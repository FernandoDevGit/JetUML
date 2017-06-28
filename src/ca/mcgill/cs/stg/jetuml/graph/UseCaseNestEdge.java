/**
 * @author Fernando Trindade
 */

package ca.mcgill.cs.stg.jetuml.graph;

import java.awt.geom.Point2D;

import ca.mcgill.cs.stg.jetuml.framework.ArrowHead;
import ca.mcgill.cs.stg.jetuml.framework.SegmentationStyleFactory;


public class UseCaseNestEdge extends SegmentedLabeledEdge
{
	/**
	 * Creates an association edge.
	 */
	public UseCaseNestEdge()
	{}
	
	@Override
	protected ArrowHead obtainEndArrowHead()
	{
		return ArrowHead.BLACK_TRIANGLE;
	}	
	
	@Override
	protected Point2D[] getPoints()
	{
		return SegmentationStyleFactory.createStraightStrategy().getPath(this, getGraph());
	}

}
