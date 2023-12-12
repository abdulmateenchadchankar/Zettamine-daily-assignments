package com.zettamine.java.day4.question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[5];

        for (int i = 0; i < shapes.length; i++) {
        	System.out.println("Enetr the type of shape you want: ");
            String type = scanner.nextLine();

            switch (type) {
                case "Rectangle":
                    Rectangle rectangle = new Rectangle();
                    System.out.println("Enter the Length");
                    rectangle.setLength(scanner.nextDouble());
                    System.out.println("Eneter the width ");
                    rectangle.setWidth(scanner.nextDouble());
                    shapes[i] = rectangle;
                    break;
                case "Triangle":
                    Triangle triangle = new Triangle();
                    System.out.println("Enter base: ");
                    triangle.setBase(scanner.nextDouble());
                    System.out.println("Enter height: ");
                    triangle.setHeight(scanner.nextDouble());
                    shapes[i] = triangle;
                    break;
                case "Cube":
                    Cube cube = new Cube();
                    
                    cube.setLength(scanner.nextDouble());
                    cube.setWidth(scanner.nextDouble());
                    cube.setHeight(scanner.nextDouble());
                    shapes[i] = cube;
                    break;
                case "Sphere":
                    Sphere sphere = new Sphere();
                    sphere.setRadius(scanner.nextDouble());
                    shapes[i] = sphere;
                    break;
                default:
                    System.out.println("Invalid shape type");
                    i--; 
                    break;
            }
        }

        for (Shape shape : shapes) {
            System.out.println("Area " + shape.area());
            if (shape instanceof Spatial) {
                double volume = shape.volume();
                if (volume != -1) {
                    System.out.println("Volume " + volume);
                }
            }
        }
        scanner.close();
		

	}

}
