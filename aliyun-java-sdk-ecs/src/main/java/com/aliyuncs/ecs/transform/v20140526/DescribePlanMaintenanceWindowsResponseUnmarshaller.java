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

import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowInfo;
import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowInfo.TargetResource;
import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowInfo.TargetResource.ResourceTags;
import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowInfo.TimePeriod;
import com.aliyuncs.ecs.model.v20140526.DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowInfo.TimePeriod.TimeWindows;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePlanMaintenanceWindowsResponseUnmarshaller {

	public static DescribePlanMaintenanceWindowsResponse unmarshall(DescribePlanMaintenanceWindowsResponse describePlanMaintenanceWindowsResponse, UnmarshallerContext _ctx) {
		
		describePlanMaintenanceWindowsResponse.setRequestId(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.RequestId"));
		describePlanMaintenanceWindowsResponse.setTotalCount(_ctx.integerValue("DescribePlanMaintenanceWindowsResponse.TotalCount"));
		describePlanMaintenanceWindowsResponse.setNextToken(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.NextToken"));
		describePlanMaintenanceWindowsResponse.setMaxResults(_ctx.integerValue("DescribePlanMaintenanceWindowsResponse.MaxResults"));

		List<PlanMaintenanceWindowInfo> planMaintenanceWindowList = new ArrayList<PlanMaintenanceWindowInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList.Length"); i++) {
			PlanMaintenanceWindowInfo planMaintenanceWindowInfo = new PlanMaintenanceWindowInfo();
			planMaintenanceWindowInfo.setSupportMaintenanceAction(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].SupportMaintenanceAction"));
			planMaintenanceWindowInfo.setModifiedTime(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].ModifiedTime"));
			planMaintenanceWindowInfo.setCreateTime(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].CreateTime"));
			planMaintenanceWindowInfo.setMinMaintenanceInterval(_ctx.integerValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].MinMaintenanceInterval"));
			planMaintenanceWindowInfo.setPlanWindowName(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].PlanWindowName"));
			planMaintenanceWindowInfo.setEnable(_ctx.booleanValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].Enable"));
			planMaintenanceWindowInfo.setPlanWindowId(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].PlanWindowId"));

			TargetResource targetResource = new TargetResource();
			targetResource.setScope(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TargetResource.Scope"));
			targetResource.setResourceGroupId(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TargetResource.ResourceGroupId"));

			List<ResourceTags> tags = new ArrayList<ResourceTags>();
			for (int j = 0; j < _ctx.lengthValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TargetResource.Tags.Length"); j++) {
				ResourceTags resourceTags = new ResourceTags();
				resourceTags.setValue(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TargetResource.Tags["+ j +"].Value"));
				resourceTags.setKey(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TargetResource.Tags["+ j +"].Key"));

				tags.add(resourceTags);
			}
			targetResource.setTags(tags);
			planMaintenanceWindowInfo.setTargetResource(targetResource);

			TimePeriod timePeriod = new TimePeriod();
			timePeriod.setPeriodUnit(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TimePeriod.PeriodUnit"));

			List<TimeWindows> rangeList = new ArrayList<TimeWindows>();
			for (int j = 0; j < _ctx.lengthValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TimePeriod.RangeList.Length"); j++) {
				TimeWindows timeWindows = new TimeWindows();
				timeWindows.setEndTime(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TimePeriod.RangeList["+ j +"].EndTime"));
				timeWindows.setStartTime(_ctx.stringValue("DescribePlanMaintenanceWindowsResponse.PlanMaintenanceWindowList["+ i +"].TimePeriod.RangeList["+ j +"].StartTime"));

				rangeList.add(timeWindows);
			}
			timePeriod.setRangeList(rangeList);
			planMaintenanceWindowInfo.setTimePeriod(timePeriod);

			planMaintenanceWindowList.add(planMaintenanceWindowInfo);
		}
		describePlanMaintenanceWindowsResponse.setPlanMaintenanceWindowList(planMaintenanceWindowList);
	 
	 	return describePlanMaintenanceWindowsResponse;
	}
}