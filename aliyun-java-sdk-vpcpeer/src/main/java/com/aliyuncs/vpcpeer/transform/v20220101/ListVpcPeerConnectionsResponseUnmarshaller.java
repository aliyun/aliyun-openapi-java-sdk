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

import com.aliyuncs.vpcpeer.model.v20220101.ListVpcPeerConnectionsResponse;
import com.aliyuncs.vpcpeer.model.v20220101.ListVpcPeerConnectionsResponse.VpcPeerConnectsItem;
import com.aliyuncs.vpcpeer.model.v20220101.ListVpcPeerConnectionsResponse.VpcPeerConnectsItem.AcceptingVpc;
import com.aliyuncs.vpcpeer.model.v20220101.ListVpcPeerConnectionsResponse.VpcPeerConnectsItem.TagsItem;
import com.aliyuncs.vpcpeer.model.v20220101.ListVpcPeerConnectionsResponse.VpcPeerConnectsItem.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcPeerConnectionsResponseUnmarshaller {

	public static ListVpcPeerConnectionsResponse unmarshall(ListVpcPeerConnectionsResponse listVpcPeerConnectionsResponse, UnmarshallerContext _ctx) {
		
		listVpcPeerConnectionsResponse.setRequestId(_ctx.stringValue("ListVpcPeerConnectionsResponse.RequestId"));
		listVpcPeerConnectionsResponse.setTotalCount(_ctx.integerValue("ListVpcPeerConnectionsResponse.TotalCount"));
		listVpcPeerConnectionsResponse.setMaxResults(_ctx.integerValue("ListVpcPeerConnectionsResponse.MaxResults"));
		listVpcPeerConnectionsResponse.setNextToken(_ctx.stringValue("ListVpcPeerConnectionsResponse.NextToken"));

		List<VpcPeerConnectsItem> vpcPeerConnects = new ArrayList<VpcPeerConnectsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects.Length"); i++) {
			VpcPeerConnectsItem vpcPeerConnectsItem = new VpcPeerConnectsItem();
			vpcPeerConnectsItem.setInstanceId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].InstanceId"));
			vpcPeerConnectsItem.setGmtCreate(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].GmtCreate"));
			vpcPeerConnectsItem.setGmtModified(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].GmtModified"));
			vpcPeerConnectsItem.setName(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Name"));
			vpcPeerConnectsItem.setDescription(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Description"));
			vpcPeerConnectsItem.setOwnerId(_ctx.integerValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].OwnerId"));
			vpcPeerConnectsItem.setAcceptingOwnerUid(_ctx.integerValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingOwnerUid"));
			vpcPeerConnectsItem.setRegionId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].RegionId"));
			vpcPeerConnectsItem.setAcceptingRegionId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingRegionId"));
			vpcPeerConnectsItem.setBandwidth(_ctx.integerValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Bandwidth"));
			vpcPeerConnectsItem.setStatus(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Status"));
			vpcPeerConnectsItem.setBizStatus(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].BizStatus"));
			vpcPeerConnectsItem.setGmtExpired(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].GmtExpired"));
			vpcPeerConnectsItem.setResourceGroupId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].ResourceGroupId"));

			Vpc vpc = new Vpc();
			vpc.setVpcId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Vpc.VpcId"));

			List<String> ipv4Cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Vpc.Ipv4Cidrs.Length"); j++) {
				ipv4Cidrs.add(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Vpc.Ipv4Cidrs["+ j +"]"));
			}
			vpc.setIpv4Cidrs(ipv4Cidrs);

			List<String> ipv6Cidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Vpc.Ipv6Cidrs.Length"); j++) {
				ipv6Cidrs.add(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Vpc.Ipv6Cidrs["+ j +"]"));
			}
			vpc.setIpv6Cidrs(ipv6Cidrs);
			vpcPeerConnectsItem.setVpc(vpc);

			AcceptingVpc acceptingVpc = new AcceptingVpc();
			acceptingVpc.setVpcId(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingVpc.VpcId"));

			List<String> ipv4Cidrs1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingVpc.Ipv4Cidrs.Length"); j++) {
				ipv4Cidrs1.add(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingVpc.Ipv4Cidrs["+ j +"]"));
			}
			acceptingVpc.setIpv4Cidrs1(ipv4Cidrs1);

			List<String> ipv6Cidrs2 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingVpc.Ipv6Cidrs.Length"); j++) {
				ipv6Cidrs2.add(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].AcceptingVpc.Ipv6Cidrs["+ j +"]"));
			}
			acceptingVpc.setIpv6Cidrs2(ipv6Cidrs2);
			vpcPeerConnectsItem.setAcceptingVpc(acceptingVpc);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListVpcPeerConnectionsResponse.VpcPeerConnects["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			vpcPeerConnectsItem.setTags(tags);

			vpcPeerConnects.add(vpcPeerConnectsItem);
		}
		listVpcPeerConnectionsResponse.setVpcPeerConnects(vpcPeerConnects);
	 
	 	return listVpcPeerConnectionsResponse;
	}
}