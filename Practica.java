
public class Practica
{
    public static Ubicacion matrices(int [][] big, int [][] small){
        Ubicacion ubicacion = new Ubicacion();
        int limiteColumnas = big[0].length-small[0].length;
        int limiteFilas = big.length-small.length;
        
        
        for (int y = 0;y<=limiteFilas;y++){
            for (int x = 0; x<=limiteColumnas;x++){
                if (review(x,y,big,small)) {
                    ubicacion.setCoordenadas(x,y);
                    return ubicacion;
                }
            }
        }
        
        return null;
    }
    
    public static boolean review(int x, int y, int [][] big, int [][] small){
        
        int ncolumnas = small[0].length;
        int nfilas = small.length;
        
        
        for (int i = 0;i<nfilas;i++){
            for (int j = 0; j<ncolumnas;j++){
                if(big[i+y][j+x]!=small[i][j]) return false;
            }
        }
        return true;
    }
}
