package repository;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import model.Prodi;
import model.DBTables;

public class Database {
    private String namaFileDataMahasiswa = "db_kampusapp.txt";
    protected DBTables tables = new DBTables();
    public MahasiswaTbl mahasiswaTbl = new MahasiswaTbl(this);
    public ProdiTbl prodiTbl = new ProdiTbl(this);

    public Database() {
        readDBFile();
    }

    protected void commit() {
        try (FileWriter writer = new FileWriter(new File(namaFileDataMahasiswa))) {
            for (Prodi prodi : tables.dataProdi) {
                writer.write(prodi.getId() + "," + prodi.getNama() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file: " + e.getMessage());
        }
    }

    private void readDBFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFileDataMahasiswa))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Prodi prodi = new Prodi(data[0], data[1]);
                tables.dataProdi.add(prodi);
            }
        } catch (IOException e) {
            System.out.println("File tidak ditemukan atau terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    public class ProdiTbl {
        private Database db;

        public ProdiTbl(Database db) {
            this.db = db;
        }

        public void create(Prodi prodi) {
            db.tables.dataProdi.add(prodi);
            db.commit();
        }

        public Prodi getProdiById(String id) {
            for (Prodi prodi : db.tables.dataProdi) {
                if (prodi.getId().equals(id)) {
                    return prodi;
                }
            }
            return null;
        }
    }
}
