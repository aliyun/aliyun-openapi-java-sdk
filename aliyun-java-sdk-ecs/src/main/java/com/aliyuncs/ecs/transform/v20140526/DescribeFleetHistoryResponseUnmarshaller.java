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

import com.aliyuncs.ecs.model.v20140526.DescribeFleetHistoryResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetHistoryResponse.FleetHistory;
import com.aliyuncs.ecs.model.v20140526.DescribeFleetHistoryResponse.FleetHistory.ActivityDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFleetHistoryResponseUnmarshaller {

	public static DescribeFleetHistoryResponse unmarshall(DescribeFleetHistoryResponse describeFleetHistoryResponse, UnmarshallerContext context) {
		
		describeFleetHistoryResponse.setRequestId(context.stringValue("DescribeFleetHistoryResponse.RequestId"));
		describeFleetHistoryResponse.setTotalCount(context.integerValue("DescribeFleetHistoryResponse.TotalCount"));
		describeFleetHistoryResponse.setPageNumber(context.integerValue("DescribeFleetHistoryResponse.PageNumber"));
		describeFleetHistoryResponse.setPageSize(context.integerValue("DescribeFleetHistoryResponse.PageSize"));

		List<FleetHistory> fleetHistorys = new ArrayList<FleetHistory>();
		for (int i = 0; i < context.lengthValue("DescribeFleetHistoryResponse.FleetHistorys.Length"); i++) {
			FleetHistory fleetHistory = new FleetHistory();
			fleetHistory.setTaskId(context.stringValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].TaskId"));
			fleetHistory.setStatus(context.stringValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].Status"));
			fleetHistory.setLastEventTime(context.stringValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].LastEventTime"));
			fleetHistory.setStartTime(context.stringValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].StartTime"));

			List<ActivityDetail> activityDetails = new ArrayList<ActivityDetail>();
			for (int j = 0; j < context.lengthValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].ActivityDetails.Length"); j++) {
				ActivityDetail activityDetail = new ActivityDetail();
				activityDetail.setDetail(context.stringValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].ActivityDetails["+ j +"].Detail"));
				activityDetail.setStatus(context.floatValue("DescribeFleetHistoryResponse.FleetHistorys["+ i +"].ActivityDetails["+ j +"].Status"));

				activityDetails.add(activityDetail);
			}
			fleetHistory.setActivityDetails(activityDetails);

			fleetHistorys.add(fleetHistory);
		}
		describeFleetHistoryResponse.setFleetHistorys(fleetHistorys);
	 
	 	return describeFleetHistoryResponse;
	}
}