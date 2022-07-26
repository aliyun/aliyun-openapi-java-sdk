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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.ListInstancePatchStatesResponse;
import com.aliyuncs.oos.model.v20190601.ListInstancePatchStatesResponse.InstancePatchState;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancePatchStatesResponseUnmarshaller {

	public static ListInstancePatchStatesResponse unmarshall(ListInstancePatchStatesResponse listInstancePatchStatesResponse, UnmarshallerContext _ctx) {
		
		listInstancePatchStatesResponse.setRequestId(_ctx.stringValue("ListInstancePatchStatesResponse.RequestId"));
		listInstancePatchStatesResponse.setNextToken(_ctx.stringValue("ListInstancePatchStatesResponse.NextToken"));
		listInstancePatchStatesResponse.setMaxResults(_ctx.integerValue("ListInstancePatchStatesResponse.MaxResults"));

		List<InstancePatchState> instancePatchStates = new ArrayList<InstancePatchState>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancePatchStatesResponse.InstancePatchStates.Length"); i++) {
			InstancePatchState instancePatchState = new InstancePatchState();
			instancePatchState.setMissingCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].MissingCount"));
			instancePatchState.setOperationEndTime(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].OperationEndTime"));
			instancePatchState.setOwnerInformation(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].OwnerInformation"));
			instancePatchState.setInstalledOtherCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].InstalledOtherCount"));
			instancePatchState.setInstanceId(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].InstanceId"));
			instancePatchState.setOperationType(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].OperationType"));
			instancePatchState.setOperationStartTime(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].OperationStartTime"));
			instancePatchState.setFailedCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].FailedCount"));
			instancePatchState.setBaselineId(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].BaselineId"));
			instancePatchState.setInstalledPendingRebootCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].InstalledPendingRebootCount"));
			instancePatchState.setInstalledRejectedCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].InstalledRejectedCount"));
			instancePatchState.setPatchGroup(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].PatchGroup"));
			instancePatchState.setInstalledCount(_ctx.stringValue("ListInstancePatchStatesResponse.InstancePatchStates["+ i +"].InstalledCount"));

			instancePatchStates.add(instancePatchState);
		}
		listInstancePatchStatesResponse.setInstancePatchStates(instancePatchStates);
	 
	 	return listInstancePatchStatesResponse;
	}
}