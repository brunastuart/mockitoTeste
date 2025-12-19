package me.dio.mockito.exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.mockito.Mockito.*;

/**
 * Teste da classe {@link GeradorDeNumeros} exemplificando testes de métodos estáticos
 */
@ExtendWith(MockitoExtension.class)
public class GeradorDeNumerosTeste {

    @Test
    void validaGeracaoListaDeNumeros() {
        try (MockedStatic<GeradorDeNumeros> mockedGerador = Mockito.mockStatic(GeradorDeNumeros.class)) {
            List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

            mockedGerador.when(() -> GeradorDeNumeros.geraNumerosAleatorios(anyInt()))
                    .thenReturn(integers);

            Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios(8));
        }
    }

    @Test
    void validaGeracaoListaDeNumerosSemInformarTamanho() {
        try (MockedStatic<GeradorDeNumeros> mockedGerador = Mockito.mockStatic(GeradorDeNumeros.class)) {
            List<Integer> integers = List.of(10, 9, 8, 6);

            mockedGerador.when(GeradorDeNumeros::geraNumerosAleatorios).thenReturn(integers);

            Assertions.assertEquals(integers, GeradorDeNumeros.geraNumerosAleatorios());
        }
    }
}
