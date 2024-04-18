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

import com.aliyuncs.eflo.model.v20220530.GetVccRouteEntryResponse;
import com.aliyuncs.eflo.model.v20220530.GetVccRouteEntryResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVccRouteEntryResponseUnmarshaller {

	public static GetVccRouteEntryResponse unmarshall(GetVccRouteEntryResponse getVccRouteEntryResponse, UnmarshallerContext _ctx) {
		
		getVccRouteEntryResponse.setRequestId(_ctx.stringValue("GetVccRouteEntryResponse.RequestId"));
		getVccRouteEntryResponse.setCode(_ctx.integerValue("GetVccRouteEntryResponse.Code"));
		getVccRouteEntryResponse.setMessage(_ctx.stringValue("GetVccRouteEntryResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVccRouteEntryResponse.Content.RegionId"));
		content.setVccRouteEntryId(_ctx.stringValue("GetVccRouteEntryResponse.Content.VccRouteEntryId"));
		content.setTenantId(_ctx.stringValue("GetVccRouteEntryResponse.Content.TenantId"));
		content.setVccId(_ctx.stringValue("GetVccRouteEntryResponse.Content.VccId"));
		content.setDestinationCidrBlock(_ctx.stringValue("GetVccRouteEntryResponse.Content.DestinationCidrBlock"));
		content.setNextHopType(_ctx.stringValue("GetVccRouteEntryResponse.Content.NextHopType"));
		content.setNextHopId(_ctx.stringValue("GetVccRouteEntryResponse.Content.NextHopId"));
		content.setRouteType(_ctx.stringValue("GetVccRouteEntryResponse.Content.RouteType"));
		content.setStatus(_ctx.stringValue("GetVccRouteEntryResponse.Content.Status"));
		content.setGmtModified(_ctx.stringValue("GetVccRouteEntryResponse.Content.GmtModified"));
		content.setMessage(_ctx.stringValue("GetVccRouteEntryResponse.Content.Message"));
		getVccRouteEntryResponse.setContent(content);
	 
	 	return getVccRouteEntryResponse;
	}
}