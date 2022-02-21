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

import com.aliyuncs.mpaas.model.v20201028.UploadMcubeRsaKeyResponse;
import com.aliyuncs.mpaas.model.v20201028.UploadMcubeRsaKeyResponse.UploadRsaResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadMcubeRsaKeyResponseUnmarshaller {

	public static UploadMcubeRsaKeyResponse unmarshall(UploadMcubeRsaKeyResponse uploadMcubeRsaKeyResponse, UnmarshallerContext _ctx) {
		
		uploadMcubeRsaKeyResponse.setRequestId(_ctx.stringValue("UploadMcubeRsaKeyResponse.RequestId"));
		uploadMcubeRsaKeyResponse.setResultMessage(_ctx.stringValue("UploadMcubeRsaKeyResponse.ResultMessage"));
		uploadMcubeRsaKeyResponse.setResultCode(_ctx.stringValue("UploadMcubeRsaKeyResponse.ResultCode"));

		UploadRsaResult uploadRsaResult = new UploadRsaResult();
		uploadRsaResult.setData(_ctx.stringValue("UploadMcubeRsaKeyResponse.UploadRsaResult.Data"));
		uploadRsaResult.setSuccess(_ctx.booleanValue("UploadMcubeRsaKeyResponse.UploadRsaResult.Success"));
		uploadRsaResult.setResultMsg(_ctx.stringValue("UploadMcubeRsaKeyResponse.UploadRsaResult.ResultMsg"));
		uploadMcubeRsaKeyResponse.setUploadRsaResult(uploadRsaResult);
	 
	 	return uploadMcubeRsaKeyResponse;
	}
}