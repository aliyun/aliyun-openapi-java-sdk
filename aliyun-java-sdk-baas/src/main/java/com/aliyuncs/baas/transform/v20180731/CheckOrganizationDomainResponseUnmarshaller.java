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

package com.aliyuncs.baas.transform.v20180731;

import com.aliyuncs.baas.model.v20180731.CheckOrganizationDomainResponse;
import com.aliyuncs.baas.model.v20180731.CheckOrganizationDomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckOrganizationDomainResponseUnmarshaller {

	public static CheckOrganizationDomainResponse unmarshall(CheckOrganizationDomainResponse checkOrganizationDomainResponse, UnmarshallerContext context) {
		
		checkOrganizationDomainResponse.setRequestId(context.stringValue("CheckOrganizationDomainResponse.RequestId"));
		checkOrganizationDomainResponse.setSuccess(context.booleanValue("CheckOrganizationDomainResponse.Success"));
		checkOrganizationDomainResponse.setErrorCode(context.integerValue("CheckOrganizationDomainResponse.ErrorCode"));

		Result result = new Result();
		result.setValid(context.booleanValue("CheckOrganizationDomainResponse.Result.Valid"));
		result.setDomain(context.stringValue("CheckOrganizationDomainResponse.Result.Domain"));
		result.setPrompt(context.stringValue("CheckOrganizationDomainResponse.Result.Prompt"));
		checkOrganizationDomainResponse.setResult(result);
	 
	 	return checkOrganizationDomainResponse;
	}
}