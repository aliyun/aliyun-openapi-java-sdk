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

import com.aliyuncs.vpc.model.v20160428.CreateVpnPbrRouteEntryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVpnPbrRouteEntryResponseUnmarshaller {

	public static CreateVpnPbrRouteEntryResponse unmarshall(CreateVpnPbrRouteEntryResponse createVpnPbrRouteEntryResponse, UnmarshallerContext _ctx) {
		
		createVpnPbrRouteEntryResponse.setRequestId(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.RequestId"));
		createVpnPbrRouteEntryResponse.setVpnInstanceId(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.VpnInstanceId"));
		createVpnPbrRouteEntryResponse.setRouteSource(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.RouteSource"));
		createVpnPbrRouteEntryResponse.setRouteDest(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.RouteDest"));
		createVpnPbrRouteEntryResponse.setNextHop(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.NextHop"));
		createVpnPbrRouteEntryResponse.setWeight(_ctx.integerValue("CreateVpnPbrRouteEntryResponse.Weight"));
		createVpnPbrRouteEntryResponse.setOverlayMode(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.OverlayMode"));
		createVpnPbrRouteEntryResponse.setDescription(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.Description"));
		createVpnPbrRouteEntryResponse.setState(_ctx.stringValue("CreateVpnPbrRouteEntryResponse.State"));
		createVpnPbrRouteEntryResponse.setCreateTime(_ctx.longValue("CreateVpnPbrRouteEntryResponse.CreateTime"));
	 
	 	return createVpnPbrRouteEntryResponse;
	}
}