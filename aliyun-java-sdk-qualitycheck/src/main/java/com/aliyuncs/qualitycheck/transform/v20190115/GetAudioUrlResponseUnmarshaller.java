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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetAudioUrlResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetAudioUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAudioUrlResponseUnmarshaller {

	public static GetAudioUrlResponse unmarshall(GetAudioUrlResponse getAudioUrlResponse, UnmarshallerContext _ctx) {
		
		getAudioUrlResponse.setRequestId(_ctx.stringValue("GetAudioUrlResponse.RequestId"));
		getAudioUrlResponse.setSuccess(_ctx.booleanValue("GetAudioUrlResponse.Success"));
		getAudioUrlResponse.setCode(_ctx.stringValue("GetAudioUrlResponse.Code"));
		getAudioUrlResponse.setMessage(_ctx.stringValue("GetAudioUrlResponse.Message"));

		Data data = new Data();
		data.setAudioUrl(_ctx.stringValue("GetAudioUrlResponse.Data.AudioUrl"));
		getAudioUrlResponse.setData(data);
	 
	 	return getAudioUrlResponse;
	}
}