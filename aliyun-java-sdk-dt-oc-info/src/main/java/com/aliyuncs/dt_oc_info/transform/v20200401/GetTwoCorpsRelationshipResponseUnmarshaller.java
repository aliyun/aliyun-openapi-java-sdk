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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetTwoCorpsRelationshipResponse;
import com.aliyuncs.dt_oc_info.model.v20200401.GetTwoCorpsRelationshipResponse.DataItem;
import com.aliyuncs.dt_oc_info.model.v20200401.GetTwoCorpsRelationshipResponse.DataItem.NodesItem;
import com.aliyuncs.dt_oc_info.model.v20200401.GetTwoCorpsRelationshipResponse.DataItem.RelationshipsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTwoCorpsRelationshipResponseUnmarshaller {

	public static GetTwoCorpsRelationshipResponse unmarshall(GetTwoCorpsRelationshipResponse getTwoCorpsRelationshipResponse, UnmarshallerContext _ctx) {
		
		getTwoCorpsRelationshipResponse.setRequestId(_ctx.stringValue("GetTwoCorpsRelationshipResponse.RequestId"));
		getTwoCorpsRelationshipResponse.setCode(_ctx.integerValue("GetTwoCorpsRelationshipResponse.Code"));
		getTwoCorpsRelationshipResponse.setMessage(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Message"));
		getTwoCorpsRelationshipResponse.setTotal(_ctx.integerValue("GetTwoCorpsRelationshipResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTwoCorpsRelationshipResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStrength(_ctx.floatValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Strength"));
			dataItem.setRelationLevel(_ctx.integerValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].RelationLevel"));
			dataItem.setRelationRank(_ctx.integerValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].RelationRank"));

			List<NodesItem> nodes = new ArrayList<NodesItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Nodes.Length"); j++) {
				NodesItem nodesItem = new NodesItem();
				nodesItem.setName(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Nodes["+ j +"].Name"));
				nodesItem.setLabel(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Nodes["+ j +"].Label"));
				nodesItem.setId(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Nodes["+ j +"].Id"));

				nodes.add(nodesItem);
			}
			dataItem.setNodes(nodes);

			List<RelationshipsItem> relationships = new ArrayList<RelationshipsItem>();
			for (int j = 0; j < _ctx.lengthValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships.Length"); j++) {
				RelationshipsItem relationshipsItem = new RelationshipsItem();
				relationshipsItem.setType(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships["+ j +"].Type"));
				relationshipsItem.setEndNode(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships["+ j +"].EndNode"));
				relationshipsItem.setId(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships["+ j +"].Id"));
				relationshipsItem.setProperties(_ctx.mapValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships["+ j +"].Properties"));
				relationshipsItem.setStartNode(_ctx.stringValue("GetTwoCorpsRelationshipResponse.Data["+ i +"].Relationships["+ j +"].StartNode"));

				relationships.add(relationshipsItem);
			}
			dataItem.setRelationships(relationships);

			data.add(dataItem);
		}
		getTwoCorpsRelationshipResponse.setData(data);
	 
	 	return getTwoCorpsRelationshipResponse;
	}
}