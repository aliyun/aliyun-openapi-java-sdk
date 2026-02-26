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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.CreateDataDomainResponse;
import com.aliyuncs.dataphin_public.model.v20230630.CreateDataDomainResponse.CreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDataDomainResponseUnmarshaller {

	public static CreateDataDomainResponse unmarshall(CreateDataDomainResponse createDataDomainResponse, UnmarshallerContext _ctx) {
		
		createDataDomainResponse.setRequestId(_ctx.stringValue("CreateDataDomainResponse.RequestId"));
		createDataDomainResponse.setSuccess(_ctx.booleanValue("CreateDataDomainResponse.Success"));
		createDataDomainResponse.setHttpStatusCode(_ctx.integerValue("CreateDataDomainResponse.HttpStatusCode"));
		createDataDomainResponse.setCode(_ctx.stringValue("CreateDataDomainResponse.Code"));
		createDataDomainResponse.setMessage(_ctx.stringValue("CreateDataDomainResponse.Message"));

		CreateResult createResult = new CreateResult();
		createResult.setDataDomainId(_ctx.longValue("CreateDataDomainResponse.CreateResult.DataDomainId"));
		createDataDomainResponse.setCreateResult(createResult);
	 
	 	return createDataDomainResponse;
	}
}