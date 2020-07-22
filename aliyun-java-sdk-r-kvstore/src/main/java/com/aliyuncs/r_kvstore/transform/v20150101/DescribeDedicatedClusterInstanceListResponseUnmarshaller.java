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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeDedicatedClusterInstanceListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeDedicatedClusterInstanceListResponse.InstancesItem;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeDedicatedClusterInstanceListResponse.InstancesItem.InstanceNodes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedClusterInstanceListResponseUnmarshaller {

	public static DescribeDedicatedClusterInstanceListResponse unmarshall(DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedClusterInstanceListResponse.setRequestId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.RequestId"));
		describeDedicatedClusterInstanceListResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.PageNumber"));
		describeDedicatedClusterInstanceListResponse.setPageSize(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.PageSize"));
		describeDedicatedClusterInstanceListResponse.setTotalCount(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedClusterInstanceListResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setCharacterType(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CharacterType"));
			instancesItem.setClusterId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ClusterId"));
			instancesItem.setClusterName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ClusterName"));
			instancesItem.setEngineVersion(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].EngineVersion"));
			instancesItem.setInstanceId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceStatus(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceStatus"));
			instancesItem.setMaintainEndTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].MaintainEndTime"));
			instancesItem.setMaintainStartTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].MaintainStartTime"));
			instancesItem.setRegionId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].RegionId"));
			instancesItem.setVpcId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].VpcId"));
			instancesItem.setVswitchId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].VswitchId"));
			instancesItem.setZoneId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ZoneId"));
			instancesItem.setInstanceName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setCustomId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CustomId"));
			instancesItem.setInstanceClass(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceClass"));
			instancesItem.setEngine(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].Engine"));
			instancesItem.setStorageType(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].StorageType"));
			instancesItem.setConnectionDomain(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ConnectionDomain"));
			instancesItem.setCreateTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CreateTime"));

			List<InstanceNodes> instanceNodeList = new ArrayList<InstanceNodes>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList.Length"); j++) {
				InstanceNodes instanceNodes = new InstanceNodes();
				instanceNodes.setNodeId(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeId"));
				instanceNodes.setNodeIp(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeIp"));
				instanceNodes.setNodeType(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeType"));
				instanceNodes.setPort(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].Port"));
				instanceNodes.setRole(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].Role"));
				instanceNodes.setZoneId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].ZoneId"));
				instanceNodes.setInstanceId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].InstanceId"));
				instanceNodes.setDedicatedHostName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].DedicatedHostName"));

				instanceNodeList.add(instanceNodes);
			}
			instancesItem.setInstanceNodeList(instanceNodeList);

			instances.add(instancesItem);
		}
		describeDedicatedClusterInstanceListResponse.setInstances(instances);
	 
	 	return describeDedicatedClusterInstanceListResponse;
	}
}