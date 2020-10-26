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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushDeviceJobResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushDeviceJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelPushDeviceJobResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechModelPushDeviceJobResponseUnmarshaller {

	public static QuerySpeechModelPushDeviceJobResponse unmarshall(QuerySpeechModelPushDeviceJobResponse querySpeechModelPushDeviceJobResponse, UnmarshallerContext _ctx) {
		
		querySpeechModelPushDeviceJobResponse.setRequestId(_ctx.stringValue("QuerySpeechModelPushDeviceJobResponse.RequestId"));
		querySpeechModelPushDeviceJobResponse.setSuccess(_ctx.booleanValue("QuerySpeechModelPushDeviceJobResponse.Success"));
		querySpeechModelPushDeviceJobResponse.setCode(_ctx.stringValue("QuerySpeechModelPushDeviceJobResponse.Code"));
		querySpeechModelPushDeviceJobResponse.setErrorMessage(_ctx.stringValue("QuerySpeechModelPushDeviceJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechModelPushDeviceJobResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechModelPushDeviceJobResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechModelPushDeviceJobResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechModelPushDeviceJobResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setGmtModified(_ctx.longValue("QuerySpeechModelPushDeviceJobResponse.Data.List["+ i +"].GmtModified"));
			items.setStatus(_ctx.stringValue("QuerySpeechModelPushDeviceJobResponse.Data.List["+ i +"].Status"));
			items.setDeviceName(_ctx.stringValue("QuerySpeechModelPushDeviceJobResponse.Data.List["+ i +"].DeviceName"));

			list.add(items);
		}
		data.setList(list);
		querySpeechModelPushDeviceJobResponse.setData(data);
	 
	 	return querySpeechModelPushDeviceJobResponse;
	}
}