/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabook;

import java.io.File; // Importa la clase File del paquete java.io.
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alexs
 */
public class Ficheros {
    
    File archivoAbs = new File("C:/Ruta/Carpeta/Documento.txt"); // Ruta absoluta de un archivo en Windows.
    File rutaAbs = new File("C:/Ruta/Carpeta"); // Ruta absoluta de una carpeta en Windows.
    File archivoRel = new File("Documento.txt"); // Ruta relativa de un archivo en Windows/Unix.
    File rutaRel = new File("Ruta/Carpeta"); // Ruta relativa de una carpeta en Windows/Unix.



    ////////////////////////////////////////////////////////////////////////////
    //////////////////////////// M É T O D O S /////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////

    
    public static void obtencionDeLaRuta(File f){
        
        /* - String getParent() -> Devuelve la ruta de la carpeta del elemento referido por esta ruta.
        */
        System.out.println("getParent(): \t\t" + f.getParent());
        
        /* - String getName() -> Devuelve el nombre del elemento que representa
        la ruta, ya sea una carpeta o un archivo. Es el caso inverso del método
        getParent(), ya que el texto resultante es solo el último elemento.
        */
        System.out.println("getName(): \t\t" + f.getName());
        
        /* - String getAbsolutePath() -> Devuelve la ruta absoluta. Si el objeto File
        se inicializó usando una ruta relativa, el resultado incluye también la
        carpeta de trabajo.
        */
        System.out.println("getAbsolutePath(): \t" + f.getAbsolutePath());
        System.out.println("getAbsoluteFile(): \t" + f.getAbsoluteFile()); // Es lo mismo que getAbsolutePath()
        
    }
    
    public static void comprobacionesDeEstado(File f){
        
        /* - boolean exists() -> Comprueba si la ruta existe dentro del sistema de
        ficheros. Devolverá true si existe y false en caso contrario.
        */
        System.out.println("f.exists(): " + f.exists());
        
        /* - boolean isFile() -> Comprueba el sistema de ficheros en busca de la
        ruta y devuelve true si existe y es un fichero. Devolverá false si no
        existe, o si existe pero no es un fichero.
        */
        System.out.println("f.isFile(): " + f.isFile());
        
        /* - boolean isDirectory() -> Funciona como el anterior pero comprueba si
        es una carpeta.
        */
        System.out.println("f.isFile(): " + f.isDirectory());
        
    }
    
    public static void propiedadesDeFicheros(File f){
        
        /* - long length() -> Devuelve el tamaño de un archivo en bytes. Este
        método solo puede ser llamado sobre una ruta que represente un
        archivo, de lo contrario no se puede garantizar que el resultado sea
        válido.
        */
        System.out.println("Tamaño del archivo: " + f.length());
        
        /* - long lastModified() -> Devuelve la última fecha de edición del elemento
        representado por esta ruta. El resultado se codifica en un único
        número entero cuyo valor es el número de milisegundos que han
        pasado desde el 1 de junio de 1970.
        */
        System.out.println("Ultima modificación (ms): " + f.lastModified());
        
        // --- Uso de la clase Date para mostrar fecha en formato legible ---
        
        Date fecha = new Date(f.lastModified());
        System.out.println("Ultima modificación (Fecha): " + fecha);
    }
    
