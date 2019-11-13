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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceRecordLifeCycleResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDeviceRecordLifeCycleResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceRecordLifeCycleResponseUnmarshaller {

	public static QueryDeviceRecordLifeCycleResponse unmarshall(QueryDeviceRecordLifeCycleResponse queryDeviceRecordLifeCycleResponse, UnmarshallerContext _ctx) {
		
		queryDeviceRecordLifeCycleResponse.setRequestId(_ctx.stringValue("QueryDeviceRecordLifeCycleResponse.RequestId"));
		queryDeviceRecordLifeCycleResponse.setSuccess(_ctx.booleanValue("QueryDeviceRecordLifeCycleResponse.Success"));
		queryDeviceRecordLifeCycleResponse.setErrorMessage(_ctx.stringValue("QueryDeviceRecordLifeCycleResponse.ErrorMessage"));
		queryDeviceRecordLifeCycleResponse.setCode(_ctx.integerValue("QueryDeviceRecordLifeCycleResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceRecordLifeCycleResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIotId(_ctx.stringValue("QueryDeviceRecordLifeCycleResponse.Data["+ i +"].IotId"));
			dataItem.setDay(_ctx.integerValue("QueryDeviceRecordLifeCycleResponse.Data["+ i +"].Day"));

			data.add(dataItem);
		}
		queryDeviceRecordLifeCycleResponse.setData(data);
	 
	 	return queryDeviceRecordLifeCycleResponse;
	}
}