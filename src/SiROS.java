import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiROS extends JFrame implements ActionListener {

    public JMenuBar menuBar;
    public JMenu mSistema, mCategorias, mSobre, mSaibaMais;
    public JMenuItem miLogin, miCadastro, miSair;
    public JMenuItem miAlimentosBebidas, miTurismoLazer, miCasaConstrucao, miEducacao, miOutras;
    public JMenuItem miQmSomos, miFaleConosco;
    public JLabel lTitulo;
    public Login fLogin;
    public Cadastro fCadastro;
    public FaleConosco fFaleConosc;


    public SiROS() {

        setTitle("SiROS");
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        setBounds(400,200,600,400);
        setResizable(false);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        areaTrabalho.setBackground(Color.white);

        //-------Menu
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        areaTrabalho.add(menuBar);

        mSistema = new JMenu("Sistema");
        mCategorias = new JMenu("Categorias");
        mSobre = new JMenu("Sobre");
        mSaibaMais = new JMenu("Saiba Mais");

        menuBar.add(mSistema);
        menuBar.add(mCategorias);
        menuBar.add(mSaibaMais);

        miLogin = new JMenuItem("Login >");
        miLogin.addActionListener(this);
        miCadastro = new JMenuItem("Cadastro >>");
        miCadastro.addActionListener(this);
        miSair = new JMenuItem("Sair");
        miSair.addActionListener(this);

        mSistema.add(miLogin);
        mSistema.add(miCadastro);
        mSistema.addSeparator();
        mSistema.add(miSair);

        miAlimentosBebidas = new JMenuItem("Alimentos e Bebidas");
        miTurismoLazer = new JMenuItem("Turismo e Lazer");
        miEducacao = new JMenuItem("Educação");
        miCasaConstrucao = new JMenuItem("Casa e Construção");
        miOutras = new JMenuItem("Outras...");

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

        ImageIcon img01 = new ImageIcon("src/5417912.jpg");
        JLabel imgL01 = new JLabel(img01);
        imgL01.setBounds(70,10,400,300);
        areaTrabalho.add(imgL01);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int temp=0;
        if (e.getSource()==miSair)
            System.exit(0);
        else if(e.getSource()==miLogin)
            logar();
        else if(e.getSource()==miCadastro)
            cadastrar();
        else if(e.getSource()==miFaleConosco)
            faleConosco();
        else
            temp = 0;
    }

    public void conectar(String usuario, String senha){
        if(usuario.equals("aluno") && senha.equals("123")){
            JOptionPane.showMessageDialog(null, "Acesso Autorizado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "Acesso Nao Autorizado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void Perfil(){

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

    public void faleConosco(){
        fFaleConosc = new FaleConosco(null, "SiROS: Fale Conosco", true, this);
        fFaleConosc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        fFaleConosc.setVisible(true);
    }


    public static void main(String[] args) {
        SiROS siros = new SiROS();
        siros.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



