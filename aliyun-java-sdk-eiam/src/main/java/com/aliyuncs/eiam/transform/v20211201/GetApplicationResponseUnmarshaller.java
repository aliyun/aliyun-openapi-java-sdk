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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.GetApplicationResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));

		Application application = new Application();
		application.setInstanceId(_ctx.stringValue("GetApplicationResponse.Application.InstanceId"));
		application.setApplicationId(_ctx.stringValue("GetApplicationResponse.Application.ApplicationId"));
		application.setClientId(_ctx.stringValue("GetApplicationResponse.Application.ClientId"));
		application.setLogoUrl(_ctx.stringValue("GetApplicationResponse.Application.LogoUrl"));
		application.setApplicationName(_ctx.stringValue("GetApplicationResponse.Application.ApplicationName"));
		application.setDescription(_ctx.stringValue("GetApplicationResponse.Application.Description"));
		application.setApplicationSourceType(_ctx.stringValue("GetApplicationResponse.Application.ApplicationSourceType"));
		application.setSsoType(_ctx.stringValue("GetApplicationResponse.Application.SsoType"));
		application.setFeatures(_ctx.stringValue("GetApplicationResponse.Application.Features"));
		application.setStatus(_ctx.stringValue("GetApplicationResponse.Application.Status"));
		application.setCreateTime(_ctx.longValue("GetApplicationResponse.Application.CreateTime"));
		application.setUpdateTime(_ctx.longValue("GetApplicationResponse.Application.UpdateTime"));
		application.setAuthorizationType(_ctx.stringValue("GetApplicationResponse.Application.AuthorizationType"));
		application.setApiInvokeStatus(_ctx.stringValue("GetApplicationResponse.Application.ApiInvokeStatus"));
		getApplicationResponse.setApplication(application);
	 
	 	return getApplicationResponse;
	}
}