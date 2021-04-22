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

import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedBlockStorageClustersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageCluster;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageCluster.DedicatedBlockStorageClusterCapacity;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedBlockStorageClustersResponseUnmarshaller {

	public static DescribeDedicatedBlockStorageClustersResponse unmarshall(DescribeDedicatedBlockStorageClustersResponse describeDedicatedBlockStorageClustersResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedBlockStorageClustersResponse.setRequestId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.RequestId"));
		describeDedicatedBlockStorageClustersResponse.setNextToken(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.NextToken"));

		List<DedicatedBlockStorageCluster> dedicatedBlockStorageClusters = new ArrayList<DedicatedBlockStorageCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters.Length"); i++) {
			DedicatedBlockStorageCluster dedicatedBlockStorageCluster = new DedicatedBlockStorageCluster();
			dedicatedBlockStorageCluster.setDedicatedBlockStorageClusterId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterId"));
			dedicatedBlockStorageCluster.setDedicatedBlockStorageClusterName(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterName"));
			dedicatedBlockStorageCluster.setDescription(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Description"));
			dedicatedBlockStorageCluster.setZoneId(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].ZoneId"));
			dedicatedBlockStorageCluster.setStatus(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Status"));
			dedicatedBlockStorageCluster.setCategory(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].Category"));
			dedicatedBlockStorageCluster.setPerformanceLevel(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].PerformanceLevel"));
			dedicatedBlockStorageCluster.setExpiredTime(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].ExpiredTime"));
			dedicatedBlockStorageCluster.setCreateTime(_ctx.stringValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].CreateTime"));

			DedicatedBlockStorageClusterCapacity dedicatedBlockStorageClusterCapacity = new DedicatedBlockStorageClusterCapacity();
			dedicatedBlockStorageClusterCapacity.setAvailableCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.AvailableCapacity"));
			dedicatedBlockStorageClusterCapacity.setTotalCapacity(_ctx.longValue("DescribeDedicatedBlockStorageClustersResponse.DedicatedBlockStorageClusters["+ i +"].DedicatedBlockStorageClusterCapacity.TotalCapacity"));
			dedicatedBlockStorageCluster.setDedicatedBlockStorageClusterCapacity(dedicatedBlockStorageClusterCapacity);

			dedicatedBlockStorageClusters.add(dedicatedBlockStorageCluster);
		}
		describeDedicatedBlockStorageClustersResponse.setDedicatedBlockStorageClusters(dedicatedBlockStorageClusters);
	 
	 	return describeDedicatedBlockStorageClustersResponse;
	}
}