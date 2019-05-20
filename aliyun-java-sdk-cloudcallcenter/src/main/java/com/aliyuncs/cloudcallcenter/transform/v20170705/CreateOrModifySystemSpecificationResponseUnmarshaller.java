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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateOrModifySystemSpecificationResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateOrModifySystemSpecificationResponse.SystemSpecification;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrModifySystemSpecificationResponseUnmarshaller {

	public static CreateOrModifySystemSpecificationResponse unmarshall(CreateOrModifySystemSpecificationResponse createOrModifySystemSpecificationResponse, UnmarshallerContext context) {
		
		createOrModifySystemSpecificationResponse.setRequestId(context.stringValue("CreateOrModifySystemSpecificationResponse.RequestId"));
		createOrModifySystemSpecificationResponse.setSuccess(context.booleanValue("CreateOrModifySystemSpecificationResponse.Success"));
		createOrModifySystemSpecificationResponse.setCode(context.stringValue("CreateOrModifySystemSpecificationResponse.Code"));
		createOrModifySystemSpecificationResponse.setMessage(context.stringValue("CreateOrModifySystemSpecificationResponse.Message"));
		createOrModifySystemSpecificationResponse.setHttpStatusCode(context.integerValue("CreateOrModifySystemSpecificationResponse.HttpStatusCode"));

		SystemSpecification systemSpecification = new SystemSpecification();
		systemSpecification.setSpecificationId(context.stringValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.SpecificationId"));
		systemSpecification.setAccount(context.stringValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.Account"));
		systemSpecification.setMaxInstances(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxInstances"));
		systemSpecification.setMaxAgents(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxAgents"));
		systemSpecification.setMaxOnlineAgents(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxOnlineAgents"));
		systemSpecification.setStorageMaxDays(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.StorageMaxDays"));
		systemSpecification.setStorageMaxSize(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.StorageMaxSize"));
		systemSpecification.setMaxPhoneNumbers(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxPhoneNumbers"));
		systemSpecification.setMaxSkillGroups(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxSkillGroups"));
		systemSpecification.setMaxContactFlows(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxContactFlows"));
		systemSpecification.setMaxRoles(context.integerValue("CreateOrModifySystemSpecificationResponse.SystemSpecification.MaxRoles"));
		createOrModifySystemSpecificationResponse.setSystemSpecification(systemSpecification);
	 
	 	return createOrModifySystemSpecificationResponse;
	}
}