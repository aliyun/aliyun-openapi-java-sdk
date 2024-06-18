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

import com.aliyuncs.domain.model.v20180208.CheckSelectedDomainStatusResponse;
import com.aliyuncs.domain.model.v20180208.CheckSelectedDomainStatusResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckSelectedDomainStatusResponseUnmarshaller {

	public static CheckSelectedDomainStatusResponse unmarshall(CheckSelectedDomainStatusResponse checkSelectedDomainStatusResponse, UnmarshallerContext _ctx) {
		
		checkSelectedDomainStatusResponse.setRequestId(_ctx.stringValue("CheckSelectedDomainStatusResponse.RequestId"));
		checkSelectedDomainStatusResponse.setErrorCode(_ctx.stringValue("CheckSelectedDomainStatusResponse.ErrorCode"));
		checkSelectedDomainStatusResponse.setSuccess(_ctx.booleanValue("CheckSelectedDomainStatusResponse.Success"));
		checkSelectedDomainStatusResponse.setHttpStatusCode(_ctx.integerValue("CheckSelectedDomainStatusResponse.HttpStatusCode"));

		Module module = new Module();
		module.setDomain(_ctx.stringValue("CheckSelectedDomainStatusResponse.Module.Domain"));
		module.setPrice(_ctx.doubleValue("CheckSelectedDomainStatusResponse.Module.Price"));
		module.setRegDate(_ctx.longValue("CheckSelectedDomainStatusResponse.Module.RegDate"));
		module.setDeadDate(_ctx.longValue("CheckSelectedDomainStatusResponse.Module.DeadDate"));
		module.setEndTime(_ctx.longValue("CheckSelectedDomainStatusResponse.Module.EndTime"));
		module.setPremium(_ctx.booleanValue("CheckSelectedDomainStatusResponse.Module.Premium"));
		checkSelectedDomainStatusResponse.setModule(module);
	 
	 	return checkSelectedDomainStatusResponse;
	}
}