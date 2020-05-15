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

import com.aliyuncs.ros.model.v20190910.GetStackGroupOperationResponse;
import com.aliyuncs.ros.model.v20190910.GetStackGroupOperationResponse.StackGroupOperation;
import com.aliyuncs.ros.model.v20190910.GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences;
import com.aliyuncs.ros.model.v20190910.GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackGroupOperationResponseUnmarshaller {

	public static GetStackGroupOperationResponse unmarshall(GetStackGroupOperationResponse getStackGroupOperationResponse, UnmarshallerContext _ctx) {
		
		getStackGroupOperationResponse.setRequestId(_ctx.stringValue("GetStackGroupOperationResponse.RequestId"));

		StackGroupOperation stackGroupOperation = new StackGroupOperation();
		stackGroupOperation.setStackGroupName(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupName"));
		stackGroupOperation.setStackGroupId(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupId"));
		stackGroupOperation.setOperationId(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.OperationId"));
		stackGroupOperation.setOperationDescription(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.OperationDescription"));
		stackGroupOperation.setCreateTime(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.CreateTime"));
		stackGroupOperation.setEndTime(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.EndTime"));
		stackGroupOperation.setAction(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.Action"));
		stackGroupOperation.setStatus(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.Status"));
		stackGroupOperation.setRetainStacks(_ctx.booleanValue("GetStackGroupOperationResponse.StackGroupOperation.RetainStacks"));
		stackGroupOperation.setAdministratorRoleName(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.AdministratorRoleName"));
		stackGroupOperation.setExecutionRoleName(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.ExecutionRoleName"));

		OperationPreferences operationPreferences = new OperationPreferences();
		operationPreferences.setFailureToleranceCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.FailureToleranceCount"));
		operationPreferences.setFailureTolerancePercentage(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.FailureTolerancePercentage"));
		operationPreferences.setMaxConcurrentCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.MaxConcurrentCount"));
		operationPreferences.setMaxConcurrentPercentage(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.MaxConcurrentPercentage"));

		List<String> regionIdsOrder = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.RegionIdsOrder.Length"); i++) {
			regionIdsOrder.add(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.OperationPreferences.RegionIdsOrder["+ i +"]"));
		}
		operationPreferences.setRegionIdsOrder(regionIdsOrder);
		stackGroupOperation.setOperationPreferences(operationPreferences);

		StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail = new StackGroupDriftDetectionDetail();
		stackGroupDriftDetectionDetail.setDriftDetectionTime(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.DriftDetectionTime"));
		stackGroupDriftDetectionDetail.setStackGroupDriftStatus(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.StackGroupDriftStatus"));
		stackGroupDriftDetectionDetail.setDriftDetectionStatus(_ctx.stringValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.DriftDetectionStatus"));
		stackGroupDriftDetectionDetail.setDriftedStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.DriftedStackInstancesCount"));
		stackGroupDriftDetectionDetail.setFailedStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.FailedStackInstancesCount"));
		stackGroupDriftDetectionDetail.setCancelledStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.CancelledStackInstancesCount"));
		stackGroupDriftDetectionDetail.setInProgressStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.InProgressStackInstancesCount"));
		stackGroupDriftDetectionDetail.setInSyncStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.InSyncStackInstancesCount"));
		stackGroupDriftDetectionDetail.setTotalStackInstancesCount(_ctx.integerValue("GetStackGroupOperationResponse.StackGroupOperation.StackGroupDriftDetectionDetail.TotalStackInstancesCount"));
		stackGroupOperation.setStackGroupDriftDetectionDetail(stackGroupDriftDetectionDetail);
		getStackGroupOperationResponse.setStackGroupOperation(stackGroupOperation);
	 
	 	return getStackGroupOperationResponse;
	}
}