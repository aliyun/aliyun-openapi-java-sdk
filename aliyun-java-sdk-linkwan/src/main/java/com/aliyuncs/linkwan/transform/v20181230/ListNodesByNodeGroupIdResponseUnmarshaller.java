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

import com.aliyuncs.linkwan.model.v20181230.ListNodesByNodeGroupIdResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodesByNodeGroupIdResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodesByNodeGroupIdResponse.Data.NodeGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByNodeGroupIdResponseUnmarshaller {

	public static ListNodesByNodeGroupIdResponse unmarshall(ListNodesByNodeGroupIdResponse listNodesByNodeGroupIdResponse, UnmarshallerContext context) {
		
		listNodesByNodeGroupIdResponse.setRequestId(context.stringValue("ListNodesByNodeGroupIdResponse.RequestId"));
		listNodesByNodeGroupIdResponse.setSuccess(context.booleanValue("ListNodesByNodeGroupIdResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodesByNodeGroupIdResponse.Data.TotalCount"));

		List<NodeGroup> list = new ArrayList<NodeGroup>();
		for (int i = 0; i < context.lengthValue("ListNodesByNodeGroupIdResponse.Data.List.Length"); i++) {
			NodeGroup nodeGroup = new NodeGroup();
			nodeGroup.setDevEui(context.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].DevEui"));
			nodeGroup.setDevAddr(context.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].DevAddr"));
			nodeGroup.setClassMode(context.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].ClassMode"));
			nodeGroup.setLastJoinMillis(context.longValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].LastJoinMillis"));
			nodeGroup.setBoundMillis(context.longValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].BoundMillis"));

			list.add(nodeGroup);
		}
		data.setList(list);
		listNodesByNodeGroupIdResponse.setData(data);
	 
	 	return listNodesByNodeGroupIdResponse;
	}
}