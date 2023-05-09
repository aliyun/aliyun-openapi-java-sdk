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

import com.aliyuncs.iot.model.v20180120.GetSoundCodeAudioResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSoundCodeAudioResponseUnmarshaller {

	public static GetSoundCodeAudioResponse unmarshall(GetSoundCodeAudioResponse getSoundCodeAudioResponse, UnmarshallerContext _ctx) {
		
		getSoundCodeAudioResponse.setRequestId(_ctx.stringValue("GetSoundCodeAudioResponse.RequestId"));
		getSoundCodeAudioResponse.setCode(_ctx.stringValue("GetSoundCodeAudioResponse.Code"));
		getSoundCodeAudioResponse.setErrorMessage(_ctx.stringValue("GetSoundCodeAudioResponse.ErrorMessage"));
		getSoundCodeAudioResponse.setSuccess(_ctx.booleanValue("GetSoundCodeAudioResponse.Success"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSoundCodeAudioResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetSoundCodeAudioResponse.Data["+ i +"]"));
		}
		getSoundCodeAudioResponse.setData(data);
	 
	 	return getSoundCodeAudioResponse;
	}
}