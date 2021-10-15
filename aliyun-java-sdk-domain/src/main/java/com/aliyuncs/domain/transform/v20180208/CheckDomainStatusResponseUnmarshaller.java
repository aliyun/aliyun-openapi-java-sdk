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

package com.aliyuncs.domain.transform.v20180208;

import com.aliyuncs.domain.model.v20180208.CheckDomainStatusResponse;
import com.aliyuncs.domain.model.v20180208.CheckDomainStatusResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDomainStatusResponseUnmarshaller {

	public static CheckDomainStatusResponse unmarshall(CheckDomainStatusResponse checkDomainStatusResponse, UnmarshallerContext _ctx) {
		
		checkDomainStatusResponse.setRequestId(_ctx.stringValue("CheckDomainStatusResponse.RequestId"));
		checkDomainStatusResponse.setHttpStatusCode(_ctx.integerValue("CheckDomainStatusResponse.HttpStatusCode"));
		checkDomainStatusResponse.setErrorCode(_ctx.stringValue("CheckDomainStatusResponse.ErrorCode"));
		checkDomainStatusResponse.setSuccess(_ctx.booleanValue("CheckDomainStatusResponse.Success"));

		Module module = new Module();
		module.setDomain(_ctx.stringValue("CheckDomainStatusResponse.Module.Domain"));
		module.setPrice(_ctx.floatValue("CheckDomainStatusResponse.Module.Price"));
		module.setRegDate(_ctx.longValue("CheckDomainStatusResponse.Module.RegDate"));
		module.setDeadDate(_ctx.longValue("CheckDomainStatusResponse.Module.DeadDate"));
		module.setEndTime(_ctx.longValue("CheckDomainStatusResponse.Module.EndTime"));
		checkDomainStatusResponse.setModule(module);
	 
	 	return checkDomainStatusResponse;
	}
}