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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeDedicatedClusterInstanceListResponse;
import com.aliyuncs.dds.model.v20151201.DescribeDedicatedClusterInstanceListResponse.DbInstance;
import com.aliyuncs.dds.model.v20151201.DescribeDedicatedClusterInstanceListResponse.DbInstance.InstanceNodes;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedClusterInstanceListResponseUnmarshaller {

	public static DescribeDedicatedClusterInstanceListResponse unmarshall(DescribeDedicatedClusterInstanceListResponse describeDedicatedClusterInstanceListResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedClusterInstanceListResponse.setRequestId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.RequestId"));
		describeDedicatedClusterInstanceListResponse.setTotalCount(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.TotalCount"));
		describeDedicatedClusterInstanceListResponse.setPageSize(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.PageSize"));
		describeDedicatedClusterInstanceListResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.PageNumber"));

		List<DbInstance> instances = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedClusterInstanceListResponse.Instances.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setVpcId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].VpcId"));
			dbInstance.setCharacterType(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CharacterType"));
			dbInstance.setVswitchId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].VswitchId"));
			dbInstance.setMaintainStartTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].MaintainStartTime"));
			dbInstance.setInstanceClass(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceClass"));
			dbInstance.setConnectionDomain(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ConnectionDomain"));
			dbInstance.setCreateTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CreateTime"));
			dbInstance.setMaintainEndTime(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].MaintainEndTime"));
			dbInstance.setStorageType(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].StorageType"));
			dbInstance.setInstanceId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceId"));
			dbInstance.setEngineVersion(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].EngineVersion"));
			dbInstance.setRegionId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].RegionId"));
			dbInstance.setInstanceName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceName"));
			dbInstance.setRegion(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].Region"));
			dbInstance.setZoneId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ZoneId"));
			dbInstance.setClusterName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ClusterName"));
			dbInstance.setInstanceStatus(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceStatus"));
			dbInstance.setEngine(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].Engine"));
			dbInstance.setCustomId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].CustomId"));
			dbInstance.setClusterId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].ClusterId"));

			List<InstanceNodes> instanceNodeList = new ArrayList<InstanceNodes>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList.Length"); j++) {
				InstanceNodes instanceNodes = new InstanceNodes();
				instanceNodes.setNodeIp(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeIp"));
				instanceNodes.setDedicatedHostName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].DedicatedHostName"));
				instanceNodes.setInsName(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].InsName"));
				instanceNodes.setNodeType(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeType"));
				instanceNodes.setZoneId(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].ZoneId"));
				instanceNodes.setRole(_ctx.stringValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].Role"));
				instanceNodes.setPort(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].Port"));
				instanceNodes.setNodeId(_ctx.integerValue("DescribeDedicatedClusterInstanceListResponse.Instances["+ i +"].InstanceNodeList["+ j +"].NodeId"));

				instanceNodeList.add(instanceNodes);
			}
			dbInstance.setInstanceNodeList(instanceNodeList);

			instances.add(dbInstance);
		}
		describeDedicatedClusterInstanceListResponse.setInstances(instances);
	 
	 	return describeDedicatedClusterInstanceListResponse;
	}
}