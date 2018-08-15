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

import com.aliyuncs.ecs.model.v20140526.DescribeHaVipsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeHaVipsResponse.HaVip;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHaVipsResponseUnmarshaller {

	public static DescribeHaVipsResponse unmarshall(DescribeHaVipsResponse describeHaVipsResponse, UnmarshallerContext context) {
		
		describeHaVipsResponse.setRequestId(context.stringValue("DescribeHaVipsResponse.RequestId"));
		describeHaVipsResponse.setTotalCount(context.integerValue("DescribeHaVipsResponse.TotalCount"));
		describeHaVipsResponse.setPageNumber(context.integerValue("DescribeHaVipsResponse.PageNumber"));
		describeHaVipsResponse.setPageSize(context.integerValue("DescribeHaVipsResponse.PageSize"));

		List<HaVip> haVips = new ArrayList<HaVip>();
		for (int i = 0; i < context.lengthValue("DescribeHaVipsResponse.HaVips.Length"); i++) {
			HaVip haVip = new HaVip();
			haVip.setHaVipId(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].HaVipId"));
			haVip.setRegionId(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].RegionId"));
			haVip.setVpcId(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].VpcId"));
			haVip.setVSwitchId(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].VSwitchId"));
			haVip.setIpAddress(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].IpAddress"));
			haVip.setStatus(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Status"));
			haVip.setMasterInstanceId(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].MasterInstanceId"));
			haVip.setDescription(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Description"));
			haVip.setCreateTime(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].CreateTime"));

			List<String> associatedInstances = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances.Length"); j++) {
				associatedInstances.add(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"]"));
			}
			haVip.setAssociatedInstances(associatedInstances);

			List<String> associatedEipAddresses = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses.Length"); j++) {
				associatedEipAddresses.add(context.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses["+ j +"]"));
			}
			haVip.setAssociatedEipAddresses(associatedEipAddresses);

			haVips.add(haVip);
		}
		describeHaVipsResponse.setHaVips(haVips);
	 
	 	return describeHaVipsResponse;
	}
}