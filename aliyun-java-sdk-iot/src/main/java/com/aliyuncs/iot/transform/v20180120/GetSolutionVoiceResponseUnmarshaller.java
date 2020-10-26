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

import com.aliyuncs.iot.model.v20180120.GetSolutionVoiceResponse;
import com.aliyuncs.iot.model.v20180120.GetSolutionVoiceResponse.Data;
import com.aliyuncs.iot.model.v20180120.GetSolutionVoiceResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSolutionVoiceResponseUnmarshaller {

	public static GetSolutionVoiceResponse unmarshall(GetSolutionVoiceResponse getSolutionVoiceResponse, UnmarshallerContext _ctx) {
		
		getSolutionVoiceResponse.setRequestId(_ctx.stringValue("GetSolutionVoiceResponse.RequestId"));
		getSolutionVoiceResponse.setSuccess(_ctx.booleanValue("GetSolutionVoiceResponse.Success"));
		getSolutionVoiceResponse.setCode(_ctx.stringValue("GetSolutionVoiceResponse.Code"));
		getSolutionVoiceResponse.setErrorMessage(_ctx.stringValue("GetSolutionVoiceResponse.ErrorMessage"));

		Data data = new Data();

		List<Items> speechModelVoiceVOList = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("GetSolutionVoiceResponse.Data.SpeechModelVoiceVOList.Length"); i++) {
			Items items = new Items();
			items.setValue(_ctx.stringValue("GetSolutionVoiceResponse.Data.SpeechModelVoiceVOList["+ i +"].Value"));
			items.setLabel(_ctx.stringValue("GetSolutionVoiceResponse.Data.SpeechModelVoiceVOList["+ i +"].Label"));
			items.setChildren(_ctx.stringValue("GetSolutionVoiceResponse.Data.SpeechModelVoiceVOList["+ i +"].Children"));

			speechModelVoiceVOList.add(items);
		}
		data.setSpeechModelVoiceVOList(speechModelVoiceVOList);
		getSolutionVoiceResponse.setData(data);
	 
	 	return getSolutionVoiceResponse;
	}
}