/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeListResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeListResponse.NodeListInfo;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeListResponse.NodeListInfo.Edge;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoNodeListResponse.NodeListInfo.Vertex;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTraceInfoNodeListResponseUnmarshaller {

	public static DescribeTraceInfoNodeListResponse unmarshall(DescribeTraceInfoNodeListResponse describeTraceInfoNodeListResponse, UnmarshallerContext context) {
		
		describeTraceInfoNodeListResponse.setRequestId(context.stringValue("DescribeTraceInfoNodeListResponse.RequestId"));

		NodeListInfo nodeListInfo = new NodeListInfo();

		List<String> entityTypeList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EntityTypeList.Length"); i++) {
			entityTypeList.add(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EntityTypeList["+ i +"]"));
		}
		nodeListInfo.setEntityTypeList(entityTypeList);

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setEndId(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EdgeList["+ i +"].EndId"));
			edge.setStartId(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EdgeList["+ i +"].StartId"));
			edge.setTime(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.EdgeList["+ i +"].Time"));

			edgeList.add(edge);
		}
		nodeListInfo.setEdgeList(edgeList);

		List<Vertex> vertexList = new ArrayList<Vertex>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList.Length"); i++) {
			Vertex vertex = new Vertex();
			vertex.setName(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList["+ i +"].Name"));
			vertex.setId(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList["+ i +"].Id"));
			vertex.setTime(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList["+ i +"].Time"));

			List<String> neighborList = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList["+ i +"].NeighborList.Length"); j++) {
				neighborList.add(context.stringValue("DescribeTraceInfoNodeListResponse.NodeListInfo.VertexList["+ i +"].NeighborList["+ j +"]"));
			}
			vertex.setNeighborList(neighborList);

			vertexList.add(vertex);
		}
		nodeListInfo.setVertexList(vertexList);
		describeTraceInfoNodeListResponse.setNodeListInfo(nodeListInfo);
	 
	 	return describeTraceInfoNodeListResponse;
	}
}