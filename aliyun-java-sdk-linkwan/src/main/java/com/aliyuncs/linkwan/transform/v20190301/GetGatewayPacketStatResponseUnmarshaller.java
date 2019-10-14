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

import com.aliyuncs.linkwan.model.v20190301.GetGatewayPacketStatResponse;
import com.aliyuncs.linkwan.model.v20190301.GetGatewayPacketStatResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetGatewayPacketStatResponseUnmarshaller {

	public static GetGatewayPacketStatResponse unmarshall(GetGatewayPacketStatResponse getGatewayPacketStatResponse, UnmarshallerContext _ctx) {
		
		getGatewayPacketStatResponse.setRequestId(_ctx.stringValue("GetGatewayPacketStatResponse.RequestId"));
		getGatewayPacketStatResponse.setSuccess(_ctx.booleanValue("GetGatewayPacketStatResponse.Success"));

		Data data = new Data();
		data.setUplinkValid(_ctx.integerValue("GetGatewayPacketStatResponse.Data.UplinkValid"));
		data.setUplinkInvalid(_ctx.integerValue("GetGatewayPacketStatResponse.Data.UplinkInvalid"));
		data.setDownlinkValid(_ctx.integerValue("GetGatewayPacketStatResponse.Data.DownlinkValid"));
		data.setDownlinkInvalid(_ctx.integerValue("GetGatewayPacketStatResponse.Data.DownlinkInvalid"));
		getGatewayPacketStatResponse.setData(data);
	 
	 	return getGatewayPacketStatResponse;
	}
}