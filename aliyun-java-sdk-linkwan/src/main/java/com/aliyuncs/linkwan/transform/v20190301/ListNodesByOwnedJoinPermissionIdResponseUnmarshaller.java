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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListNodesByOwnedJoinPermissionIdResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodesByOwnedJoinPermissionIdResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodesByOwnedJoinPermissionIdResponse.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByOwnedJoinPermissionIdResponseUnmarshaller {

	public static ListNodesByOwnedJoinPermissionIdResponse unmarshall(ListNodesByOwnedJoinPermissionIdResponse listNodesByOwnedJoinPermissionIdResponse, UnmarshallerContext _ctx) {
		
		listNodesByOwnedJoinPermissionIdResponse.setRequestId(_ctx.stringValue("ListNodesByOwnedJoinPermissionIdResponse.RequestId"));
		listNodesByOwnedJoinPermissionIdResponse.setSuccess(_ctx.booleanValue("ListNodesByOwnedJoinPermissionIdResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.TotalCount"));

		List<Node> list = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List.Length"); i++) {
			Node node = new Node();
			node.setDevEui(_ctx.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].DevEui"));
			node.setDevAddr(_ctx.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].DevAddr"));
			node.setClassMode(_ctx.stringValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].ClassMode"));
			node.setLastJoinMillis(_ctx.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].LastJoinMillis"));
			node.setBoundMillis(_ctx.longValue("ListNodesByOwnedJoinPermissionIdResponse.Data.List["+ i +"].BoundMillis"));

			list.add(node);
		}
		data.setList(list);
		listNodesByOwnedJoinPermissionIdResponse.setData(data);
	 
	 	return listNodesByOwnedJoinPermissionIdResponse;
	}
}