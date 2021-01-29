import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BuscaBinariaTeste {

  @Test
  public void numeroNoFim() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4, 6, 8, 10, 18, 29, 40};
    int chave = 40;

    assertEquals(6, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroNoMeio() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {9, 11, 17, 29, 60, 67, 88, 90, 100};
    int chave = 60;

    assertEquals(4, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroNoComeco() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {1, 8, 13, 19, 26};
    int chave = 1;

    assertEquals(0, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void numeroMaiorQueONumeroDoFimDoArray() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {4, 6, 11, 13, 20, 36};
    int chave = 50;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 

  @Test
  public void ChaveDiferenteDaLista() {
    BuscaBinaria buscaBinaria = new BuscaBinaria();

    int[] array = {12, 15, 17, 19};
    int chave = 3;

    assertEquals(-1, buscaBinaria.busca(array, chave), 0.001);
  } 
  
}
