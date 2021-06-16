
package proyectofinal;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;



public class PlantillaPdfCobro {
    
    String nombreHotel;
    String lema;
    String ubicacion;
    String fechaS;
    String NombreHuesped;
    String CiudadH;
    String FechaEntd;
    String FechaSal;
    String TipoHab;
    String CostoHab;
    String Dias;
    String TotalSinCargos;
    String TotalCargos;
    String CargosExtra;
    String lavanderia, paqueteria , spa , ServicioC;
    String rutaImagen;
    String rutaImagen2;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public PlantillaPdfCobro(String NombreHotel, String lema,String ubicacion, String rutaImagen,String rutaImagen2
                            ,String NombreHuesped,String CiudadH,String FechEntd,String FechaSal,String TipoHab
                            ,String CostoHab,String Dias,String TotalSinCargos,String TotalCargos,String CargosExtra
                            ,String lavanderia,String paqueteria ,String spa ,String ServicioC
                            ){
        this.nombreHotel = NombreHotel;
        this.lema = lema;
        this.ubicacion = ubicacion;
        this.NombreHuesped = NombreHuesped;
        this.CiudadH = CiudadH;
        this.FechaEntd = FechEntd;
        this.FechaSal = FechaSal;
        this.TipoHab = TipoHab;
        this.CostoHab = CostoHab;
        this.Dias = Dias;
        this.TotalSinCargos = TotalSinCargos;
        this.TotalCargos = TotalCargos;
        this.CargosExtra = CargosExtra;
        this.lavanderia = lavanderia;
        this.paqueteria = paqueteria;
        this.spa = spa;
        this.ServicioC = ServicioC;
       
        
        Date fecha = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        fechaS = sf.format(fecha);
        
        this.rutaImagen = rutaImagen;
        this.rutaImagen2 = rutaImagen2;
        
        documento = new Document();
        titulo  = new Paragraph("Java Inn");        
       
    }
    
    public void crearPlantilla(){
        
        try {
       
            archivo = new FileOutputStream("Recibo "+NombreHuesped + ".pdf"); //nombra el archivo
          
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            Image image = null;
            Image image2 = null ;
            
            try {
                image =  Image.getInstance(rutaImagen2);//carga imagen
                image.scaleAbsolute(150, 100);//cambia tamaño
                image.setAbsolutePosition(205, 340);//coloca imagen en la posicion
                image2 = Image.getInstance(rutaImagen);
                image2.scaleAbsolute(150,100);
                image2.setAbsolutePosition(425,730);
               
            } catch (Exception e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            documento.add(image2);
            documento.add(titulo);
            
            documento.add(new Paragraph("\n"));
            documento.add(new Paragraph("\n"));
            documento.add(new Paragraph("\n"));
            
            documento.add(new Paragraph("Ubicacion: " + ubicacion+"\n"));
           
            documento.add(new Paragraph("Nombre Huesped: " + NombreHuesped));
            documento.add(new Paragraph("Ciudad: " + CiudadH));
            documento.add(new Paragraph("Fecha de ingreso: " + FechaEntd));
            
            documento.add(new Paragraph("Fecha de salida: " + FechaSal));
            documento.add(new Paragraph("Tipo de habitacion: " + TipoHab));
            documento.add(new Paragraph("Costo de habitacion: " + CostoHab));
            
            documento.add(new Paragraph("Dias de estancia: " + Dias));
            documento.add(new Paragraph("Total pago sin cargos extra: $" + TotalSinCargos));
            documento.add(new Paragraph("Total pago con cargos extra: $" + TotalCargos));
            
            
            documento.add(Chunk.NEWLINE);
            //Parrafo
            Paragraph texto = new Paragraph(CargosExtra);
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            documento.add(new Paragraph("Fecha: " + fechaS));
            
            documento.close();
            System.out.println("Archivo creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }  
    
}
