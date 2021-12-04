import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FaleConosco extends JDialog{

    public JLabel lTexto, lContatos, lContatos2, lContatos3;
    public JButton bSair;
    public SiROS siros;

    FaleConosco(Frame owner, String title, boolean modal, SiROS siros){

        super(owner, title, modal);
        this.siros = siros;
        setTitle("SiROS");
        setResizable(false);
        setBounds(400,200,400,250);

        Container areaTrabalho = getContentPane();
        areaTrabalho.setLayout(null);
        //areaTrabalho.setBackground(Color.white);

        lTexto = new JLabel("Olá! Bem-Vindo ao Fale Conosco :)");
        lTexto.setFont(new Font("TimesRoman", Font.BOLD, 18));
        lTexto.setBounds(30, 10, 340, 50);

        lContatos = new JLabel("Telefone: +55 (99) 99999-9999");
        lContatos.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        lContatos.setBounds(10, 30, 340, 30);

        lContatos2 = new JLabel("ou +55 (00) 00000-0000");
        lContatos2.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        lContatos2.setBounds(80, 50, 340, 30);

        lContatos3 = new JLabel("Email: faleconosco@faleconosco.com");
        lContatos3.setFont(new Font("TimesRoman", Font.ITALIC, 14));
        lContatos3.setBounds(10, 80, 340, 30);

        areaTrabalho.add(lTexto);
        areaTrabalho.add(lContatos);

        String titulo = "Nossos Contatos";
        Border borda = BorderFactory.createEtchedBorder();
        Border bordaTitulo = BorderFactory.createTitledBorder(borda, titulo,
                TitledBorder.DEFAULT_JUSTIFICATION , TitledBorder.DEFAULT_POSITION , new Font("TimesRoman", Font.PLAIN, 18));

        JPanel pContatos = new JPanel();
        pContatos.setBounds(40, 70, 300, 120);
        pContatos.setLayout(null);
        pContatos.setBorder(bordaTitulo);

        pContatos.add(lContatos);
        pContatos.add(lContatos2);
        pContatos.add(lContatos3);
        pContatos.setBackground(Color.white);
        areaTrabalho.add(pContatos);

    }

    public void faleconosco(){
        siros.faleConosco();
    }
}
