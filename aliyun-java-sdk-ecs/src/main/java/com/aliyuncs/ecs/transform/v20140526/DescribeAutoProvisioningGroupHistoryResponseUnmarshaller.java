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

import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistory;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistory.ActivityDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoProvisioningGroupHistoryResponseUnmarshaller {

	public static DescribeAutoProvisioningGroupHistoryResponse unmarshall(DescribeAutoProvisioningGroupHistoryResponse describeAutoProvisioningGroupHistoryResponse, UnmarshallerContext _ctx) {
		
		describeAutoProvisioningGroupHistoryResponse.setRequestId(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.RequestId"));
		describeAutoProvisioningGroupHistoryResponse.setTotalCount(_ctx.integerValue("DescribeAutoProvisioningGroupHistoryResponse.TotalCount"));
		describeAutoProvisioningGroupHistoryResponse.setPageNumber(_ctx.integerValue("DescribeAutoProvisioningGroupHistoryResponse.PageNumber"));
		describeAutoProvisioningGroupHistoryResponse.setPageSize(_ctx.integerValue("DescribeAutoProvisioningGroupHistoryResponse.PageSize"));

		List<AutoProvisioningGroupHistory> autoProvisioningGroupHistories = new ArrayList<AutoProvisioningGroupHistory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories.Length"); i++) {
			AutoProvisioningGroupHistory autoProvisioningGroupHistory = new AutoProvisioningGroupHistory();
			autoProvisioningGroupHistory.setTaskId(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].TaskId"));
			autoProvisioningGroupHistory.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].Status"));
			autoProvisioningGroupHistory.setLastEventTime(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].LastEventTime"));
			autoProvisioningGroupHistory.setStartTime(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].StartTime"));

			List<ActivityDetail> activityDetails = new ArrayList<ActivityDetail>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].ActivityDetails.Length"); j++) {
				ActivityDetail activityDetail = new ActivityDetail();
				activityDetail.setDetail(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].ActivityDetails["+ j +"].Detail"));
				activityDetail.setStatus(_ctx.stringValue("DescribeAutoProvisioningGroupHistoryResponse.AutoProvisioningGroupHistories["+ i +"].ActivityDetails["+ j +"].Status"));

				activityDetails.add(activityDetail);
			}
			autoProvisioningGroupHistory.setActivityDetails(activityDetails);

			autoProvisioningGroupHistories.add(autoProvisioningGroupHistory);
		}
		describeAutoProvisioningGroupHistoryResponse.setAutoProvisioningGroupHistories(autoProvisioningGroupHistories);
	 
	 	return describeAutoProvisioningGroupHistoryResponse;
	}
}