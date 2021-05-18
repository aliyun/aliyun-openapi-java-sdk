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

import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobSpeechResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobSpeechResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobSpeechResponse.Data.Items;
import com.aliyuncs.iot.model.v20180120.QuerySpeechPushJobSpeechResponse.Data.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechPushJobSpeechResponseUnmarshaller {

	public static QuerySpeechPushJobSpeechResponse unmarshall(QuerySpeechPushJobSpeechResponse querySpeechPushJobSpeechResponse, UnmarshallerContext _ctx) {
		
		querySpeechPushJobSpeechResponse.setRequestId(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.RequestId"));
		querySpeechPushJobSpeechResponse.setSuccess(_ctx.booleanValue("QuerySpeechPushJobSpeechResponse.Success"));
		querySpeechPushJobSpeechResponse.setCode(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Code"));
		querySpeechPushJobSpeechResponse.setErrorMessage(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechPushJobSpeechResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechPushJobSpeechResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechPushJobSpeechResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechPushJobSpeechResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setBizCode(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].BizCode"));
			items.setText(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].Text"));
			items.setVoice(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].Voice"));
			items.setSpeechType(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].SpeechType"));

			List<Items1> speechList = new ArrayList<Items1>();
			for (int j = 0; j < _ctx.lengthValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].SpeechList.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setBizCode(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].SpeechList["+ j +"].BizCode"));
				items1.setText(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].SpeechList["+ j +"].Text"));
				items1.setVoice(_ctx.stringValue("QuerySpeechPushJobSpeechResponse.Data.List["+ i +"].SpeechList["+ j +"].Voice"));

				speechList.add(items1);
			}
			items.setSpeechList(speechList);

			list.add(items);
		}
		data.setList(list);
		querySpeechPushJobSpeechResponse.setData(data);
	 
	 	return querySpeechPushJobSpeechResponse;
	}
}