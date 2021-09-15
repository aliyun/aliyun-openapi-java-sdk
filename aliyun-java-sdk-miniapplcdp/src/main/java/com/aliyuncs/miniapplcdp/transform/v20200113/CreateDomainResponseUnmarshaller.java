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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import com.aliyuncs.miniapplcdp.model.v20200113.CreateDomainResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.CreateDomainResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDomainResponseUnmarshaller {

	public static CreateDomainResponse unmarshall(CreateDomainResponse createDomainResponse, UnmarshallerContext _ctx) {
		
		createDomainResponse.setRequestId(_ctx.stringValue("CreateDomainResponse.RequestId"));

		Data data = new Data();
		data.setApplied(_ctx.booleanValue("CreateDomainResponse.Data.Applied"));
		data.setDomain(_ctx.stringValue("CreateDomainResponse.Data.Domain"));
		data.setAppId(_ctx.stringValue("CreateDomainResponse.Data.AppId"));
		data.setPath(_ctx.stringValue("CreateDomainResponse.Data.Path"));
		data.setDeleted(_ctx.booleanValue("CreateDomainResponse.Data.Deleted"));
		data.setEnvId(_ctx.stringValue("CreateDomainResponse.Data.EnvId"));
		data.setDomainType(_ctx.stringValue("CreateDomainResponse.Data.DomainType"));
		createDomainResponse.setData(data);
	 
	 	return createDomainResponse;
	}
}