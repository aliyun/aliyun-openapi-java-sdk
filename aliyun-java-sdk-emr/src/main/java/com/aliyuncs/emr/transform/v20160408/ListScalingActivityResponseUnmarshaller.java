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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListScalingActivityResponse;
import com.aliyuncs.emr.model.v20160408.ListScalingActivityResponse.ScalingActivity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingActivityResponseUnmarshaller {

	public static ListScalingActivityResponse unmarshall(ListScalingActivityResponse listScalingActivityResponse, UnmarshallerContext context) {
		
		listScalingActivityResponse.setRequestId(context.stringValue("ListScalingActivityResponse.RequestId"));
		listScalingActivityResponse.setPageNumber(context.integerValue("ListScalingActivityResponse.PageNumber"));
		listScalingActivityResponse.setPageSize(context.integerValue("ListScalingActivityResponse.PageSize"));
		listScalingActivityResponse.setTotal(context.integerValue("ListScalingActivityResponse.Total"));

		List<ScalingActivity> scalingActivityList = new ArrayList<ScalingActivity>();
		for (int i = 0; i < context.lengthValue("ListScalingActivityResponse.ScalingActivityList.Length"); i++) {
			ScalingActivity scalingActivity = new ScalingActivity();
			scalingActivity.setBizId(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].BizId"));
			scalingActivity.setStartTime(context.longValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].StartTime"));
			scalingActivity.setEndTime(context.longValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].EndTime"));
			scalingActivity.setInstanceIds(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].InstanceIds"));
			scalingActivity.setTotalCapacity(context.integerValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].TotalCapacity"));
			scalingActivity.setCause(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Cause"));
			scalingActivity.setDescription(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Description"));
			scalingActivity.setStatus(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Status"));
			scalingActivity.setTransition(context.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Transition"));

			scalingActivityList.add(scalingActivity);
		}
		listScalingActivityResponse.setScalingActivityList(scalingActivityList);
	 
	 	return listScalingActivityResponse;
	}
}