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

import com.aliyuncs.r_kvstore.model.v20150101.DescribeDedicatedUserClusterResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeDedicatedUserClusterResponse.ClusterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedUserClusterResponseUnmarshaller {

	public static DescribeDedicatedUserClusterResponse unmarshall(DescribeDedicatedUserClusterResponse describeDedicatedUserClusterResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedUserClusterResponse.setRequestId(_ctx.stringValue("DescribeDedicatedUserClusterResponse.RequestId"));
		describeDedicatedUserClusterResponse.setMaxRecordsPerPage(_ctx.integerValue("DescribeDedicatedUserClusterResponse.MaxRecordsPerPage"));
		describeDedicatedUserClusterResponse.setPageNumber(_ctx.integerValue("DescribeDedicatedUserClusterResponse.PageNumber"));
		describeDedicatedUserClusterResponse.setTotalRecords(_ctx.integerValue("DescribeDedicatedUserClusterResponse.TotalRecords"));
		describeDedicatedUserClusterResponse.setItemsNumbers(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ItemsNumbers"));

		List<ClusterInfo> clusterItems = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedUserClusterResponse.ClusterItems.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setClusterId(_ctx.stringValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].ClusterId"));
			clusterInfo.setClusterName(_ctx.stringValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].ClusterName"));
			clusterInfo.setHostNumbers(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].HostNumbers"));
			clusterInfo.setInstanceNumbers(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].InstanceNumbers"));
			clusterInfo.setCpuOverAllocationRatio(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].CpuOverAllocationRatio"));
			clusterInfo.setMemoryOverAllocationRatio(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].MemoryOverAllocationRatio"));
			clusterInfo.setDiskOverAllocationRatio(_ctx.integerValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].DiskOverAllocationRatio"));
			clusterInfo.setAllocationPolicy(_ctx.stringValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].AllocationPolicy"));
			clusterInfo.setHostReplacePolicy(_ctx.stringValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].HostReplacePolicy"));
			clusterInfo.setCreateTime(_ctx.stringValue("DescribeDedicatedUserClusterResponse.ClusterItems["+ i +"].CreateTime"));

			clusterItems.add(clusterInfo);
		}
		describeDedicatedUserClusterResponse.setClusterItems(clusterItems);
	 
	 	return describeDedicatedUserClusterResponse;
	}
}