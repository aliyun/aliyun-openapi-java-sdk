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

import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclsResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclsResponse.NetworkAcl;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclsResponse.NetworkAcl.EgressAclEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclsResponse.NetworkAcl.IngressAclEntry;
import com.aliyuncs.vpc.model.v20160428.DescribeNetworkAclsResponse.NetworkAcl.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkAclsResponseUnmarshaller {

	public static DescribeNetworkAclsResponse unmarshall(DescribeNetworkAclsResponse describeNetworkAclsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkAclsResponse.setRequestId(_ctx.stringValue("DescribeNetworkAclsResponse.RequestId"));
		describeNetworkAclsResponse.setTotalCount(_ctx.stringValue("DescribeNetworkAclsResponse.TotalCount"));
		describeNetworkAclsResponse.setPageNumber(_ctx.stringValue("DescribeNetworkAclsResponse.PageNumber"));
		describeNetworkAclsResponse.setPageSize(_ctx.stringValue("DescribeNetworkAclsResponse.PageSize"));

		List<NetworkAcl> networkAcls = new ArrayList<NetworkAcl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls.Length"); i++) {
			NetworkAcl networkAcl = new NetworkAcl();
			networkAcl.setNetworkAclId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].NetworkAclId"));
			networkAcl.setRegionId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].RegionId"));
			networkAcl.setNetworkAclName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].NetworkAclName"));
			networkAcl.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Description"));
			networkAcl.setVpcId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].VpcId"));
			networkAcl.setCreationTime(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].CreationTime"));
			networkAcl.setStatus(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Status"));

			List<IngressAclEntry> ingressAclEntries = new ArrayList<IngressAclEntry>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries.Length"); j++) {
				IngressAclEntry ingressAclEntry = new IngressAclEntry();
				ingressAclEntry.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].NetworkAclEntryId"));
				ingressAclEntry.setPolicy(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Policy"));
				ingressAclEntry.setBizProtocol(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Protocol"));
				ingressAclEntry.setSourceCidrIp(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].SourceCidrIp"));
				ingressAclEntry.setPort(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Port"));
				ingressAclEntry.setEntryType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].EntryType"));
				ingressAclEntry.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].NetworkAclEntryName"));
				ingressAclEntry.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].IngressAclEntries["+ j +"].Description"));

				ingressAclEntries.add(ingressAclEntry);
			}
			networkAcl.setIngressAclEntries(ingressAclEntries);

			List<EgressAclEntry> egressAclEntries = new ArrayList<EgressAclEntry>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries.Length"); j++) {
				EgressAclEntry egressAclEntry = new EgressAclEntry();
				egressAclEntry.setNetworkAclEntryId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].NetworkAclEntryId"));
				egressAclEntry.setPolicy(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Policy"));
				egressAclEntry.setBizProtocol(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Protocol"));
				egressAclEntry.setDestinationCidrIp(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].DestinationCidrIp"));
				egressAclEntry.setPort(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Port"));
				egressAclEntry.setEntryType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].EntryType"));
				egressAclEntry.setDescription(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].Description"));
				egressAclEntry.setNetworkAclEntryName(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].EgressAclEntries["+ j +"].NetworkAclEntryName"));

				egressAclEntries.add(egressAclEntry);
			}
			networkAcl.setEgressAclEntries(egressAclEntries);

			List<Resource> resources = new ArrayList<Resource>();
			for (int j = 0; j < _ctx.lengthValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources.Length"); j++) {
				Resource resource = new Resource();
				resource.setResourceId(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].ResourceId"));
				resource.setResourceType(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].ResourceType"));
				resource.setStatus(_ctx.stringValue("DescribeNetworkAclsResponse.NetworkAcls["+ i +"].Resources["+ j +"].Status"));

				resources.add(resource);
			}
			networkAcl.setResources(resources);

			networkAcls.add(networkAcl);
		}
		describeNetworkAclsResponse.setNetworkAcls(networkAcls);
	 
	 	return describeNetworkAclsResponse;
	}
}