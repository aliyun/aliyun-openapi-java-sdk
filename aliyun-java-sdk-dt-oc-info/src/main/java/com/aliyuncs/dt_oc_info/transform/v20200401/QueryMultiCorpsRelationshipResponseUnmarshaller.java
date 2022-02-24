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

import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse.Data;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse.Data.GraphPathsItem;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse.Data.GraphPathsItem.PathsItem;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse.Data.GraphPathsItem.PathsItem.NodesItem;
import com.aliyuncs.dt_oc_info.model.v20200401.QueryMultiCorpsRelationshipResponse.Data.GraphPathsItem.PathsItem.RelationshipsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMultiCorpsRelationshipResponseUnmarshaller {

	public static QueryMultiCorpsRelationshipResponse unmarshall(QueryMultiCorpsRelationshipResponse queryMultiCorpsRelationshipResponse, UnmarshallerContext _ctx) {
		
		queryMultiCorpsRelationshipResponse.setRequestId(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.RequestId"));
		queryMultiCorpsRelationshipResponse.setCode(_ctx.integerValue("QueryMultiCorpsRelationshipResponse.Code"));
		queryMultiCorpsRelationshipResponse.setMessage(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Message"));
		queryMultiCorpsRelationshipResponse.setTotal(_ctx.integerValue("QueryMultiCorpsRelationshipResponse.Total"));

		Data data = new Data();
		data.setGroup(_ctx.integerValue("QueryMultiCorpsRelationshipResponse.Data.Group"));
		data.setPathTotal(_ctx.integerValue("QueryMultiCorpsRelationshipResponse.Data.PathTotal"));

		List<Map<Object, Object>> groupCorps = _ctx.listMapValue("QueryMultiCorpsRelationshipResponse.Data.GroupCorps");
		data.setGroupCorps(groupCorps);

		List<GraphPathsItem> graphPaths = new ArrayList<GraphPathsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths.Length"); i++) {
			GraphPathsItem graphPathsItem = new GraphPathsItem();
			graphPathsItem.setStartNodeName(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].StartNodeName"));
			graphPathsItem.setEndNodeName(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].EndNodeName"));

			List<PathsItem> paths = new ArrayList<PathsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths.Length"); j++) {
				PathsItem pathsItem = new PathsItem();
				pathsItem.setStrength(_ctx.floatValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Strength"));
				pathsItem.setRelationLevel(_ctx.longValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].RelationLevel"));
				pathsItem.setRelationRank(_ctx.longValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].RelationRank"));

				List<NodesItem> nodes = new ArrayList<NodesItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Nodes.Length"); k++) {
					NodesItem nodesItem = new NodesItem();
					nodesItem.setLabel(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Nodes["+ k +"].Label"));
					nodesItem.setName(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Nodes["+ k +"].Name"));
					nodesItem.setId(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Nodes["+ k +"].Id"));
					nodesItem.setProperties(_ctx.mapValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Nodes["+ k +"].Properties"));

					nodes.add(nodesItem);
				}
				pathsItem.setNodes(nodes);

				List<RelationshipsItem> relationships = new ArrayList<RelationshipsItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships.Length"); k++) {
					RelationshipsItem relationshipsItem = new RelationshipsItem();
					relationshipsItem.setType(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].Type"));
					relationshipsItem.setStartNode(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].StartNode"));
					relationshipsItem.setEndNode(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].EndNode"));
					relationshipsItem.setName(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].Name"));
					relationshipsItem.setId(_ctx.stringValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].Id"));
					relationshipsItem.setProperties(_ctx.mapValue("QueryMultiCorpsRelationshipResponse.Data.GraphPaths["+ i +"].Paths["+ j +"].Relationships["+ k +"].Properties"));

					relationships.add(relationshipsItem);
				}
				pathsItem.setRelationships(relationships);

				paths.add(pathsItem);
			}
			graphPathsItem.setPaths(paths);

			graphPaths.add(graphPathsItem);
		}
		data.setGraphPaths(graphPaths);
		queryMultiCorpsRelationshipResponse.setData(data);
	 
	 	return queryMultiCorpsRelationshipResponse;
	}
}