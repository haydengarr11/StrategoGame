import org.junit.Assert;
import org.w3c.dom.events.Event;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.w3c.dom.events.EventTarget;
import org.w3c.dom.views.AbstractView;

import java.awt.*;
import java.awt.event.*;
import java.security.Key;
import javax.swing.*;

import static org.junit.Assert.*;
/**
 * Board Tester.
 *
 * @author <Authors name>
 * @since <pre>Apr 22, 2021</pre>
 * @version 1.0
 */

public class BoardTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: getGui()
     *
     */
    @Test
    public void testGetGui() throws Exception {
       //try {
           Board board = new Board();
           JPanel brd = new JPanel();
           board.initializeGui();
           brd.add(board.getGui());
           assertEquals(brd, board.getGui());
//       }catch AWTException {
//            throw AWTException;
//           }
    }

    /**
     *
     * Method: initializeGui()
     *
     */
    @Test
    public void testInitializeGui() throws Exception {
        Board b = new Board();
        b.initializeGui();
        for (int i = 0; i < 10; i++){
            for (int j = 0;j < 10; j++) {
                assertTrue("It worked", b.c1squares[j][i].getText().equals(""));
            }
        }
    }

    /**
     *
     * Method: resetGame()
     *
     */
    @Test
    public void testResetGame() throws Exception {
        Board brd = new Board();
        brd.initializeGui();
        brd.c1squares[4][9].setText("9");
        brd.c1squares[3][2].setText("7");
        brd.resetGame();
        assertTrue(brd.c1squares[4][9].getText().equals(""));
        assertTrue(brd.c1squares[3][2].getText().equals(""));


    }

    /**
     *
     * Method: nextTurn()
     *
     */
    @Test
    public void testNextTurn() throws Exception {
        Board hb = new Board();
        hb.nextTurn();
        assertFalse(hb.getPlayerturn());
        hb.nextTurn();
        assertTrue(hb.getPlayerturn());
    }

    /**
     *
     * Method: actionPerformed(ActionEvent e)
     *
     */
    @Test
    public void testSetupFlagRed() throws Exception {
        Board b = new Board();
        JFrame j = new JFrame();
        j.add(b.getGui());
        b.c1squares[1][2].doClick();
        assertTrue(b.c1squares[1][2].getText().equals("F"));
        b.c1squares[2][1].doClick();
        assertFalse(b.c1squares[2][1].equals("F"));

    }

    @Test
    public void testSetupBombRed() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[3][2].doClick();
        assertTrue(b.c1squares[3][2].getText() == "B");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("B", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("B"));
    }
    @Test
    public void testSetupSpyRed() throws Exception {
        Board b = new Board();
        Robot r = new Robot();
        b.initializeGui();
        b.getGui();
        b.c1squares[2][1].doClick();
        assertTrue(b.c1squares[2][1].getText().equals("S"));
        b.c1squares[4][2].doClick();
        assertFalse(b.c1squares[4][2].getText().equals("S"));
    }
    @Test
    public void testSetup2Red() throws Exception {
        Board b = new Board();
        Robot r = new Robot();
        b.initializeGui();
        b.getGui();
        b.c1squares[2][2].doClick();
        assertTrue(b.c1squares[2][2].getText().equals("2"));
        for (int i = 3; i < 4; i++) {
            for (int j = 0; j < 7; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("2", b.c1squares[j][i].getText());
            }
            }
        b.c1squares[6][3].doClick();
        assertFalse(b.c1squares[6][3].equals("2"));
    }
    @Test
    public void testSetup3Red() throws Exception {
        Board b = new Board();
        Robot r = new Robot();
        b.initializeGui();
        b.getGui();
        b.c1squares[3][3].doClick();
        assertTrue(b.c1squares[3][3].getText().equals("3"));
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("3", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("3"));
        assertFalse(b.c1squares[4][6].equals("3"));
    }
    @Test
    public void testSetup4() throws Exception {
            Board b = new Board();
            b.initializeGui();
            b.getGui();
            b.c1squares[5][2].doClick();
            assertTrue(b.c1squares[5][2].getText().equals("4"));
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("4", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("4"));

    }
        @Test
        public void testSetup5 () throws Exception {
            Board b = new Board();
            b.initializeGui();
            b.getGui();
            b.c1squares[8][2].doClick();
            assertTrue(b.c1squares[8][2].getText().equals("5"));
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < 3; j++) {
                    b.c1squares[j][i].doClick();
                    assertEquals("5", b.c1squares[j][i].getText());
                }
            }
            b.c1squares[5][3].doClick();
            assertFalse(b.c1squares[5][3].equals("5"));

    }
    @Test
    public void testSetup6Red () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[8][2].doClick();
        assertTrue(b.c1squares[8][2].getText().equals("6"));
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("6", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("6"));

    }
    @Test
    public void testSetup7Red () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[8][2].doClick();
        assertTrue(b.c1squares[8][2].getText().equals("7"));
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 2; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("7", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("7"));

    }
    @Test
    public void testSetup8Red () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[8][2].doClick();
        assertTrue(b.c1squares[8][2].getText().equals("8"));
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("8", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("8"));

    }
    @Test
    public void testSetup9Red () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[8][2].doClick();
        assertTrue(b.c1squares[8][2].getText().equals("9"));
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("9"));

    }
    @Test
    public void testSetup10Red () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.c1squares[8][2].doClick();
        assertTrue(b.c1squares[8][2].getText().equals("10"));
        b.c1squares[5][3].doClick();
        assertFalse(b.c1squares[5][3].equals("10"));

    }

    @Test
    public void testSetupFlagBlue() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("F"));
        b.c1squares[1][8].doClick();
        assertFalse(b.c1squares[1][8].equals("F"));

    }

    @Test
    public void testSetupBombblue() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("B"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("B", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("B"));
    }
    @Test
    public void testSetupSpyblue() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("S"));
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("S"));
    }
    @Test
    public void testSetup2blue() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("2"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("2", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("2"));
    }
    @Test
    public void testSetup3blue() throws Exception {
        Board b = new Board();
        Robot r = new Robot();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("3"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("3", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("3"));
    }
    @Test
    public void testSetup4blue() throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("4"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("4", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("4"));

    }
    @Test
    public void testSetup5blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("5"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("5", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("5"));
    }
    @Test
    public void testSetup6blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("6"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 3; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("6", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("6"));

    }
    @Test
    public void testSetup7blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("7"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 2; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("7", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("7"));

    }
    @Test
    public void testSetup8blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[0][8].doClick();
        assertTrue(b.c1squares[0][8].getText().equals("8"));
        for (int i = 7; i < 8; i++) {
            for (int j = 0; j < 1; j++) {
                b.c1squares[j][i].doClick();
                assertEquals("8", b.c1squares[j][i].getText());
            }
        }
        b.c1squares[2][8].doClick();
        assertFalse(b.c1squares[2][8].equals("8"));

    }
    @Test
    public void testSetup9Blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[2][8].doClick();
        assertTrue(b.c1squares[2][8].getText().equals("9"));
        b.c1squares[3][6].doClick();
        assertFalse(b.c1squares[3][6].equals("9"));

    }
    @Test
    public void testSetup10Blue () throws Exception {
        Board b = new Board();
        b.initializeGui();
        b.getGui();
        b.nextTurn();
        b.redTotal = 0;
        b.c1squares[3][6].doClick();
        assertTrue(b.c1squares[3][6].getText().equals("10"));
        assertTrue(b.c1squares[3][6].getBackground().equals(Color.BLUE));
        b.c1squares[2][6].doClick();
        assertFalse(b.c1squares[2][6].equals("10"));

    }


    /**
     *
     * Method: getAccessibleRole()
     *
     */
    @Test
    public void testGetAccessibleRole() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getValue(java.lang.String key)
     *
     */
    @Test
    public void testGetValue() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: isEnabled()
     *
     */
    @Test
    public void testIsEnabled() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: actionPerformed(java.awt.event.ActionEvent ae)
     *
     */
    @Test
    public void testActionPerformedAe() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: putValue(java.lang.String key, java.lang.Object value)
     *
     */
    @Test
    public void testPutValue() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setEnabled(boolean b)
     *
     */
    @Test
    public void testSetEnabledB() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: addPropertyChangeListener(java.beans.PropertyChangeListener listener)
     *
     */
    @Test
    public void testAddPropertyChangeListenerListener() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: removePropertyChangeListener(java.beans.PropertyChangeListener listener)
     *
     */
    @Test
    public void testRemovePropertyChangeListenerListener() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getKeyCodeArray()
     *
     */
    @Test
    public void testGetKeyCodeArray() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: registerKeyPressed(int keyCode)
     *
     */
    @Test
    public void testRegisterKeyPressed() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: registerKeyReleased(int keyCode)
     *
     */
    @Test
    public void testRegisterKeyReleased() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: keyIsPressed(int keyCode)
     *
     */
    @Test
    public void testKeyIsPressed() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: shouldProcess(java.awt.event.KeyEvent e)
     *
     */
    @Test
    public void testShouldProcess() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: validateObject()
     *
     */
    @Test
    public void testValidateObject() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getBorderTitle(javax.swing.border.Border b)
     *
     */
    @Test
    public void testGetBorderTitle() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleName()
     *
     */
    @Test
    public void testGetAccessibleName() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleDescription()
     *
     */
    @Test
    public void testGetAccessibleDescription() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleStateSet()
     *
     */
    @Test
    public void testGetAccessibleStateSet() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleChildrenCount()
     *
     */
    @Test
    public void testGetAccessibleChildrenCount() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleChild(int i)
     *
     */
    @Test
    public void testGetAccessibleChildI() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleExtendedComponent()
     *
     */
    @Test
    public void testGetAccessibleExtendedComponent() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getToolTipText()
     *
     */
    @Test
    public void testGetToolTipText() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getTitledBorderText()
     *
     */
    @Test
    public void testGetTitledBorderText() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleKeyBinding()
     *
     */
    @Test
    public void testGetAccessibleKeyBinding() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: size()
     *
     */
    @Test
    public void testSize() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: elementAt(int index)
     *
     */
    @Test
    public void testElementAt() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: addElement(int value)
     *
     */
    @Test
    public void testAddElement() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setElementAt(int value, int index)
     *
     */
    @Test
    public void testSetElementAt() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: accept(java.awt.Component comp)
     *
     */
    @Test
    public void testAcceptComp() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: run()
     *
     */
    @Test
    public void testRun() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleAt(java.awt.Point p)
     *
     */
    @Test
    public void testGetAccessibleAtP() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: values()
     *
     */
    @Test
    public void testValues() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: valueOf(java.lang.String name)
     *
     */
    @Test
    public void testValueOf() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getCapabilities()
     *
     */
    @Test
    public void testGetCapabilities() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getDrawGraphics()
     *
     */
    @Test
    public void testGetDrawGraphics() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: contentsLost()
     *
     */
    @Test
    public void testContentsLost() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: contentsRestored()
     *
     */
    @Test
    public void testContentsRestored() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: show()
     *
     */
    @Test
    public void testShow() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: show(int x1, int y1, int x2, int y2)
     *
     */
    @Test
    public void testShowForX1Y1X2Y2() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: showIfNotLost(int x1, int y1, int x2, int y2)
     *
     */
    @Test
    public void testShowIfNotLostForX1Y1X2Y2() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: dispose()
     *
     */
    @Test
    public void testDispose() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: createBackBuffers(int numBuffers)
     *
     */
    @Test
    public void testCreateBackBuffers() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getBackBuffer()
     *
     */
    @Test
    public void testGetBackBuffer() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: showSubRegion(int x1, int y1, int x2, int y2)
     *
     */
    @Test
    public void testShowSubRegionForX1Y1X2Y2() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: revalidate()
     *
     */
    @Test
    public void testRevalidate() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: revalidate(boolean checkSize)
     *
     */
    @Test
    public void testRevalidateCheckSize() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: createBuffers(int numBuffers, java.awt.BufferCapabilities caps)
     *
     */
    @Test
    public void testCreateBuffers() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: flip(java.awt.BufferCapabilities.FlipContents flipAction)
     *
     */
    @Test
    public void testFlip() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: flipSubRegion(int x1, int y1, int x2, int y2, java.awt.BufferCapabilities.FlipContents flipAction)
     *
     */
    @Test
    public void testFlipSubRegion() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: destroyBuffers()
     *
     */
    @Test
    public void testDestroyBuffers() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: acceptRequestFocus(java.awt.Component from, java.awt.Component to, boolean temporary, boolean focusedWindowChangeAllowed, java.awt.event.FocusEvent.Cause cause)
     *
     */
    @Test
    public void testAcceptRequestFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleParent()
     *
     */
    @Test
    public void testGetAccessibleParent() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleIndexInParent()
     *
     */
    @Test
    public void testGetAccessibleIndexInParent() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getLocale()
     *
     */
    @Test
    public void testGetLocale() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getAccessibleComponent()
     *
     */
    @Test
    public void testGetAccessibleComponent() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getBackground()
     *
     */
    @Test
    public void testGetBackground() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setBackground(java.awt.Color c)
     *
     */
    @Test
    public void testSetBackground() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getForeground()
     *
     */
    @Test
    public void testGetForeground() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setForeground(java.awt.Color c)
     *
     */
    @Test
    public void testSetForeground() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getCursor()
     *
     */
    @Test
    public void testGetCursor() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setCursor(java.awt.Cursor cursor)
     *
     */
    @Test
    public void testSetCursor() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getFont()
     *
     */
    @Test
    public void testGetFont() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setFont(java.awt.Font f)
     *
     */
    @Test
    public void testSetFont() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getFontMetrics(java.awt.Font f)
     *
     */
    @Test
    public void testGetFontMetrics() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: isVisible()
     *
     */
    @Test
    public void testIsVisible() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setVisible(boolean b)
     *
     */
    @Test
    public void testSetVisible() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: isShowing()
     *
     */
    @Test
    public void testIsShowing() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: contains(java.awt.Point p)
     *
     */
    @Test
    public void testContains() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getLocationOnScreen()
     *
     */
    @Test
    public void testGetLocationOnScreen() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getLocation()
     *
     */
    @Test
    public void testGetLocation() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setLocation(java.awt.Point p)
     *
     */
    @Test
    public void testSetLocation() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getBounds()
     *
     */
    @Test
    public void testGetBounds() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setBounds(java.awt.Rectangle r)
     *
     */
    @Test
    public void testSetBounds() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: getSize()
     *
     */
    @Test
    public void testGetSize() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: setSize(java.awt.Dimension d)
     *
     */
    @Test
    public void testSetSize() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: isFocusTraversable()
     *
     */
    @Test
    public void testIsFocusTraversable() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: requestFocus()
     *
     */
    @Test
    public void testRequestFocus() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: addFocusListener(java.awt.event.FocusListener l)
     *
     */
    @Test
    public void testAddFocusListener() throws Exception {
//TODO: Test goes here...
    }

    /**
     *
     * Method: removeFocusListener(java.awt.event.FocusListener l)
     *
     */
    @Test
    public void testRemoveFocusListener() throws Exception {
//TODO: Test goes here...
    }


    /**
     *
     * Method: registerComponent(javax.swing.JComponent c)
     *
     */
    @Test
    public void testRegisterComponent() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = Board.getClass().getMethod("registerComponent", javax.swing.JComponent.class);
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }

    /**
     *
     * Method: updateInternalBuffers()
     *
     */
    @Test
    public void testUpdateInternalBuffers() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = Board.getClass().getMethod("updateInternalBuffers");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }

    /**
     *
     * Method: invalidate()
     *
     */
    @Test
    public void testInvalidate() throws Exception {
//TODO: Test goes here...
/*
try {
   Method method = Board.getClass().getMethod("invalidate");
   method.setAccessible(true);
   method.invoke(<Object>, <Parameters>);
} catch(NoSuchMethodException e) {
} catch(IllegalAccessException e) {
} catch(InvocationTargetException e) {
}
*/
    }

}

