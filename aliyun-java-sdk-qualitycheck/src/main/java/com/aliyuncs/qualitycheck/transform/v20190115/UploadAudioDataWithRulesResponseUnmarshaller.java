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

import com.aliyuncs.qualitycheck.model.v20190115.UploadAudioDataWithRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioDataWithRulesResponseUnmarshaller {

	public static UploadAudioDataWithRulesResponse unmarshall(UploadAudioDataWithRulesResponse uploadAudioDataWithRulesResponse, UnmarshallerContext _ctx) {
		
		uploadAudioDataWithRulesResponse.setRequestId(_ctx.stringValue("UploadAudioDataWithRulesResponse.RequestId"));
		uploadAudioDataWithRulesResponse.setSuccess(_ctx.booleanValue("UploadAudioDataWithRulesResponse.Success"));
		uploadAudioDataWithRulesResponse.setCode(_ctx.stringValue("UploadAudioDataWithRulesResponse.Code"));
		uploadAudioDataWithRulesResponse.setMessage(_ctx.stringValue("UploadAudioDataWithRulesResponse.Message"));
		uploadAudioDataWithRulesResponse.setData(_ctx.stringValue("UploadAudioDataWithRulesResponse.Data"));
	 
	 	return uploadAudioDataWithRulesResponse;
	}
}