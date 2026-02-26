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

package com.aliyuncs.netana.transform.v20181018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.netana.model.v20181018.DescribeNetworkResourceCountForGlobalResponse;
import com.aliyuncs.netana.model.v20181018.DescribeNetworkResourceCountForGlobalResponse.RegionSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkResourceCountForGlobalResponseUnmarshaller {

	public static DescribeNetworkResourceCountForGlobalResponse unmarshall(DescribeNetworkResourceCountForGlobalResponse describeNetworkResourceCountForGlobalResponse, UnmarshallerContext _ctx) {
		
		describeNetworkResourceCountForGlobalResponse.setRequestId(_ctx.stringValue("DescribeNetworkResourceCountForGlobalResponse.RequestId"));
		describeNetworkResourceCountForGlobalResponse.setTotalCount(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.TotalCount"));
		describeNetworkResourceCountForGlobalResponse.setTotalInstancesExpireSoon(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.TotalInstancesExpireSoon"));
		describeNetworkResourceCountForGlobalResponse.setResourceType(_ctx.stringValue("DescribeNetworkResourceCountForGlobalResponse.ResourceType"));
		describeNetworkResourceCountForGlobalResponse.setTotalInstancesExpire(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.TotalInstancesExpire"));

		List<RegionSummary> regionSummaries = new ArrayList<RegionSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkResourceCountForGlobalResponse.RegionSummaries.Length"); i++) {
			RegionSummary regionSummary = new RegionSummary();
			regionSummary.setInstancesExpire(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.RegionSummaries["+ i +"].InstancesExpire"));
			regionSummary.setInstancesExpireSoon(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.RegionSummaries["+ i +"].InstancesExpireSoon"));
			regionSummary.setInstances(_ctx.integerValue("DescribeNetworkResourceCountForGlobalResponse.RegionSummaries["+ i +"].Instances"));
			regionSummary.setRegionId(_ctx.stringValue("DescribeNetworkResourceCountForGlobalResponse.RegionSummaries["+ i +"].RegionId"));

			regionSummaries.add(regionSummary);
		}
		describeNetworkResourceCountForGlobalResponse.setRegionSummaries(regionSummaries);
	 
	 	return describeNetworkResourceCountForGlobalResponse;
	}
}