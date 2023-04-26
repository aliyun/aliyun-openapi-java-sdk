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

import com.aliyuncs.eflo.model.v20220530.GetErRouteEntryResponse;
import com.aliyuncs.eflo.model.v20220530.GetErRouteEntryResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetErRouteEntryResponseUnmarshaller {

	public static GetErRouteEntryResponse unmarshall(GetErRouteEntryResponse getErRouteEntryResponse, UnmarshallerContext _ctx) {
		
		getErRouteEntryResponse.setRequestId(_ctx.stringValue("GetErRouteEntryResponse.RequestId"));
		getErRouteEntryResponse.setCode(_ctx.integerValue("GetErRouteEntryResponse.Code"));
		getErRouteEntryResponse.setMessage(_ctx.stringValue("GetErRouteEntryResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetErRouteEntryResponse.Content.RegionId"));
		content.setErRouteEntryId(_ctx.stringValue("GetErRouteEntryResponse.Content.ErRouteEntryId"));
		content.setTenantId(_ctx.stringValue("GetErRouteEntryResponse.Content.TenantId"));
		content.setErId(_ctx.stringValue("GetErRouteEntryResponse.Content.ErId"));
		content.setDestinationCidrBlock(_ctx.stringValue("GetErRouteEntryResponse.Content.DestinationCidrBlock"));
		content.setNextHopType(_ctx.stringValue("GetErRouteEntryResponse.Content.NextHopType"));
		content.setNextHopId(_ctx.stringValue("GetErRouteEntryResponse.Content.NextHopId"));
		content.setRouteType(_ctx.stringValue("GetErRouteEntryResponse.Content.RouteType"));
		content.setStatus(_ctx.stringValue("GetErRouteEntryResponse.Content.Status"));
		content.setGmtModified(_ctx.stringValue("GetErRouteEntryResponse.Content.GmtModified"));
		getErRouteEntryResponse.setContent(content);
	 
	 	return getErRouteEntryResponse;
	}
}