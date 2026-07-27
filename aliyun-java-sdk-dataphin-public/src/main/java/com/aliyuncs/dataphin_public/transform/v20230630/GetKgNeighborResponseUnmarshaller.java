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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse.Data;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse.Data.Edge;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse.Data.Edge.Property2;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse.Data.Node;
import com.aliyuncs.dataphin_public.model.v20230630.GetKgNeighborResponse.Data.Node.Property;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetKgNeighborResponseUnmarshaller {

	public static GetKgNeighborResponse unmarshall(GetKgNeighborResponse getKgNeighborResponse, UnmarshallerContext _ctx) {
		
		getKgNeighborResponse.setRequestId(_ctx.stringValue("GetKgNeighborResponse.RequestId"));
		getKgNeighborResponse.setMessage(_ctx.stringValue("GetKgNeighborResponse.Message"));
		getKgNeighborResponse.setHttpStatusCode(_ctx.integerValue("GetKgNeighborResponse.HttpStatusCode"));
		getKgNeighborResponse.setCode(_ctx.stringValue("GetKgNeighborResponse.Code"));
		getKgNeighborResponse.setSuccess(_ctx.booleanValue("GetKgNeighborResponse.Success"));

		Data data = new Data();

		List<Node> nodeList = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("GetKgNeighborResponse.Data.NodeList.Length"); i++) {
			Node node = new Node();
			node.setEntityId(_ctx.stringValue("GetKgNeighborResponse.Data.NodeList["+ i +"].EntityId"));
			node.setEntityType(_ctx.stringValue("GetKgNeighborResponse.Data.NodeList["+ i +"].EntityType"));

			List<Property> propertyList = new ArrayList<Property>();
			for (int j = 0; j < _ctx.lengthValue("GetKgNeighborResponse.Data.NodeList["+ i +"].PropertyList.Length"); j++) {
				Property property = new Property();
				property.setValue(_ctx.stringValue("GetKgNeighborResponse.Data.NodeList["+ i +"].PropertyList["+ j +"].Value"));
				property.setDataType(_ctx.stringValue("GetKgNeighborResponse.Data.NodeList["+ i +"].PropertyList["+ j +"].DataType"));
				property.setCode(_ctx.stringValue("GetKgNeighborResponse.Data.NodeList["+ i +"].PropertyList["+ j +"].Code"));

				propertyList.add(property);
			}
			node.setPropertyList(propertyList);

			nodeList.add(node);
		}
		data.setNodeList(nodeList);

		List<Edge> edgeList = new ArrayList<Edge>();
		for (int i = 0; i < _ctx.lengthValue("GetKgNeighborResponse.Data.EdgeList.Length"); i++) {
			Edge edge = new Edge();
			edge.setRelationType(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].RelationType"));
			edge.setRelationId(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].RelationId"));
			edge.setTargetEntityId(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].TargetEntityId"));
			edge.setSourceEntityId(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].SourceEntityId"));

			List<Property2> propertyList1 = new ArrayList<Property2>();
			for (int j = 0; j < _ctx.lengthValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].PropertyList.Length"); j++) {
				Property2 property2 = new Property2();
				property2.setValue(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].PropertyList["+ j +"].Value"));
				property2.setDataType(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].PropertyList["+ j +"].DataType"));
				property2.setCode(_ctx.stringValue("GetKgNeighborResponse.Data.EdgeList["+ i +"].PropertyList["+ j +"].Code"));

				propertyList1.add(property2);
			}
			edge.setPropertyList1(propertyList1);

			edgeList.add(edge);
		}
		data.setEdgeList(edgeList);
		getKgNeighborResponse.setData(data);
	 
	 	return getKgNeighborResponse;
	}
}