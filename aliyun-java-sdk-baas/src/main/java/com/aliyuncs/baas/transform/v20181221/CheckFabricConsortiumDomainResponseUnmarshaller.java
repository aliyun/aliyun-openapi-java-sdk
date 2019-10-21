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

import com.aliyuncs.baas.model.v20181221.CheckFabricConsortiumDomainResponse;
import com.aliyuncs.baas.model.v20181221.CheckFabricConsortiumDomainResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckFabricConsortiumDomainResponseUnmarshaller {

	public static CheckFabricConsortiumDomainResponse unmarshall(CheckFabricConsortiumDomainResponse checkFabricConsortiumDomainResponse, UnmarshallerContext _ctx) {
		
		checkFabricConsortiumDomainResponse.setRequestId(_ctx.stringValue("CheckFabricConsortiumDomainResponse.RequestId"));
		checkFabricConsortiumDomainResponse.setSuccess(_ctx.booleanValue("CheckFabricConsortiumDomainResponse.Success"));
		checkFabricConsortiumDomainResponse.setErrorCode(_ctx.integerValue("CheckFabricConsortiumDomainResponse.ErrorCode"));

		Result result = new Result();
		result.setValid(_ctx.booleanValue("CheckFabricConsortiumDomainResponse.Result.Valid"));
		result.setDomain(_ctx.stringValue("CheckFabricConsortiumDomainResponse.Result.Domain"));
		result.setPrompt(_ctx.stringValue("CheckFabricConsortiumDomainResponse.Result.Prompt"));
		checkFabricConsortiumDomainResponse.setResult(result);
	 
	 	return checkFabricConsortiumDomainResponse;
	}
}