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

package com.aliyuncs.vpcpeer.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpcpeer.model.v20220101.GetVpcPeerConnectionAttributeResponse;
import com.aliyuncs.vpcpeer.model.v20220101.GetVpcPeerConnectionAttributeResponse.AcceptingVpc;
import com.aliyuncs.vpcpeer.model.v20220101.GetVpcPeerConnectionAttributeResponse.TagsItem;
import com.aliyuncs.vpcpeer.model.v20220101.GetVpcPeerConnectionAttributeResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVpcPeerConnectionAttributeResponseUnmarshaller {

	public static GetVpcPeerConnectionAttributeResponse unmarshall(GetVpcPeerConnectionAttributeResponse getVpcPeerConnectionAttributeResponse, UnmarshallerContext _ctx) {
		
		getVpcPeerConnectionAttributeResponse.setRequestId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.RequestId"));
		getVpcPeerConnectionAttributeResponse.setInstanceId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.InstanceId"));
		getVpcPeerConnectionAttributeResponse.setGmtCreate(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.GmtCreate"));
		getVpcPeerConnectionAttributeResponse.setGmtModified(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.GmtModified"));
		getVpcPeerConnectionAttributeResponse.setName(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Name"));
		getVpcPeerConnectionAttributeResponse.setDescription(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Description"));
		getVpcPeerConnectionAttributeResponse.setOwnerId(_ctx.longValue("GetVpcPeerConnectionAttributeResponse.OwnerId"));
		getVpcPeerConnectionAttributeResponse.setAcceptingOwnerUid(_ctx.longValue("GetVpcPeerConnectionAttributeResponse.AcceptingOwnerUid"));
		getVpcPeerConnectionAttributeResponse.setRegionId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.RegionId"));
		getVpcPeerConnectionAttributeResponse.setAcceptingRegionId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.AcceptingRegionId"));
		getVpcPeerConnectionAttributeResponse.setBandwidth(_ctx.integerValue("GetVpcPeerConnectionAttributeResponse.Bandwidth"));
		getVpcPeerConnectionAttributeResponse.setStatus(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Status"));
		getVpcPeerConnectionAttributeResponse.setBizStatus(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.BizStatus"));
		getVpcPeerConnectionAttributeResponse.setGmtExpired(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.GmtExpired"));
		getVpcPeerConnectionAttributeResponse.setResourceGroupId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.ResourceGroupId"));

		Vpc vpc = new Vpc();
		vpc.setVpcId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Vpc.VpcId"));

		List<String> ipv4Cidrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPeerConnectionAttributeResponse.Vpc.Ipv4Cidrs.Length"); i++) {
			ipv4Cidrs.add(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Vpc.Ipv4Cidrs["+ i +"]"));
		}
		vpc.setIpv4Cidrs(ipv4Cidrs);

		List<String> ipv6Cidrs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPeerConnectionAttributeResponse.Vpc.Ipv6Cidrs.Length"); i++) {
			ipv6Cidrs.add(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Vpc.Ipv6Cidrs["+ i +"]"));
		}
		vpc.setIpv6Cidrs(ipv6Cidrs);
		getVpcPeerConnectionAttributeResponse.setVpc(vpc);

		AcceptingVpc acceptingVpc = new AcceptingVpc();
		acceptingVpc.setVpcId(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.AcceptingVpc.VpcId"));

		List<String> ipv4Cidrs1 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPeerConnectionAttributeResponse.AcceptingVpc.Ipv4Cidrs.Length"); i++) {
			ipv4Cidrs1.add(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.AcceptingVpc.Ipv4Cidrs["+ i +"]"));
		}
		acceptingVpc.setIpv4Cidrs1(ipv4Cidrs1);

		List<String> ipv6Cidrs2 = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPeerConnectionAttributeResponse.AcceptingVpc.Ipv6Cidrs.Length"); i++) {
			ipv6Cidrs2.add(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.AcceptingVpc.Ipv6Cidrs["+ i +"]"));
		}
		acceptingVpc.setIpv6Cidrs2(ipv6Cidrs2);
		getVpcPeerConnectionAttributeResponse.setAcceptingVpc(acceptingVpc);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVpcPeerConnectionAttributeResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("GetVpcPeerConnectionAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		getVpcPeerConnectionAttributeResponse.setTags(tags);
	 
	 	return getVpcPeerConnectionAttributeResponse;
	}
}