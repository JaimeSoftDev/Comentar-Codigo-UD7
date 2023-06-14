
public class EntradaBlogJMM {
    public static char separador=':';
    private int id;
    private String texto;
    private String autor;


    /**
     *
     * @id 74386548
     * @author Jaime Maciá Mora
     * @version 14.6.23
     */
    public EntradaBlogJMM(int id,String autor,String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
        }

    /**
     *
     * @return toString
     */
    @Override
public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
        }

    /**
     *
     * @return id
     */
    public int getId(){
        return this.id;
        }

    /**
     *
     * @return texto
     */
    public String getTexto(){
        return this.texto;
        }

    /**
     *
     * @return autor en mayúsculas
     */
    public String getAutor(){
        return this.autor.toUpperCase();
        }

    /**
     *
     * @return autor
     */
    public String devuelveAutor(){
        return this.autor;
        }


    public static void main(String[] args) {
        EntradaBlogJMM e1=new EntradaBlogJMM (74386548,"Jaime","Creado el 14/06/2023");
        System.out.println(e1);
        }
        }
