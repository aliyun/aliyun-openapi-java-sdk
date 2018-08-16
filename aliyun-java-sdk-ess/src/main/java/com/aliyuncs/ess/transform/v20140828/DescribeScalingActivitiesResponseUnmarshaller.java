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

package com.aliyuncs.ess.transform.v20140828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ess.model.v20140828.DescribeScalingActivitiesResponse;
import com.aliyuncs.ess.model.v20140828.DescribeScalingActivitiesResponse.ScalingActivity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingActivitiesResponseUnmarshaller {

	public static DescribeScalingActivitiesResponse unmarshall(DescribeScalingActivitiesResponse describeScalingActivitiesResponse, UnmarshallerContext context) {
		
		describeScalingActivitiesResponse.setRequestId(context.stringValue("DescribeScalingActivitiesResponse.RequestId"));
		describeScalingActivitiesResponse.setTotalCount(context.integerValue("DescribeScalingActivitiesResponse.TotalCount"));
		describeScalingActivitiesResponse.setPageNumber(context.integerValue("DescribeScalingActivitiesResponse.PageNumber"));
		describeScalingActivitiesResponse.setPageSize(context.integerValue("DescribeScalingActivitiesResponse.PageSize"));

		List<ScalingActivity> scalingActivities = new ArrayList<ScalingActivity>();
		for (int i = 0; i < context.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities.Length"); i++) {
			ScalingActivity scalingActivity = new ScalingActivity();
			scalingActivity.setScalingActivityId(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingActivityId"));
			scalingActivity.setScalingGroupId(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingGroupId"));
			scalingActivity.setDescription(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Description"));
			scalingActivity.setCause(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Cause"));
			scalingActivity.setStartTime(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartTime"));
			scalingActivity.setEndTime(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].EndTime"));
			scalingActivity.setProgress(context.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Progress"));
			scalingActivity.setStatusCode(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusCode"));
			scalingActivity.setStatusMessage(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusMessage"));
			scalingActivity.setTotalCapacity(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].TotalCapacity"));
			scalingActivity.setAttachedCapacity(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AttachedCapacity"));
			scalingActivity.setAutoCreatedCapacity(context.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AutoCreatedCapacity"));

			scalingActivities.add(scalingActivity);
		}
		describeScalingActivitiesResponse.setScalingActivities(scalingActivities);
	 
	 	return describeScalingActivitiesResponse;
	}
}