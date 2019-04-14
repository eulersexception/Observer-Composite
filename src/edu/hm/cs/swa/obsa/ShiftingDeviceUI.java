package edu.hm.cs.swa.obsa;

// TODO: import Observer

import edu.hm.cs.swa.obsa.observer.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ShiftingDeviceUI extends JFrame implements Observer {

    public static void main(String[] args) {
        // start new ShiftingDeviceUI
        new ShiftingDeviceUI(new ShiftingDevice());
    }

    private ShiftingDevice subject;

    public ShiftingDeviceUI(ShiftingDevice subject) {
        // create new subject
        this.subject = subject;
        //TODO uncomment registerObserver when implemented
        subject.registerObserver(this);

        initWindow();
        setLayout(null);
        addButtons();
        addImage();

        setVisible(true);
    }

    private void initWindow() {
        setTitle("Shifting Device (SD)");
        setSize(474, 326);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addImage() {
        JLabel label = new JLabel(new ImageIcon("src/assets/bmw_shifter.jpg"));
        label.setBounds(0, 0, 274, 326);
        add(label);
    }

    private void addButtons() {
        JButton drive = new JButton("forward");
        drive.setBounds(274, 20, 200, 50);
        drive.addActionListener(e -> {
            System.out.print("\n" + subject.getState().getName());
            subject.changeGears(SDButton.FORWARD);
        });
        add(drive);

        JButton reverse = new JButton("backward");
        reverse.setBounds(274, 110, 200, 50);
        reverse.addActionListener(e -> {
            System.out.print("\n" + subject.getState().getName());
            subject.changeGears(SDButton.BACKWARD);
        });
        add(reverse);

        JButton park = new JButton("park");
        park.setBounds(274, 200, 200, 50);
        park.addActionListener(e -> {
            System.out.print("\n" + subject.getState().getName());
            subject.changeGears(SDButton.PARK);
        });
        add(park);
    }

    @Override
    public void update() {
        System.out.println(subject.getState());
    }

    //TODO make sure you implement all Observer methods
    // the update method should use System.out.print to print all gear modes

}
