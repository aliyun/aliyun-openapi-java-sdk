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

package com.aliyuncs.smartag_inner.transform.v20180313;

import com.aliyuncs.smartag_inner.model.v20180313.InnerDeleteSmartAccessGatewayForceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerDeleteSmartAccessGatewayForceResponseUnmarshaller {

	public static InnerDeleteSmartAccessGatewayForceResponse unmarshall(InnerDeleteSmartAccessGatewayForceResponse innerDeleteSmartAccessGatewayForceResponse, UnmarshallerContext context) {
		
		innerDeleteSmartAccessGatewayForceResponse.setRequestId(context.stringValue("InnerDeleteSmartAccessGatewayForceResponse.requestId"));
		innerDeleteSmartAccessGatewayForceResponse.setData(context.stringValue("InnerDeleteSmartAccessGatewayForceResponse.data"));
		innerDeleteSmartAccessGatewayForceResponse.setCode(context.stringValue("InnerDeleteSmartAccessGatewayForceResponse.code"));
		innerDeleteSmartAccessGatewayForceResponse.setSuccess(context.booleanValue("InnerDeleteSmartAccessGatewayForceResponse.success"));
		innerDeleteSmartAccessGatewayForceResponse.setMessage(context.stringValue("InnerDeleteSmartAccessGatewayForceResponse.message"));
	 
	 	return innerDeleteSmartAccessGatewayForceResponse;
	}
}