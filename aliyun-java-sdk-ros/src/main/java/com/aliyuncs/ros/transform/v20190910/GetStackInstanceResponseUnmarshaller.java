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

import com.aliyuncs.ros.model.v20190910.GetStackInstanceResponse;
import com.aliyuncs.ros.model.v20190910.GetStackInstanceResponse.StackInstance;
import com.aliyuncs.ros.model.v20190910.GetStackInstanceResponse.StackInstance.ParameterOverride;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStackInstanceResponseUnmarshaller {

	public static GetStackInstanceResponse unmarshall(GetStackInstanceResponse getStackInstanceResponse, UnmarshallerContext _ctx) {
		
		getStackInstanceResponse.setRequestId(_ctx.stringValue("GetStackInstanceResponse.RequestId"));

		StackInstance stackInstance = new StackInstance();
		stackInstance.setStackGroupName(_ctx.stringValue("GetStackInstanceResponse.StackInstance.StackGroupName"));
		stackInstance.setStackGroupId(_ctx.stringValue("GetStackInstanceResponse.StackInstance.StackGroupId"));
		stackInstance.setStackId(_ctx.stringValue("GetStackInstanceResponse.StackInstance.StackId"));
		stackInstance.setAccountId(_ctx.stringValue("GetStackInstanceResponse.StackInstance.AccountId"));
		stackInstance.setRegionId(_ctx.stringValue("GetStackInstanceResponse.StackInstance.RegionId"));
		stackInstance.setStatus(_ctx.stringValue("GetStackInstanceResponse.StackInstance.Status"));
		stackInstance.setStatusReason(_ctx.stringValue("GetStackInstanceResponse.StackInstance.StatusReason"));
		stackInstance.setStackDriftStatus(_ctx.stringValue("GetStackInstanceResponse.StackInstance.StackDriftStatus"));
		stackInstance.setDriftDetectionTime(_ctx.stringValue("GetStackInstanceResponse.StackInstance.DriftDetectionTime"));

		List<ParameterOverride> parameterOverrides = new ArrayList<ParameterOverride>();
		for (int i = 0; i < _ctx.lengthValue("GetStackInstanceResponse.StackInstance.ParameterOverrides.Length"); i++) {
			ParameterOverride parameterOverride = new ParameterOverride();
			parameterOverride.setParameterKey(_ctx.stringValue("GetStackInstanceResponse.StackInstance.ParameterOverrides["+ i +"].ParameterKey"));
			parameterOverride.setParameterValue(_ctx.stringValue("GetStackInstanceResponse.StackInstance.ParameterOverrides["+ i +"].ParameterValue"));

			parameterOverrides.add(parameterOverride);
		}
		stackInstance.setParameterOverrides(parameterOverrides);
		getStackInstanceResponse.setStackInstance(stackInstance);
	 
	 	return getStackInstanceResponse;
	}
}