import javax.swing.*;
import java.awt.*;

public class SiROS extends JFrame {

    public JMenuBar menuBar;
    public JMenu mFeed, mCategorias, mLogin, mCadastro, mSobre, mSaibaMais;
    public JMenuItem miQmSomos;
    public JMenuItem miAlimentosBebidas, miTurismoLazer, miBancosCartoes, miCasaConstrucao, miEducacao, miOutras;
    public JLabel lTitulo;


    public SiROS() {

        setTitle("SiROS");
        setVisible(true);
        setResizable(false);
        setExtendedState(MAXIMIZED_BOTH);
        setBounds(400,400,600,400);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);

        //-------Menu
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        areaTrabalho.add(menuBar);

        mFeed = new JMenu("Feed");
        mCategorias = new JMenu("Categorias");
        mLogin = new JMenu("Login");
        mCadastro = new JMenu("Cadastro");
        mSobre = new JMenu("Sobre");
        mSaibaMais = new JMenu("Saiba Mais");

        menuBar.add(mSobre);
        menuBar.add(mFeed);
        menuBar.add(mCategorias);
        menuBar.add(mLogin);
        menuBar.add(mCadastro);
        menuBar.add(mSaibaMais);

        miQmSomos = new JMenuItem("Quem Somos");

        mSobre.add(miQmSomos);

        miAlimentosBebidas = new JMenuItem("Alimentos e Bebidas");
        miTurismoLazer = new JMenuItem("Turismo e Lazer");
        miBancosCartoes = new JMenuItem("Bancos e Cartões");
        miEducacao = new JMenuItem("Educação");
        miCasaConstrucao = new JMenuItem("Casa e Construção");
        miOutras = new JMenuItem("Outras...");

        mCategorias.add(miAlimentosBebidas);
        mCategorias.add(miTurismoLazer);
        mCategorias.add(miBancosCartoes);
        mCategorias.add(miEducacao);
        mCategorias.add(miCasaConstrucao);
        mCategorias.addSeparator();
        mCategorias.add(miOutras);


        setVisible(true);

    }

    public static void main(String[] args) {
        SiROS sistema = new SiROS();
        sistema.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



