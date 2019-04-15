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

import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQuerySecurityResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQuerySecurityResponse.Data;
import com.aliyuncs.ecsinc.model.v20160314.InnerEcsQuerySecurityResponse.ErrorCode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerEcsQuerySecurityResponseUnmarshaller {

	public static InnerEcsQuerySecurityResponse unmarshall(InnerEcsQuerySecurityResponse innerEcsQuerySecurityResponse, UnmarshallerContext context) {
		
		innerEcsQuerySecurityResponse.setRequestId(context.stringValue("InnerEcsQuerySecurityResponse.RequestId"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerEcsQuerySecurityResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerEcsQuerySecurityResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerEcsQuerySecurityResponse.errorCode.isSuccess"));
		innerEcsQuerySecurityResponse.setErrorCode(errorCode);

		Data data = new Data();
		data.setFirewallRules(context.stringValue("InnerEcsQuerySecurityResponse.data.firewallRules"));
		data.setInstanceId(context.stringValue("InnerEcsQuerySecurityResponse.data.instanceId"));
		data.setVmStatus(context.stringValue("InnerEcsQuerySecurityResponse.data.vmStatus"));
		innerEcsQuerySecurityResponse.setData(data);
	 
	 	return innerEcsQuerySecurityResponse;
	}
}