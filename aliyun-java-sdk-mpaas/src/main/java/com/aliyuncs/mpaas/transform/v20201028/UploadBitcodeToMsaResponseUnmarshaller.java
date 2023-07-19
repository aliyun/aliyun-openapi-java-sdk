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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.UploadBitcodeToMsaResponse;
import com.aliyuncs.mpaas.model.v20201028.UploadBitcodeToMsaResponse.ResultContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadBitcodeToMsaResponseUnmarshaller {

	public static UploadBitcodeToMsaResponse unmarshall(UploadBitcodeToMsaResponse uploadBitcodeToMsaResponse, UnmarshallerContext _ctx) {
		
		uploadBitcodeToMsaResponse.setRequestId(_ctx.stringValue("UploadBitcodeToMsaResponse.RequestId"));
		uploadBitcodeToMsaResponse.setResultMessage(_ctx.stringValue("UploadBitcodeToMsaResponse.ResultMessage"));
		uploadBitcodeToMsaResponse.setResultCode(_ctx.stringValue("UploadBitcodeToMsaResponse.ResultCode"));

		ResultContent resultContent = new ResultContent();
		resultContent.setCode(_ctx.stringValue("UploadBitcodeToMsaResponse.ResultContent.Code"));
		resultContent.setMessage(_ctx.stringValue("UploadBitcodeToMsaResponse.ResultContent.Message"));
		resultContent.setSuccess(_ctx.booleanValue("UploadBitcodeToMsaResponse.ResultContent.Success"));
		resultContent.setData(_ctx.stringValue("UploadBitcodeToMsaResponse.ResultContent.Data"));
		uploadBitcodeToMsaResponse.setResultContent(resultContent);
	 
	 	return uploadBitcodeToMsaResponse;
	}
}