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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqNodeResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqNodeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqNodeResponseUnmarshaller {

	public static ListMqSofamqNodeResponse unmarshall(ListMqSofamqNodeResponse listMqSofamqNodeResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqNodeResponse.setRequestId(_ctx.stringValue("ListMqSofamqNodeResponse.RequestId"));
		listMqSofamqNodeResponse.setResultCode(_ctx.stringValue("ListMqSofamqNodeResponse.ResultCode"));
		listMqSofamqNodeResponse.setResultMessage(_ctx.stringValue("ListMqSofamqNodeResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqNodeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCluster(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Cluster"));
			dataItem.setDataCenter(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].DataCenter"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].GmtModified"));
			dataItem.setHostname(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Hostname"));
			dataItem.setId(_ctx.longValue("ListMqSofamqNodeResponse.Data["+ i +"].Id"));
			dataItem.setNodeGroup(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].NodeGroup"));
			dataItem.setNodeType(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].NodeType"));
			dataItem.setPerm(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Perm"));
			dataItem.setRip(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Rip"));
			dataItem.setRoom(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Room"));
			dataItem.setVip(_ctx.stringValue("ListMqSofamqNodeResponse.Data["+ i +"].Vip"));

			data.add(dataItem);
		}
		listMqSofamqNodeResponse.setData(data);
	 
	 	return listMqSofamqNodeResponse;
	}
}