    public static void gestionDeFicheros(File f){
        
        /* - boolean mkdir() -> Permite crear la carpeta indicada en la ruta. La ruta
        debe indicar el nombre de una carpeta que no existe en el momento
        de invocar el método.
        */
        boolean crearCarpeta = f.mkdir();
        System.out.println("¿Carpeta creada?: " + crearCarpeta);
        /*
        - boolean delete() borra el archivo o carpeta indicada en la ruta. La
        ruta debe indicar el nombre de un archivo o carpeta que sí existe en el
        momento de invocar el método. Se podrá borrar una carpeta solo si
        está vacía. Devuelve true o false según si la operación se ha podido realizar.
        */
        boolean borrarCarpeta = f.delete();
        System.out.println("¿Carpeta borrada?:" + borrarCarpeta);
        /*
        - boolean renameTo(File destino) -> El nombre de este método es algo
        engañoso ("renombrar", en inglés), ya que su función real no es
        simplemente cambiar el nombre de un archivo o carpeta, sino cambiar
        la ubicación completa. Devuelve true o false según si la operación se ha 
        podido llevar a cabo correctamente o no.
        */
        boolean cambiarRuta = f.renameTo(f); // En el argumento se debe poner el archivo destino.
        System.out.println("¿Carpeta renombrada?: " + cambiarRuta);
    }
    
