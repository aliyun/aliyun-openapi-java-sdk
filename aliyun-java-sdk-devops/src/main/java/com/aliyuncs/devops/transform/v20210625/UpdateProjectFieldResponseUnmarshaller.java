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

import com.aliyuncs.devops.model.v20210625.UpdateProjectFieldResponse;
import com.aliyuncs.devops.model.v20210625.UpdateProjectFieldResponse.Project;
import com.aliyuncs.devops.model.v20210625.UpdateProjectFieldResponse.Project.FieldListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectFieldResponseUnmarshaller {

	public static UpdateProjectFieldResponse unmarshall(UpdateProjectFieldResponse updateProjectFieldResponse, UnmarshallerContext _ctx) {
		
		updateProjectFieldResponse.setRequestId(_ctx.stringValue("UpdateProjectFieldResponse.requestId"));
		updateProjectFieldResponse.setErrorCode(_ctx.stringValue("UpdateProjectFieldResponse.errorCode"));
		updateProjectFieldResponse.setErrorMessage(_ctx.stringValue("UpdateProjectFieldResponse.errorMessage"));
		updateProjectFieldResponse.setSuccess(_ctx.booleanValue("UpdateProjectFieldResponse.success"));

		Project project = new Project();
		project.setCategory(_ctx.stringValue("UpdateProjectFieldResponse.project.category"));
		project.setCategoryIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.categoryIdentifier"));
		project.setCreator(_ctx.stringValue("UpdateProjectFieldResponse.project.creator"));
		project.setCustomCode(_ctx.stringValue("UpdateProjectFieldResponse.project.customCode"));
		project.setDescription(_ctx.stringValue("UpdateProjectFieldResponse.project.description"));
		project.setGmtCreate(_ctx.longValue("UpdateProjectFieldResponse.project.gmtCreate"));
		project.setGmtModified(_ctx.longValue("UpdateProjectFieldResponse.project.gmtModified"));
		project.setIconGroup(_ctx.stringValue("UpdateProjectFieldResponse.project.iconGroup"));
		project.setIcon(_ctx.stringValue("UpdateProjectFieldResponse.project.icon"));
		project.setIconBig(_ctx.stringValue("UpdateProjectFieldResponse.project.iconBig"));
		project.setIconSmall(_ctx.stringValue("UpdateProjectFieldResponse.project.iconSmall"));
		project.setId(_ctx.stringValue("UpdateProjectFieldResponse.project.id"));
		project.setIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.identifier"));
		project.setIdentifierPath(_ctx.stringValue("UpdateProjectFieldResponse.project.identifierPath"));
		project.setLogicalStatus(_ctx.stringValue("UpdateProjectFieldResponse.project.logicalStatus"));
		project.setModifier(_ctx.stringValue("UpdateProjectFieldResponse.project.modifier"));
		project.setName(_ctx.stringValue("UpdateProjectFieldResponse.project.name"));
		project.setOrganizationIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.organizationIdentifier"));
		project.setParentIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.parentIdentifier"));
		project.setScope(_ctx.stringValue("UpdateProjectFieldResponse.project.scope"));
		project.setStatusIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.statusIdentifier"));
		project.setStatusStageIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.statusStageIdentifier"));
		project.setSubType(_ctx.stringValue("UpdateProjectFieldResponse.project.subType"));
		project.setTypeIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.typeIdentifier"));
		project.setStatusName(_ctx.stringValue("UpdateProjectFieldResponse.project.statusName"));

		List<FieldListItem> fieldList = new ArrayList<FieldListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateProjectFieldResponse.project.fieldList.Length"); i++) {
			FieldListItem fieldListItem = new FieldListItem();
			fieldListItem.setIdentifier(_ctx.stringValue("UpdateProjectFieldResponse.project.fieldList["+ i +"].identifier"));
			fieldListItem.setDisplayName(_ctx.stringValue("UpdateProjectFieldResponse.project.fieldList["+ i +"].displayName"));
			fieldListItem.setValueType(_ctx.stringValue("UpdateProjectFieldResponse.project.fieldList["+ i +"].valueType"));
			fieldListItem.setValue(_ctx.stringValue("UpdateProjectFieldResponse.project.fieldList["+ i +"].value"));

			fieldList.add(fieldListItem);
		}
		project.setFieldList(fieldList);
		updateProjectFieldResponse.setProject(project);
	 
	 	return updateProjectFieldResponse;
	}
}