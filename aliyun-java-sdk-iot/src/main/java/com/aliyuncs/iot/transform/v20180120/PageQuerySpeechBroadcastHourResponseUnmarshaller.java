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

import com.aliyuncs.iot.model.v20180120.PageQuerySpeechBroadcastHourResponse;
import com.aliyuncs.iot.model.v20180120.PageQuerySpeechBroadcastHourResponse.Data;
import com.aliyuncs.iot.model.v20180120.PageQuerySpeechBroadcastHourResponse.Data.Data1;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageQuerySpeechBroadcastHourResponseUnmarshaller {

	public static PageQuerySpeechBroadcastHourResponse unmarshall(PageQuerySpeechBroadcastHourResponse pageQuerySpeechBroadcastHourResponse, UnmarshallerContext _ctx) {
		
		pageQuerySpeechBroadcastHourResponse.setRequestId(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.RequestId"));
		pageQuerySpeechBroadcastHourResponse.setSuccess(_ctx.booleanValue("PageQuerySpeechBroadcastHourResponse.Success"));
		pageQuerySpeechBroadcastHourResponse.setCode(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Code"));
		pageQuerySpeechBroadcastHourResponse.setErrorMessage(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.ErrorMessage"));

		Data data = new Data();
		data.setPageId(_ctx.integerValue("PageQuerySpeechBroadcastHourResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("PageQuerySpeechBroadcastHourResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("PageQuerySpeechBroadcastHourResponse.Data.Total"));
		data.setPageToken(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.PageToken"));

		List<Data1> resultData = new ArrayList<Data1>();
		for (int i = 0; i < _ctx.lengthValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData.Length"); i++) {
			Data1 data1 = new Data1();
			data1.setProductKey(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].ProductKey"));
			data1.setDeviceName(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].DeviceName"));
			data1.setShareTaskCode(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].ShareTaskCode"));
			data1.setSpeechs(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].Speechs"));
			data1.setCode(_ctx.integerValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].Code"));
			data1.setMsg(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].Msg"));
			data1.setSpeechId(_ctx.stringValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].SpeechId"));
			data1.setStartTime(_ctx.longValue("PageQuerySpeechBroadcastHourResponse.Data.ResultData["+ i +"].StartTime"));

			resultData.add(data1);
		}
		data.setResultData(resultData);
		pageQuerySpeechBroadcastHourResponse.setData(data);
	 
	 	return pageQuerySpeechBroadcastHourResponse;
	}
}