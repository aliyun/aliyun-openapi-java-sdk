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

package com.aliyuncs.eflo.transform.v20220530;

import com.aliyuncs.eflo.model.v20220530.GetErRouteMapResponse;
import com.aliyuncs.eflo.model.v20220530.GetErRouteMapResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetErRouteMapResponseUnmarshaller {

	public static GetErRouteMapResponse unmarshall(GetErRouteMapResponse getErRouteMapResponse, UnmarshallerContext _ctx) {
		
		getErRouteMapResponse.setRequestId(_ctx.stringValue("GetErRouteMapResponse.RequestId"));
		getErRouteMapResponse.setCode(_ctx.integerValue("GetErRouteMapResponse.Code"));
		getErRouteMapResponse.setMessage(_ctx.stringValue("GetErRouteMapResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetErRouteMapResponse.Content.RegionId"));
		content.setTenantId(_ctx.stringValue("GetErRouteMapResponse.Content.TenantId"));
		content.setGmtCreate(_ctx.stringValue("GetErRouteMapResponse.Content.GmtCreate"));
		content.setGmtModified(_ctx.stringValue("GetErRouteMapResponse.Content.GmtModified"));
		content.setMessage(_ctx.stringValue("GetErRouteMapResponse.Content.Message"));
		content.setStatus(_ctx.stringValue("GetErRouteMapResponse.Content.Status"));
		content.setErRouteMapId(_ctx.stringValue("GetErRouteMapResponse.Content.ErRouteMapId"));
		content.setErId(_ctx.stringValue("GetErRouteMapResponse.Content.ErId"));
		content.setRouteMapNum(_ctx.integerValue("GetErRouteMapResponse.Content.RouteMapNum"));
		content.setDescription(_ctx.stringValue("GetErRouteMapResponse.Content.Description"));
		content.setDestinationCidrBlock(_ctx.stringValue("GetErRouteMapResponse.Content.DestinationCidrBlock"));
		content.setTransmissionInstanceName(_ctx.stringValue("GetErRouteMapResponse.Content.TransmissionInstanceName"));
		content.setTransmissionInstanceId(_ctx.stringValue("GetErRouteMapResponse.Content.TransmissionInstanceId"));
		content.setTransmissionInstanceType(_ctx.stringValue("GetErRouteMapResponse.Content.TransmissionInstanceType"));
		content.setReceptionInstanceName(_ctx.stringValue("GetErRouteMapResponse.Content.ReceptionInstanceName"));
		content.setReceptionInstanceId(_ctx.stringValue("GetErRouteMapResponse.Content.ReceptionInstanceId"));
		content.setReceptionInstanceType(_ctx.stringValue("GetErRouteMapResponse.Content.ReceptionInstanceType"));
		content.setAction(_ctx.stringValue("GetErRouteMapResponse.Content.Action"));
		content.setTransmissionInstanceOwner(_ctx.stringValue("GetErRouteMapResponse.Content.TransmissionInstanceOwner"));
		content.setReceptionInstanceOwner(_ctx.stringValue("GetErRouteMapResponse.Content.ReceptionInstanceOwner"));
		content.setResourceGroupId(_ctx.stringValue("GetErRouteMapResponse.Content.ResourceGroupId"));
		content.setErRouteMapName(_ctx.stringValue("GetErRouteMapResponse.Content.ErRouteMapName"));
		getErRouteMapResponse.setContent(content);
	 
	 	return getErRouteMapResponse;
	}
}