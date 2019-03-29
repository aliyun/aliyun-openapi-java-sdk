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

package com.aliyuncs.ivision.transform.v20190308;

import com.aliyuncs.ivision.model.v20190308.ModifyProjectAttributeResponse;
import com.aliyuncs.ivision.model.v20190308.ModifyProjectAttributeResponse.Project;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyProjectAttributeResponseUnmarshaller {

	public static ModifyProjectAttributeResponse unmarshall(ModifyProjectAttributeResponse modifyProjectAttributeResponse, UnmarshallerContext context) {
		
		modifyProjectAttributeResponse.setRequestId(context.stringValue("ModifyProjectAttributeResponse.RequestId"));

		Project project = new Project();
		project.setProjectId(context.stringValue("ModifyProjectAttributeResponse.Project.ProjectId"));
		project.setName(context.stringValue("ModifyProjectAttributeResponse.Project.Name"));
		project.setDescription(context.stringValue("ModifyProjectAttributeResponse.Project.Description"));
		project.setProType(context.stringValue("ModifyProjectAttributeResponse.Project.ProType"));
		project.setIterCount(context.integerValue("ModifyProjectAttributeResponse.Project.IterCount"));
		project.setCreationTime(context.stringValue("ModifyProjectAttributeResponse.Project.CreationTime"));
		project.setStatus(context.stringValue("ModifyProjectAttributeResponse.Project.Status"));
		modifyProjectAttributeResponse.setProject(project);
	 
	 	return modifyProjectAttributeResponse;
	}
}