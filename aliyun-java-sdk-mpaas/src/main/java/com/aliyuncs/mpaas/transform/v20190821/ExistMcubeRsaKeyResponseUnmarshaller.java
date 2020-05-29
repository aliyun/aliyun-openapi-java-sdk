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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.ExistMcubeRsaKeyResponse;
import com.aliyuncs.mpaas.model.v20190821.ExistMcubeRsaKeyResponse.CheckRsaKeyResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExistMcubeRsaKeyResponseUnmarshaller {

	public static ExistMcubeRsaKeyResponse unmarshall(ExistMcubeRsaKeyResponse existMcubeRsaKeyResponse, UnmarshallerContext _ctx) {
		
		existMcubeRsaKeyResponse.setRequestId(_ctx.stringValue("ExistMcubeRsaKeyResponse.RequestId"));
		existMcubeRsaKeyResponse.setResultCode(_ctx.stringValue("ExistMcubeRsaKeyResponse.ResultCode"));
		existMcubeRsaKeyResponse.setResultMessage(_ctx.stringValue("ExistMcubeRsaKeyResponse.ResultMessage"));

		CheckRsaKeyResult checkRsaKeyResult = new CheckRsaKeyResult();
		checkRsaKeyResult.setData(_ctx.stringValue("ExistMcubeRsaKeyResponse.CheckRsaKeyResult.Data"));
		checkRsaKeyResult.setResultMsg(_ctx.stringValue("ExistMcubeRsaKeyResponse.CheckRsaKeyResult.ResultMsg"));
		checkRsaKeyResult.setSuccess(_ctx.booleanValue("ExistMcubeRsaKeyResponse.CheckRsaKeyResult.Success"));
		existMcubeRsaKeyResponse.setCheckRsaKeyResult(checkRsaKeyResult);
	 
	 	return existMcubeRsaKeyResponse;
	}
}