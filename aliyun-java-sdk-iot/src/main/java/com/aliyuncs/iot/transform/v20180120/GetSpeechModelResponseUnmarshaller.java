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

import com.aliyuncs.iot.model.v20180120.GetSpeechModelResponse;
import com.aliyuncs.iot.model.v20180120.GetSpeechModelResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechModelResponseUnmarshaller {

	public static GetSpeechModelResponse unmarshall(GetSpeechModelResponse getSpeechModelResponse, UnmarshallerContext _ctx) {
		
		getSpeechModelResponse.setRequestId(_ctx.stringValue("GetSpeechModelResponse.RequestId"));
		getSpeechModelResponse.setSuccess(_ctx.booleanValue("GetSpeechModelResponse.Success"));
		getSpeechModelResponse.setCode(_ctx.stringValue("GetSpeechModelResponse.Code"));
		getSpeechModelResponse.setErrorMessage(_ctx.stringValue("GetSpeechModelResponse.ErrorMessage"));

		Data data = new Data();
		data.setCode(_ctx.stringValue("GetSpeechModelResponse.Data.Code"));
		data.setBizCode(_ctx.stringValue("GetSpeechModelResponse.Data.BizCode"));
		data.setVoice(_ctx.stringValue("GetSpeechModelResponse.Data.Voice"));
		data.setVolume(_ctx.integerValue("GetSpeechModelResponse.Data.Volume"));
		data.setSpeechRate(_ctx.integerValue("GetSpeechModelResponse.Data.SpeechRate"));
		data.setText(_ctx.stringValue("GetSpeechModelResponse.Data.Text"));
		data.setAudioFormat(_ctx.stringValue("GetSpeechModelResponse.Data.AudioFormat"));
		getSpeechModelResponse.setData(data);
	 
	 	return getSpeechModelResponse;
	}
}