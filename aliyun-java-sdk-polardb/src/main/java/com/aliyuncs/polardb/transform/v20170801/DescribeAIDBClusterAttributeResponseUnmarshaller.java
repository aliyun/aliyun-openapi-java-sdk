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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse.DBNode;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse.DBNode.Volumes;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse.EndpointListItem;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse.EndpointListItem.NetInfoItemsItem;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClusterAttributeResponse.VolumesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIDBClusterAttributeResponseUnmarshaller {

	public static DescribeAIDBClusterAttributeResponse unmarshall(DescribeAIDBClusterAttributeResponse describeAIDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeAIDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.RequestId"));
		describeAIDBClusterAttributeResponse.setDBClusterId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBClusterId"));
		describeAIDBClusterAttributeResponse.setDBClusterStatus(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBClusterStatus"));
		describeAIDBClusterAttributeResponse.setDBClusterDescription(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBClusterDescription"));
		describeAIDBClusterAttributeResponse.setRegionId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.RegionId"));
		describeAIDBClusterAttributeResponse.setZoneId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.ZoneId"));
		describeAIDBClusterAttributeResponse.setVPCId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.VPCId"));
		describeAIDBClusterAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.VSwitchId"));
		describeAIDBClusterAttributeResponse.setInternalIp(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.InternalIp"));
		describeAIDBClusterAttributeResponse.setStorageType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.StorageType"));
		describeAIDBClusterAttributeResponse.setLockMode(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.LockMode"));
		describeAIDBClusterAttributeResponse.setCreationTime(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.CreationTime"));
		describeAIDBClusterAttributeResponse.setPayType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.PayType"));
		describeAIDBClusterAttributeResponse.setExpireTime(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.ExpireTime"));
		describeAIDBClusterAttributeResponse.setExpired(_ctx.booleanValue("DescribeAIDBClusterAttributeResponse.Expired"));
		describeAIDBClusterAttributeResponse.setZoneIds(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.ZoneIds"));
		describeAIDBClusterAttributeResponse.setRunType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.RunType"));
		describeAIDBClusterAttributeResponse.setKubeClusterId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.KubeClusterId"));
		describeAIDBClusterAttributeResponse.setDBVersion(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBVersion"));
		describeAIDBClusterAttributeResponse.setAiNodeType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.AiNodeType"));
		describeAIDBClusterAttributeResponse.setModelName(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.ModelName"));
		describeAIDBClusterAttributeResponse.setMaxQPM(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.MaxQPM"));
		describeAIDBClusterAttributeResponse.setPublicIp(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.PublicIp"));

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterAttributeResponse.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setDBNodeClass(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeClass"));
			dBNode.setCpuCores(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].CpuCores"));
			dBNode.setMemorySize(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].MemorySize"));
			dBNode.setGPU(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].GPU"));
			dBNode.setDBNodeId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeId"));
			dBNode.setDBNodeDescription(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeDescription"));
			dBNode.setVSwitchId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].VSwitchId"));
			dBNode.setVPCId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].VPCId"));
			dBNode.setDBNodeStatus(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setZoneId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ZoneId"));
			dBNode.setVNodeId(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].VNodeId"));
			dBNode.setLinkIP(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].LinkIP"));

			List<Volumes> childVolumes = new ArrayList<Volumes>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes.Length"); j++) {
				Volumes volumes = new Volumes();
				volumes.setStorageType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes["+ j +"].StorageType"));
				volumes.setStorageCategory(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes["+ j +"].StorageCategory"));
				volumes.setSizeGB(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes["+ j +"].SizeGB"));
				volumes.setName(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes["+ j +"].Name"));
				volumes.setMountPath(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.DBNodes["+ i +"].ChildVolumes["+ j +"].MountPath"));

				childVolumes.add(volumes);
			}
			dBNode.setChildVolumes(childVolumes);

			dBNodes.add(dBNode);
		}
		describeAIDBClusterAttributeResponse.setDBNodes(dBNodes);

		List<VolumesItem> volumes1 = new ArrayList<VolumesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterAttributeResponse.Volumes.Length"); i++) {
			VolumesItem volumesItem = new VolumesItem();
			volumesItem.setStorageType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.Volumes["+ i +"].StorageType"));
			volumesItem.setStorageCategory(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.Volumes["+ i +"].StorageCategory"));
			volumesItem.setName(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.Volumes["+ i +"].Name"));
			volumesItem.setSizeGB(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.Volumes["+ i +"].SizeGB"));
			volumesItem.setMountPath(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.Volumes["+ i +"].MountPath"));

			volumes1.add(volumesItem);
		}
		describeAIDBClusterAttributeResponse.setVolumes(volumes1);

		List<EndpointListItem> endpointList = new ArrayList<EndpointListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClusterAttributeResponse.EndpointList.Length"); i++) {
			EndpointListItem endpointListItem = new EndpointListItem();

			List<NetInfoItemsItem> netInfoItems = new ArrayList<NetInfoItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAIDBClusterAttributeResponse.EndpointList["+ i +"].NetInfoItems.Length"); j++) {
				NetInfoItemsItem netInfoItemsItem = new NetInfoItemsItem();
				netInfoItemsItem.setNetType(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.EndpointList["+ i +"].NetInfoItems["+ j +"].NetType"));
				netInfoItemsItem.setConnectionString(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.EndpointList["+ i +"].NetInfoItems["+ j +"].ConnectionString"));
				netInfoItemsItem.setPort(_ctx.stringValue("DescribeAIDBClusterAttributeResponse.EndpointList["+ i +"].NetInfoItems["+ j +"].Port"));

				netInfoItems.add(netInfoItemsItem);
			}
			endpointListItem.setNetInfoItems(netInfoItems);

			endpointList.add(endpointListItem);
		}
		describeAIDBClusterAttributeResponse.setEndpointList(endpointList);
	 
	 	return describeAIDBClusterAttributeResponse;
	}
}