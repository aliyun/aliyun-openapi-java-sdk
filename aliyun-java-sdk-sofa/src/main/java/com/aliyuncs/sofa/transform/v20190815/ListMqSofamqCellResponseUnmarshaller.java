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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqCellResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqCellResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqCellResponseUnmarshaller {

	public static ListMqSofamqCellResponse unmarshall(ListMqSofamqCellResponse listMqSofamqCellResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqCellResponse.setRequestId(_ctx.stringValue("ListMqSofamqCellResponse.RequestId"));
		listMqSofamqCellResponse.setResultCode(_ctx.stringValue("ListMqSofamqCellResponse.ResultCode"));
		listMqSofamqCellResponse.setResultMessage(_ctx.stringValue("ListMqSofamqCellResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqCellResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCell(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].Cell"));
			dataItem.setCellType(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].CellType"));
			dataItem.setDatacenter(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].Datacenter"));
			dataItem.setEndpoint(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].Endpoint"));
			dataItem.setEndpointType(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].EndpointType"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("ListMqSofamqCellResponse.Data["+ i +"].Id"));
			dataItem.setNamespaceId(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].NamespaceId"));
			dataItem.setRoom(_ctx.stringValue("ListMqSofamqCellResponse.Data["+ i +"].Room"));

			data.add(dataItem);
		}
		listMqSofamqCellResponse.setData(data);
	 
	 	return listMqSofamqCellResponse;
	}
}