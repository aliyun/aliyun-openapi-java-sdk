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

package com.aliyuncs.eflo_controller.transform.v20221215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo_controller.model.v20221215.DescribeClusterResponse;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeClusterResponse.ComponentsItem;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeClusterResponse.NetworksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));
		describeClusterResponse.setCreateTime(_ctx.stringValue("DescribeClusterResponse.CreateTime"));
		describeClusterResponse.setNodeCount(_ctx.longValue("DescribeClusterResponse.NodeCount"));
		describeClusterResponse.setNodeGroupCount(_ctx.longValue("DescribeClusterResponse.NodeGroupCount"));
		describeClusterResponse.setUpdateTime(_ctx.stringValue("DescribeClusterResponse.UpdateTime"));
		describeClusterResponse.setClusterDescription(_ctx.stringValue("DescribeClusterResponse.ClusterDescription"));
		describeClusterResponse.setOperatingState(_ctx.stringValue("DescribeClusterResponse.OperatingState"));
		describeClusterResponse.setClusterId(_ctx.stringValue("DescribeClusterResponse.ClusterId"));
		describeClusterResponse.setClusterName(_ctx.stringValue("DescribeClusterResponse.ClusterName"));
		describeClusterResponse.setTaskId(_ctx.stringValue("DescribeClusterResponse.TaskId"));
		describeClusterResponse.setClusterType(_ctx.stringValue("DescribeClusterResponse.ClusterType"));
		describeClusterResponse.setResourceGroupId(_ctx.stringValue("DescribeClusterResponse.ResourceGroupId"));

		List<ComponentsItem> components = new ArrayList<ComponentsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.Components.Length"); i++) {
			ComponentsItem componentsItem = new ComponentsItem();
			componentsItem.setComponentType(_ctx.stringValue("DescribeClusterResponse.Components["+ i +"].ComponentType"));
			componentsItem.setComponentId(_ctx.stringValue("DescribeClusterResponse.Components["+ i +"].ComponentId"));

			components.add(componentsItem);
		}
		describeClusterResponse.setComponents(components);

		List<NetworksItem> networks = new ArrayList<NetworksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.Networks.Length"); i++) {
			NetworksItem networksItem = new NetworksItem();
			networksItem.setVpdId(_ctx.stringValue("DescribeClusterResponse.Networks["+ i +"].VpdId"));

			networks.add(networksItem);
		}
		describeClusterResponse.setNetworks(networks);
	 
	 	return describeClusterResponse;
	}
}