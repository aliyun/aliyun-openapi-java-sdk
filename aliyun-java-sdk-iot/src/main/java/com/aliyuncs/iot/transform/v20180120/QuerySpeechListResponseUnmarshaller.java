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

import com.aliyuncs.iot.model.v20180120.QuerySpeechListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySpeechListResponse.Data.Items;
import com.aliyuncs.iot.model.v20180120.QuerySpeechListResponse.Data.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechListResponseUnmarshaller {

	public static QuerySpeechListResponse unmarshall(QuerySpeechListResponse querySpeechListResponse, UnmarshallerContext _ctx) {
		
		querySpeechListResponse.setRequestId(_ctx.stringValue("QuerySpeechListResponse.RequestId"));
		querySpeechListResponse.setSuccess(_ctx.booleanValue("QuerySpeechListResponse.Success"));
		querySpeechListResponse.setCode(_ctx.stringValue("QuerySpeechListResponse.Code"));
		querySpeechListResponse.setErrorMessage(_ctx.stringValue("QuerySpeechListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySpeechListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySpeechListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySpeechListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySpeechListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setSpeechCode(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechCode"));
			items.setBizCode(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].BizCode"));
			items.setText(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].Text"));
			items.setVoice(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].Voice"));
			items.setSpeechType(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechType"));
			items.setAudioFormat(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].AudioFormat"));

			List<Items1> speechList = new ArrayList<Items1>();
			for (int j = 0; j < _ctx.lengthValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechList.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setSpeechCode(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechList["+ j +"].SpeechCode"));
				items1.setBizCode(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechList["+ j +"].BizCode"));
				items1.setText(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechList["+ j +"].Text"));
				items1.setVoice(_ctx.stringValue("QuerySpeechListResponse.Data.List["+ i +"].SpeechList["+ j +"].Voice"));

				speechList.add(items1);
			}
			items.setSpeechList(speechList);

			list.add(items);
		}
		data.setList(list);
		querySpeechListResponse.setData(data);
	 
	 	return querySpeechListResponse;
	}
}