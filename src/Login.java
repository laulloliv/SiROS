import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JDialog implements ActionListener{

    public JTextField tfUsuario;
    public JPasswordField tfSenha;
    public JLabel lUsuario, lSenha;
    public JButton bEntrar, bCancelar;
    public SiROS siros;

    public Login(Frame owner, String title, boolean modal, SiROS siros){
        super(owner, title, modal);
        this.siros = siros;
        setTitle("SiROS");
        ImageIcon iLogo = new ImageIcon("src/imgs/icon01.png");
        setIconImage(iLogo.getImage());
        setResizable(false);
        setBounds(500,290,410,250);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        areaTrabalho.setBackground(new Color(93,63, 211));

        lUsuario = new JLabel("Usuário");
        lUsuario.setBounds(30, 35, 150, 40);
        lUsuario.setFont(new Font("TimesRoman", Font.ITALIC, 15));

        tfUsuario = new JTextField("");
        tfUsuario.setBounds(30, 65, 120, 30);
        tfUsuario.addActionListener(this);
        tfUsuario.setHorizontalAlignment(JTextField.LEFT);
        tfUsuario.setFont(new Font("TimesRoman", Font.ITALIC, 15));
        tfUsuario.setEditable(true);
        tfUsuario.setBackground(Color.white);

        lSenha = new JLabel("Senha");
        lSenha.setBounds(170, 35, 150, 40);
        lSenha.setFont(new Font("TimesRoman", Font.ITALIC, 15));

        tfSenha = new JPasswordField("");
        tfSenha.setBounds(170, 65, 120, 30);
        tfSenha.addActionListener(this);
        tfSenha.setHorizontalAlignment(JPasswordField.LEFT);

        //Painel para agrupar objetos
        String titulo = "Login";
        Border borda = BorderFactory.createEtchedBorder();
        Border bordaTitulo = BorderFactory.createTitledBorder(borda, titulo,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION , new Font("TimesRoman", Font.PLAIN, 20));

        JPanel pSenha = new JPanel();
        pSenha.setBounds(30, 25, 330, 130);
        pSenha.setLayout(null);
        pSenha.setBorder(bordaTitulo);
        pSenha.add(lUsuario);
        pSenha.add(tfUsuario);
        pSenha.add(lSenha);
        pSenha.add(tfSenha);

        areaTrabalho.add(pSenha);
        tfUsuario.requestFocus();

        pSenha.setBackground(new Color(252, 245, 95));

        //Definições dos botões
        bEntrar = new JButton("Entrar");
        bEntrar.addActionListener(this);
        bEntrar.setBounds(180, 170, 85, 25);
        bEntrar.setBackground(Color.white);
        areaTrabalho.add(bEntrar);

        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bCancelar.setBounds(275, 170, 85, 25);
        bCancelar.setBackground(Color.white);
        areaTrabalho.add(bCancelar);

    }

    public void logar(){
        siros.logar();
    }

    public void actionPerformed(ActionEvent e){
        int temp = 0;
        if (e.getSource()==bEntrar || e.getSource()==tfSenha){
            siros.conectar(tfUsuario.getText(), tfSenha.getText());
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
