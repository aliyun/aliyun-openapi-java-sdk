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

import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data.Edge;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data.EntityType;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data.RelationType;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data.Vertex;
import com.aliyuncs.sas.model.v20181203.DescribeGraph4InvestigationOnlineResponse.Data.Vertex.Neighbor;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGraph4InvestigationOnlineResponseUnmarshaller {

	public static DescribeGraph4InvestigationOnlineResponse unmarshall(DescribeGraph4InvestigationOnlineResponse describeGraph4InvestigationOnlineResponse, UnmarshallerContext _ctx) {
		
		describeGraph4InvestigationOnlineResponse.setRequestId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.RequestId"));

		Data data = new Data();

		List<Vertex> vertexList = new ArrayList<Vertex>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList.Length"); i++) {
			Vertex vertex = new Vertex();
			vertex.setId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Id"));
			vertex.setName(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Name"));
			vertex.setType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Type"));
			vertex.setTime(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Time"));
			vertex.setUuid(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Uuid"));
			vertex.setAliuid(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Aliuid"));
			vertex.setProperties(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Properties"));
			vertex.setPositionId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].PositionId"));
			vertex.setPosition(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].Position"));

			List<Neighbor> neighborList = new ArrayList<Neighbor>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].NeighborList.Length"); j++) {
				Neighbor neighbor = new Neighbor();
				neighbor.setType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].NeighborList["+ j +"].Type"));
				neighbor.setCount(_ctx.integerValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].NeighborList["+ j +"].Count"));
				neighbor.setHasMore(_ctx.booleanValue("DescribeGraph4InvestigationOnlineResponse.Data.VertexList["+ i +"].NeighborList["+ j +"].HasMore"));

				neighborList.add(neighbor);
			}
			vertex.setNeighborList(neighborList);

			vertexList.add(vertex);
		}
		data.setVertexList(vertexList);

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setId(_ctx.integerValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].Id"));
			edge.setStartId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].StartId"));
			edge.setEndId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].EndId"));
			edge.setStartType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].StartType"));
			edge.setEndType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].EndType"));
			edge.setName(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].Name"));
			edge.setType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].Type"));
			edge.setTime(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EdgeList["+ i +"].Time"));

			edgeList.add(edge);
		}
		data.setEdgeList(edgeList);

		List<EntityType> entityTypeList = new ArrayList<EntityType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList.Length"); i++) {
			EntityType entityType = new EntityType();
			entityType.setId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList["+ i +"].Id"));
			entityType.setName(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList["+ i +"].Name"));
			entityType.setDisplayColor(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList["+ i +"].DisplayColor"));
			entityType.setDisplayIcon(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList["+ i +"].DisplayIcon"));
			entityType.setDisplayOrder(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.EntityTypeList["+ i +"].DisplayOrder"));

			entityTypeList.add(entityType);
		}
		data.setEntityTypeList(entityTypeList);

		List<RelationType> relationTypeList = new ArrayList<RelationType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGraph4InvestigationOnlineResponse.Data.RelationTypeList.Length"); i++) {
			RelationType relationType = new RelationType();
			relationType.setId(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.RelationTypeList["+ i +"].Id"));
			relationType.setShowType(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.RelationTypeList["+ i +"].ShowType"));
			relationType.setDirected(_ctx.integerValue("DescribeGraph4InvestigationOnlineResponse.Data.RelationTypeList["+ i +"].Directed"));
			relationType.setName(_ctx.stringValue("DescribeGraph4InvestigationOnlineResponse.Data.RelationTypeList["+ i +"].Name"));

			relationTypeList.add(relationType);
		}
		data.setRelationTypeList(relationTypeList);
		describeGraph4InvestigationOnlineResponse.setData(data);
	 
	 	return describeGraph4InvestigationOnlineResponse;
	}
}