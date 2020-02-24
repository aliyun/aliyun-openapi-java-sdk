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

import com.aliyuncs.outboundbot.model.v20191226.DownloadRecordingResponse;
import com.aliyuncs.outboundbot.model.v20191226.DownloadRecordingResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class DownloadRecordingResponseUnmarshaller {

	public static DownloadRecordingResponse unmarshall(DownloadRecordingResponse downloadRecordingResponse, UnmarshallerContext _ctx) {
		
		downloadRecordingResponse.setRequestId(_ctx.stringValue("DownloadRecordingResponse.RequestId"));
		downloadRecordingResponse.setSuccess(_ctx.booleanValue("DownloadRecordingResponse.Success"));
		downloadRecordingResponse.setCode(_ctx.stringValue("DownloadRecordingResponse.Code"));
		downloadRecordingResponse.setMessage(_ctx.stringValue("DownloadRecordingResponse.Message"));
		downloadRecordingResponse.setHttpStatusCode(_ctx.integerValue("DownloadRecordingResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("DownloadRecordingResponse.DownloadParams.SignatureUrl"));
		downloadParams.setFileName(_ctx.stringValue("DownloadRecordingResponse.DownloadParams.FileName"));
		downloadRecordingResponse.setDownloadParams(downloadParams);
	 
	 	return downloadRecordingResponse;
	}
}