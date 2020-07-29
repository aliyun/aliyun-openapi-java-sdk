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

import com.aliyuncs.ros.model.v20190910.GetStackGroupResponse;
import com.aliyuncs.ros.model.v20190910.GetStackGroupResponse.StackGroup;
import com.aliyuncs.ros.model.v20190910.GetStackGroupResponse.StackGroup.Parameter;
import com.aliyuncs.ros.model.v20190910.GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackGroupResponseUnmarshaller {

	public static GetStackGroupResponse unmarshall(GetStackGroupResponse getStackGroupResponse, UnmarshallerContext _ctx) {
		
		getStackGroupResponse.setRequestId(_ctx.stringValue("GetStackGroupResponse.RequestId"));

		StackGroup stackGroup = new StackGroup();
		stackGroup.setStackGroupName(_ctx.stringValue("GetStackGroupResponse.StackGroup.StackGroupName"));
		stackGroup.setStackGroupId(_ctx.stringValue("GetStackGroupResponse.StackGroup.StackGroupId"));
		stackGroup.setStatus(_ctx.stringValue("GetStackGroupResponse.StackGroup.Status"));
		stackGroup.setDescription(_ctx.stringValue("GetStackGroupResponse.StackGroup.Description"));
		stackGroup.setTemplateBody(_ctx.stringValue("GetStackGroupResponse.StackGroup.TemplateBody"));
		stackGroup.setExecutionRoleName(_ctx.stringValue("GetStackGroupResponse.StackGroup.ExecutionRoleName"));
		stackGroup.setAdministrationRoleName(_ctx.stringValue("GetStackGroupResponse.StackGroup.AdministrationRoleName"));

		StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail = new StackGroupDriftDetectionDetail();
		stackGroupDriftDetectionDetail.setDriftDetectionTime(_ctx.stringValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.DriftDetectionTime"));
		stackGroupDriftDetectionDetail.setStackGroupDriftStatus(_ctx.stringValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.StackGroupDriftStatus"));
		stackGroupDriftDetectionDetail.setDriftDetectionStatus(_ctx.stringValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.DriftDetectionStatus"));
		stackGroupDriftDetectionDetail.setDriftedStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.DriftedStackInstancesCount"));
		stackGroupDriftDetectionDetail.setFailedStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.FailedStackInstancesCount"));
		stackGroupDriftDetectionDetail.setCancelledStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.CancelledStackInstancesCount"));
		stackGroupDriftDetectionDetail.setInProgressStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.InProgressStackInstancesCount"));
		stackGroupDriftDetectionDetail.setInSyncStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.InSyncStackInstancesCount"));
		stackGroupDriftDetectionDetail.setTotalStackInstancesCount(_ctx.integerValue("GetStackGroupResponse.StackGroup.StackGroupDriftDetectionDetail.TotalStackInstancesCount"));
		stackGroup.setStackGroupDriftDetectionDetail(stackGroupDriftDetectionDetail);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetStackGroupResponse.StackGroup.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterKey(_ctx.stringValue("GetStackGroupResponse.StackGroup.Parameters["+ i +"].ParameterKey"));
			parameter.setParameterValue(_ctx.stringValue("GetStackGroupResponse.StackGroup.Parameters["+ i +"].ParameterValue"));

			parameters.add(parameter);
		}
		stackGroup.setParameters(parameters);
		getStackGroupResponse.setStackGroup(stackGroup);
	 
	 	return getStackGroupResponse;
	}
}