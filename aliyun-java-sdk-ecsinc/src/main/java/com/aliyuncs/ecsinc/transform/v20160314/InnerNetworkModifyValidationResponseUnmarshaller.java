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

package com.aliyuncs.ecsinc.transform.v20160314;

import com.aliyuncs.ecsinc.model.v20160314.InnerNetworkModifyValidationResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerNetworkModifyValidationResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerNetworkModifyValidationResponseUnmarshaller {

	public static InnerNetworkModifyValidationResponse unmarshall(InnerNetworkModifyValidationResponse innerNetworkModifyValidationResponse, UnmarshallerContext context) {
		
		innerNetworkModifyValidationResponse.setRequestId(context.stringValue("InnerNetworkModifyValidationResponse.RequestId"));
		innerNetworkModifyValidationResponse.setSuccess(context.booleanValue("InnerNetworkModifyValidationResponse.Success"));
		innerNetworkModifyValidationResponse.setCode(context.stringValue("InnerNetworkModifyValidationResponse.Code"));
		innerNetworkModifyValidationResponse.setMessage(context.stringValue("InnerNetworkModifyValidationResponse.Message"));
		innerNetworkModifyValidationResponse.setHttpStatusCode(context.integerValue("InnerNetworkModifyValidationResponse.HttpStatusCode"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerNetworkModifyValidationResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerNetworkModifyValidationResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerNetworkModifyValidationResponse.errorCode.isSuccess"));
		innerNetworkModifyValidationResponse.setErrorCode(errorCode);
	 
	 	return innerNetworkModifyValidationResponse;
	}
}