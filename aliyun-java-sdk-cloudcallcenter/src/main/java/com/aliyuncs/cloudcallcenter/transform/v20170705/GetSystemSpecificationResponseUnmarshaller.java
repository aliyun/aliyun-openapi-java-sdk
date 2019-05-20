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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetSystemSpecificationResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.GetSystemSpecificationResponse.SystemSpecification;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSystemSpecificationResponseUnmarshaller {

	public static GetSystemSpecificationResponse unmarshall(GetSystemSpecificationResponse getSystemSpecificationResponse, UnmarshallerContext context) {
		
		getSystemSpecificationResponse.setRequestId(context.stringValue("GetSystemSpecificationResponse.RequestId"));
		getSystemSpecificationResponse.setSuccess(context.booleanValue("GetSystemSpecificationResponse.Success"));
		getSystemSpecificationResponse.setCode(context.stringValue("GetSystemSpecificationResponse.Code"));
		getSystemSpecificationResponse.setMessage(context.stringValue("GetSystemSpecificationResponse.Message"));
		getSystemSpecificationResponse.setHttpStatusCode(context.integerValue("GetSystemSpecificationResponse.HttpStatusCode"));

		SystemSpecification systemSpecification = new SystemSpecification();
		systemSpecification.setSpecificationId(context.stringValue("GetSystemSpecificationResponse.SystemSpecification.SpecificationId"));
		systemSpecification.setAccount(context.stringValue("GetSystemSpecificationResponse.SystemSpecification.Account"));
		systemSpecification.setMaxInstances(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxInstances"));
		systemSpecification.setMaxAgents(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxAgents"));
		systemSpecification.setMaxOnlineAgents(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxOnlineAgents"));
		systemSpecification.setStorageMaxDays(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.StorageMaxDays"));
		systemSpecification.setStorageMaxSize(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.StorageMaxSize"));
		systemSpecification.setMaxPhoneNumbers(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxPhoneNumbers"));
		systemSpecification.setMaxSkillGroups(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxSkillGroups"));
		systemSpecification.setMaxContactFlows(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxContactFlows"));
		systemSpecification.setMaxRoles(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.MaxRoles"));
		systemSpecification.setFreeNumberCount(context.integerValue("GetSystemSpecificationResponse.SystemSpecification.FreeNumberCount"));
		getSystemSpecificationResponse.setSystemSpecification(systemSpecification);
	 
	 	return getSystemSpecificationResponse;
	}
}