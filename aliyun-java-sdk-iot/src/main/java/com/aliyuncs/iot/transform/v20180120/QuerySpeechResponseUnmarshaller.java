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
import com.aliyuncs.iot.model.v20180120.QuerySpeechResponse.Data.SoundCodeConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySpeechResponseUnmarshaller {

	public static QuerySpeechResponse unmarshall(QuerySpeechResponse querySpeechResponse, UnmarshallerContext _ctx) {
		
		querySpeechResponse.setRequestId(_ctx.stringValue("QuerySpeechResponse.RequestId"));
		querySpeechResponse.setCode(_ctx.stringValue("QuerySpeechResponse.Code"));
		querySpeechResponse.setErrorMessage(_ctx.stringValue("QuerySpeechResponse.ErrorMessage"));
		querySpeechResponse.setSuccess(_ctx.booleanValue("QuerySpeechResponse.Success"));

		Data data = new Data();
		data.setVoice(_ctx.stringValue("QuerySpeechResponse.Data.Voice"));
		data.setBizCode(_ctx.stringValue("QuerySpeechResponse.Data.BizCode"));
		data.setSpeechCode(_ctx.stringValue("QuerySpeechResponse.Data.SpeechCode"));
		data.setSpeechType(_ctx.stringValue("QuerySpeechResponse.Data.SpeechType"));
		data.setText(_ctx.stringValue("QuerySpeechResponse.Data.Text"));
		data.setSpeechRate(_ctx.integerValue("QuerySpeechResponse.Data.SpeechRate"));
		data.setVolume(_ctx.integerValue("QuerySpeechResponse.Data.Volume"));
		data.setAudioFormat(_ctx.stringValue("QuerySpeechResponse.Data.AudioFormat"));
		data.setEnableSoundCode(_ctx.booleanValue("QuerySpeechResponse.Data.EnableSoundCode"));

		SoundCodeConfig soundCodeConfig = new SoundCodeConfig();
		soundCodeConfig.setAdditionalDuration(_ctx.integerValue("QuerySpeechResponse.Data.SoundCodeConfig.AdditionalDuration"));
		soundCodeConfig.setSoundCodeContent(_ctx.stringValue("QuerySpeechResponse.Data.SoundCodeConfig.SoundCodeContent"));
		data.setSoundCodeConfig(soundCodeConfig);
		querySpeechResponse.setData(data);
	 
	 	return querySpeechResponse;
	}
}