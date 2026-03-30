import java.util.Random;

public class LotteryGame1 extends javax.swing.JFrame {

    public LotteryGame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lottery Game");

        jButton1.setText("Generate Numbers");
        jButton2.setText("Clear");

        // BUTTON ACTIONS
        jButton1.addActionListener(evt -> generateLottery());
        jButton2.addActionListener(evt -> jTextArea1.setText(""));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(10);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }

    // ✅ MAIN METHOD
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new LotteryGame123().setVisible(true));
    }

    // ✅ BUTTON LOGIC
    private void generateLottery() {
        int selectionBound = 63;

        int[] take3 = generateUniqueNumbers(4, selectionBound);
        int[] take4 = generateUniqueNumbers(5, selectionBound);
        int[] take5 = generateUniqueNumbers(6, selectionBound);

        jTextArea1.append("Take 3: " + arrayToString(take3) + "\n");
        jTextArea1.append("Take 4: " + arrayToString(take4) + "\n");
        jTextArea1.append("Take 5: " + arrayToString(take5) + "\n\n");
    }

    // ✅ GENERATE UNIQUE NUMBERS (NO HASHSET)
    public static int[] generateUniqueNumbers(int size, int bound) {
        Random rand = new Random();
        int[] result = new int[size];
        int count = 0;

        while (count < size) {
            int num = rand.nextInt(bound) + 1;

            boolean exists = false;
            for (int i = 0; i < count; i++) {
                if (result[i] == num) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                result[count++] = num;
            }
        }

        return result;
    }

    // ✅ FORMAT ARRAY
    private String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString();
    }

    // GUI VARIABLES
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
}