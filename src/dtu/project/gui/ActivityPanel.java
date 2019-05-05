/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtu.project.gui;

import dtu.project.app.Activity;
import dtu.project.enums.ActivityType;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.PatternSyntaxException;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Jonathan
 */
public class ActivityPanel extends PanelTemplate {

    /**
     * Creates new form ActivityPanel
     */
    public ActivityPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectProjectLabel1 = new javax.swing.JLabel();
        projectListComboBox1 = new javax.swing.JComboBox<>();
        activityNameLabel1 = new javax.swing.JLabel();
        activityNameTextField1 = new javax.swing.JTextField();
        activityTypeLabel1 = new javax.swing.JLabel();
        activityUserLabel1 = new javax.swing.JLabel();
        estimatedHoursLabel1 = new javax.swing.JLabel();
        activityStartDateLabel1 = new javax.swing.JLabel();
        activityEndDateLabel1 = new javax.swing.JLabel();
        activityTypeComboBox1 = new javax.swing.JComboBox<>();
        activityUserComboBox1 = new javax.swing.JComboBox<>();
        estimatedHoursTextField1 = new javax.swing.JTextField();
        activityStartDateTextField1 = new javax.swing.JTextField();
        activityEndDateTextField1 = new javax.swing.JTextField();
        addActivityButton = new javax.swing.JButton();
        activityStartDateLabel2 = new javax.swing.JLabel();
        activityEndDateLabel2 = new javax.swing.JLabel();
        activityTypeComboBox2 = new javax.swing.JComboBox<>();
        activityUserComboBox2 = new javax.swing.JComboBox<>();
        estimatedHoursTextField2 = new javax.swing.JTextField();
        activityStartDateTextField2 = new javax.swing.JTextField();
        activityNameLabel2 = new javax.swing.JLabel();
        activityEndDateTextField2 = new javax.swing.JTextField();
        activityNameTextField2 = new javax.swing.JTextField();
        editActivityButton = new javax.swing.JButton();
        activityTypeLabel2 = new javax.swing.JLabel();
        activityUserLabel2 = new javax.swing.JLabel();
        estimatedHoursLabel2 = new javax.swing.JLabel();
        activitySelectLabel1 = new javax.swing.JLabel();
        activitySelectComboBox1 = new javax.swing.JComboBox<>();
        activitySelectLabel2 = new javax.swing.JLabel();
        activitySelectComboBox2 = new javax.swing.JComboBox<>();
        removeActivityButton = new javax.swing.JButton();

        selectProjectLabel1.setText("Select Project");

        projectListComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        activityNameLabel1.setText("Activity Name");

        activityNameTextField1.setText("Activity Name");

        activityTypeLabel1.setText("Activity Type");

        activityUserLabel1.setText("Primary User");

        estimatedHoursLabel1.setText("Estimated Hours");

        activityStartDateLabel1.setText("Start Date");

        activityEndDateLabel1.setText("End Date");

        activityTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        activityUserComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        estimatedHoursTextField1.setText("45");

        activityStartDateTextField1.setText("2019-05-05 13:12");

        activityEndDateTextField1.setText("2019-05-05 13:13");

