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

import com.aliyuncs.iot.model.v20180120.QuerySpeechModelResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechModelResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechModelResponseUnmarshaller {

	public static QuerySpeechModelResponse unmarshall(QuerySpeechModelResponse querySpeechModelResponse, UnmarshallerContext _ctx) {
		
		querySpeechModelResponse.setRequestId(_ctx.stringValue("QuerySpeechModelResponse.RequestId"));
		querySpeechModelResponse.setSuccess(_ctx.booleanValue("QuerySpeechModelResponse.Success"));
		querySpeechModelResponse.setCode(_ctx.stringValue("QuerySpeechModelResponse.Code"));
		querySpeechModelResponse.setErrorMessage(_ctx.stringValue("QuerySpeechModelResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechModelResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechModelResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechModelResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechModelResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setCode(_ctx.stringValue("QuerySpeechModelResponse.Data.List["+ i +"].Code"));
			items.setBizCode(_ctx.stringValue("QuerySpeechModelResponse.Data.List["+ i +"].BizCode"));
			items.setText(_ctx.stringValue("QuerySpeechModelResponse.Data.List["+ i +"].Text"));
			items.setVoice(_ctx.stringValue("QuerySpeechModelResponse.Data.List["+ i +"].Voice"));

			list.add(items);
		}
		data.setList(list);
		querySpeechModelResponse.setData(data);
	 
	 	return querySpeechModelResponse;
	}
}