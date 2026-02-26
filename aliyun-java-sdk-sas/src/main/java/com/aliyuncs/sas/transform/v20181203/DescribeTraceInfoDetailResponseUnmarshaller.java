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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail.Edge;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityType;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationType;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail.Vertex;
import com.aliyuncs.sas.model.v20181203.DescribeTraceInfoDetailResponse.TraceInfoDetail.Vertex.Neighbor;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTraceInfoDetailResponseUnmarshaller {

	public static DescribeTraceInfoDetailResponse unmarshall(DescribeTraceInfoDetailResponse describeTraceInfoDetailResponse, UnmarshallerContext _ctx) {
		
		describeTraceInfoDetailResponse.setRequestId(_ctx.stringValue("DescribeTraceInfoDetailResponse.RequestId"));
		describeTraceInfoDetailResponse.setSuccess(_ctx.booleanValue("DescribeTraceInfoDetailResponse.Success"));

		TraceInfoDetail traceInfoDetail = new TraceInfoDetail();

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setType(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].Type"));
			edge.setTime(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].Time"));
			edge.setStartId(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].StartId"));
			edge.setCount(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].Count"));
			edge.setEndId(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EdgeList["+ i +"].EndId"));

			edgeList.add(edge);
		}
		traceInfoDetail.setEdgeList(edgeList);

		List<Vertex> vertexList = new ArrayList<Vertex>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList.Length"); i++) {
			Vertex vertex = new Vertex();
			vertex.setType(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Type"));
			vertex.setTime(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Time"));
			vertex.setName(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Name"));
			vertex.setId(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Id"));
			vertex.setCount(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].Count"));

			List<Neighbor> neighborList = new ArrayList<Neighbor>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList.Length"); j++) {
				Neighbor neighbor = new Neighbor();
				neighbor.setType(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].Type"));
				neighbor.setHasMore(_ctx.booleanValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].HasMore"));
				neighbor.setCount(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.VertexList["+ i +"].NeighborList["+ j +"].Count"));

				neighborList.add(neighbor);
			}
			vertex.setNeighborList(neighborList);

			vertexList.add(vertex);
		}
		traceInfoDetail.setVertexList(vertexList);

		List<EntityType> entityTypeList = new ArrayList<EntityType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList.Length"); i++) {
			EntityType entityType = new EntityType();
			entityType.setDisplayColor(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayColor"));
			entityType.setDbId(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DbId"));
			entityType.setDisplayTemplate(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayTemplate"));
			entityType.setDisplayIcon(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].DisplayIcon"));
			entityType.setLimit(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Limit"));
			entityType.setGmtCreate(_ctx.longValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].GmtCreate"));
			entityType.setOffset(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Offset"));
			entityType.setNamespace(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Namespace"));
			entityType.setName(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Name"));
			entityType.setGmtModified(_ctx.longValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].GmtModified"));
			entityType.setId(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.EntityTypeList["+ i +"].Id"));

			entityTypeList.add(entityType);
		}
		traceInfoDetail.setEntityTypeList(entityTypeList);

		List<RelationType> relationTypeList = new ArrayList<RelationType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList.Length"); i++) {
			RelationType relationType = new RelationType();
			relationType.setShowType(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList["+ i +"].ShowType"));
			relationType.setDisplayColor(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList["+ i +"].DisplayColor"));
			relationType.setName(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList["+ i +"].Name"));
			relationType.setDirected(_ctx.integerValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList["+ i +"].Directed"));
			relationType.setRelationTypeId(_ctx.stringValue("DescribeTraceInfoDetailResponse.TraceInfoDetail.RelationTypeList["+ i +"].RelationTypeId"));

			relationTypeList.add(relationType);
		}
		traceInfoDetail.setRelationTypeList(relationTypeList);
		describeTraceInfoDetailResponse.setTraceInfoDetail(traceInfoDetail);
	 
	 	return describeTraceInfoDetailResponse;
	}
}