package polimorfismo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Polimorfismo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        boolean valido = false;
        do {
            try {
                System.out.println("Cuantos trabajadores va a ingresar: ");
                cantidad = sc.nextInt();
                if (cantidad <= 0) {
                    System.out.println("Debe ser mayor a 0");
                } else {
                    valido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Solo numeros enteros");
                sc.nextLine();
            }
        } while (!valido);

        Persona[] trabajadores = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n--- Trabajador " + (i + 1) + " ---");

            // tipo de trabajador
            int tipo = 0;
            valido = false;              // <-- reset para cada trabajador
            do {
                try {
                    System.out.println("Tipo: 1=Empleado  2=Operario  3=Administrativo: ");
                    tipo = sc.nextInt();
                    if (tipo < 1 || tipo > 3) {
                        System.out.println("Ingrese 1, 2 o 3");
                    } else {
                        valido = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Solo numeros enteros");
                    sc.nextLine();
                }
            } while (!valido);

            switch (tipo) {

                case 1:
                    Empleado e = new Empleado();

                    // validar que nombre solo tenga letras
                    valido = false;
                    do {
                        System.out.println("Ingrese el nombre: ");
                        String nom = sc.next();
                        if (nom.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            e.setNombre(nom);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        System.out.println("Ingrese el apellido: ");
                        String ape = sc.next();
                        if (ape.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            e.setApellido(ape);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese el salario por dia: ");
                            double sd = sc.nextDouble();
                            if (sd <= 0) {
                                System.out.println("Debe ser mayor a 0");
                            } else {
                                e.setSEdia(sd);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros validos");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese los dias trabajados (1-30): ");
                            int dt = sc.nextInt();
                            if (dt < 1 || dt > 30) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                e.setHEdia(dt);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese las horas extra (0-50): ");
                            int he = sc.nextInt();
                            if (he < 0 || he > 50) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                e.setHextra(he);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese los meses trabajados (1-12): ");
                            int mt = sc.nextInt();
                            if (mt < 1 || mt > 12) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                e.setmTrab(mt);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    trabajadores[i] = e;
                    break;

                case 2:
                    Operario o = new Operario();

                    valido = false;
                    do {
                        System.out.println("Ingrese el nombre: ");
                        String nom2 = sc.next();
                        if (nom2.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            o.setNombre(nom2);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        System.out.println("Ingrese el apellido: ");
                        String ape2 = sc.next();
                        if (ape2.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            o.setApellido(ape2);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese el salario por dia: ");
                            double sd2 = sc.nextDouble();
                            if (sd2 <= 0) {
                                System.out.println("Debe ser mayor a 0");
                            } else {
                                o.setSOdia(sd2);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros validos");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese los dias trabajados (1-30): ");
                            int dt2 = sc.nextInt();
                            if (dt2 < 1 || dt2 > 30) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                o.setDiaO(dt2);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese el bono transporte (0 si no tiene): ");
                            double bt = sc.nextDouble();
                            if (bt < 0) {
                                System.out.println("No puede ser negativo");
                            } else {
                                o.setBonoT(bt);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros validos");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese los meses trabajados (1-12): ");
                            int mt2 = sc.nextInt();
                            if (mt2 < 1 || mt2 > 12) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                o.setmTrab(mt2);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    trabajadores[i] = o;
                    break;

                case 3:
                    Administrativo a = new Administrativo();

                    valido = false;
                    do {
                        System.out.println("Ingrese el nombre: ");
                        String nom3 = sc.next();
                        if (nom3.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            a.setNombre(nom3);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        System.out.println("Ingrese el apellido: ");
                        String ape3 = sc.next();
                        if (ape3.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ]+")) {
                            a.setApellido(ape3);
                            valido = true;
                        } else {
                            System.out.println("Solo se permiten letras");
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese el salario mensual: ");
                            double sm = sc.nextDouble();
                            if (sm <= 0) {
                                System.out.println("Debe ser mayor a 0");
                            } else {
                                a.setSalarioMensual(sm);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros validos");
                            sc.nextLine();
                        }
                    } while (!valido);

                    valido = false;
                    do {
                        try {
                            System.out.println("Ingrese los meses trabajados (1-12): ");
                            int mt3 = sc.nextInt();
                            if (mt3 < 1 || mt3 > 12) {
                                System.out.println("Valor fuera de rango");
                            } else {
                                a.setmTrab(mt3);
                                valido = true;
                            }
                        } catch (InputMismatchException ex) {
                            System.out.println("Solo numeros enteros");
                            sc.nextLine();
                        }
                    } while (!valido);

                    trabajadores[i] = a;
                    break;
            }
        }

        // mostrar resultados
        System.out.println("\n===== CALCULO DE SALARIOS =====");
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("\nNombre: " + trabajadores[i].getNombre() + " " + trabajadores[i].getApellido());
            System.out.println("Salario total: $" + trabajadores[i].calcularSalario());

            if (trabajadores[i] instanceof BonoNav) {
                BonoNav b = (BonoNav) trabajadores[i];
                System.out.println("Bono Navidad: $" + b.calcularbono());
            }

            if (trabajadores[i] instanceof Hextras) {
                Hextras h = (Hextras) trabajadores[i];
                System.out.println("Horas Extra: $" + h.calculohextra());
            }
        }
    }
}