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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.UpdateProjectResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateProjectResponseUnmarshaller {

	public static UpdateProjectResponse unmarshall(UpdateProjectResponse updateProjectResponse, UnmarshallerContext context) {
		
		updateProjectResponse.setRequestId(context.stringValue("UpdateProjectResponse.RequestId"));
		updateProjectResponse.setProject(context.stringValue("UpdateProjectResponse.Project"));
		updateProjectResponse.setCreateTime(context.stringValue("UpdateProjectResponse.CreateTime"));
		updateProjectResponse.setModifyTime(context.stringValue("UpdateProjectResponse.ModifyTime"));
		updateProjectResponse.setServiceRole(context.stringValue("UpdateProjectResponse.ServiceRole"));
		updateProjectResponse.setCU(context.integerValue("UpdateProjectResponse.CU"));
		updateProjectResponse.setType(context.stringValue("UpdateProjectResponse.Type"));
	 
	 	return updateProjectResponse;
	}
}