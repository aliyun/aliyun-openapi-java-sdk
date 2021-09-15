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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse.DedicatedHostCluster;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse.DedicatedHostCluster.DedicatedHostClusterCapacity;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse.DedicatedHostCluster.DedicatedHostClusterCapacity.AvailableInstanceType;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse.DedicatedHostCluster.DedicatedHostClusterCapacity.LocalStorageCapacity;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostClustersResponse.DedicatedHostCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostClustersResponseUnmarshaller {

	public static DescribeDedicatedHostClustersResponse unmarshall(DescribeDedicatedHostClustersResponse describeDedicatedHostClustersResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostClustersResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostClustersResponse.RequestId"));
		describeDedicatedHostClustersResponse.setPageSize(_ctx.integerValue("DescribeDedicatedHostClustersResponse.PageSize"));
		describeDedicatedHostClustersResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedHostClustersResponse.PageNumber"));
		describeDedicatedHostClustersResponse.setTotalCount(_ctx.integerValue("DescribeDedicatedHostClustersResponse.TotalCount"));

		List<DedicatedHostCluster> dedicatedHostClusters = new ArrayList<DedicatedHostCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters.Length"); i++) {
			DedicatedHostCluster dedicatedHostCluster = new DedicatedHostCluster();
			dedicatedHostCluster.setDescription(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].Description"));
			dedicatedHostCluster.setDedicatedHostClusterId(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterId"));
			dedicatedHostCluster.setResourceGroupId(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].ResourceGroupId"));
			dedicatedHostCluster.setZoneId(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].ZoneId"));
			dedicatedHostCluster.setRegionId(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].RegionId"));
			dedicatedHostCluster.setDedicatedHostClusterName(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterName"));

			List<String> dedicatedHostIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostIds.Length"); j++) {
				dedicatedHostIds.add(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostIds["+ j +"]"));
			}
			dedicatedHostCluster.setDedicatedHostIds(dedicatedHostIds);

			DedicatedHostClusterCapacity dedicatedHostClusterCapacity = new DedicatedHostClusterCapacity();
			dedicatedHostClusterCapacity.setAvailableVcpus(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.AvailableVcpus"));
			dedicatedHostClusterCapacity.setAvailableMemory(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.AvailableMemory"));
			dedicatedHostClusterCapacity.setTotalMemory(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.TotalMemory"));
			dedicatedHostClusterCapacity.setTotalVcpus(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.TotalVcpus"));

			List<LocalStorageCapacity> localStorageCapacities = new ArrayList<LocalStorageCapacity>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.LocalStorageCapacities.Length"); j++) {
				LocalStorageCapacity localStorageCapacity = new LocalStorageCapacity();
				localStorageCapacity.setDataDiskCategory(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.LocalStorageCapacities["+ j +"].DataDiskCategory"));
				localStorageCapacity.setAvailableDisk(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.LocalStorageCapacities["+ j +"].AvailableDisk"));
				localStorageCapacity.setTotalDisk(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.LocalStorageCapacities["+ j +"].TotalDisk"));

				localStorageCapacities.add(localStorageCapacity);
			}
			dedicatedHostClusterCapacity.setLocalStorageCapacities(localStorageCapacities);

			List<AvailableInstanceType> availableInstanceTypes = new ArrayList<AvailableInstanceType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.AvailableInstanceTypes.Length"); j++) {
				AvailableInstanceType availableInstanceType = new AvailableInstanceType();
				availableInstanceType.setInstanceType(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.AvailableInstanceTypes["+ j +"].InstanceType"));
				availableInstanceType.setAvailableInstanceCapacity(_ctx.integerValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].DedicatedHostClusterCapacity.AvailableInstanceTypes["+ j +"].AvailableInstanceCapacity"));

				availableInstanceTypes.add(availableInstanceType);
			}
			dedicatedHostClusterCapacity.setAvailableInstanceTypes(availableInstanceTypes);
			dedicatedHostCluster.setDedicatedHostClusterCapacity(dedicatedHostClusterCapacity);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setTagValue(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].Tags["+ j +"].TagValue"));
				tag.setTagKey(_ctx.stringValue("DescribeDedicatedHostClustersResponse.DedicatedHostClusters["+ i +"].Tags["+ j +"].TagKey"));

				tags.add(tag);
			}
			dedicatedHostCluster.setTags(tags);

			dedicatedHostClusters.add(dedicatedHostCluster);
		}
		describeDedicatedHostClustersResponse.setDedicatedHostClusters(dedicatedHostClusters);
	 
	 	return describeDedicatedHostClustersResponse;
	}
}