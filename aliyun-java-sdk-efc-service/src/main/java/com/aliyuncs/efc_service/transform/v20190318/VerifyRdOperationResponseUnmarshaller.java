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

package com.aliyuncs.efc_service.transform.v20190318;

import com.aliyuncs.efc_service.model.v20190318.VerifyRdOperationResponse;
import com.aliyuncs.efc_service.model.v20190318.VerifyRdOperationResponse.RdOprationCheckResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifyRdOperationResponseUnmarshaller {

	public static VerifyRdOperationResponse unmarshall(VerifyRdOperationResponse verifyRdOperationResponse, UnmarshallerContext _ctx) {
		
		verifyRdOperationResponse.setRequestId(_ctx.stringValue("VerifyRdOperationResponse.RequestId"));

		RdOprationCheckResult rdOprationCheckResult = new RdOprationCheckResult();
		rdOprationCheckResult.setSuccess(_ctx.booleanValue("VerifyRdOperationResponse.RdOprationCheckResult.Success"));
		rdOprationCheckResult.setBizType(_ctx.stringValue("VerifyRdOperationResponse.RdOprationCheckResult.BizType"));
		rdOprationCheckResult.setFailCode(_ctx.stringValue("VerifyRdOperationResponse.RdOprationCheckResult.FailCode"));
		rdOprationCheckResult.setFailMessage(_ctx.stringValue("VerifyRdOperationResponse.RdOprationCheckResult.FailMessage"));
		rdOprationCheckResult.setExtraData(_ctx.stringValue("VerifyRdOperationResponse.RdOprationCheckResult.ExtraData"));
		verifyRdOperationResponse.setRdOprationCheckResult(rdOprationCheckResult);
	 
	 	return verifyRdOperationResponse;
	}
}