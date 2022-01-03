package principal;
import java.awt.Color;


public class Start extends javax.swing.JFrame{
	private static final long serialVersionUID = 1L;
	Dolar dolar;
	PesoDolar pesoADolar;
	Peso peso;
	DolarPeso dolarApeso;

	public Start() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setTitle("currency exchange");
		this.dolar = new Dolar();
		this.peso = new Peso();
		this.pesoADolar = new PesoDolar(dolar,peso, this);
		this.dolarApeso = new DolarPeso(dolar, peso, this);
		
	}

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Start().setVisible(true);
			}
		});
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		btnPesosADolar = new javax.swing.JButton();
		btnDolarAPesos = new javax.swing.JButton();
		valorDolar = new javax.swing.JTextField();
		txtValorDolar = new javax.swing.JLabel();
		txtTitulo = new javax.swing.JLabel();
        btnValorDolar = new javax.swing.JButton();
//        jLabel3 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setIconImages(null);

		txtValorDolar.setText("Valor al dia de la fecha");
		txtTitulo.setText("Seleccione la opción deseada");
		txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 2, 26)); // NOI18N
	
		btnPesosADolar.setBackground(new java.awt.Color(51, 102, 255));
		btnPesosADolar.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
		btnPesosADolar.setText("Pesos a dolar");
		btnPesosADolar.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnPesosADolarMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnPesosADolarMouseExited(evt);
			}
		});
		btnPesosADolar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnPesosADolarActionPerformed(evt);
			}
		});

		btnDolarAPesos.setBackground(new java.awt.Color(51, 102, 255));
		btnDolarAPesos.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
		btnDolarAPesos.setText("Dolar a Pesos");
		btnDolarAPesos.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				btnDolarAPesosMouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				btnDolarAPesosMouseExited(evt);
			}
		});
		btnDolarAPesos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDolarAPesosActionPerformed(evt);
			}
		});
		

		btnValorDolar.setText("OK");
		btnValorDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	btnValorDolarActionPerformed(evt);
            }
        });
		
		
		

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

								.addComponent(txtValorDolar, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(valorDolar, javax.swing.GroupLayout.PREFERRED_SIZE , 50, Short.MAX_VALUE)
								 .addComponent(btnValorDolar)
								.addGap(80, 80, 80))
						
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(97, 97, 97).addGroup(layout
										.createSequentialGroup().addGap(80, 80, 80)
										.addGroup(layout.createSequentialGroup().addGap(80, 80, 80)
												.addGroup(layout.createSequentialGroup().addGap(70, 70, 70)
														.addGroup(layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)))))))
								.addContainerGap(106, Short.MAX_VALUE)))
				
				.addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
						.addComponent(txtTitulo))
				


				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(41, 41, 41)
//						.addComponent(txtTitulo)
						.addComponent(btnDolarAPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
						.addComponent(btnPesosADolar, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(71, 71, 71)));

		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				



				.addGroup(layout.createSequentialGroup().addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(valorDolar, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtValorDolar))
						 .addComponent(btnValorDolar)
						.addGap(18, 18, 18))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
				
	
				
				
				.addGroup(javax.swing.GroupLayout.Alignment.CENTER , layout.createSequentialGroup()
					
						.addComponent(txtTitulo))
				
				
				.addGroup(
						layout.createSequentialGroup().addContainerGap(200, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//										.addComponent(txtTitulo)
										.addComponent(btnPesosADolar).addComponent(btnDolarAPesos))
								.addGap(250, 250, 250))
				
				
				
				);


		getAccessibleContext().setAccessibleDescription("");

		pack();
	}

	private void btnPesosADolarActionPerformed(java.awt.event.ActionEvent evt) {
		this.pesoADolar.setVisible(true);
        this.setVisible(false);
	}
	
	private void btnDolarAPesosActionPerformed(java.awt.event.ActionEvent evt) {
		this.dolarApeso.setVisible(true);
        this.setVisible(false);
	}

	private void btnDolarAPesosMouseEntered(java.awt.event.MouseEvent evt) {
		btnDolarAPesos.setBackground(Color.pink);
	}

	private void btnDolarAPesosMouseExited(java.awt.event.MouseEvent evt) {
		btnDolarAPesos.setBackground(new java.awt.Color(51, 102, 255));
	}

	private void btnPesosADolarMouseEntered(java.awt.event.MouseEvent evt) {
		btnPesosADolar.setBackground(Color.pink);
	}

	private void btnPesosADolarMouseExited(java.awt.event.MouseEvent evt) {
		btnPesosADolar.setBackground(new java.awt.Color(51, 102, 255));
	}
	

	// Variables declaration - do not modify
	private javax.swing.JButton btnPesosADolar;
	private javax.swing.JButton btnDolarAPesos;
	private javax.swing.JTextField valorDolar;
	private javax.swing.JLabel txtValorDolar;
	private javax.swing.JButton btnValorDolar;
	private javax.swing.JLabel txtTitulo;
//	private javax.swing.JLabel jLabel3;

		
    private void btnValorDolarActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
        if(valorDolar.getText().isEmpty()){
          System.out.println("Debes completar el campo");
          return;
        }
               
       
        this.dolar.setValor(Double.parseDouble(valorDolar.getText()));
        
//        jLabel3.setText("El valor del dolar hoy es " + dolar.getValor()+ " u$d ");
       
              
    }
}
