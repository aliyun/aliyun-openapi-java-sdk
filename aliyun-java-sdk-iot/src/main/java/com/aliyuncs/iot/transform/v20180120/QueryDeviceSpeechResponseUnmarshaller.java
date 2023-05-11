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

import com.aliyuncs.iot.model.v20180120.QueryDeviceSpeechResponse;
import com.aliyuncs.iot.model.v20180120.QueryDeviceSpeechResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryDeviceSpeechResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDeviceSpeechResponseUnmarshaller {

	public static QueryDeviceSpeechResponse unmarshall(QueryDeviceSpeechResponse queryDeviceSpeechResponse, UnmarshallerContext _ctx) {
		
		queryDeviceSpeechResponse.setRequestId(_ctx.stringValue("QueryDeviceSpeechResponse.RequestId"));
		queryDeviceSpeechResponse.setSuccess(_ctx.booleanValue("QueryDeviceSpeechResponse.Success"));
		queryDeviceSpeechResponse.setCode(_ctx.stringValue("QueryDeviceSpeechResponse.Code"));
		queryDeviceSpeechResponse.setErrorMessage(_ctx.stringValue("QueryDeviceSpeechResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDeviceSpeechResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QueryDeviceSpeechResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QueryDeviceSpeechResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QueryDeviceSpeechResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setBizCode(_ctx.stringValue("QueryDeviceSpeechResponse.Data.List["+ i +"].BizCode"));
			items.setSize(_ctx.floatValue("QueryDeviceSpeechResponse.Data.List["+ i +"].Size"));
			items.setAudioFormat(_ctx.stringValue("QueryDeviceSpeechResponse.Data.List["+ i +"].AudioFormat"));

			list.add(items);
		}
		data.setList(list);
		queryDeviceSpeechResponse.setData(data);
	 
	 	return queryDeviceSpeechResponse;
	}
}