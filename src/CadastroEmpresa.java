import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroEmpresa extends JDialog implements ActionListener{

    public JLabel lNome, lEmail, lLogradouro, lCep, lBairro, lNum, lCidade, lSenha;
    public JTextField tfNome, tfEmail, tfLogradouro, tfCep, tfBairro, tfNum, tfCidade;
    public JPasswordField tfSenha;
    public JTextArea taDescricao;
    public JButton bSalvar, bCancelar;
    public SiROS siros;

    CadastroEmpresa(Frame owner, String title, boolean modal, SiROS siros){

        super(owner, title, modal);
        this.siros = siros;
        setTitle("SiROS");
        ImageIcon iLogo = new ImageIcon("src/imgs/icon01.png");
        setIconImage(iLogo.getImage());
        setResizable(false);
        setBounds(550,60,530,670);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        areaTrabalho.setBackground(new Color(93,63, 211));

        lNome = new JLabel("Nome da Empresa");
        lNome.setBounds(20,25,120,40);
        lNome.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfNome = new JTextField("");
        tfNome.setBounds(20, 60, 170, 30);
        tfNome.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        tfNome.setEditable(true);

        lEmail = new JLabel("Email");
        lEmail.setBounds(230, 25, 80, 40);
        lEmail.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfEmail = new JTextField("  Ex: exemplo@exemplo.com");
        tfEmail.setBounds(230, 60, 180,30);
        tfEmail.setFont(new Font("TimesRoman", Font.ITALIC, 12));

        taDescricao = new JTextArea( 480, 130);
        taDescricao.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        taDescricao.setText("   Descreva mais sobre sua empresa...");
        taDescricao.setLineWrap(true);
        taDescricao.setWrapStyleWord(true);
        taDescricao.setBackground(Color.white);

        JScrollPane pRolagem = new JScrollPane(taDescricao);
        pRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pRolagem.setBounds(20, 110, 410, 100);
        areaTrabalho.add(pRolagem);

        lLogradouro = new JLabel("Logradouro");
        lLogradouro.setBounds(20, 30, 140, 30);
        lLogradouro.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfLogradouro = new JTextField();
        tfLogradouro.setBounds(20, 60, 180, 30);
        tfLogradouro.setFont(new Font("TimesRoman", Font.BOLD, 12));

        lNum = new JLabel("Número");
        lNum.setBounds(230, 30, 100, 30);
        lNum.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfNum = new JTextField();
        tfNum.setBounds(230, 60, 100, 30);

        lBairro = new JLabel("Bairro");
        lBairro.setBounds(20, 90,100, 30);
        lBairro.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfBairro = new JTextField();
        tfBairro.setBounds(20, 120,180, 30);
        tfBairro.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        lCidade = new JLabel("Cidade");
        lCidade.setBounds(230, 90,100, 30);
        lCidade.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfCidade = new JTextField();
        tfCidade.setBounds(230, 120,160, 30);
        tfCidade.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        lCep = new JLabel("Cep");
        lCep.setBounds(20, 150,100, 30);
        lCep.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfCep = new JTextField();
        tfCep.setBounds(20, 175,180, 30);
        tfCep.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        lSenha = new JLabel("Escolha uma Senha");
        lSenha.setBounds(30, 465, 140, 30);
        lSenha.setFont(new Font("TimesRoman", Font.ITALIC, 14));

        tfSenha = new JPasswordField();
        tfSenha.setBounds(30, 495, 180, 30);
        tfSenha.setFont(new Font("TimesRoman", Font.BOLD, 12));

        //-------- Painel para agrupar dados da Empresa
        String titulo = "Cadastro de Empresa";
        Border borda = BorderFactory.createEtchedBorder();
        Border bordaTitulo = BorderFactory.createTitledBorder(borda, titulo,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION , new Font("TimesRoman", Font.PLAIN, 18));

        JPanel pCadastro = new JPanel();
        pCadastro.setBounds(30, 30, 455, 540);
        pCadastro.setLayout(null);
        pCadastro.setBorder(bordaTitulo);

        pCadastro.add(lNome);
        pCadastro.add(tfNome);
        pCadastro.add(lEmail);
        pCadastro.add(tfEmail);
        pCadastro.add(lSenha);
        pCadastro.add(tfSenha);
        pCadastro.add(pRolagem);

        //------ Painel para agrupar Dados do Endereço
        String titulo2 = "Seu Endereço";
        Border borda2 = BorderFactory.createEtchedBorder();
        Border bordaTitulo2 = BorderFactory.createTitledBorder(borda2, titulo2,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION , new Font("TimesRoman", Font.PLAIN, 18));

        JPanel pEndereco = new JPanel();
        pEndereco.setBounds(20, 230, 415, 230);
        pEndereco.setLayout(null);
        pEndereco.setBorder(bordaTitulo2);
        pEndereco.setBackground(new Color(252, 245, 95));

        pEndereco.add(lLogradouro);
        pEndereco.add(tfLogradouro);
        pEndereco.add(lNum);
        pEndereco.add(tfNum);
        pEndereco.add(lCidade);
        pEndereco.add(tfCidade);
        pEndereco.add(lBairro);
        pEndereco.add(tfBairro);
        pEndereco.add(lCep);
        pEndereco.add(tfCep);

        pCadastro.add(pEndereco);
        pCadastro.setBackground(new Color(252, 245, 95));
        areaTrabalho.add(pCadastro);

        //------ Adiciona Botões de Salvar e Cancelar

        //-----Botões
        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(this);
        bSalvar.setBounds(280, 585, 100, 30);
        bSalvar.setBackground(Color.white);
        areaTrabalho.add(bSalvar);

        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bCancelar.setBounds(385, 585, 100, 30);
        bCancelar.setBackground(Color.white);
        areaTrabalho.add(bCancelar);


    }

    public void cadastraEmpresa(){
        siros.cadastraEmpresa();
    }


    public void actionPerformed(ActionEvent e) {
        int temp = 0;
        if (e.getSource()==bSalvar){
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource()==bCancelar)
            setVisible(false);
        else
            temp = 0;

    }
}
