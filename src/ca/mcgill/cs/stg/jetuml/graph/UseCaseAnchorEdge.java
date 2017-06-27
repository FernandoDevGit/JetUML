/**
 * @author Martin P. Robillard
 */

package ca.mcgill.cs.stg.jetuml.graph;

import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;

import ca.mcgill.cs.stg.jetuml.framework.SegmentationStyleFactory;

/**
 *  An edge that that represents a association between use cases.
 *  Does not support labels or multiplicities.
 */

public class UseCaseAnchorEdge extends SegmentedLabeledEdge
{
	
	private static final Stroke DOTTED_STROKE = new BasicStroke(1.0f, BasicStroke.CAP_ROUND, 
			  BasicStroke.JOIN_ROUND, 0.0f, new float[] { 1.0f, 5.0f }, 2.0f);
	
	@Override
	public void draw(Graphics2D pGraphics2D)
	{
		Stroke oldStroke = pGraphics2D.getStroke();
		pGraphics2D.setStroke(DOTTED_STROKE);
		pGraphics2D.draw(getShape());
		pGraphics2D.setStroke(oldStroke);
	}
	
	
	/**
	 * Creates an association edge.
	 */
	public UseCaseAnchorEdge()
	{}
	
	@Override
	protected Point2D[] getPoints()
	{
		return SegmentationStyleFactory.createStraightStrategy().getPath(this, getGraph());
	}
}