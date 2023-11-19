import java.util.Scanner;

public class RobotApp {
    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public static void main(String[] args) {
        new RobotApp();
    }

    private RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot(1, 1, 'o', layout);
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do {
            draw();
            instruction = waitInstruction();
            if (!instruction.equals("x")) {
                parseInstruction(instruction);
            }
        } while (!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private void parseInstruction(String instruction) {
        char direction = instruction.charAt(0);
        int steps = Integer.parseInt(instruction.substring(1));
        switch (direction) {
            case 'd':
                robot.moveRight(steps);
                break;
            case 'a':
                robot.moveLeft(steps);
                break;
            case 'w':
                robot.moveUp(steps);
                break;
            case 's':
                robot.moveDown(steps);
                break;
            default:
                System.out.println("Instruksi tidak valid.");
        }
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'ke atas 3 langkah'");
        System.out.print("Masukkan instruksi atau ketik 'x' untuk keluar: ");
        return scanner.nextLine();
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        char[][] area = layout.getArea();
        area[robot.getY()][robot.getX()] = robot.getIcon();

        for (char[] row : area) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}