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

import com.aliyuncs.iot.model.v20180120.QuerySpeechResponse;
import com.aliyuncs.iot.model.v20180120.QuerySpeechResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechResponseUnmarshaller {

	public static QuerySpeechResponse unmarshall(QuerySpeechResponse querySpeechResponse, UnmarshallerContext _ctx) {
		
		querySpeechResponse.setRequestId(_ctx.stringValue("QuerySpeechResponse.RequestId"));
		querySpeechResponse.setSuccess(_ctx.booleanValue("QuerySpeechResponse.Success"));
		querySpeechResponse.setCode(_ctx.stringValue("QuerySpeechResponse.Code"));
		querySpeechResponse.setErrorMessage(_ctx.stringValue("QuerySpeechResponse.ErrorMessage"));

		Data data = new Data();
		data.setSpeechCode(_ctx.stringValue("QuerySpeechResponse.Data.SpeechCode"));
		data.setBizCode(_ctx.stringValue("QuerySpeechResponse.Data.BizCode"));
		data.setVoice(_ctx.stringValue("QuerySpeechResponse.Data.Voice"));
		data.setVolume(_ctx.integerValue("QuerySpeechResponse.Data.Volume"));
		data.setSpeechRate(_ctx.integerValue("QuerySpeechResponse.Data.SpeechRate"));
		data.setText(_ctx.stringValue("QuerySpeechResponse.Data.Text"));
		data.setAudioFormat(_ctx.stringValue("QuerySpeechResponse.Data.AudioFormat"));
		data.setSpeechType(_ctx.stringValue("QuerySpeechResponse.Data.SpeechType"));
		querySpeechResponse.setData(data);
	 
	 	return querySpeechResponse;
	}
}