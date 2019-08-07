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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeDrGatewayFlowControlPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrGatewayFlowControlPolicyResponseUnmarshaller {

	public static DescribeDrGatewayFlowControlPolicyResponse unmarshall(DescribeDrGatewayFlowControlPolicyResponse describeDrGatewayFlowControlPolicyResponse, UnmarshallerContext _ctx) {
		
		describeDrGatewayFlowControlPolicyResponse.setRequestId(_ctx.stringValue("DescribeDrGatewayFlowControlPolicyResponse.RequestId"));
		describeDrGatewayFlowControlPolicyResponse.setSuccess(_ctx.booleanValue("DescribeDrGatewayFlowControlPolicyResponse.Success"));
		describeDrGatewayFlowControlPolicyResponse.setCode(_ctx.stringValue("DescribeDrGatewayFlowControlPolicyResponse.Code"));
		describeDrGatewayFlowControlPolicyResponse.setMessage(_ctx.stringValue("DescribeDrGatewayFlowControlPolicyResponse.Message"));
		describeDrGatewayFlowControlPolicyResponse.setFlowControlPolicy(_ctx.stringValue("DescribeDrGatewayFlowControlPolicyResponse.FlowControlPolicy"));
	 
	 	return describeDrGatewayFlowControlPolicyResponse;
	}
}