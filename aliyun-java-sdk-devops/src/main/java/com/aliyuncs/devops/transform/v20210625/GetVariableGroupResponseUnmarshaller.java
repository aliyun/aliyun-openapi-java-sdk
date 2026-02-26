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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.GetVariableGroupResponse;
import com.aliyuncs.devops.model.v20210625.GetVariableGroupResponse.VariableGroup;
import com.aliyuncs.devops.model.v20210625.GetVariableGroupResponse.VariableGroup.RelatedPipeline;
import com.aliyuncs.devops.model.v20210625.GetVariableGroupResponse.VariableGroup.Variable;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVariableGroupResponseUnmarshaller {

	public static GetVariableGroupResponse unmarshall(GetVariableGroupResponse getVariableGroupResponse, UnmarshallerContext _ctx) {
		
		getVariableGroupResponse.setRequestId(_ctx.stringValue("GetVariableGroupResponse.requestId"));
		getVariableGroupResponse.setErrorMessage(_ctx.stringValue("GetVariableGroupResponse.errorMessage"));
		getVariableGroupResponse.setErrorCode(_ctx.stringValue("GetVariableGroupResponse.errorCode"));
		getVariableGroupResponse.setSuccess(_ctx.booleanValue("GetVariableGroupResponse.success"));

		VariableGroup variableGroup = new VariableGroup();
		variableGroup.setCcreatorAccountId(_ctx.stringValue("GetVariableGroupResponse.variableGroup.ccreatorAccountId"));
		variableGroup.setDescription(_ctx.stringValue("GetVariableGroupResponse.variableGroup.description"));
		variableGroup.setUpdateTime(_ctx.longValue("GetVariableGroupResponse.variableGroup.updateTime"));
		variableGroup.setId(_ctx.longValue("GetVariableGroupResponse.variableGroup.id"));
		variableGroup.setModifierAccountId(_ctx.stringValue("GetVariableGroupResponse.variableGroup.modifierAccountId"));
		variableGroup.setName(_ctx.stringValue("GetVariableGroupResponse.variableGroup.name"));
		variableGroup.setCreateTime(_ctx.longValue("GetVariableGroupResponse.variableGroup.createTime"));

		List<RelatedPipeline> relatedPipelines = new ArrayList<RelatedPipeline>();
		for (int i = 0; i < _ctx.lengthValue("GetVariableGroupResponse.variableGroup.relatedPipelines.Length"); i++) {
			RelatedPipeline relatedPipeline = new RelatedPipeline();
			relatedPipeline.setId(_ctx.longValue("GetVariableGroupResponse.variableGroup.relatedPipelines["+ i +"].id"));
			relatedPipeline.setName(_ctx.stringValue("GetVariableGroupResponse.variableGroup.relatedPipelines["+ i +"].name"));

			relatedPipelines.add(relatedPipeline);
		}
		variableGroup.setRelatedPipelines(relatedPipelines);

		List<Variable> variables = new ArrayList<Variable>();
		for (int i = 0; i < _ctx.lengthValue("GetVariableGroupResponse.variableGroup.variables.Length"); i++) {
			Variable variable = new Variable();
			variable.setValue(_ctx.stringValue("GetVariableGroupResponse.variableGroup.variables["+ i +"].value"));
			variable.setName(_ctx.stringValue("GetVariableGroupResponse.variableGroup.variables["+ i +"].name"));
			variable.setIsEncrypted(_ctx.booleanValue("GetVariableGroupResponse.variableGroup.variables["+ i +"].isEncrypted"));

			variables.add(variable);
		}
		variableGroup.setVariables(variables);
		getVariableGroupResponse.setVariableGroup(variableGroup);
	 
	 	return getVariableGroupResponse;
	}
}