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

import com.aliyuncs.linkwan.model.v20190301.CreateLabGatewayResponse;
import com.aliyuncs.linkwan.model.v20190301.CreateLabGatewayResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLabGatewayResponseUnmarshaller {

	public static CreateLabGatewayResponse unmarshall(CreateLabGatewayResponse createLabGatewayResponse, UnmarshallerContext _ctx) {
		
		createLabGatewayResponse.setRequestId(_ctx.stringValue("CreateLabGatewayResponse.RequestId"));
		createLabGatewayResponse.setSuccess(_ctx.booleanValue("CreateLabGatewayResponse.Success"));

		Data data = new Data();
		data.setGwEui(_ctx.stringValue("CreateLabGatewayResponse.Data.GwEui"));
		data.setName(_ctx.stringValue("CreateLabGatewayResponse.Data.Name"));
		data.setIotHubProductKey(_ctx.stringValue("CreateLabGatewayResponse.Data.IotHubProductKey"));
		data.setIotHubDeviceName(_ctx.stringValue("CreateLabGatewayResponse.Data.IotHubDeviceName"));
		data.setIotHubDeviceSecret(_ctx.stringValue("CreateLabGatewayResponse.Data.IotHubDeviceSecret"));
		data.setOnlineState(_ctx.stringValue("CreateLabGatewayResponse.Data.OnlineState"));
		data.setBoundNodesCount(_ctx.longValue("CreateLabGatewayResponse.Data.BoundNodesCount"));
		data.setFreqBandPlanGroupId(_ctx.longValue("CreateLabGatewayResponse.Data.FreqBandPlanGroupId"));
		data.setCreateMillis(_ctx.longValue("CreateLabGatewayResponse.Data.CreateMillis"));
		createLabGatewayResponse.setData(data);
	 
	 	return createLabGatewayResponse;
	}
}