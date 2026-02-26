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

import com.aliyuncs.eflo_controller.model.v20221215.DescribeNodeResponse;
import com.aliyuncs.eflo_controller.model.v20221215.DescribeNodeResponse.NetworksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNodeResponseUnmarshaller {

	public static DescribeNodeResponse unmarshall(DescribeNodeResponse describeNodeResponse, UnmarshallerContext _ctx) {
		
		describeNodeResponse.setRequestId(_ctx.stringValue("DescribeNodeResponse.RequestId"));
		describeNodeResponse.setNodeGroupName(_ctx.stringValue("DescribeNodeResponse.NodeGroupName"));
		describeNodeResponse.setClusterId(_ctx.stringValue("DescribeNodeResponse.ClusterId"));
		describeNodeResponse.setClusterName(_ctx.stringValue("DescribeNodeResponse.ClusterName"));
		describeNodeResponse.setZoneId(_ctx.stringValue("DescribeNodeResponse.ZoneId"));
		describeNodeResponse.setCreateTime(_ctx.stringValue("DescribeNodeResponse.CreateTime"));
		describeNodeResponse.setNodeGroupId(_ctx.stringValue("DescribeNodeResponse.NodeGroupId"));
		describeNodeResponse.setHostname(_ctx.stringValue("DescribeNodeResponse.Hostname"));
		describeNodeResponse.setImageId(_ctx.stringValue("DescribeNodeResponse.ImageId"));
		describeNodeResponse.setMachineType(_ctx.stringValue("DescribeNodeResponse.MachineType"));
		describeNodeResponse.setNodeId(_ctx.stringValue("DescribeNodeResponse.NodeId"));
		describeNodeResponse.setSn(_ctx.stringValue("DescribeNodeResponse.Sn"));
		describeNodeResponse.setOperatingState(_ctx.stringValue("DescribeNodeResponse.OperatingState"));
		describeNodeResponse.setExpiredTime(_ctx.stringValue("DescribeNodeResponse.ExpiredTime"));

		List<NetworksItem> networks = new ArrayList<NetworksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNodeResponse.Networks.Length"); i++) {
			NetworksItem networksItem = new NetworksItem();
			networksItem.setBondName(_ctx.stringValue("DescribeNodeResponse.Networks["+ i +"].BondName"));
			networksItem.setIp(_ctx.stringValue("DescribeNodeResponse.Networks["+ i +"].Ip"));
			networksItem.setSubnetId(_ctx.stringValue("DescribeNodeResponse.Networks["+ i +"].SubnetId"));
			networksItem.setVpdId(_ctx.stringValue("DescribeNodeResponse.Networks["+ i +"].VpdId"));

			networks.add(networksItem);
		}
		describeNodeResponse.setNetworks(networks);
	 
	 	return describeNodeResponse;
	}
}