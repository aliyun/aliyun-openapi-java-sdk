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

import com.aliyuncs.vpc.model.v20160428.ListDhcpOptionsSetsResponse;
import com.aliyuncs.vpc.model.v20160428.ListDhcpOptionsSetsResponse.DhcpOptionsSet;
import com.aliyuncs.vpc.model.v20160428.ListDhcpOptionsSetsResponse.DhcpOptionsSet.DhcpOptions;
import com.aliyuncs.vpc.model.v20160428.ListDhcpOptionsSetsResponse.DhcpOptionsSet.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDhcpOptionsSetsResponseUnmarshaller {

	public static ListDhcpOptionsSetsResponse unmarshall(ListDhcpOptionsSetsResponse listDhcpOptionsSetsResponse, UnmarshallerContext _ctx) {
		
		listDhcpOptionsSetsResponse.setRequestId(_ctx.stringValue("ListDhcpOptionsSetsResponse.RequestId"));
		listDhcpOptionsSetsResponse.setNextToken(_ctx.stringValue("ListDhcpOptionsSetsResponse.NextToken"));
		listDhcpOptionsSetsResponse.setTotalCount(_ctx.stringValue("ListDhcpOptionsSetsResponse.TotalCount"));

		List<DhcpOptionsSet> dhcpOptionsSets = new ArrayList<DhcpOptionsSet>();
		for (int i = 0; i < _ctx.lengthValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets.Length"); i++) {
			DhcpOptionsSet dhcpOptionsSet = new DhcpOptionsSet();
			dhcpOptionsSet.setDhcpOptionsSetDescription(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptionsSetDescription"));
			dhcpOptionsSet.setStatus(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].Status"));
			dhcpOptionsSet.setDhcpOptionsSetId(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptionsSetId"));
			dhcpOptionsSet.setDhcpOptionsSetName(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptionsSetName"));
			dhcpOptionsSet.setAssociateVpcCount(_ctx.integerValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].AssociateVpcCount"));
			dhcpOptionsSet.setOwnerId(_ctx.longValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].OwnerId"));
			dhcpOptionsSet.setResourceGroupId(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].ResourceGroupId"));

			DhcpOptions dhcpOptions = new DhcpOptions();
			dhcpOptions.setDomainNameServers(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptions.DomainNameServers"));
			dhcpOptions.setDomainName(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptions.DomainName"));
			dhcpOptions.setLeaseTime(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptions.LeaseTime"));
			dhcpOptions.setIpv6LeaseTime(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].DhcpOptions.Ipv6LeaseTime"));
			dhcpOptionsSet.setDhcpOptions(dhcpOptions);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListDhcpOptionsSetsResponse.DhcpOptionsSets["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dhcpOptionsSet.setTags(tags);

			dhcpOptionsSets.add(dhcpOptionsSet);
		}
		listDhcpOptionsSetsResponse.setDhcpOptionsSets(dhcpOptionsSets);
	 
	 	return listDhcpOptionsSetsResponse;
	}
}