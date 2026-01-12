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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.AcceptAgreementResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AcceptAgreementResponseUnmarshaller {

	public static AcceptAgreementResponse unmarshall(AcceptAgreementResponse acceptAgreementResponse, UnmarshallerContext _ctx) {
		
		acceptAgreementResponse.setRequestId(_ctx.stringValue("AcceptAgreementResponse.RequestId"));
		acceptAgreementResponse.setSuccess(_ctx.booleanValue("AcceptAgreementResponse.Success"));
		acceptAgreementResponse.setCode(_ctx.stringValue("AcceptAgreementResponse.Code"));
		acceptAgreementResponse.setMessage(_ctx.stringValue("AcceptAgreementResponse.Message"));
		acceptAgreementResponse.setErrorName(_ctx.stringValue("AcceptAgreementResponse.ErrorName"));
		acceptAgreementResponse.setHttpCode(_ctx.integerValue("AcceptAgreementResponse.HttpCode"));
	 
	 	return acceptAgreementResponse;
	}
}