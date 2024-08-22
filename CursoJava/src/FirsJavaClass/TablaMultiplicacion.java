package FirsJavaClass;

public class TablaMultiplicacion {
	// 5*1=5
		// 5-10=50

		void imprimir() {
			imprimir(5);
		}

		void imprimir(int table) {
			imprimir(table, 1, 10);
		}

		void imprimir(int table, int del, int hasta) {
			for (int i = del; i <= hasta; i++) {
				System.out.printf("%d * %d = %d", table, i, table * i).println();
			}
		}

	}