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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateStudioAppDomainOpenResponse;
import com.aliyuncs.iot.model.v20180120.CreateStudioAppDomainOpenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStudioAppDomainOpenResponseUnmarshaller {

	public static CreateStudioAppDomainOpenResponse unmarshall(CreateStudioAppDomainOpenResponse createStudioAppDomainOpenResponse, UnmarshallerContext _ctx) {
		
		createStudioAppDomainOpenResponse.setRequestId(_ctx.stringValue("CreateStudioAppDomainOpenResponse.RequestId"));
		createStudioAppDomainOpenResponse.setCode(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Code"));
		createStudioAppDomainOpenResponse.setErrorMessage(_ctx.stringValue("CreateStudioAppDomainOpenResponse.ErrorMessage"));
		createStudioAppDomainOpenResponse.setSuccess(_ctx.booleanValue("CreateStudioAppDomainOpenResponse.Success"));

		Data data = new Data();
		data.setHost(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.Host"));
		data.setBizProtocol(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.Protocol"));
		data.setAppId(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.AppId"));
		data.setProjectId(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.ProjectId"));
		data.setIsBeian(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.IsBeian"));
		data.setId(_ctx.integerValue("CreateStudioAppDomainOpenResponse.Data.Id"));
		data.setTenantId(_ctx.stringValue("CreateStudioAppDomainOpenResponse.Data.TenantId"));
		createStudioAppDomainOpenResponse.setData(data);
	 
	 	return createStudioAppDomainOpenResponse;
	}
}