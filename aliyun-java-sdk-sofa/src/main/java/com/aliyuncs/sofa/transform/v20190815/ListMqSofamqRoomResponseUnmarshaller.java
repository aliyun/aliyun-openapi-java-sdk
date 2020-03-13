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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqRoomResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqRoomResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqRoomResponseUnmarshaller {

	public static ListMqSofamqRoomResponse unmarshall(ListMqSofamqRoomResponse listMqSofamqRoomResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqRoomResponse.setRequestId(_ctx.stringValue("ListMqSofamqRoomResponse.RequestId"));
		listMqSofamqRoomResponse.setResultCode(_ctx.stringValue("ListMqSofamqRoomResponse.ResultCode"));
		listMqSofamqRoomResponse.setResultMessage(_ctx.stringValue("ListMqSofamqRoomResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqRoomResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCluster(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].Cluster"));
			dataItem.setEndpoint(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].Endpoint"));
			dataItem.setEndpointType(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].EndpointType"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("ListMqSofamqRoomResponse.Data["+ i +"].Id"));
			dataItem.setRegion(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].Region"));
			dataItem.setRoom(_ctx.stringValue("ListMqSofamqRoomResponse.Data["+ i +"].Room"));

			data.add(dataItem);
		}
		listMqSofamqRoomResponse.setData(data);
	 
	 	return listMqSofamqRoomResponse;
	}
}