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

import com.aliyuncs.iot.model.v20180120.GetSpeechVoiceResponse;
import com.aliyuncs.iot.model.v20180120.GetSpeechVoiceResponse.Items;
import com.aliyuncs.iot.model.v20180120.GetSpeechVoiceResponse.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpeechVoiceResponseUnmarshaller {

	public static GetSpeechVoiceResponse unmarshall(GetSpeechVoiceResponse getSpeechVoiceResponse, UnmarshallerContext _ctx) {
		
		getSpeechVoiceResponse.setRequestId(_ctx.stringValue("GetSpeechVoiceResponse.RequestId"));
		getSpeechVoiceResponse.setSuccess(_ctx.booleanValue("GetSpeechVoiceResponse.Success"));
		getSpeechVoiceResponse.setCode(_ctx.stringValue("GetSpeechVoiceResponse.Code"));
		getSpeechVoiceResponse.setErrorMessage(_ctx.stringValue("GetSpeechVoiceResponse.ErrorMessage"));

		List<Items> data = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("GetSpeechVoiceResponse.Data.Length"); i++) {
			Items items = new Items();
			items.setValue(_ctx.stringValue("GetSpeechVoiceResponse.Data["+ i +"].Value"));
			items.setLabel(_ctx.stringValue("GetSpeechVoiceResponse.Data["+ i +"].Label"));

			List<Items1> voiceList = new ArrayList<Items1>();
			for (int j = 0; j < _ctx.lengthValue("GetSpeechVoiceResponse.Data["+ i +"].VoiceList.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setValue(_ctx.stringValue("GetSpeechVoiceResponse.Data["+ i +"].VoiceList["+ j +"].Value"));
				items1.setLabel(_ctx.stringValue("GetSpeechVoiceResponse.Data["+ i +"].VoiceList["+ j +"].Label"));

				voiceList.add(items1);
			}
			items.setVoiceList(voiceList);

			data.add(items);
		}
		getSpeechVoiceResponse.setData(data);
	 
	 	return getSpeechVoiceResponse;
	}
}