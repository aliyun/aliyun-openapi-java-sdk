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
import com.aliyuncs.ess.model.v20140828.DescribeScalingActivitiesResponse.ScalingActivity.ErrorMessagesItem;
import com.aliyuncs.ess.model.v20140828.DescribeScalingActivitiesResponse.ScalingActivity.LifecycleHookContext;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScalingActivitiesResponseUnmarshaller {

	public static DescribeScalingActivitiesResponse unmarshall(DescribeScalingActivitiesResponse describeScalingActivitiesResponse, UnmarshallerContext _ctx) {
		
		describeScalingActivitiesResponse.setRequestId(_ctx.stringValue("DescribeScalingActivitiesResponse.RequestId"));
		describeScalingActivitiesResponse.setPageNumber(_ctx.integerValue("DescribeScalingActivitiesResponse.PageNumber"));
		describeScalingActivitiesResponse.setPageSize(_ctx.integerValue("DescribeScalingActivitiesResponse.PageSize"));
		describeScalingActivitiesResponse.setTotalCount(_ctx.integerValue("DescribeScalingActivitiesResponse.TotalCount"));

		List<ScalingActivity> scalingActivities = new ArrayList<ScalingActivity>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities.Length"); i++) {
			ScalingActivity scalingActivity = new ScalingActivity();
			scalingActivity.setProgress(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Progress"));
			scalingActivity.setScalingInstanceNumber(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingInstanceNumber"));
			scalingActivity.setAttachedCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AttachedCapacity"));
			scalingActivity.setTotalCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].TotalCapacity"));
			scalingActivity.setScalingGroupId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingGroupId"));
			scalingActivity.setAutoCreatedCapacity(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].AutoCreatedCapacity"));
			scalingActivity.setEndTime(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].EndTime"));
			scalingActivity.setStartTime(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartTime"));
			scalingActivity.setDescription(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Description"));
			scalingActivity.setStatusCode(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusCode"));
			scalingActivity.setCause(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Cause"));
			scalingActivity.setScalingActivityId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ScalingActivityId"));
			scalingActivity.setStatusMessage(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StatusMessage"));
			scalingActivity.setCreatedCapacity(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].CreatedCapacity"));
			scalingActivity.setDestroyedCapacity(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].DestroyedCapacity"));
			scalingActivity.setStartedCapacity(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartedCapacity"));
			scalingActivity.setStoppedCapacity(_ctx.integerValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StoppedCapacity"));
			scalingActivity.setErrorCode(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorCode"));
			scalingActivity.setErrorMessage(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessage"));
			scalingActivity.setDetail(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].Detail"));
			scalingActivity.setTriggerSourceType(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].TriggerSourceType"));
			scalingActivity.setTriggerSourceId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].TriggerSourceId"));
			scalingActivity.setActivityMetadata(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ActivityMetadata"));
			scalingActivity.setInstanceRefreshTaskId(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].InstanceRefreshTaskId"));

			List<String> createdInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].CreatedInstances.Length"); j++) {
				createdInstances.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].CreatedInstances["+ j +"]"));
			}
			scalingActivity.setCreatedInstances(createdInstances);

			List<String> destroyedInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].DestroyedInstances.Length"); j++) {
				destroyedInstances.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].DestroyedInstances["+ j +"]"));
			}
			scalingActivity.setDestroyedInstances(destroyedInstances);

			List<String> startedInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartedInstances.Length"); j++) {
				startedInstances.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StartedInstances["+ j +"]"));
			}
			scalingActivity.setStartedInstances(startedInstances);

			List<String> stoppedInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StoppedInstances.Length"); j++) {
				stoppedInstances.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].StoppedInstances["+ j +"]"));
			}
			scalingActivity.setStoppedInstances(stoppedInstances);

			LifecycleHookContext lifecycleHookContext = new LifecycleHookContext();
			lifecycleHookContext.setDisableLifecycleHook(_ctx.booleanValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].LifecycleHookContext.DisableLifecycleHook"));

			List<String> ignoredLifecycleHookIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].LifecycleHookContext.IgnoredLifecycleHookIds.Length"); j++) {
				ignoredLifecycleHookIds.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].LifecycleHookContext.IgnoredLifecycleHookIds["+ j +"]"));
			}
			lifecycleHookContext.setIgnoredLifecycleHookIds(ignoredLifecycleHookIds);
			scalingActivity.setLifecycleHookContext(lifecycleHookContext);

			List<ErrorMessagesItem> errorMessages = new ArrayList<ErrorMessagesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages.Length"); j++) {
				ErrorMessagesItem errorMessagesItem = new ErrorMessagesItem();
				errorMessagesItem.setDescription(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages["+ j +"].Description"));
				errorMessagesItem.setCode(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages["+ j +"].Code"));
				errorMessagesItem.setMessage(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages["+ j +"].Message"));

				List<String> failedInstanceIds = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages["+ j +"].FailedInstanceIds.Length"); k++) {
					failedInstanceIds.add(_ctx.stringValue("DescribeScalingActivitiesResponse.ScalingActivities["+ i +"].ErrorMessages["+ j +"].FailedInstanceIds["+ k +"]"));
				}
				errorMessagesItem.setFailedInstanceIds(failedInstanceIds);

				errorMessages.add(errorMessagesItem);
			}
			scalingActivity.setErrorMessages(errorMessages);

			scalingActivities.add(scalingActivity);
		}
		describeScalingActivitiesResponse.setScalingActivities(scalingActivities);
	 
	 	return describeScalingActivitiesResponse;
	}
}