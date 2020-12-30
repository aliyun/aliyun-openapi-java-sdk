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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.AddShardingNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddShardingNodeResponseUnmarshaller {

	public static AddShardingNodeResponse unmarshall(AddShardingNodeResponse addShardingNodeResponse, UnmarshallerContext _ctx) {
		
		addShardingNodeResponse.setRequestId(_ctx.stringValue("AddShardingNodeResponse.RequestId"));
		addShardingNodeResponse.setOrderId(_ctx.longValue("AddShardingNodeResponse.OrderId"));
		addShardingNodeResponse.setNodeId(_ctx.stringValue("AddShardingNodeResponse.NodeId"));

		List<String> nodeIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddShardingNodeResponse.NodeIds.Length"); i++) {
			nodeIds.add(_ctx.stringValue("AddShardingNodeResponse.NodeIds["+ i +"]"));
		}
		addShardingNodeResponse.setNodeIds(nodeIds);
	 
	 	return addShardingNodeResponse;
	}
}