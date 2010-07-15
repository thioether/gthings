sb = new groovy.swing.SwingBuilder()

frame = sb.frame(
    title: 'Swing',
    size : [100,100],
    layout: new java.awt.FlowLayout(),
    defaultCloseOperation:javax.swing.WindowConstants.EXIT_ON_CLOSE
    ) {
        lbl = label(text: 'test')
        btn = button(text: 'Click Me', actionPerformed: {
            btn.text = 'Clickec'
            lbl.text = 'Groovy !'
        }
        )
    }
  frame.show();