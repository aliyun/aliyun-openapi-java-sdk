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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScalingActivityResponseUnmarshaller {

	public static ListScalingActivityResponse unmarshall(ListScalingActivityResponse listScalingActivityResponse, UnmarshallerContext _ctx) {
		
		listScalingActivityResponse.setRequestId(_ctx.stringValue("ListScalingActivityResponse.RequestId"));
		listScalingActivityResponse.setPageNumber(_ctx.integerValue("ListScalingActivityResponse.PageNumber"));
		listScalingActivityResponse.setPageSize(_ctx.integerValue("ListScalingActivityResponse.PageSize"));
		listScalingActivityResponse.setTotal(_ctx.integerValue("ListScalingActivityResponse.Total"));

		List<ScalingActivity> scalingActivityList = new ArrayList<ScalingActivity>();
		for (int i = 0; i < _ctx.lengthValue("ListScalingActivityResponse.ScalingActivityList.Length"); i++) {
			ScalingActivity scalingActivity = new ScalingActivity();
			scalingActivity.setBizId(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].BizId"));
			scalingActivity.setStartTime(_ctx.longValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].StartTime"));
			scalingActivity.setEndTime(_ctx.longValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].EndTime"));
			scalingActivity.setInstanceIds(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].InstanceIds"));
			scalingActivity.setTotalCapacity(_ctx.integerValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].TotalCapacity"));
			scalingActivity.setCause(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Cause"));
			scalingActivity.setDescription(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Description"));
			scalingActivity.setStatus(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Status"));
			scalingActivity.setTransition(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].Transition"));
			scalingActivity.setScalingRuleId(_ctx.stringValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].ScalingRuleId"));
			scalingActivity.setExpectNum(_ctx.integerValue("ListScalingActivityResponse.ScalingActivityList["+ i +"].ExpectNum"));

			scalingActivityList.add(scalingActivity);
		}
		listScalingActivityResponse.setScalingActivityList(scalingActivityList);
	 
	 	return listScalingActivityResponse;
	}
}