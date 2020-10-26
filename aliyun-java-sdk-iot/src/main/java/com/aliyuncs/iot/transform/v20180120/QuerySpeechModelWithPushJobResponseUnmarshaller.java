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

import com.aliyuncs.iot.model.v20180120.QuerySpeechModelWithPushJobResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelWithPushJobResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelWithPushJobResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechModelWithPushJobResponseUnmarshaller {

	public static QuerySpeechModelWithPushJobResponse unmarshall(QuerySpeechModelWithPushJobResponse querySpeechModelWithPushJobResponse, UnmarshallerContext _ctx) {
		
		querySpeechModelWithPushJobResponse.setRequestId(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.RequestId"));
		querySpeechModelWithPushJobResponse.setSuccess(_ctx.booleanValue("QuerySpeechModelWithPushJobResponse.Success"));
		querySpeechModelWithPushJobResponse.setCode(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.Code"));
		querySpeechModelWithPushJobResponse.setErrorMessage(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechModelWithPushJobResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechModelWithPushJobResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechModelWithPushJobResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechModelWithPushJobResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setBizCode(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.Data.List["+ i +"].BizCode"));
			items.setText(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.Data.List["+ i +"].Text"));
			items.setVoice(_ctx.stringValue("QuerySpeechModelWithPushJobResponse.Data.List["+ i +"].Voice"));

			list.add(items);
		}
		data.setList(list);
		querySpeechModelWithPushJobResponse.setData(data);
	 
	 	return querySpeechModelWithPushJobResponse;
	}
}