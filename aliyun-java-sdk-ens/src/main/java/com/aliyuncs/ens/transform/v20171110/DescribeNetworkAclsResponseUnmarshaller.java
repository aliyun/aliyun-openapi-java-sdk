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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeNetworkAclsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkAclsResponse.NetworkAcl;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkAclsResponse.NetworkAcl.EgressAclRule;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkAclsResponse.NetworkAcl.IngressAclRule;
import com.aliyuncs.ens.model.v20171110.DescribeNetworkAclsResponse.NetworkAcl.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAclsResponseUnmarshaller {

	public static DescribeNetworkAclsResponse unmarshall(DescribeNetworkAclsResponse describeNetworkAclsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAclsResponse.setRequestId(_ctx.stringValue("DescribeNetworkAclsResponse.RequestId"));
		describeNetworkAclsResponse.setTotalCount(_ctx.stringValue("DescribeNetworkAclsResponse.TotalCount"));
		describeNetworkAclsResponse.setPageSize(_ctx.stringValue("DescribeNetworkAclsResponse.PageSize"));
		describeNetworkAclsResponse.setPageNumber(_ctx.stringValue("DescribeNetworkAclsResponse.PageNumber"));

		List<NetworkAcl> networkAcls = new ArrayList<NetworkAcl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls.Length"); i++) {
			NetworkAcl networkAcl = new NetworkAcl();
			networkAcl.setStatus(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Status"));
			networkAcl.setCreationTime(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].CreationTime"));
			networkAcl.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Description"));
			networkAcl.setNetworkAclId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].NetworkAclId"));
			networkAcl.setNetworkAclName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].NetworkAclName"));

			List<IngressAclRule> ingressAclEntries = new ArrayList<IngressAclRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries.Length"); j++) {
				IngressAclRule ingressAclRule = new IngressAclRule();
				ingressAclRule.setPolicy(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Policy"));
				ingressAclRule.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].NetworkAclEntryId"));
				ingressAclRule.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].NetworkAclEntryName"));
				ingressAclRule.setCidrBlock(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].CidrBlock"));
				ingressAclRule.setBizProtocol(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Protocol"));
				ingressAclRule.setPortRange(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].PortRange"));
				ingressAclRule.setPriority(_ctx.integerValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Priority"));
				ingressAclRule.setType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Type"));
				ingressAclRule.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Description"));

				ingressAclEntries.add(ingressAclRule);
			}
			networkAcl.setIngressAclEntries(ingressAclEntries);

			List<EgressAclRule> egressAclEntries = new ArrayList<EgressAclRule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries.Length"); j++) {
				EgressAclRule egressAclRule = new EgressAclRule();
				egressAclRule.setPolicy(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Policy"));
				egressAclRule.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].NetworkAclEntryId"));
				egressAclRule.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].NetworkAclEntryName"));
				egressAclRule.setCidrBlock(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].CidrBlock"));
				egressAclRule.setBizProtocol(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Protocol"));
				egressAclRule.setPortRange(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].PortRange"));
				egressAclRule.setPriority(_ctx.integerValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Priority"));
				egressAclRule.setType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Type"));
				egressAclRule.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Description"));

				egressAclEntries.add(egressAclRule);
			}
			networkAcl.setEgressAclEntries(egressAclEntries);

			List<Resource> resources = new ArrayList<Resource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources.Length"); j++) {
				Resource resource = new Resource();
				resource.setStatus(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].Status"));
				resource.setResourceType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].ResourceType"));
				resource.setResourceId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].ResourceId"));
				resource.setEnsRegionId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].EnsRegionId"));

				resources.add(resource);
			}
			networkAcl.setResources(resources);

			networkAcls.add(networkAcl);
		}
		describeNetworkAclsResponse.setNetworkAcls(networkAcls);
	 
	 	return describeNetworkAclsResponse;
	}
}