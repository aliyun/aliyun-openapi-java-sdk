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

import com.aliyuncs.eflo.model.v20220530.GetVpdRouteEntryResponse;
import com.aliyuncs.eflo.model.v20220530.GetVpdRouteEntryResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpdRouteEntryResponseUnmarshaller {

	public static GetVpdRouteEntryResponse unmarshall(GetVpdRouteEntryResponse getVpdRouteEntryResponse, UnmarshallerContext _ctx) {
		
		getVpdRouteEntryResponse.setRequestId(_ctx.stringValue("GetVpdRouteEntryResponse.RequestId"));
		getVpdRouteEntryResponse.setCode(_ctx.integerValue("GetVpdRouteEntryResponse.Code"));
		getVpdRouteEntryResponse.setMessage(_ctx.stringValue("GetVpdRouteEntryResponse.Message"));

		Content content = new Content();
		content.setRegionId(_ctx.stringValue("GetVpdRouteEntryResponse.Content.RegionId"));
		content.setVpdRouteEntryId(_ctx.stringValue("GetVpdRouteEntryResponse.Content.VpdRouteEntryId"));
		content.setTenantId(_ctx.stringValue("GetVpdRouteEntryResponse.Content.TenantId"));
		content.setVpdId(_ctx.stringValue("GetVpdRouteEntryResponse.Content.VpdId"));
		content.setDestinationCidrBlock(_ctx.stringValue("GetVpdRouteEntryResponse.Content.DestinationCidrBlock"));
		content.setNextHopType(_ctx.stringValue("GetVpdRouteEntryResponse.Content.NextHopType"));
		content.setNextHopId(_ctx.stringValue("GetVpdRouteEntryResponse.Content.NextHopId"));
		content.setRouteType(_ctx.stringValue("GetVpdRouteEntryResponse.Content.RouteType"));
		content.setStatus(_ctx.stringValue("GetVpdRouteEntryResponse.Content.Status"));
		content.setGmtModified(_ctx.stringValue("GetVpdRouteEntryResponse.Content.GmtModified"));
		getVpdRouteEntryResponse.setContent(content);
	 
	 	return getVpdRouteEntryResponse;
	}
}