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

import com.aliyuncs.sofa.model.v20190815.BatchqueryODPInstancesMappingsResponse;
import com.aliyuncs.sofa.model.v20190815.BatchqueryODPInstancesMappingsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchqueryODPInstancesMappingsResponseUnmarshaller {

	public static BatchqueryODPInstancesMappingsResponse unmarshall(BatchqueryODPInstancesMappingsResponse batchqueryODPInstancesMappingsResponse, UnmarshallerContext _ctx) {
		
		batchqueryODPInstancesMappingsResponse.setRequestId(_ctx.stringValue("BatchqueryODPInstancesMappingsResponse.RequestId"));
		batchqueryODPInstancesMappingsResponse.setResultCode(_ctx.stringValue("BatchqueryODPInstancesMappingsResponse.ResultCode"));
		batchqueryODPInstancesMappingsResponse.setResultMessage(_ctx.stringValue("BatchqueryODPInstancesMappingsResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchqueryODPInstancesMappingsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("BatchqueryODPInstancesMappingsResponse.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("BatchqueryODPInstancesMappingsResponse.Data["+ i +"].InstanceName"));

			data.add(dataItem);
		}
		batchqueryODPInstancesMappingsResponse.setData(data);
	 
	 	return batchqueryODPInstancesMappingsResponse;
	}
}