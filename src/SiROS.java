import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiROS extends JFrame implements ActionListener {

    public JMenuBar menuBar;
    public JMenu mFeed, mSistema, mLogin, mCadastro, mCategorias, mSaibaMais;
    public JMenuItem miUserLogin, miEmpLogin, miUserCadastro, miEmpCadastro, miSair;
    public JMenuItem miAlimentosBebidas, miTurismoLazer, miCasaConstrucao, miEducacao, miOutras;
    public JMenuItem miQmSomos, miFaleConosco;
    public JLabel lFeed, lTitle, lTitle2, imgL01, imgL02, imagL03, lNome;
    public Login fLogin;
    public Cadastro fCadastro;
    public FaleConosco fFaleConosc;
    public Publicacao fPublicacao;
    public CadastroEmpresa fCadastroEmpresa;
    public JPanel area;
    public Container areaTrabalho;
    public JButton bPublicacao, bSair;


    public SiROS() {

        setTitle("SiROS");
        setExtendedState(MAXIMIZED_BOTH);
        ImageIcon iLogo = new ImageIcon("src/imgs/icon01.png");
        setIconImage(iLogo.getImage());
        setVisible(true);
        setBounds(150,70,1050,650);
        setResizable(false);

        areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        areaTrabalho.setBackground(new Color(93,63, 211));

        //-------Menu
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        areaTrabalho.add(menuBar);

        mFeed = new JMenu("Feed");
        mSistema = new JMenu("Sistema");
        mLogin = new JMenu("Login");
        mCadastro = new JMenu("Cadastre-se");
        mCategorias = new JMenu("Categorias");
        mSaibaMais = new JMenu("Saiba Mais");


        menuBar.add(mSistema);
        menuBar.add(mFeed);
        menuBar.add(mLogin);
        menuBar.add(mCadastro);
        mFeed.setVisible(false);
        menuBar.add(mCategorias);
        menuBar.add(mSaibaMais);

        miUserLogin = new JMenuItem("Área do Cliente");
        miUserLogin.addActionListener(this);
        miEmpLogin = new JMenuItem("Área da Empresa");
        miEmpLogin.addActionListener(this);

        mLogin.add(miUserLogin);
        mLogin.addSeparator();
        mLogin.add(miEmpLogin);

        miUserCadastro = new JMenuItem("Você Cliente");
        miUserCadastro.addActionListener(this);
        miEmpCadastro = new JMenuItem("Você Empresa");
        miEmpCadastro.addActionListener(this);

        mCadastro.add(miUserCadastro);
        mCadastro.addSeparator();
        mCadastro.add(miEmpCadastro);

        miSair = new JMenuItem("Finalizar Sistema");
        miSair.addActionListener(this);

        mSistema.add(miSair);

        miAlimentosBebidas = new JMenuItem("Alimentos e Bebidas");
        miAlimentosBebidas.setEnabled(false);
        miTurismoLazer = new JMenuItem("Turismo e Lazer");
        miTurismoLazer.setEnabled(false);
        miEducacao = new JMenuItem("Educação");
        miEducacao.setEnabled(false);
        miCasaConstrucao = new JMenuItem("Casa e Construção");
        miCasaConstrucao.setEnabled(false);
        miOutras = new JMenuItem("Outras...");
        miOutras.setEnabled(false);

        mCategorias.add(miAlimentosBebidas);
        mCategorias.add(miTurismoLazer);
        mCategorias.add(miEducacao);
        mCategorias.add(miCasaConstrucao);
        mCategorias.addSeparator();
        mCategorias.add(miOutras);

        miQmSomos = new JMenuItem("Quem Somos");
        miFaleConosco = new JMenuItem("Fale Conosco :)");
        miFaleConosco.addActionListener(this);

        mSaibaMais.add(miQmSomos);
        mSaibaMais.addSeparator();
        mSaibaMais.add(miFaleConosco);

        //---------Body

        lTitle = new JLabel("SiROS");
        lTitle.setFont(new Font("Georgia Bold", Font.BOLD, 40));
        lTitle.setBounds(200, 85, 900,100);

        lTitle2 = new JLabel("Seu registro de opiniões preferido!");
        lTitle2.setFont(new Font("Georgia", Font.ITALIC, 24));
        lTitle2.setBounds(360, 90, 900,100);

        areaTrabalho.add(lTitle);
        areaTrabalho.add(lTitle2);

        ImageIcon img01 = new ImageIcon("src/imgs/imag001.png");
        imgL01 = new JLabel(img01);
        imgL01.setBounds(270,180,600,400);

        ImageIcon img02 = new ImageIcon("src/imgs/stars.png");
        imgL02 = new JLabel(img02);
        imgL02.setBounds(185,65,160,60);

        areaTrabalho.add(imgL01);
        areaTrabalho.add(imgL02);


        //---------Pós Login
        area = new JPanel();
        area.setBounds(200,20,650,580);
        area.setBackground(Color.white);
        areaTrabalho.add(area);
        area.setVisible(false);
        setVisible(true);

        lFeed = new JLabel("Feed");
        lFeed.setFont(new Font("TimesRoman", Font.BOLD, 18));
        lFeed.setBounds(90, 20, 100,100);
        area.add(lFeed);

        ImageIcon imag02 = new ImageIcon("src/imgs/yoda03.png");
        imagL03 = new JLabel(imag02);
        imagL03.setBounds(35,80, 130,70);
        areaTrabalho.add(imagL03);
        imagL03.setVisible(false);

        lNome = new JLabel("Baby Yoda");
        lNome.setFont(new Font("TimesRoman", Font.BOLD, 14));
        lNome.setBounds(60,145,100,30);
        areaTrabalho.add(lNome);
        lNome.setVisible(false);

        //--------Botões
        bPublicacao = new JButton("Nova Publicação");
        bPublicacao.addActionListener(this);
        bPublicacao.setBounds(30,200,140,30);
        bPublicacao.setBackground(Color.white);
        areaTrabalho.add(bPublicacao);
        bPublicacao.setVisible(false);

        bSair = new JButton("Logout");
        bSair.addActionListener(this);
        bSair.setBounds(30, 240, 140, 30);
        bSair.setBackground(Color.white);
        areaTrabalho.add(bSair);
        bSair.setVisible(false);


    }

    public void actionPerformed(ActionEvent e) {
        int temp=0;
        if (e.getSource()==miSair)
            System.exit(0);
        else if(e.getSource()==miUserLogin)
            logar();
        else if(e.getSource()==miEmpLogin)
            logar();
        else if(e.getSource()==miUserCadastro)
            cadastrar();
        else if(e.getSource()==miEmpCadastro)
            cadastraEmpresa();
        else if(e.getSource()==miFaleConosco)
            faleConosco();
        else if(e.getSource()==bPublicacao)
            publicacao();
        else if(e.getSource()==bSair)
            desconectar();
        else
            temp = 0;
    }

    public void conectar(String usuario, String senha){
        if(usuario.equals("yoda") && senha.equals("123")){
            fLogin.setVisible(false);
            conectar();
        }else
            JOptionPane.showMessageDialog(null, "Acesso Nao Autorizado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
    }


    public void logar(){
        fLogin = new Login(null, "SiROS: Login de Usuário.", true, this );
        fLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fLogin.setVisible(true);
    }

    public void cadastrar(){
        fCadastro = new Cadastro(null, "SiROS: Cadastro", true, this);
        fCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fCadastro.setVisible(true);
    }

    public void cadastraEmpresa(){
        fCadastroEmpresa = new CadastroEmpresa(null, "SiROS: Cadastro", true, this);
        fCadastroEmpresa.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fCadastroEmpresa.setVisible(true);
    }

    public void faleConosco(){
        fFaleConosc = new FaleConosco(null, "SiROS: Fale Conosco", true, this);
        fFaleConosc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fFaleConosc.setVisible(true);
    }

    public void publicacao(){
        fPublicacao = new Publicacao(null, "Criar Publicação", true, this);
        fPublicacao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fPublicacao.setVisible(true);
    }

    public void conectar(){
        lTitle.setVisible(false);
        lTitle2.setVisible(false);
        imgL01.setVisible(false);
        imgL02.setVisible(false);
        mLogin.setEnabled(false);
        mCadastro.setEnabled(false);
        miAlimentosBebidas.setEnabled(true);
        miTurismoLazer.setEnabled(true);
        miEducacao.setEnabled(true);
        miCasaConstrucao.setEnabled(true);
        miOutras.setEnabled(true);
        mFeed.setVisible(true);
        area.setVisible(true);
        lNome.setVisible(true);
        imagL03.setVisible(true);
        bPublicacao.setVisible(true);
        bSair.setVisible(true);

    }

    public void desconectar(){
        lTitle.setVisible(true);
        lTitle2.setVisible(true);
        imgL01.setVisible(true);
        imgL02.setVisible(true);
        mLogin.setEnabled(true);
        mCadastro.setEnabled(true);
        miAlimentosBebidas.setEnabled(false);
        miTurismoLazer.setEnabled(false);
        miEducacao.setEnabled(false);
        miCasaConstrucao.setEnabled(false);
        miOutras.setEnabled(false);
        mFeed.setVisible(false);
        area.setVisible(false);
        lNome.setVisible(false);
        imagL03.setVisible(false);
        bPublicacao.setVisible(false);
        bSair.setVisible(false);
    }


    public static void main(String[] args) {
        SiROS siros = new SiROS();
        siros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



