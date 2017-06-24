/**
 * @author Martin P. Robillard
 */

package ca.mcgill.cs.stg.jetuml.graph;

import java.awt.geom.Point2D;

import ca.mcgill.cs.stg.jetuml.framework.SegmentationStyleFactory;

/**
 *  An edge that that represents a association between use cases.
 *  Does not support labels or multiplicities.
 */

public class UseCaseAnchorEdge extends SegmentedLabeledEdge
{
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