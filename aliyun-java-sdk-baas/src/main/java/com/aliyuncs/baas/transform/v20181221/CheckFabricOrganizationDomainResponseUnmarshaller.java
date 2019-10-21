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

package com.aliyuncs.baas.transform.v20181221;

import com.aliyuncs.baas.model.v20181221.CheckFabricOrganizationDomainResponse;
import com.aliyuncs.baas.model.v20181221.CheckFabricOrganizationDomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckFabricOrganizationDomainResponseUnmarshaller {

	public static CheckFabricOrganizationDomainResponse unmarshall(CheckFabricOrganizationDomainResponse checkFabricOrganizationDomainResponse, UnmarshallerContext _ctx) {
		
		checkFabricOrganizationDomainResponse.setRequestId(_ctx.stringValue("CheckFabricOrganizationDomainResponse.RequestId"));
		checkFabricOrganizationDomainResponse.setSuccess(_ctx.booleanValue("CheckFabricOrganizationDomainResponse.Success"));
		checkFabricOrganizationDomainResponse.setErrorCode(_ctx.integerValue("CheckFabricOrganizationDomainResponse.ErrorCode"));

		Result result = new Result();
		result.setValid(_ctx.booleanValue("CheckFabricOrganizationDomainResponse.Result.Valid"));
		result.setDomain(_ctx.stringValue("CheckFabricOrganizationDomainResponse.Result.Domain"));
		result.setPrompt(_ctx.stringValue("CheckFabricOrganizationDomainResponse.Result.Prompt"));
		checkFabricOrganizationDomainResponse.setResult(result);
	 
	 	return checkFabricOrganizationDomainResponse;
	}
}