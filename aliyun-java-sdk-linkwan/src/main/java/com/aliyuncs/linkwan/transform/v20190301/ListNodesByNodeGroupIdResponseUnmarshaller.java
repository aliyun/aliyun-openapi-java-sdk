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

import com.aliyuncs.linkwan.model.v20190301.ListNodesByNodeGroupIdResponse;
import com.aliyuncs.linkwan.model.v20190301.ListNodesByNodeGroupIdResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListNodesByNodeGroupIdResponse.Data.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNodesByNodeGroupIdResponseUnmarshaller {

	public static ListNodesByNodeGroupIdResponse unmarshall(ListNodesByNodeGroupIdResponse listNodesByNodeGroupIdResponse, UnmarshallerContext _ctx) {
		
		listNodesByNodeGroupIdResponse.setRequestId(_ctx.stringValue("ListNodesByNodeGroupIdResponse.RequestId"));
		listNodesByNodeGroupIdResponse.setSuccess(_ctx.booleanValue("ListNodesByNodeGroupIdResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListNodesByNodeGroupIdResponse.Data.TotalCount"));

		List<Node> list = new ArrayList<Node>();
		for (int i = 0; i < _ctx.lengthValue("ListNodesByNodeGroupIdResponse.Data.List.Length"); i++) {
			Node node = new Node();
			node.setDevEui(_ctx.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].DevEui"));
			node.setDevAddr(_ctx.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].DevAddr"));
			node.setClassMode(_ctx.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].ClassMode"));
			node.setLastJoinMillis(_ctx.longValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].LastJoinMillis"));
			node.setBoundMillis(_ctx.longValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].BoundMillis"));
			node.setMulticastGroupId(_ctx.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].MulticastGroupId"));
			node.setAuthTypes(_ctx.stringValue("ListNodesByNodeGroupIdResponse.Data.List["+ i +"].AuthTypes"));

			list.add(node);
		}
		data.setList(list);
		listNodesByNodeGroupIdResponse.setData(data);
	 
	 	return listNodesByNodeGroupIdResponse;
	}
}