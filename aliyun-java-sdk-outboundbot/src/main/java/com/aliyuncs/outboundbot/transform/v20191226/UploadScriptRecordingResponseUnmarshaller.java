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

package com.aliyuncs.outboundbot.transform.v20191226;

import com.aliyuncs.outboundbot.model.v20191226.UploadScriptRecordingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadScriptRecordingResponseUnmarshaller {

	public static UploadScriptRecordingResponse unmarshall(UploadScriptRecordingResponse uploadScriptRecordingResponse, UnmarshallerContext _ctx) {
		
		uploadScriptRecordingResponse.setRequestId(_ctx.stringValue("UploadScriptRecordingResponse.RequestId"));
		uploadScriptRecordingResponse.setHttpStatusCode(_ctx.integerValue("UploadScriptRecordingResponse.HttpStatusCode"));
		uploadScriptRecordingResponse.setUuid(_ctx.stringValue("UploadScriptRecordingResponse.Uuid"));
		uploadScriptRecordingResponse.setSuccess(_ctx.booleanValue("UploadScriptRecordingResponse.Success"));
		uploadScriptRecordingResponse.setCode(_ctx.stringValue("UploadScriptRecordingResponse.Code"));
		uploadScriptRecordingResponse.setMessage(_ctx.stringValue("UploadScriptRecordingResponse.Message"));
	 
	 	return uploadScriptRecordingResponse;
	}
}