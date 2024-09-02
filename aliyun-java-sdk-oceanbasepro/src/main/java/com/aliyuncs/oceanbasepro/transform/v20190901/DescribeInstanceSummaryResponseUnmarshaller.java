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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSummaryResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSummaryResponse.InstanceSummary;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryLis;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSummaryResponseUnmarshaller {

	public static DescribeInstanceSummaryResponse unmarshall(DescribeInstanceSummaryResponse describeInstanceSummaryResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSummaryResponse.setRequestId(_ctx.stringValue("DescribeInstanceSummaryResponse.RequestId"));

		InstanceSummary instanceSummary = new InstanceSummary();
		instanceSummary.setTotalInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.TotalInstancesCount"));
		instanceSummary.setOverLoadInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.OverLoadInstancesCount"));
		instanceSummary.setImmediatelyExpiredInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.ImmediatelyExpiredInstancesCount"));
		instanceSummary.setRunningInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.RunningInstancesCount"));
		instanceSummary.setInsufficientDiskInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.InsufficientDiskInstancesCount"));
		instanceSummary.setExpiredInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.ExpiredInstancesCount"));
		instanceSummary.setAlarmSummaryCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.AlarmSummaryCount"));
		instanceSummary.setAnomalySQLCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.AnomalySQLCount"));
		instanceSummary.setClusterInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.ClusterInstancesCount"));
		instanceSummary.setTenantInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.TenantInstancesCount"));
		instanceSummary.setTotalOmsInstancesCount(_ctx.longValue("DescribeInstanceSummaryResponse.InstanceSummary.TotalOmsInstancesCount"));

		List<RegionalInstanceSummaryLis> regionalInstanceSummaryList = new ArrayList<RegionalInstanceSummaryLis>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList.Length"); i++) {
			RegionalInstanceSummaryLis regionalInstanceSummaryLis = new RegionalInstanceSummaryLis();
			regionalInstanceSummaryLis.setRegion(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].Region"));
			regionalInstanceSummaryLis.setTotalInstancesCount(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].TotalInstancesCount"));
			regionalInstanceSummaryLis.setImmediatelyExpiredInstancesCount(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].ImmediatelyExpiredInstancesCount"));
			regionalInstanceSummaryLis.setRunningInstancesCount(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].RunningInstancesCount"));
			regionalInstanceSummaryLis.setExpiredInstancesCount(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].ExpiredInstancesCount"));
			regionalInstanceSummaryLis.setRecentCreatedInstancesCount(_ctx.stringValue("DescribeInstanceSummaryResponse.InstanceSummary.RegionalInstanceSummaryList["+ i +"].RecentCreatedInstancesCount"));

			regionalInstanceSummaryList.add(regionalInstanceSummaryLis);
		}
		instanceSummary.setRegionalInstanceSummaryList(regionalInstanceSummaryList);
		describeInstanceSummaryResponse.setInstanceSummary(instanceSummary);
	 
	 	return describeInstanceSummaryResponse;
	}
}