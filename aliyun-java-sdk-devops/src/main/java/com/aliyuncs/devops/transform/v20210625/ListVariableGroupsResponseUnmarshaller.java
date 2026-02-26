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

import com.aliyuncs.devops.model.v20210625.ListVariableGroupsResponse;
import com.aliyuncs.devops.model.v20210625.ListVariableGroupsResponse.VariableGroup;
import com.aliyuncs.devops.model.v20210625.ListVariableGroupsResponse.VariableGroup.RelatedPipeline;
import com.aliyuncs.devops.model.v20210625.ListVariableGroupsResponse.VariableGroup.Variable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVariableGroupsResponseUnmarshaller {

	public static ListVariableGroupsResponse unmarshall(ListVariableGroupsResponse listVariableGroupsResponse, UnmarshallerContext _ctx) {
		
		listVariableGroupsResponse.setRequestId(_ctx.stringValue("ListVariableGroupsResponse.requestId"));
		listVariableGroupsResponse.setErrorMessage(_ctx.stringValue("ListVariableGroupsResponse.errorMessage"));
		listVariableGroupsResponse.setErrorCode(_ctx.stringValue("ListVariableGroupsResponse.errorCode"));
		listVariableGroupsResponse.setSuccess(_ctx.booleanValue("ListVariableGroupsResponse.success"));
		listVariableGroupsResponse.setTotalCount(_ctx.longValue("ListVariableGroupsResponse.totalCount"));
		listVariableGroupsResponse.setNextToken(_ctx.stringValue("ListVariableGroupsResponse.nextToken"));

		List<VariableGroup> variableGroups = new ArrayList<VariableGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListVariableGroupsResponse.variableGroups.Length"); i++) {
			VariableGroup variableGroup = new VariableGroup();
			variableGroup.setCreatorAccountId(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].creatorAccountId"));
			variableGroup.setUpdateTime(_ctx.longValue("ListVariableGroupsResponse.variableGroups["+ i +"].updateTime"));
			variableGroup.setModifierAccountId(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].modifierAccountId"));
			variableGroup.setDescription(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].description"));
			variableGroup.setName(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].name"));
			variableGroup.setId(_ctx.longValue("ListVariableGroupsResponse.variableGroups["+ i +"].id"));
			variableGroup.setCreateTime(_ctx.longValue("ListVariableGroupsResponse.variableGroups["+ i +"].createTime"));

			List<RelatedPipeline> relatedPipelines = new ArrayList<RelatedPipeline>();
			for (int j = 0; j < _ctx.lengthValue("ListVariableGroupsResponse.variableGroups["+ i +"].relatedPipelines.Length"); j++) {
				RelatedPipeline relatedPipeline = new RelatedPipeline();
				relatedPipeline.setId(_ctx.longValue("ListVariableGroupsResponse.variableGroups["+ i +"].relatedPipelines["+ j +"].id"));
				relatedPipeline.setName(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].relatedPipelines["+ j +"].name"));

				relatedPipelines.add(relatedPipeline);
			}
			variableGroup.setRelatedPipelines(relatedPipelines);

			List<Variable> variables = new ArrayList<Variable>();
			for (int j = 0; j < _ctx.lengthValue("ListVariableGroupsResponse.variableGroups["+ i +"].variables.Length"); j++) {
				Variable variable = new Variable();
				variable.setValue(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].variables["+ j +"].value"));
				variable.setName(_ctx.stringValue("ListVariableGroupsResponse.variableGroups["+ i +"].variables["+ j +"].name"));
				variable.setIsEncrypted(_ctx.booleanValue("ListVariableGroupsResponse.variableGroups["+ i +"].variables["+ j +"].isEncrypted"));

				variables.add(variable);
			}
			variableGroup.setVariables(variables);

			variableGroups.add(variableGroup);
		}
		listVariableGroupsResponse.setVariableGroups(variableGroups);
	 
	 	return listVariableGroupsResponse;
	}
}