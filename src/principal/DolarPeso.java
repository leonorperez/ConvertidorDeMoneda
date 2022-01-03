package principal;

import java.awt.Dimension;

public class DolarPeso extends javax.swing.JFrame {
	 Dolar dolar;
	 Start start;
	 Peso peso;
	 double resultado;
	
	
	public DolarPeso(Dolar dolar,Peso peso, Start start) {
	 initComponents();
     this.setLocationRelativeTo(null);
     this.setTitle("convertidor");
     this.dolar = dolar;
     this.start = start;
     this.peso = peso;

}
    @SuppressWarnings("unchecked")                        
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        cantidadDolares = new javax.swing.JTextField();
        btnDolaresACambiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jLabel1.setText("que cantidad de Dolares deseas convertir");

        jLabel3.setSize(2000,2000);

        btnVolver.setBackground(new java.awt.Color(153, 51, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
  
//        cantidadDolares.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                cantidadDolaresActionPerformed(evt);
//            }
//        });

        btnDolaresACambiar.setBackground(new java.awt.Color(153, 51, 255));
        btnDolaresACambiar.setText("ok");
        btnDolaresACambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDolaresACambiarActionPerformed(evt);
            }
        });

       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(307, 307, 307))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(227, 227, 227)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(cantidadDolares, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDolaresACambiar)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadDolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDolaresACambiar))))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(btnVolver)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }
    
    public void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {
    	this.dolar.setCantidad(0);
    	this.start.setVisible(true);
        this.setVisible(false);
    	
    }
    public void btnDolaresACambiarActionPerformed(java.awt.event.ActionEvent evt) {
    	 if(cantidadDolares.getText().isEmpty()){
             System.out.println("Debes ingresar cantidad de Dolares a cambiar");
             return;
           }   
    	 this.dolar.setCantidad(Double.parseDouble(cantidadDolares.getText()));
    	 this.resultado = dolar.getCantidad()* dolar.getValor();
    	 jLabel3.setText("El monto ingresado equivale a $" + this.resultado + " pesos");
         cantidadDolares.setText(null);
    	
	}
    
    
    
    private javax.swing.JButton btnDolaresACambiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField cantidadDolares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
}
