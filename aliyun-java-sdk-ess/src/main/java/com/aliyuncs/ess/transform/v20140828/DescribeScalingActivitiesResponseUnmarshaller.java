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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingActivitiesResponseUnmarshaller {

	public static DescribeScalingActivitiesResponse unmarshall(DescribeScalingActivitiesResponse describeScalingActivitiesResponse, UnmarshallerContext _ctx) {
		
		describeScalingActivitiesResponse.setRequestId(_ctx.stringValue("DescribeScalingActivitiesResponse.RequestId"));
		describeScalingActivitiesResponse.setTotalCount(_ctx.integerValue("DescribeScalingActivitiesResponse.TotalCount"));
		describeScalingActivitiesResponse.setPageNumber(_ctx.integerValue("DescribeScalingActivitiesResponse.PageNumber"));
		describeScalingActivitiesResponse.setPageSize(_ctx.integerValue("DescribeScalingActivitiesResponse.PageSize"));

		List<ScalingActivity> scalingActivities = new ArrayList<ScalingActivity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities.Length"); i++) {
			ScalingActivity scalingActivity = new ScalingActivity();
			scalingActivity.setScalingActivityId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingActivityId"));
			scalingActivity.setScalingGroupId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingGroupId"));
			scalingActivity.setDescription(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Description"));
			scalingActivity.setCause(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Cause"));
			scalingActivity.setStartTime(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartTime"));
			scalingActivity.setEndTime(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].EndTime"));
			scalingActivity.setProgress(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Progress"));
			scalingActivity.setStatusCode(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusCode"));
			scalingActivity.setStatusMessage(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusMessage"));
			scalingActivity.setTotalCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].TotalCapacity"));
			scalingActivity.setAttachedCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AttachedCapacity"));
			scalingActivity.setAutoCreatedCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AutoCreatedCapacity"));
			scalingActivity.setScalingInstanceNumber(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingInstanceNumber"));

			scalingActivities.add(scalingActivity);
		}
		describeScalingActivitiesResponse.setScalingActivities(scalingActivities);
	 
	 	return describeScalingActivitiesResponse;
	}
}