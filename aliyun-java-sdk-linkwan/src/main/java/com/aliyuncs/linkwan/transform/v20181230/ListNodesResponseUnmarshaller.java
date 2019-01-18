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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListNodesResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodesResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodesResponse.Data.NodeGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesResponseUnmarshaller {

	public static ListNodesResponse unmarshall(ListNodesResponse listNodesResponse, UnmarshallerContext context) {
		
		listNodesResponse.setRequestId(context.stringValue("ListNodesResponse.RequestId"));
		listNodesResponse.setSuccess(context.booleanValue("ListNodesResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodesResponse.Data.TotalCount"));

		List<NodeGroup> list = new ArrayList<NodeGroup>();
		for (int i = 0; i < context.lengthValue("ListNodesResponse.Data.List.Length"); i++) {
			NodeGroup nodeGroup = new NodeGroup();
			nodeGroup.setNodeGroupId(context.stringValue("ListNodesResponse.Data.List["+ i +"].NodeGroupId"));
			nodeGroup.setDevEui(context.stringValue("ListNodesResponse.Data.List["+ i +"].DevEui"));
			nodeGroup.setDevAddr(context.stringValue("ListNodesResponse.Data.List["+ i +"].DevAddr"));
			nodeGroup.setClassMode(context.stringValue("ListNodesResponse.Data.List["+ i +"].ClassMode"));
			nodeGroup.setLastJoinMillis(context.longValue("ListNodesResponse.Data.List["+ i +"].LastJoinMillis"));
			nodeGroup.setBoundMillis(context.longValue("ListNodesResponse.Data.List["+ i +"].BoundMillis"));

			list.add(nodeGroup);
		}
		data.setList(list);
		listNodesResponse.setData(data);
	 
	 	return listNodesResponse;
	}
}