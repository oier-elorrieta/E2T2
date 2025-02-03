package aplikazioa;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Profil_Berria {

    JFrame frame;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Profil_Berria window = new Profil_Berria();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Profil_Berria() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 721, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel labelConImagen = new JLabel();
        labelConImagen.setBounds(0, 0, 705, 426);
        labelConImagen.setIcon(new ImageIcon(getClass().getResource("/img/fondo2.jpg")));
        frame.getContentPane().add(labelConImagen);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(197, 32, 296, 363);
        panel_1.setBackground(new Color(255, 255, 255, 120));
        frame.getContentPane().add(panel_1);

        frame.getContentPane().setComponentZOrder(labelConImagen, frame.getContentPane().getComponentCount() - 1);
        frame.getContentPane().setComponentZOrder(panel_1, 0);
        panel_1.setLayout(null);

        JLabel lblNewLabel = new JLabel("Bidai berria");
        lblNewLabel.setBounds(40, 40, 89, 14);
        panel_1.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(151, 37, 123, 20);
        panel_1.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Bidai mota");
        lblNewLabel_1.setBounds(40, 77, 74, 14);
        panel_1.add(lblNewLabel_1);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(151, 73, 123, 22);
        panel_1.add(comboBox);

        comboBox.addItem("Bidai Simplea");
        comboBox.addItem("Bidai Ostatua");

        JLabel lblNewLabel_2 = new JLabel("Bidai hasiera");
        lblNewLabel_2.setBounds(40, 119, 89, 14);
        panel_1.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Herrialdea");
        lblNewLabel_3.setBounds(40, 193, 89, 14);
        panel_1.add(lblNewLabel_3);

        JComboBox<String> comboBox_1 = new JComboBox<>();
        comboBox_1.setBounds(151, 189, 123, 22);
        panel_1.add(comboBox_1);
        
        JLabel lblNewLabel_4 = new JLabel("Deskribapena");
        lblNewLabel_4.setBounds(40, 240, 89, 14);
        panel_1.add(lblNewLabel_4);
        
        textField_1 = new JTextField();
        textField_1.setBounds(151, 237, 123, 46);
        panel_1.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_5 = new JLabel("Zerbitzuetan ez");
        lblNewLabel_5.setBounds(40, 292, 89, 32);
        panel_1.add(lblNewLabel_5);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(151, 298, 123, 46);
        panel_1.add(textField_2);
/* ESTO DEBE SER DESDE LA DATU BASE */
        String[] paises = {
            "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", 
            "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", 
            "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Belice", "Benín", 
            "Bielorrusia", "Birmania", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", 
            "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", 
            "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", 
            "Congo (República del)", "Corea del Norte", "Corea del Sur", "Costa Rica", "Croacia", 
            "Cuba", "Curazao", "Chipre", "Dominica", "Egipto", "El Salvador", "Emiratos Árabes Unidos", 
            "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Esuatini", 
            "Etiopía", "Fiyi", "Filipinas", "Finlandia", "Francia", "Gabón", "Gambia", "Georgia", 
            "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guyana", "Haití", 
            "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", 
            "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", 
            "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kosovo", "Kuwait", "Laos", "Lesoto", 
            "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", 
            "Madagascar", "Malawi", "Malasia", "Malaui", "Maldivas", "Mali", "Malta", "Marruecos", 
            "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", 
            "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", 
            "Noruega", "Nueva Zelanda", "Omán", "Pakistán", "Palau", "Panamá", "Papúa Nueva Guinea", 
            "Paraguay", "Perú", "Polonia", "Portugal", "Puerto Rico", "Qatar", "Rumanía", "Rusia", 
            "Ruanda", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", 
            "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", 
            "Sri Lanka", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Siria", 
            "Taiwán", "Tanzania", "Tailandia", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", 
            "Turquía", "Tuvalu", "Uganda", "Ucrania", "Uruguay", "Vanuatu", "Venezuela", "Vietnam", 
            "Yemen", "Yibuti", "Zambia", "Zimbabue"
        };

        for (String pais : paises) {
            comboBox_1.addItem(pais);
            
        }
    }
}

