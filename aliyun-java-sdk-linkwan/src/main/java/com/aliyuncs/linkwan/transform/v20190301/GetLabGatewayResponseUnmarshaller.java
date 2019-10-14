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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetLabGatewayResponse;
import com.aliyuncs.linkwan.model.v20190301.GetLabGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLabGatewayResponseUnmarshaller {

	public static GetLabGatewayResponse unmarshall(GetLabGatewayResponse getLabGatewayResponse, UnmarshallerContext _ctx) {
		
		getLabGatewayResponse.setRequestId(_ctx.stringValue("GetLabGatewayResponse.RequestId"));
		getLabGatewayResponse.setSuccess(_ctx.booleanValue("GetLabGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(_ctx.stringValue("GetLabGatewayResponse.Data.GwEui"));
		data.setName(_ctx.stringValue("GetLabGatewayResponse.Data.Name"));
		data.setIotHubProductKey(_ctx.stringValue("GetLabGatewayResponse.Data.IotHubProductKey"));
		data.setIotHubDeviceName(_ctx.stringValue("GetLabGatewayResponse.Data.IotHubDeviceName"));
		data.setIotHubDeviceSecret(_ctx.stringValue("GetLabGatewayResponse.Data.IotHubDeviceSecret"));
		data.setOnlineState(_ctx.stringValue("GetLabGatewayResponse.Data.OnlineState"));
		data.setBoundNodesCount(_ctx.longValue("GetLabGatewayResponse.Data.BoundNodesCount"));
		data.setFreqBandPlanGroupId(_ctx.longValue("GetLabGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(_ctx.longValue("GetLabGatewayResponse.Data.CreateMillis"));
		data.setExpirationMillis(_ctx.longValue("GetLabGatewayResponse.Data.ExpirationMillis"));
		getLabGatewayResponse.setData(data);
	 
	 	return getLabGatewayResponse;
	}
}