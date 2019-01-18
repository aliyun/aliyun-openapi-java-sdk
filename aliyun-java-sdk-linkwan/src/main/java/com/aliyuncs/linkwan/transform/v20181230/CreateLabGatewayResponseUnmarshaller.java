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

package com.aliyuncs.linkwan.transform.v20181230;

import com.aliyuncs.linkwan.model.v20181230.CreateLabGatewayResponse;
import com.aliyuncs.linkwan.model.v20181230.CreateLabGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabGatewayResponseUnmarshaller {

	public static CreateLabGatewayResponse unmarshall(CreateLabGatewayResponse createLabGatewayResponse, UnmarshallerContext context) {
		
		createLabGatewayResponse.setRequestId(context.stringValue("CreateLabGatewayResponse.RequestId"));
		createLabGatewayResponse.setSuccess(context.booleanValue("CreateLabGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(context.stringValue("CreateLabGatewayResponse.Data.GwEui"));
		data.setName(context.stringValue("CreateLabGatewayResponse.Data.Name"));
		data.setIotHubProductKey(context.stringValue("CreateLabGatewayResponse.Data.IotHubProductKey"));
		data.setIotHubDeviceName(context.stringValue("CreateLabGatewayResponse.Data.IotHubDeviceName"));
		data.setIotHubDeviceSecret(context.stringValue("CreateLabGatewayResponse.Data.IotHubDeviceSecret"));
		data.setOnlineState(context.stringValue("CreateLabGatewayResponse.Data.OnlineState"));
		data.setBoundNodesCount(context.longValue("CreateLabGatewayResponse.Data.BoundNodesCount"));
		data.setFreqBandPlanGroupId(context.longValue("CreateLabGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(context.longValue("CreateLabGatewayResponse.Data.CreateMillis"));
		createLabGatewayResponse.setData(data);
	 
	 	return createLabGatewayResponse;
	}
}