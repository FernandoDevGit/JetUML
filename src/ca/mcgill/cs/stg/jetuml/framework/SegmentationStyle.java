/*******************************************************************************
 * JetUML - A desktop application for fast UML diagramming.
 *
 * Copyright (C) 2016 by the contributors of the JetUML project.
 *
 * See: https://github.com/prmr/JetUML
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package ca.mcgill.cs.stg.jetuml.framework;

import java.awt.geom.Point2D;

import ca.mcgill.cs.stg.jetuml.graph.Edge;
import ca.mcgill.cs.stg.jetuml.graph.Graph;

/**
 * A strategy for drawing a segmented line between two nodes.
 * 
 * @author Martin P. Robillard
 *
 */
public interface SegmentationStyle
{
	/**
     * Gets the points at which the line representing an
     * edge is bent according to this strategy.
     * @param pEdge the Edge for which a path is determine
     * @param pGraph the graph holding the edge
     * @return an array list of points at which to bend the
     * segmented line representing the edge.
	 */
	Point2D[] getPath(Edge pEdge, Graph pGraph);
}
