/*******************************************************************************
 * JetUML - A desktop application for fast UML diagramming.
 *
 * Copyright (C) 2016 by the contributors of the JetUML project.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
/*
@autor Luis Gouvea
*/

package ca.mcgill.cs.stg.jetuml.graph;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import ca.mcgill.cs.stg.jetuml.framework.MultiLineString;
import java.awt.Color;
import java.awt.geom.Line2D;

/**
 *  A use case node in a use case diagram.
 */
public class UseCaseNodeBusiness extends RectangularNode
{
	private static final int DEFAULT_WIDTH = 110;
	private static final int DEFAULT_HEIGHT = 40;   
	
	private MultiLineString aNameBusiness;

	/**
     * Construct a use case node with a default size.
	 */
	public UseCaseNodeBusiness()
	{
		aNameBusiness = new MultiLineString();
		setBounds(new Rectangle2D.Double(0, 0, DEFAULT_WIDTH, DEFAULT_HEIGHT));
	}
	
	@Override
	public void draw(Graphics2D pGraphics2D)
	{                
                super.draw(pGraphics2D);
                pGraphics2D.draw(new Line2D.Double(getBounds().getX(), getBounds().getY(), getBounds().getX()+ getBounds().getWidth(), getBounds().getY()+ getBounds().getHeight()));
                pGraphics2D.setColor(Color.red);
                pGraphics2D.draw(getShape());
		aNameBusiness.draw(pGraphics2D, getBounds());
	}
   
	@Override
	public Shape getShape()
	{
		return new Ellipse2D.Double(getBounds().getX(), getBounds().getY(), getBounds().getWidth(), getBounds().getHeight());
	}
   
	/**
     * Sets the name property value.
     * @param pName the new use case name
	 */
	public void setName(MultiLineString pName)
	{
		aNameBusiness = pName;
	}

	/**
     * Gets the name property value.
     * @return the use case name
	 */
	public MultiLineString getName()
	{
		return aNameBusiness;
	}

	@Override
	public UseCaseNodeBusiness clone()
	{
		UseCaseNodeBusiness cloned = (UseCaseNodeBusiness) super.clone();
		cloned.aNameBusiness = aNameBusiness.clone();
		return cloned;
	}
}