    public static void listadoDeArchivos(File f){
        
        /* - File[] listfiles() -> Devuelve un vector de tipo File (File[]) con todos los
        elementos contenidos en la carpeta (representados por objetos File,
        uno por elemento). Para que se ejecute correctamente la ruta debe
        indicar una carpeta. El tamaño del vector será igual al número de
        elementos que contiene la carpeta. Si el tamaño es 0, el valor devuelto
        será null y toda operación posterior sobre el vector será errónea. El
        orden de los elementos el aleatorio.
        */
        File[] lista = f.listFiles();

        // Recorrer el array y mostrar el nombre de cada elemento:
        
        for (int i = 0; i < lista.length; i++) {
        f = lista[i];
        if (f.isDirectory()) {
            System.out.println("[DIR] " + f.getName());
        } else {
            System.out.println("[ARX] " + f.getName());
            }
        }
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    ///////////////// L E C T U R A   Y   E S C R I T U R A ////////////////////
    ////////////////////////////////////////////////////////////////////////////
    
    // Acceso secuencial: 
    
    // Ficheros orientados a caracter: 
    
    /*
    Para tratar de manera sencilla ficheros orientados a carácter, Java proporciona 
    las clases Scanner (para lectura) del package java.util, 
    y FileWriter (para escritura) del package java.io.
    
    // LECTURA DE FICHERO (CLASE SCANNER)
    
    La clase que permite llevar a cabo la lectura de datos desde un
    fichero orientado a carácter es exactamente la misma que permite
    leer datos desde el teclado: Scanner.
    
    El constructor de la clase Scanner permite como argumento un objeto de tipo 
    File que contenga la ruta a un archivo.
    
    
    */
   public static void lecturaFichero(File f) throws FileNotFoundException{
       
        // Constructor:
        
        // Instancio el lector poniendole como argumento el archivo.
       
        Scanner lector = new Scanner(f);
       
        /*
        Una vez instanciado el objeto Scanner podemos utilizar sus métodos
        exactamente igual que si leyéramos de teclado: hasNext(), next(),
        nextLine(), nextInt(), nextDouble(), nextBoolean(), etc. La única diferencia es
        que el objeto Scanner leerá secuencialmente el contenido del archivo.
        */
        lector.nextInt();
        lector.nextDouble();
        lector.nextBoolean();
        
        /*
        Es importante recordar la diferencia entre el método next() y
        nextLine(), ya que ambos evalúan una cadena de texto.
        */
        lector.nextLine(); // Lee todo el texto que encuentre (espacios incluidos) hasta el siguiente salto de línea.
        lector.next(); //  Sólo lee una palabra individual.
       
        /*
        Una vez se ha finalizado la lectura del archivo, ya sean todas o solo
        una parte, es imprescindible ejecutar un método especial llamado
        close().
        */
        lector.close();
        
        /*
        Es importante saber que al instanciar el objeto Scanner se lanzará una
        excepción de tipo java.io.FileNotFoundException si el fichero no
        existe. 
        */
   }
   
   public static void escrituraDeFichero(File f) throws IOException{
       
        // Constructores.
       
        // Es necesario importar la clase FileWriter del paquete java.io.
       
        FileWriter writer = new FileWriter(f);
       
        FileWriter writer2 = new FileWriter(f, true);
        
        // Si le pasamos "true" abrirá el archivo para escribirlo en modo "append"
        // Si le pasamos "false" hará lo mismo que el constructor anterior y lo sobreescribirá.
       
        writer.write("Hello, world"); // Puede pasarse como argumento un String.
        
        /* Cuando queremos escribir el valor de variables que no sean
        String será necesario pasárselas a write() como String. Esto es muy sencillo,
        solo hay que concatenar un String vacío con la variable (Java siempre
        convierte a String la concatenación de cadenas de texto con cualquier otro
        elemento):
        */
        
        int edad = 35;
        writer.write("" + edad);
        
        // TRUCOS
        
        int valor = 1; // Inicio un valor que quiero escribir
        for (int i = 1; i <= 20; i++) {
        writer.write("" + valor); // escribimos valor
        writer.write(" "); // escribimos espacio en blanco
        valor = valor + 1; // calculamos próximo valor
        }
        writer.write("\n"); // escribimos nueva línea
        
        writer.close();
   }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    ///////////////////// H A C K S   &   T R I C K S //////////////////////////
    ////////////////////////////////////////////////////////////////////////////
   
   
    public static void crearNumerosAleatoriosCuentasBankarias(File f) throws IOException{
        
    FileWriter docWriter = new FileWriter(f);
    
    int NUM_CUENTAS = 0; // acumulador de numero de cuentas
    
        do{ // Empiezo el bucle que hará cambiar de fila.
            
            for (int i = 0; i < 10; i++) { // Empiezo el bucle que escribirá 10 números aleatorios entre el 1 y el 10
            
                int aleatorio = (int) (Math.random() * 10);
            
                docWriter.write("" + aleatorio);
            }
        
            NUM_CUENTAS++; // incremento numero de cuentas
        
            docWriter.write("\n"); // Salto de linea para la siguiente cuenta
        
        }while(NUM_CUENTAS < 10);
        
        docWriter.close();
    }
    
    public static void leerNombreyNumeroyMostrarloPorPantalla(File f) throws FileNotFoundException{

        Scanner sc = new Scanner(f); // Instancio el escaner del archivo
    
        while(sc.hasNext()){ // Condición que se cumple mientras hasNext() sea true.
            
            String nombre = sc.next(); // String para acumular el nombre con next(), que lee hasta el siguiente espacio.
            System.out.println("Nombre: " + nombre); // Lo muestro por pantalla
            int nota = sc.nextInt(); // Variable para acumular la nota.
            System.out.println("Nota: " + nota);
        }

    }
    
    
}
    
    




    
    
    
    /*
    
    FICHEROS
    
    
    // PACKAGE: java.io. ..
    
    
    
    // CLASE FILE -------------------------------------------------------------
    
    import java.io.File;
    
    * La clase File representa una ruta dentro del
    sistema de archivos, no un "archivo" como su nombre indica.
    
    * Hay que instanciarla para que sea posible
    invocar sus métodos. El constructor de File recibe como argumento una
    cadena de texto correspondiente a la ruta. Instancia:
    
    File f = new File(String ruta);
    
    * Un objeto representa una única ruta del sistema de ficheros.
    Para operar con diferentes rutas a la vez, habrá que crear varios objetos.
    
    Por ejemplo:
    
    File carpetaFotos = new File("C:/Fotos");
    File unaFoto = new File("C:/Fotos/Foto1.png");
    File otraFoto = new File("C:/Fotos/Foto2.png");

    // RUTAS ABSOLUTAS Y RELATIVAS --------------------------------------------
    
    * Una ruta absoluta:
    
    Es aquella que se refiere a un elemento a partir del raíz
    del sistema de ficheros. Por ejemplo "C:/Fotos/Foto1.png"
    
    En el caso de los sistemas operativos Windows a su inicio siempre se pone 
    el nombre de la unidad ( "C:", "D:", etc.), mientras que en el caso de los 
    sistemas operativos Unix, estas comienzan siempre por una barra ( "/").
    
    Ejemplo:
    
    C:\Fotos\Viajes (ruta a una carpeta Windows)
    /Fotos/Viajes (ruta a una carpeta Unix)
    
    * Una ruta relativa: 
    
    Es aquella que no incluye el raíz y por ello se considera que parte
    desde el directorio de trabajo de la aplicación. Esta carpeta puede
    ser diferente cada vez que se ejecuta el programa.
    
    Cuando un programa se ejecuta por defecto se le asigna una
    carpeta de trabajo. Esta carpeta suele ser la carpeta desde donde se
    lanza el programa.
    
    Ejemplo:
    
    Viajes (ruta relativa de carpeta)
    Unidad11\apartado1\etc.txt (ruta relativa de archivo)
    
    
    // MÉTODOS DE LA CLASE FILE -----------------------------------------------
    
    * Obtención de ruta:
    
    - String getParent() -> Devuelve la ruta de la carpeta del elemento
    referido por esta ruta.
    
    - String getName() -> Devuelve el nombre del elemento que representa
    la ruta, ya sea una carpeta o un archivo. Es el caso inverso del método
    getParent(), ya que el texto resultante es solo el último elemento.
    
    - String getAbsolutePath() -> Devuelve la ruta absoluta. Si el objeto File
    se inicializó usando una ruta relativa, el resultado incluye también la
    carpeta de trabajo.
    
    * Comprobaciones de estado:
    
    - boolean exists() -> Comprueba si la ruta existe dentro del sistema de
    ficheros. Devolverá true si existe y false en caso contrario.

    - boolean isFile() -> Comprueba el sistema de ficheros en busca de la
    ruta y devuelve true si existe y es un fichero. Devolverá false si no
    existe, o si existe pero no es un fichero.
    
    - boolean isDirectory() -> Funciona como el anterior pero comprueba si
    es una carpeta.
    
    * Propiedades de ficheros:
    
    - long length() -> Devuelve el tamaño de un archivo en bytes. Este
    método solo puede ser llamado sobre una ruta que represente un
    archivo, de lo contrario no se puede garantizar que el resultado sea
    válido.
    
    - long lastModified() -> Devuelve la última fecha de edición del elemento
    representado por esta ruta. El resultado se codifica en un único
    número entero cuyo valor es el número de milisegundos que han
    pasado desde el 1 de junio de 1970.
    
    --- Uso de la clase Date para mostrar fecha en formato legible ---
    long milisegundos = documento.lastModified();
    Date fecha = new Date(milisegundos);
    ---
    
    * Gestión de ficheros:
    
    - boolean mkdir() -> Permite crear la carpeta indicada en la ruta. La ruta
    debe indicar el nombre de una carpeta que no existe en el momento
    de invocar el método.
    
    - boolean delete() borra el archivo o carpeta indicada en la ruta. La
    ruta debe indicar el nombre de un archivo o carpeta que sí existe en el
    momento de invocar el método. Se podrá borrar una carpeta solo si
    está vacía. Devuelve true o false según si la operación se ha podido realizar.
    
    - boolean renameTo(File destino) -> El nombre de este método es algo
    engañoso ("renombrar", en inglés), ya que su función real no es
    simplemente cambiar el nombre de un archivo o carpeta, sino cambiar
    la ubicación completa. Devuelve true o false según si la operación se ha 
    podido llevar a cabo correctamente o no.
    
    * Listado de archivos:
    
    File[] listfiles() -> Devuelve un vector de tipo File (File[]) con todos los
    elementos contenidos en la carpeta (representados por objetos File,
    uno por elemento). Para que se ejecute correctamente la ruta debe
    indicar una carpeta. El tamaño del vector será igual al número de
    elementos que contiene la carpeta.
    
    // LECTURA Y ESCRITURA DE FICHEROS ----------------------------------------
    
    */
    
    


