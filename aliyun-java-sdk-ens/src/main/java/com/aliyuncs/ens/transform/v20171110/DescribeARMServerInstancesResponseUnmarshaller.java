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

import com.aliyuncs.ens.model.v20171110.DescribeARMServerInstancesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeARMServerInstancesResponse.ServersItem;
import com.aliyuncs.ens.model.v20171110.DescribeARMServerInstancesResponse.ServersItem.AICInstancesItem;
import com.aliyuncs.ens.model.v20171110.DescribeARMServerInstancesResponse.ServersItem.AICInstancesItem.NetworkAttributes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeARMServerInstancesResponseUnmarshaller {

	public static DescribeARMServerInstancesResponse unmarshall(DescribeARMServerInstancesResponse describeARMServerInstancesResponse, UnmarshallerContext _ctx) {
		
		describeARMServerInstancesResponse.setRequestId(_ctx.stringValue("DescribeARMServerInstancesResponse.RequestId"));
		describeARMServerInstancesResponse.setPageNumber(_ctx.integerValue("DescribeARMServerInstancesResponse.PageNumber"));
		describeARMServerInstancesResponse.setPageSize(_ctx.integerValue("DescribeARMServerInstancesResponse.PageSize"));
		describeARMServerInstancesResponse.setTotalCount(_ctx.integerValue("DescribeARMServerInstancesResponse.TotalCount"));

		List<ServersItem> servers = new ArrayList<ServersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeARMServerInstancesResponse.Servers.Length"); i++) {
			ServersItem serversItem = new ServersItem();
			serversItem.setCreationTime(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].CreationTime"));
			serversItem.setExpiredTime(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].ExpiredTime"));
			serversItem.setEnsRegionId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].EnsRegionId"));
			serversItem.setServerId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].ServerId"));
			serversItem.setSpecName(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].SpecName"));
			serversItem.setState(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].State"));
			serversItem.setStatus(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].Status"));

			List<AICInstancesItem> aICInstances = new ArrayList<AICInstancesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances.Length"); j++) {
				AICInstancesItem aICInstancesItem = new AICInstancesItem();
				aICInstancesItem.setFrequency(_ctx.longValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].Frequency"));
				aICInstancesItem.setImageId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].ImageId"));
				aICInstancesItem.setInstanceId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].InstanceId"));
				aICInstancesItem.setResolution(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].Resolution"));
				aICInstancesItem.setSpec(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].Spec"));
				aICInstancesItem.setState(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].State"));
				aICInstancesItem.setStatus(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].Status"));

				NetworkAttributes networkAttributes = new NetworkAttributes();
				networkAttributes.setIpAddress(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].NetworkAttributes.IpAddress"));
				networkAttributes.setNetworkId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].NetworkAttributes.NetworkId"));
				networkAttributes.setVSwitchId(_ctx.stringValue("DescribeARMServerInstancesResponse.Servers["+ i +"].AICInstances["+ j +"].NetworkAttributes.VSwitchId"));
				aICInstancesItem.setNetworkAttributes(networkAttributes);

				aICInstances.add(aICInstancesItem);
			}
			serversItem.setAICInstances(aICInstances);

			servers.add(serversItem);
		}
		describeARMServerInstancesResponse.setServers(servers);
	 
	 	return describeARMServerInstancesResponse;
	}
}