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

import com.aliyuncs.qualitycheck.model.v20190115.UploadAudioData4PreResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadAudioData4PreResponseUnmarshaller {

	public static UploadAudioData4PreResponse unmarshall(UploadAudioData4PreResponse uploadAudioData4PreResponse, UnmarshallerContext _ctx) {
		
		uploadAudioData4PreResponse.setRequestId(_ctx.stringValue("UploadAudioData4PreResponse.RequestId"));
		uploadAudioData4PreResponse.setSuccess(_ctx.booleanValue("UploadAudioData4PreResponse.Success"));
		uploadAudioData4PreResponse.setCode(_ctx.stringValue("UploadAudioData4PreResponse.Code"));
		uploadAudioData4PreResponse.setMessage(_ctx.stringValue("UploadAudioData4PreResponse.Message"));
		uploadAudioData4PreResponse.setData(_ctx.stringValue("UploadAudioData4PreResponse.Data"));
	 
	 	return uploadAudioData4PreResponse;
	}
}