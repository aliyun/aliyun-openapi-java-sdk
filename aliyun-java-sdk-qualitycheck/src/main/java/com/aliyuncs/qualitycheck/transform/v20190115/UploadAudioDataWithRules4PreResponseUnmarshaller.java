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

import com.aliyuncs.qualitycheck.model.v20190115.UploadAudioDataWithRules4PreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioDataWithRules4PreResponseUnmarshaller {

	public static UploadAudioDataWithRules4PreResponse unmarshall(UploadAudioDataWithRules4PreResponse uploadAudioDataWithRules4PreResponse, UnmarshallerContext _ctx) {
		
		uploadAudioDataWithRules4PreResponse.setRequestId(_ctx.stringValue("UploadAudioDataWithRules4PreResponse.RequestId"));
		uploadAudioDataWithRules4PreResponse.setSuccess(_ctx.booleanValue("UploadAudioDataWithRules4PreResponse.Success"));
		uploadAudioDataWithRules4PreResponse.setCode(_ctx.stringValue("UploadAudioDataWithRules4PreResponse.Code"));
		uploadAudioDataWithRules4PreResponse.setMessage(_ctx.stringValue("UploadAudioDataWithRules4PreResponse.Message"));
		uploadAudioDataWithRules4PreResponse.setData(_ctx.stringValue("UploadAudioDataWithRules4PreResponse.Data"));
	 
	 	return uploadAudioDataWithRules4PreResponse;
	}
}