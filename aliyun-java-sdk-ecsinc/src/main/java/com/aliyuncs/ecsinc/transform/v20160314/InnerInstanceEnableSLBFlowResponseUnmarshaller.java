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

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceEnableSLBFlowResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceEnableSLBFlowResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceEnableSLBFlowResponseUnmarshaller {

	public static InnerInstanceEnableSLBFlowResponse unmarshall(InnerInstanceEnableSLBFlowResponse innerInstanceEnableSLBFlowResponse, UnmarshallerContext context) {
		
		innerInstanceEnableSLBFlowResponse.setRequestId(context.stringValue("InnerInstanceEnableSLBFlowResponse.RequestId"));
		innerInstanceEnableSLBFlowResponse.setData(context.stringValue("InnerInstanceEnableSLBFlowResponse.data"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceEnableSLBFlowResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceEnableSLBFlowResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceEnableSLBFlowResponse.errorCode.isSuccess"));
		innerInstanceEnableSLBFlowResponse.setErrorCode(errorCode);
	 
	 	return innerInstanceEnableSLBFlowResponse;
	}
}