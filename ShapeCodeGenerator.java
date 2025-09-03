public class ShapeCodeGenerator {

    public static void main(String[] args) {
        makeSphere(100, 20, "Color.GREEN");
    }

    // Generates code for a sphere (java)
    public static void makeSphere(double radius, int steps, String color) {
        for (int i = 0; i < steps; i++) {
            double theta1 = Math.PI * i / steps;
            double theta2 = Math.PI * (i + 1) / steps;
            for (int j = 0; j < steps; j++) {
                double phi1 = 2 * Math.PI * j / steps;
                double phi2 = 2 * Math.PI * (j + 1) / steps;

                String v1 = vertex(radius, theta1, phi1);
                String v2 = vertex(radius, theta2, phi1);
                String v3 = vertex(radius, theta2, phi2);
                String v4 = vertex(radius, theta1, phi2);

                System.out.println("tris.add(new Triangle(" + v1 + ", " + v2 + ", " + v3 + ", " + color + "));");
                System.out.println("tris.add(new Triangle(" + v1 + ", " + v3 + ", " + v4 + ", " + color + "));");
            }
        }
    }

    // formats a vertex
    private static String vertex(double r, double theta, double phi) {
        double x = r * Math.sin(theta) * Math.cos(phi);
        double y = r * Math.cos(theta);
        double z = r * Math.sin(theta) * Math.sin(phi);
        return "new Vertex(" + (int)x + ", " + (int)y + ", " + (int)z + ")";
    }

}
