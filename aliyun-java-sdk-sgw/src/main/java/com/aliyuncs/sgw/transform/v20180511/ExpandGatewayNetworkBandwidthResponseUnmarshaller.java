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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.ExpandGatewayNetworkBandwidthResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExpandGatewayNetworkBandwidthResponseUnmarshaller {

	public static ExpandGatewayNetworkBandwidthResponse unmarshall(ExpandGatewayNetworkBandwidthResponse expandGatewayNetworkBandwidthResponse, UnmarshallerContext _ctx) {
		
		expandGatewayNetworkBandwidthResponse.setRequestId(_ctx.stringValue("ExpandGatewayNetworkBandwidthResponse.RequestId"));
		expandGatewayNetworkBandwidthResponse.setSuccess(_ctx.booleanValue("ExpandGatewayNetworkBandwidthResponse.Success"));
		expandGatewayNetworkBandwidthResponse.setCode(_ctx.stringValue("ExpandGatewayNetworkBandwidthResponse.Code"));
		expandGatewayNetworkBandwidthResponse.setMessage(_ctx.stringValue("ExpandGatewayNetworkBandwidthResponse.Message"));
		expandGatewayNetworkBandwidthResponse.setTaskId(_ctx.stringValue("ExpandGatewayNetworkBandwidthResponse.TaskId"));
		expandGatewayNetworkBandwidthResponse.setBuyURL(_ctx.stringValue("ExpandGatewayNetworkBandwidthResponse.BuyURL"));
	 
	 	return expandGatewayNetworkBandwidthResponse;
	}
}