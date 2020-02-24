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

import com.aliyuncs.outboundbot.model.v20191226.ExportScriptResponse;
import com.aliyuncs.outboundbot.model.v20191226.ExportScriptResponse.DownloadParams;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportScriptResponseUnmarshaller {

	public static ExportScriptResponse unmarshall(ExportScriptResponse exportScriptResponse, UnmarshallerContext _ctx) {
		
		exportScriptResponse.setRequestId(_ctx.stringValue("ExportScriptResponse.RequestId"));
		exportScriptResponse.setSuccess(_ctx.booleanValue("ExportScriptResponse.Success"));
		exportScriptResponse.setCode(_ctx.stringValue("ExportScriptResponse.Code"));
		exportScriptResponse.setMessage(_ctx.stringValue("ExportScriptResponse.Message"));
		exportScriptResponse.setHttpStatusCode(_ctx.integerValue("ExportScriptResponse.HttpStatusCode"));

		DownloadParams downloadParams = new DownloadParams();
		downloadParams.setSignatureUrl(_ctx.stringValue("ExportScriptResponse.DownloadParams.SignatureUrl"));
		exportScriptResponse.setDownloadParams(downloadParams);
	 
	 	return exportScriptResponse;
	}
}