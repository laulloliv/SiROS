import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Publicacao extends JDialog implements ActionListener{

    public SiROS siros;
    public JLabel lNome, lNota, lLocal, lPrestador;
    public JTextField tfNota, tfLocal, tfPrestador;
    public JTextArea taDescricao;
    public ImageIcon imag02;
    public JComboBox cbCategorias, cbNotas;
    public JButton bSalvar, bCancelar;

    public Publicacao(Frame owner, String title, boolean modal, SiROS siros) {
        super(owner, title, modal);

        setTitle("Criar Publicação");
        this.siros = siros;
        ImageIcon iLogo = new ImageIcon("src/imgs/icon01.png");
        setIconImage(iLogo.getImage());
        setResizable(false);
        setBounds(300,300,560,400);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        areaTrabalho.setBackground(new Color(252, 245, 95));

        imag02 = new ImageIcon("src/imgs/yoda03.png");
        JLabel imagL02 = new JLabel(imag02);
        imagL02.setBounds(5,30, 130,70);
        areaTrabalho.add(imagL02);

        lNome = new JLabel("Baby Yoda");
        lNome.setFont(new Font("TimesRoman", Font.BOLD, 14));
        lNome.setBounds(120,30,100,30);
        areaTrabalho.add(lNome);

        cbCategorias = new JComboBox();
        cbCategorias.addItem("        --- Selecione ---");
        cbCategorias.addItem("Alimentos e Bebidas");
        cbCategorias.addItem("Turismo e Lazer");
        cbCategorias.addItem("Educação e Universidades");
        cbCategorias.addItem("Tecnologia e Eletrônicos");
        cbCategorias.addItem("Casa e Construção");
        cbCategorias.addItem("Outras...");
        cbCategorias.setBackground(Color.white);
        cbCategorias.setFont(new Font("TimesRoman", Font.BOLD, 12));
        cbCategorias.setBounds(120, 60, 160, 30);
        areaTrabalho.add(cbCategorias);

        lNota = new JLabel("Nota");
        lNota.setFont(new Font("TimesRoman", Font.BOLD, 14));
        lNota.setBounds(320,30,50,30);
        areaTrabalho.add(lNota);

        cbNotas = new JComboBox();
        cbNotas.addItem("   -- ?? --");
        cbNotas.addItem("  10/10");
        cbNotas.addItem("  9/10");
        cbNotas.addItem("  8/10");
        cbNotas.addItem("  7/10");
        cbNotas.addItem("  6/10");
        cbNotas.addItem("  5/10");
        cbNotas.addItem("  4/10");
        cbNotas.addItem("  3/10");
        cbNotas.addItem("  2/10");
        cbNotas.addItem("  1/10");
        cbNotas.addItem("  0/10");
        cbNotas.setBackground(Color.white);
        cbNotas.setFont(new Font("TimesRoman", Font.BOLD, 14));
        cbNotas.setBounds(320, 60, 100, 30);
        areaTrabalho.add(cbNotas);

        lPrestador = new JLabel("Prestador");
        lPrestador.setFont(new Font("TimesRoman", Font.BOLD, 14));
        lPrestador.setBounds(30,110,100,30);
        areaTrabalho.add(lPrestador);

        tfPrestador = new JTextField("  Ex: Café da LÔ...");
        tfPrestador.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        tfPrestador.setBounds(110, 110, 400, 30);
        areaTrabalho.add(tfPrestador);

        taDescricao = new JTextArea( 280, 130);
        taDescricao.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        taDescricao.setText("   Descreva aqui sua avaliação...");
        taDescricao.setLineWrap(true);
        taDescricao.setWrapStyleWord(true);
        taDescricao.setBackground(Color.white);

        JScrollPane pRolagem = new JScrollPane(taDescricao);
        pRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        pRolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pRolagem.setBounds(30, 150, 480, 100);
        areaTrabalho.add(pRolagem);

        lLocal = new JLabel("Local");
        lLocal.setFont(new Font("TimesRoman", Font.BOLD, 14));
        lLocal.setBounds(30,260,50,30);
        areaTrabalho.add(lLocal);

        tfLocal = new JTextField("  Ex: Av. Exemplo, 000...");
        tfLocal.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        tfLocal.setBounds(80, 260, 430, 30);
        areaTrabalho.add(tfLocal);

        //-----Botões
        bSalvar = new JButton("Salvar");
        bSalvar.addActionListener(this);
        bSalvar.setBounds(300, 300, 100, 30);
        bSalvar.setBackground(Color.white);
        areaTrabalho.add(bSalvar);

        bCancelar = new JButton("Cancelar");
        bCancelar.addActionListener(this);
        bCancelar.setBounds(410, 300, 100, 30);
        bCancelar.setBackground(Color.white);
        areaTrabalho.add(bCancelar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int temp = 0;
        if (e.getSource()==bCancelar){
          setVisible(false);
        }
        else
            temp = 0;
    }

}
