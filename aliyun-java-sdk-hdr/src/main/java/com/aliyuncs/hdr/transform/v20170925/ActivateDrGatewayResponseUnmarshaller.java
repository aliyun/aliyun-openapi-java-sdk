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

import com.aliyuncs.hdr.model.v20170925.ActivateDrGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ActivateDrGatewayResponseUnmarshaller {

	public static ActivateDrGatewayResponse unmarshall(ActivateDrGatewayResponse activateDrGatewayResponse, UnmarshallerContext _ctx) {
		
		activateDrGatewayResponse.setRequestId(_ctx.stringValue("ActivateDrGatewayResponse.RequestId"));
		activateDrGatewayResponse.setSuccess(_ctx.booleanValue("ActivateDrGatewayResponse.Success"));
		activateDrGatewayResponse.setCode(_ctx.stringValue("ActivateDrGatewayResponse.Code"));
		activateDrGatewayResponse.setMessage(_ctx.stringValue("ActivateDrGatewayResponse.Message"));
		activateDrGatewayResponse.setAccountId(_ctx.longValue("ActivateDrGatewayResponse.AccountId"));
		activateDrGatewayResponse.setGatewayId(_ctx.stringValue("ActivateDrGatewayResponse.GatewayId"));
		activateDrGatewayResponse.setMqttBroker(_ctx.stringValue("ActivateDrGatewayResponse.MqttBroker"));
		activateDrGatewayResponse.setPubToken(_ctx.stringValue("ActivateDrGatewayResponse.PubToken"));
		activateDrGatewayResponse.setSubToken(_ctx.stringValue("ActivateDrGatewayResponse.SubToken"));
		activateDrGatewayResponse.setBucketName(_ctx.stringValue("ActivateDrGatewayResponse.BucketName"));
		activateDrGatewayResponse.setRegionId(_ctx.stringValue("ActivateDrGatewayResponse.RegionId"));
		activateDrGatewayResponse.setProtectedServerQuota(_ctx.integerValue("ActivateDrGatewayResponse.ProtectedServerQuota"));
	 
	 	return activateDrGatewayResponse;
	}
}