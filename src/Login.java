import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro extends JDialog implements ActionListener {

    public JTextField tfUsuario;
    public JPasswordField tfSenha;
    public JLabel lUsuario, lSenha;
    public JButton bEntrar, bCancelar;
    public SiROS siros;

    public Cadastro(Frame owner, String title, boolean modal, SiROS siros){
        super(owner, title, modal);
        this.siros = siros;
        setTitle("Cadastro");
        setVisible(false);
        setResizable(false);
        setBounds(400,400,400,400);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);


        lUsuario = new JLabel("Usuário");
        lUsuario.setBounds(30, 30, 150, 40);
        lUsuario.setFont(new Font("TimesRoman", Font.ITALIC, 25));

        tfUsuario = new JTextField("");
        tfUsuario.setBounds(30, 70, 200, 40);
        tfUsuario.addActionListener(this);
        tfUsuario.setHorizontalAlignment(JTextField.LEFT);
        tfUsuario.setFont(new Font("TimesRoman", Font.ITALIC, 25));
        tfUsuario.setEditable(true);
        tfUsuario.setBackground(Color.white);

        lSenha = new JLabel("Senha");
        lSenha.setBounds(250, 30, 150, 40);
        lSenha.setFont(new Font("TimesRoman", Font.ITALIC, 25));

        tfSenha = new JPasswordField("");
        tfSenha.setBounds(250, 70, 180, 40);
        tfSenha.addActionListener(this);
        tfSenha.setHorizontalAlignment(JPasswordField.LEFT);

        //Definições dos botões
        bEntrar = new JButton("Entrar");
        bEntrar.addActionListener(this);
        bEntrar.setBounds(80, 150, 150, 50);
        areaTrabalho.add(bEntrar);

        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bCancelar.setBounds(280, 150, 150, 50);
        areaTrabalho.add(bCancelar);

        //Painel para agrupar objetos
        String titulo = "Cadastro";
        Border borda = BorderFactory.createEtchedBorder();
        Border bordaTitulo = BorderFactory.createTitledBorder(borda, titulo,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION ,
                new Font("TimesRoman", Font.PLAIN, 30));

        JPanel pSenha = new JPanel();
        pSenha.setBounds(30, 10, 450, 130);
        pSenha.setLayout(null);
        pSenha.setBorder(bordaTitulo);
        pSenha.add(lUsuario);
        pSenha.add(tfUsuario);
        pSenha.add(lSenha);
        pSenha.add(tfSenha);

        areaTrabalho.add(pSenha);


        tfUsuario.requestFocus();

        //setVisible(true);

    }

    public void logar(){
        siros.logar();
    }

    public void actionPerformed(ActionEvent e){
        int temp = 0;
        if (e.getSource()==bEntrar || e.getSource()==tfSenha){
            siros.conectarAutorizacao(tfUsuario.getText(), tfSenha.getText());
            //setVisible(false);
        }
        else if (e.getSource()==bCancelar)
            setVisible(false);
        else if (e.getSource()==tfUsuario)
            tfSenha.requestFocus();
        else
            temp = 0;
    }

}