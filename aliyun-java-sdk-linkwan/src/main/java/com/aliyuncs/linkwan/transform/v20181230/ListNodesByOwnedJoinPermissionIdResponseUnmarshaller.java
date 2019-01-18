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

import com.aliyuncs.linkwan.model.v20181230.ListNodesByOwnedJoinPermissionIdResponse;
import com.aliyuncs.linkwan.model.v20181230.ListNodesByOwnedJoinPermissionIdResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListNodesByOwnedJoinPermissionIdResponse.Data.NodeGroup;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByOwnedJoinPermissionIdResponseUnmarshaller {

	public static ListNodesByOwnedJoinPermissionIdResponse unmarshall(ListNodesByOwnedJoinPermissionIdResponse listNodesByOwnedJoinPermissionIdResponse, UnmarshallerContext context) {
		
		listNodesByOwnedJoinPermissionIdResponse.setRequestId(context.stringValue("ListNodesByOwnedJoinPermissionIdResponse.RequestId"));
		listNodesByOwnedJoinPermissionIdResponse.setSuccess(context.booleanValue("ListNodesByOwnedJoinPermissionIdResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.TotalCount"));

		List<NodeGroup> list = new ArrayList<NodeGroup>();
		for (int i = 0; i < context.lengthValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List.Length"); i++) {
			NodeGroup nodeGroup = new NodeGroup();
			nodeGroup.setDevEui(context.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].DevEui"));
			nodeGroup.setDevAddr(context.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].DevAddr"));
			nodeGroup.setClassMode(context.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].ClassMode"));
			nodeGroup.setLastJoinMillis(context.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].LastJoinMillis"));
			nodeGroup.setBoundMillis(context.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].BoundMillis"));

			list.add(nodeGroup);
		}
		data.setList(list);
		listNodesByOwnedJoinPermissionIdResponse.setData(data);
	 
	 	return listNodesByOwnedJoinPermissionIdResponse;
	}
}