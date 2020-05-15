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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqDatacenterResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqDatacenterResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqDatacenterResponseUnmarshaller {

	public static ListMqSofamqDatacenterResponse unmarshall(ListMqSofamqDatacenterResponse listMqSofamqDatacenterResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqDatacenterResponse.setRequestId(_ctx.stringValue("ListMqSofamqDatacenterResponse.RequestId"));
		listMqSofamqDatacenterResponse.setResultCode(_ctx.stringValue("ListMqSofamqDatacenterResponse.ResultCode"));
		listMqSofamqDatacenterResponse.setResultMessage(_ctx.stringValue("ListMqSofamqDatacenterResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqDatacenterResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCluster(_ctx.stringValue("ListMqSofamqDatacenterResponse.Data["+ i +"].Cluster"));
			dataItem.setDatacenter(_ctx.stringValue("ListMqSofamqDatacenterResponse.Data["+ i +"].Datacenter"));
			dataItem.setGmtCreate(_ctx.stringValue("ListMqSofamqDatacenterResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListMqSofamqDatacenterResponse.Data["+ i +"].GmtModified"));
			dataItem.setId(_ctx.longValue("ListMqSofamqDatacenterResponse.Data["+ i +"].Id"));
			dataItem.setRoom(_ctx.stringValue("ListMqSofamqDatacenterResponse.Data["+ i +"].Room"));

			data.add(dataItem);
		}
		listMqSofamqDatacenterResponse.setData(data);
	 
	 	return listMqSofamqDatacenterResponse;
	}
}