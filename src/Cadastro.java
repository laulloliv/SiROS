import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cadastro extends JDialog implements ActionListener{

    public JLabel lNome, lEmail, lDataNasc, lSexo, lSenha;
    public JTextField tfNome, tfEmail, tfDataNasc, tfUsuario;
    public JPasswordField tfSenha;
    public JComboBox cbSexo;
    public JButton bSalvar, bCancelar;
    public SiROS siros;

    public Cadastro(Frame owner, String title, boolean modal, SiROS siros){

        super(owner, title, modal);
        this.siros = siros;
        setTitle("SiROS");
        setResizable(false);
        setBounds(400,200,480,400);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);

        lNome = new JLabel("Nome / NickName");
        lNome.setBounds(20,25,120,40);
        lNome.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfNome = new JTextField("");
        tfNome.setBounds(20, 60, 140, 30);
        tfNome.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        tfNome.setEditable(true);

        lEmail = new JLabel("Email");
        lEmail.setBounds(200, 25, 80, 40);
        lEmail.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfEmail = new JTextField("  Ex: exemplo@exemplo.com");
        tfEmail.setBounds(200, 60, 180,30);
        tfEmail.setFont(new Font("TimesRoman", Font.ITALIC, 12));

        lDataNasc = new JLabel("Data de nascimento");
        lDataNasc.setBounds(20, 90, 140, 40);
        lDataNasc.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfDataNasc = new JTextField("   Ex: 19/10/2000");
        tfDataNasc.setBounds(20, 125, 160, 30);
        tfDataNasc.setFont(new Font("TimesRoman", Font.ITALIC, 12));

        lSexo = new JLabel("Sexo");
        lSexo.setBounds(220, 90, 100, 40);
        lSexo.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        cbSexo = new JComboBox();
        cbSexo.addItem("--Selecione--");
        cbSexo.addItem("Feminino");
        cbSexo.addItem("Masculino");
        cbSexo.addItem("Outro");
        cbSexo.setBackground(Color.white);
        cbSexo.setFont(new Font("TimesRoman", Font.BOLD, 12));
        cbSexo.setBounds(220, 125, 160, 30);

        lSenha = new JLabel("Escolha uma Senha");
        lSenha.setBounds(20, 170, 140, 30);
        lSenha.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfSenha = new JPasswordField();
        tfSenha.setBounds(20, 200, 180, 30);
        tfSenha.setFont(new Font("TimesRoman", Font.BOLD, 12));

        //-----Botões
        bSalvar = new JButton("Salvar");
        bSalvar.setBounds(90, 300, 120, 30);
        areaTrabalho.add(bSalvar);

        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bCancelar.setBounds(250, 300, 120, 30);
        areaTrabalho.add(bCancelar);


        //Painel para agrupar objetos
        String titulo = "Cadastro de Usuário";
        Border borda = BorderFactory.createEtchedBorder();
        Border bordaTitulo = BorderFactory.createTitledBorder(borda, titulo,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION , new Font("TimesRoman", Font.PLAIN, 18));

        JPanel pCadastro = new JPanel();
        pCadastro.setBounds(30, 10, 405, 260);
        pCadastro.setLayout(null);
        pCadastro.setBorder(bordaTitulo);

        pCadastro.add(lNome);
        pCadastro.add(tfNome);
        pCadastro.add(lEmail);
        pCadastro.add(tfEmail);
        pCadastro.add(lDataNasc);
        pCadastro.add(tfDataNasc);
        pCadastro.add(lSexo);
        pCadastro.add(cbSexo);
        pCadastro.add(lSenha);
        pCadastro.add(tfSenha);

        areaTrabalho.add(pCadastro);

    }

    public void cadastrar(){
        siros.cadastrar();
    }

    public void actionPerformed(ActionEvent e) {
        int temp = 0;
        if (e.getSource()==bCancelar)
            setVisible(false);
        else
            temp = 0;
    }
}
