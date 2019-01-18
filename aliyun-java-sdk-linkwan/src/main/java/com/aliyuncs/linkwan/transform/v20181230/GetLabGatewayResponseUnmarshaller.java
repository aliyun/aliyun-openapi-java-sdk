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

import com.aliyuncs.linkwan.model.v20181230.GetLabGatewayResponse;
import com.aliyuncs.linkwan.model.v20181230.GetLabGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabGatewayResponseUnmarshaller {

	public static GetLabGatewayResponse unmarshall(GetLabGatewayResponse getLabGatewayResponse, UnmarshallerContext context) {
		
		getLabGatewayResponse.setRequestId(context.stringValue("GetLabGatewayResponse.RequestId"));
		getLabGatewayResponse.setSuccess(context.booleanValue("GetLabGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(context.stringValue("GetLabGatewayResponse.Data.GwEui"));
		data.setName(context.stringValue("GetLabGatewayResponse.Data.Name"));
		data.setIotHubProductKey(context.stringValue("GetLabGatewayResponse.Data.IotHubProductKey"));
		data.setIotHubDeviceName(context.stringValue("GetLabGatewayResponse.Data.IotHubDeviceName"));
		data.setIotHubDeviceSecret(context.stringValue("GetLabGatewayResponse.Data.IotHubDeviceSecret"));
		data.setOnlineState(context.stringValue("GetLabGatewayResponse.Data.OnlineState"));
		data.setBoundNodesCount(context.longValue("GetLabGatewayResponse.Data.BoundNodesCount"));
		data.setFreqBandPlanGroupId(context.longValue("GetLabGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(context.longValue("GetLabGatewayResponse.Data.CreateMillis"));
		getLabGatewayResponse.setData(data);
	 
	 	return getLabGatewayResponse;
	}
}