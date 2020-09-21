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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.GetNatGatewayConvertStatusResponse;
import com.aliyuncs.vpc.model.v20160428.GetNatGatewayConvertStatusResponse.ConvertStep;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNatGatewayConvertStatusResponseUnmarshaller {

	public static GetNatGatewayConvertStatusResponse unmarshall(GetNatGatewayConvertStatusResponse getNatGatewayConvertStatusResponse, UnmarshallerContext _ctx) {
		
		getNatGatewayConvertStatusResponse.setRequestId(_ctx.stringValue("GetNatGatewayConvertStatusResponse.RequestId"));
		getNatGatewayConvertStatusResponse.setNatGatewayId(_ctx.stringValue("GetNatGatewayConvertStatusResponse.NatGatewayId"));
		getNatGatewayConvertStatusResponse.setBid(_ctx.stringValue("GetNatGatewayConvertStatusResponse.Bid"));
		getNatGatewayConvertStatusResponse.setAliUid(_ctx.longValue("GetNatGatewayConvertStatusResponse.AliUid"));
		getNatGatewayConvertStatusResponse.setDstNatType(_ctx.stringValue("GetNatGatewayConvertStatusResponse.DstNatType"));

		List<ConvertStep> convertSteps = new ArrayList<ConvertStep>();
		for (int i = 0; i < _ctx.lengthValue("GetNatGatewayConvertStatusResponse.ConvertSteps.Length"); i++) {
			ConvertStep convertStep = new ConvertStep();
			convertStep.setStepName(_ctx.stringValue("GetNatGatewayConvertStatusResponse.ConvertSteps["+ i +"].StepName"));
			convertStep.setStepStatus(_ctx.stringValue("GetNatGatewayConvertStatusResponse.ConvertSteps["+ i +"].StepStatus"));
			convertStep.setStepStartTime(_ctx.stringValue("GetNatGatewayConvertStatusResponse.ConvertSteps["+ i +"].StepStartTime"));

			convertSteps.add(convertStep);
		}
		getNatGatewayConvertStatusResponse.setConvertSteps(convertSteps);
	 
	 	return getNatGatewayConvertStatusResponse;
	}
}