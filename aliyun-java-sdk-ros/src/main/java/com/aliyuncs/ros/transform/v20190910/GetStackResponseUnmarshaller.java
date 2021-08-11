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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GetStackResponse;
import com.aliyuncs.ros.model.v20190910.GetStackResponse.Parameter;
import com.aliyuncs.ros.model.v20190910.GetStackResponse.ResourceProgress;
import com.aliyuncs.ros.model.v20190910.GetStackResponse.ResourceProgress.InProgressResourceDetail;
import com.aliyuncs.ros.model.v20190910.GetStackResponse.Tag;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackResponseUnmarshaller {

	public static GetStackResponse unmarshall(GetStackResponse getStackResponse, UnmarshallerContext _ctx) {
		
		getStackResponse.setRequestId(_ctx.stringValue("GetStackResponse.RequestId"));
		getStackResponse.setStatus(_ctx.stringValue("GetStackResponse.Status"));
		getStackResponse.setDescription(_ctx.stringValue("GetStackResponse.Description"));
		getStackResponse.setStatusReason(_ctx.stringValue("GetStackResponse.StatusReason"));
		getStackResponse.setParentStackId(_ctx.stringValue("GetStackResponse.ParentStackId"));
		getStackResponse.setCreateTime(_ctx.stringValue("GetStackResponse.CreateTime"));
		getStackResponse.setDeletionProtection(_ctx.stringValue("GetStackResponse.DeletionProtection"));
		getStackResponse.setRootStackId(_ctx.stringValue("GetStackResponse.RootStackId"));
		getStackResponse.setTemplateDescription(_ctx.stringValue("GetStackResponse.TemplateDescription"));
		getStackResponse.setStackType(_ctx.stringValue("GetStackResponse.StackType"));
		getStackResponse.setRamRoleName(_ctx.stringValue("GetStackResponse.RamRoleName"));
		getStackResponse.setUpdateTime(_ctx.stringValue("GetStackResponse.UpdateTime"));
		getStackResponse.setDriftDetectionTime(_ctx.stringValue("GetStackResponse.DriftDetectionTime"));
		getStackResponse.setRegionId(_ctx.stringValue("GetStackResponse.RegionId"));
		getStackResponse.setStackDriftStatus(_ctx.stringValue("GetStackResponse.StackDriftStatus"));
		getStackResponse.setDisableRollback(_ctx.booleanValue("GetStackResponse.DisableRollback"));
		getStackResponse.setStackName(_ctx.stringValue("GetStackResponse.StackName"));
		getStackResponse.setTimeoutInMinutes(_ctx.integerValue("GetStackResponse.TimeoutInMinutes"));
		getStackResponse.setStackId(_ctx.stringValue("GetStackResponse.StackId"));
		getStackResponse.setResourceGroupId(_ctx.stringValue("GetStackResponse.ResourceGroupId"));

		List<Map<Object, Object>> outputs = _ctx.listMapValue("GetStackResponse.Outputs");
		getStackResponse.setOutputs(outputs);

		List<String> notificationURLs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStackResponse.NotificationURLs.Length"); i++) {
			notificationURLs.add(_ctx.stringValue("GetStackResponse.NotificationURLs["+ i +"]"));
		}
		getStackResponse.setNotificationURLs(notificationURLs);

		ResourceProgress resourceProgress = new ResourceProgress();
		resourceProgress.setTotalResourceCount(_ctx.integerValue("GetStackResponse.ResourceProgress.TotalResourceCount"));
		resourceProgress.setSuccessResourceCount(_ctx.integerValue("GetStackResponse.ResourceProgress.SuccessResourceCount"));
		resourceProgress.setFailedResourceCount(_ctx.integerValue("GetStackResponse.ResourceProgress.FailedResourceCount"));
		resourceProgress.setInProgressResourceCount(_ctx.integerValue("GetStackResponse.ResourceProgress.InProgressResourceCount"));
		resourceProgress.setPendingResourceCount(_ctx.integerValue("GetStackResponse.ResourceProgress.PendingResourceCount"));

		List<InProgressResourceDetail> inProgressResourceDetails = new ArrayList<InProgressResourceDetail>();
		for (int i = 0; i < _ctx.lengthValue("GetStackResponse.ResourceProgress.InProgressResourceDetails.Length"); i++) {
			InProgressResourceDetail inProgressResourceDetail = new InProgressResourceDetail();
			inProgressResourceDetail.setResourceName(_ctx.stringValue("GetStackResponse.ResourceProgress.InProgressResourceDetails["+ i +"].ResourceName"));
			inProgressResourceDetail.setResourceType(_ctx.stringValue("GetStackResponse.ResourceProgress.InProgressResourceDetails["+ i +"].ResourceType"));
			inProgressResourceDetail.setProgressValue(_ctx.floatValue("GetStackResponse.ResourceProgress.InProgressResourceDetails["+ i +"].ProgressValue"));
			inProgressResourceDetail.setProgressTargetValue(_ctx.floatValue("GetStackResponse.ResourceProgress.InProgressResourceDetails["+ i +"].ProgressTargetValue"));

			inProgressResourceDetails.add(inProgressResourceDetail);
		}
		resourceProgress.setInProgressResourceDetails(inProgressResourceDetails);
		getStackResponse.setResourceProgress(resourceProgress);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetStackResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterKey(_ctx.stringValue("GetStackResponse.Parameters["+ i +"].ParameterKey"));
			parameter.setParameterValue(_ctx.stringValue("GetStackResponse.Parameters["+ i +"].ParameterValue"));

			parameters.add(parameter);
		}
		getStackResponse.setParameters(parameters);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("GetStackResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("GetStackResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("GetStackResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		getStackResponse.setTags(tags);
	 
	 	return getStackResponse;
	}
}