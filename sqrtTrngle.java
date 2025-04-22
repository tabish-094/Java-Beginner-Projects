class sqrtTrngle {
    public static void main(String[] args) {
        double a = 3.0; // Length of side a
        double b = 4.0; // Length of side b
        double c; // Length of side c (hypotenuse)

        // Calculate the length of the hypotenuse using the Pythagorean theorem
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        // Print the result
        System.out.println("The length of the hypotenuse is: " + c);
    }
    
}
