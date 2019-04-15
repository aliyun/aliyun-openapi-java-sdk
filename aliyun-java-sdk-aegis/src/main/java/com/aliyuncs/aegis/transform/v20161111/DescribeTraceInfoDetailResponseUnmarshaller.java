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

import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse.TraceInfoDetail;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse.TraceInfoDetail.Edge;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityType;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse.TraceInfoDetail.Vertex;
import com.aliyuncs.aegis.model.v20161111.DescribeTraceInfoDetailResponse.TraceInfoDetail.Vertex.Neighbor;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTraceInfoDetailResponseUnmarshaller {

	public static DescribeTraceInfoDetailResponse unmarshall(DescribeTraceInfoDetailResponse describeTraceInfoDetailResponse, UnmarshallerContext context) {
		
		describeTraceInfoDetailResponse.setRequestId(context.stringValue("DescribeTraceInfoDetailResponse.RequestId"));
		describeTraceInfoDetailResponse.setSuccess(context.booleanValue("DescribeTraceInfoDetailResponse.Success"));

		TraceInfoDetail traceInfoDetail = new TraceInfoDetail();

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setEndId(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].EndId"));
			edge.setStartId(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].StartId"));
			edge.setCount(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].Count"));
			edge.setTime(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].Time"));

			edgeList.add(edge);
		}
		traceInfoDetail.setEdgeList(edgeList);

		List<Vertex> vertexList = new ArrayList<Vertex>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList.Length"); i++) {
			Vertex vertex = new Vertex();
			vertex.setName(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Name"));
			vertex.setCount(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Count"));
			vertex.setId(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Id"));
			vertex.setTime(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Time"));
			vertex.setType(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Type"));

			List<Neighbor> neighborList = new ArrayList<Neighbor>();
			for (int j = 0; j < context.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList.Length"); j++) {
				Neighbor neighbor = new Neighbor();
				neighbor.setHasMore(context.booleanValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].HasMore"));
				neighbor.setCount(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].Count"));
				neighbor.setType(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].Type"));

				neighborList.add(neighbor);
			}
			vertex.setNeighborList(neighborList);

			vertexList.add(vertex);
		}
		traceInfoDetail.setVertexList(vertexList);

		List<EntityType> entityTypeList = new ArrayList<EntityType>();
		for (int i = 0; i < context.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList.Length"); i++) {
			EntityType entityType = new EntityType();
			entityType.setDisplayTemplate(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayTemplate"));
			entityType.setGmtModified(context.longValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].GmtModified"));
			entityType.setDisplayIcon(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayIcon"));
			entityType.setOffset(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Offset"));
			entityType.setDbId(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DbId"));
			entityType.setName(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Name"));
			entityType.setNamespace(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Namespace"));
			entityType.setLimit(context.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Limit"));
			entityType.setId(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Id"));
			entityType.setDisplayColor(context.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayColor"));
			entityType.setGmtCreate(context.longValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].GmtCreate"));

			entityTypeList.add(entityType);
		}
		traceInfoDetail.setEntityTypeList(entityTypeList);
		describeTraceInfoDetailResponse.setTraceInfoDetail(traceInfoDetail);
	 
	 	return describeTraceInfoDetailResponse;
	}
}