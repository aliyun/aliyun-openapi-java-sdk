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

import com.aliyuncs.ros.model.v20190910.GetChangeSetResponse;
import com.aliyuncs.ros.model.v20190910.GetChangeSetResponse.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetChangeSetResponseUnmarshaller {

	public static GetChangeSetResponse unmarshall(GetChangeSetResponse getChangeSetResponse, UnmarshallerContext _ctx) {
		
		getChangeSetResponse.setRequestId(_ctx.stringValue("GetChangeSetResponse.RequestId"));
		getChangeSetResponse.setChangeSetId(_ctx.stringValue("GetChangeSetResponse.ChangeSetId"));
		getChangeSetResponse.setChangeSetName(_ctx.stringValue("GetChangeSetResponse.ChangeSetName"));
		getChangeSetResponse.setChangeSetType(_ctx.stringValue("GetChangeSetResponse.ChangeSetType"));
		getChangeSetResponse.setCreateTime(_ctx.stringValue("GetChangeSetResponse.CreateTime"));
		getChangeSetResponse.setDescription(_ctx.stringValue("GetChangeSetResponse.Description"));
		getChangeSetResponse.setDisableRollback(_ctx.booleanValue("GetChangeSetResponse.DisableRollback"));
		getChangeSetResponse.setExecutionStatus(_ctx.stringValue("GetChangeSetResponse.ExecutionStatus"));
		getChangeSetResponse.setRegionId(_ctx.stringValue("GetChangeSetResponse.RegionId"));
		getChangeSetResponse.setStackId(_ctx.stringValue("GetChangeSetResponse.StackId"));
		getChangeSetResponse.setStackName(_ctx.stringValue("GetChangeSetResponse.StackName"));
		getChangeSetResponse.setStatus(_ctx.stringValue("GetChangeSetResponse.Status"));
		getChangeSetResponse.setTemplateBody(_ctx.stringValue("GetChangeSetResponse.TemplateBody"));
		getChangeSetResponse.setTimeoutInMinutes(_ctx.integerValue("GetChangeSetResponse.TimeoutInMinutes"));
		getChangeSetResponse.setStatusReason(_ctx.stringValue("GetChangeSetResponse.StatusReason"));

		List<Map<Object, Object>> changes = _ctx.listMapValue("GetChangeSetResponse.Changes");
		getChangeSetResponse.setChanges(changes);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetChangeSetResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setParameterKey(_ctx.stringValue("GetChangeSetResponse.Parameters["+ i +"].ParameterKey"));
			parameter.setParameterValue(_ctx.stringValue("GetChangeSetResponse.Parameters["+ i +"].ParameterValue"));

			parameters.add(parameter);
		}
		getChangeSetResponse.setParameters(parameters);
	 
	 	return getChangeSetResponse;
	}
}