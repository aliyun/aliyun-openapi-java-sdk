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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.GetInstanceVpcEndpointResponse;
import com.aliyuncs.cr.model.v20181201.GetInstanceVpcEndpointResponse.LinkedVpcsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceVpcEndpointResponseUnmarshaller {

	public static GetInstanceVpcEndpointResponse unmarshall(GetInstanceVpcEndpointResponse getInstanceVpcEndpointResponse, UnmarshallerContext _ctx) {
		
		getInstanceVpcEndpointResponse.setRequestId(_ctx.stringValue("GetInstanceVpcEndpointResponse.RequestId"));
		getInstanceVpcEndpointResponse.setIsSuccess(_ctx.booleanValue("GetInstanceVpcEndpointResponse.IsSuccess"));
		getInstanceVpcEndpointResponse.setCode(_ctx.stringValue("GetInstanceVpcEndpointResponse.Code"));
		getInstanceVpcEndpointResponse.setEnable(_ctx.booleanValue("GetInstanceVpcEndpointResponse.Enable"));

		List<String> domains = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceVpcEndpointResponse.Domains.Length"); i++) {
			domains.add(_ctx.stringValue("GetInstanceVpcEndpointResponse.Domains["+ i +"]"));
		}
		getInstanceVpcEndpointResponse.setDomains(domains);

		List<LinkedVpcsItem> linkedVpcs = new ArrayList<LinkedVpcsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceVpcEndpointResponse.LinkedVpcs.Length"); i++) {
			LinkedVpcsItem linkedVpcsItem = new LinkedVpcsItem();
			linkedVpcsItem.setVpcId(_ctx.stringValue("GetInstanceVpcEndpointResponse.LinkedVpcs["+ i +"].VpcId"));
			linkedVpcsItem.setVswitchId(_ctx.stringValue("GetInstanceVpcEndpointResponse.LinkedVpcs["+ i +"].VswitchId"));
			linkedVpcsItem.setIp(_ctx.stringValue("GetInstanceVpcEndpointResponse.LinkedVpcs["+ i +"].Ip"));
			linkedVpcsItem.setDefaultAccess(_ctx.booleanValue("GetInstanceVpcEndpointResponse.LinkedVpcs["+ i +"].DefaultAccess"));
			linkedVpcsItem.setStatus(_ctx.stringValue("GetInstanceVpcEndpointResponse.LinkedVpcs["+ i +"].Status"));

			linkedVpcs.add(linkedVpcsItem);
		}
		getInstanceVpcEndpointResponse.setLinkedVpcs(linkedVpcs);
	 
	 	return getInstanceVpcEndpointResponse;
	}
}