        addActivityButton.setText("Add Activity");
        addActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActivityButtonActionPerformed(evt);
            }
        });

        activityStartDateLabel2.setText("Start Date");

        activityEndDateLabel2.setText("End Date");

        activityTypeComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        activityUserComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        estimatedHoursTextField2.setText("45");

        activityStartDateTextField2.setText("2019-05-05 13:12");

        activityNameLabel2.setText("Activity Name");

        activityEndDateTextField2.setText("2019-05-05 13:13");

        activityNameTextField2.setText("Activity Name");

        editActivityButton.setText("Edit Activity");
        editActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActivityButtonActionPerformed(evt);
            }
        });

        activityTypeLabel2.setText("Activity Type");

        activityUserLabel2.setText("Primary User");

        estimatedHoursLabel2.setText("Estimated Hours");

        activitySelectLabel1.setText("Activity");

        activitySelectComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        activitySelectLabel2.setText("Activity");

        activitySelectComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        removeActivityButton.setText("Remove Activity");
        removeActivityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActivityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(activitySelectComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(activitySelectComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addComponent(activityTypeLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(activityUserLabel2)
                                        .addGap(51, 51, 51)
                                        .addComponent(estimatedHoursLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(activityStartDateLabel2)
                                        .addGap(49, 49, 49)
                                        .addComponent(activityEndDateLabel2))
                                    .addComponent(activitySelectLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(activityNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(activityNameLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(activityTypeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(activityTypeLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(activityUserComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(estimatedHoursTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(activityUserLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(estimatedHoursLabel1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(activityStartDateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(activityStartDateLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(activityEndDateLabel1)
                                            .addComponent(activityEndDateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(13, 13, 13)))
                        .addGap(22, 131, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectProjectLabel1)
                            .addComponent(projectListComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addActivityButton)
                            .addComponent(activityNameLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(activityNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activityTypeComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activityUserComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(estimatedHoursTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activityStartDateTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(activityEndDateTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editActivityButton)
                            .addComponent(activitySelectLabel2)
                            .addComponent(removeActivityButton))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(selectProjectLabel1)
                .addGap(1, 1, 1)
                .addComponent(projectListComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityNameLabel1)
                    .addComponent(activityTypeLabel1)
                    .addComponent(activityUserLabel1)
                    .addComponent(estimatedHoursLabel1)
                    .addComponent(activityEndDateLabel1)
                    .addComponent(activityStartDateLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityNameTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityTypeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityUserComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estimatedHoursTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityStartDateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityEndDateTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addActivityButton)
                .addGap(18, 18, 18)
                .addComponent(activitySelectLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activitySelectComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityNameLabel2)
                    .addComponent(activityTypeLabel2)
                    .addComponent(activityUserLabel2)
                    .addComponent(estimatedHoursLabel2)
                    .addComponent(activityStartDateLabel2)
                    .addComponent(activityEndDateLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(activityNameTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityTypeComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityUserComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estimatedHoursTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityStartDateTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activityEndDateTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editActivityButton)
                .addGap(18, 18, 18)
                .addComponent(activitySelectLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activitySelectComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeActivityButton)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActivityButtonActionPerformed
        try {
            if (ActivityType.valueOf(activityTypeComboBox1.getItemAt(activityTypeComboBox1.getSelectedIndex())) == ActivityType.WORK) {
                PA.addActivity(PA.getProjectList().get(projectListComboBox1.getSelectedIndex()),
                        new Activity.Builder()
                                .setActivityName(activityNameTextField1.getText())
                                .setActivityType(ActivityType.valueOf(activityTypeComboBox1.getItemAt(activityTypeComboBox1.getSelectedIndex())))
                                .setEstimatedHours(Integer.valueOf(estimatedHoursTextField1.getText()))
                                .setTimePeriod(activityStartDateTextField1.getText(), activityEndDateTextField1.getText())
                                .setUser(PA.getUserList().get(activityUserComboBox2.getSelectedIndex()))
                                .build());
            } else {
                PA.addActivity(null,
                        new Activity.Builder()
                                .setActivityName(activityNameTextField1.getText())
                                .setActivityType(ActivityType.valueOf(activityTypeComboBox1.getItemAt(activityTypeComboBox1.getSelectedIndex())))
                                .setTimePeriod(activityStartDateTextField1.getText(), activityEndDateTextField1.getText())
                                .setUser(PA.getUserList().get(activityUserComboBox2.getSelectedIndex()))
                                .build());
            }
        } catch (NumberFormatException | DateTimeParseException | PatternSyntaxException e) {
            System.err.println(e);
        }

        MF.updateAll();
    }//GEN-LAST:event_addActivityButtonActionPerformed

    private void editActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActivityButtonActionPerformed
        try {
            PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).getActivities().set(activityUserComboBox1.getSelectedIndex(),
                    new Activity.Builder(
                            PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).getActivities().get(activityUserComboBox1.getSelectedIndex())
                    )
                            .setActivityName(activityNameTextField2.getText())
                            .setActivityType(ActivityType.valueOf(activityTypeComboBox2.getItemAt(activityTypeComboBox2.getSelectedIndex())))
                            .setEstimatedHours(Integer.valueOf(estimatedHoursTextField2.getText()))
                            .setTimePeriod(activityStartDateTextField2.getText(), activityEndDateTextField2.getText())
                            .setUser(PA.getUserList().get(activityUserComboBox2.getSelectedIndex()))
                            
                            .build());
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | DateTimeParseException | PatternSyntaxException e) {
            System.err.println(e);
        }
        PA.generateReport(PA.getProjectList().get(projectListComboBox1.getSelectedIndex()));
        MF.updateAll();
    }//GEN-LAST:event_editActivityButtonActionPerformed

    private void removeActivityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActivityButtonActionPerformed
        PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).removeActivity(PA.getProjectList().
                get(projectListComboBox1.getSelectedIndex()).getActivities().get(activityUserComboBox1.getSelectedIndex()));
        MF.updateAll();
    }//GEN-LAST:event_removeActivityButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityEndDateLabel1;
    private javax.swing.JLabel activityEndDateLabel2;
    private javax.swing.JTextField activityEndDateTextField1;
    private javax.swing.JTextField activityEndDateTextField2;
    private javax.swing.JLabel activityNameLabel1;
    private javax.swing.JLabel activityNameLabel2;
    private javax.swing.JTextField activityNameTextField1;
    private javax.swing.JTextField activityNameTextField2;
    private javax.swing.JComboBox<String> activitySelectComboBox1;
    private javax.swing.JComboBox<String> activitySelectComboBox2;
    private javax.swing.JLabel activitySelectLabel1;
    private javax.swing.JLabel activitySelectLabel2;
    private javax.swing.JLabel activityStartDateLabel1;
    private javax.swing.JLabel activityStartDateLabel2;
    private javax.swing.JTextField activityStartDateTextField1;
    private javax.swing.JTextField activityStartDateTextField2;
    private javax.swing.JComboBox<String> activityTypeComboBox1;
    private javax.swing.JComboBox<String> activityTypeComboBox2;
    private javax.swing.JLabel activityTypeLabel1;
    private javax.swing.JLabel activityTypeLabel2;
    private javax.swing.JComboBox<String> activityUserComboBox1;
    private javax.swing.JComboBox<String> activityUserComboBox2;
    private javax.swing.JLabel activityUserLabel1;
    private javax.swing.JLabel activityUserLabel2;
    private javax.swing.JButton addActivityButton;
    private javax.swing.JButton editActivityButton;
    private javax.swing.JLabel estimatedHoursLabel1;
    private javax.swing.JLabel estimatedHoursLabel2;
    private javax.swing.JTextField estimatedHoursTextField1;
    private javax.swing.JTextField estimatedHoursTextField2;
    private javax.swing.JComboBox<String> projectListComboBox1;
    private javax.swing.JButton removeActivityButton;
    private javax.swing.JLabel selectProjectLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void initFields() {
        activityTypeComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{ActivityType.WORK.toString(), ActivityType.HOLIDAY.toString(), ActivityType.UNPAID.toString()}));
        activityUserComboBox1.setModel(new DefaultComboBoxModel(PA.getUserList().toArray()));
        activityTypeComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{ActivityType.WORK.toString(), ActivityType.HOLIDAY.toString(), ActivityType.UNPAID.toString()}));
        activityUserComboBox2.setModel(new DefaultComboBoxModel(PA.getUserList().toArray()));
        if (PA.getProjectList().isEmpty()) {
            projectListComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"empty"}));
            activitySelectComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"empty"}));
            activitySelectComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"empty"}));
            addActivityButton.setEnabled(false);
            editActivityButton.setEnabled(false);
            removeActivityButton.setEnabled(false);
        } else if (PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).getActivities().isEmpty()) {
            addActivityButton.setEnabled(true);
            editActivityButton.setEnabled(false);
            removeActivityButton.setEnabled(false);
            projectListComboBox1.setModel(new DefaultComboBoxModel(PA.getProjectList().toArray()));
            activitySelectComboBox1.setModel(new DefaultComboBoxModel<>(new String[]{"empty"}));
            activitySelectComboBox2.setModel(new DefaultComboBoxModel<>(new String[]{"empty"}));
        } else {
            addActivityButton.setEnabled(true);
            editActivityButton.setEnabled(true);
            removeActivityButton.setEnabled(true);
            projectListComboBox1.setModel(new DefaultComboBoxModel(PA.getProjectList().toArray()));
            activitySelectComboBox1.setModel(new DefaultComboBoxModel(PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).getActivities().toArray()));
            activitySelectComboBox2.setModel(new DefaultComboBoxModel(PA.getProjectList().get(projectListComboBox1.getSelectedIndex()).getActivities().toArray()));
            
        }

    }
}
