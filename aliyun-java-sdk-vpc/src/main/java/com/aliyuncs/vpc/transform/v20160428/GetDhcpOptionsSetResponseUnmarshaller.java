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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.GetDhcpOptionsSetResponse;
import com.aliyuncs.vpc.model.v20160428.GetDhcpOptionsSetResponse.AssociateVpc;
import com.aliyuncs.vpc.model.v20160428.GetDhcpOptionsSetResponse.DhcpOptions;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDhcpOptionsSetResponseUnmarshaller {

	public static GetDhcpOptionsSetResponse unmarshall(GetDhcpOptionsSetResponse getDhcpOptionsSetResponse, UnmarshallerContext _ctx) {
		
		getDhcpOptionsSetResponse.setRequestId(_ctx.stringValue("GetDhcpOptionsSetResponse.RequestId"));
		getDhcpOptionsSetResponse.setDhcpOptionsSetName(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptionsSetName"));
		getDhcpOptionsSetResponse.setDhcpOptionsSetDescription(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptionsSetDescription"));
		getDhcpOptionsSetResponse.setDhcpOptionsSetId(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptionsSetId"));
		getDhcpOptionsSetResponse.setOwnerId(_ctx.longValue("GetDhcpOptionsSetResponse.OwnerId"));
		getDhcpOptionsSetResponse.setStatus(_ctx.stringValue("GetDhcpOptionsSetResponse.Status"));

		DhcpOptions dhcpOptions = new DhcpOptions();
		dhcpOptions.setDomainNameServers(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptions.DomainNameServers"));
		dhcpOptions.setDomainName(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptions.DomainName"));
		dhcpOptions.setTFTPServerName(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptions.TFTPServerName"));
		dhcpOptions.setBootFileName(_ctx.stringValue("GetDhcpOptionsSetResponse.DhcpOptions.BootFileName"));
		getDhcpOptionsSetResponse.setDhcpOptions(dhcpOptions);

		List<AssociateVpc> associateVpcs = new ArrayList<AssociateVpc>();
		for (int i = 0; i < _ctx.lengthValue("GetDhcpOptionsSetResponse.AssociateVpcs.Length"); i++) {
			AssociateVpc associateVpc = new AssociateVpc();
			associateVpc.setVpcId(_ctx.stringValue("GetDhcpOptionsSetResponse.AssociateVpcs["+ i +"].VpcId"));
			associateVpc.setAssociateStatus(_ctx.stringValue("GetDhcpOptionsSetResponse.AssociateVpcs["+ i +"].AssociateStatus"));

			associateVpcs.add(associateVpc);
		}
		getDhcpOptionsSetResponse.setAssociateVpcs(associateVpcs);
	 
	 	return getDhcpOptionsSetResponse;
	}
}