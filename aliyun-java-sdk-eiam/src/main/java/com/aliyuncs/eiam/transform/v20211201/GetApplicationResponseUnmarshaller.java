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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetApplicationResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationResponse.Application;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationResponseUnmarshaller {

	public static GetApplicationResponse unmarshall(GetApplicationResponse getApplicationResponse, UnmarshallerContext _ctx) {
		
		getApplicationResponse.setRequestId(_ctx.stringValue("GetApplicationResponse.RequestId"));

		Application application = new Application();
		application.setApiInvokeStatus(_ctx.stringValue("GetApplicationResponse.Application.ApiInvokeStatus"));
		application.setApplicationId(_ctx.stringValue("GetApplicationResponse.Application.ApplicationId"));
		application.setApplicationName(_ctx.stringValue("GetApplicationResponse.Application.ApplicationName"));
		application.setApplicationSourceType(_ctx.stringValue("GetApplicationResponse.Application.ApplicationSourceType"));
		application.setApplicationTemplateId(_ctx.stringValue("GetApplicationResponse.Application.ApplicationTemplateId"));
		application.setAuthorizationType(_ctx.stringValue("GetApplicationResponse.Application.AuthorizationType"));
		application.setClientId(_ctx.stringValue("GetApplicationResponse.Application.ClientId"));
		application.setCreateTime(_ctx.longValue("GetApplicationResponse.Application.CreateTime"));
		application.setDescription(_ctx.stringValue("GetApplicationResponse.Application.Description"));
		application.setFeatures(_ctx.stringValue("GetApplicationResponse.Application.Features"));
		application.setInstanceId(_ctx.stringValue("GetApplicationResponse.Application.InstanceId"));
		application.setLogoUrl(_ctx.stringValue("GetApplicationResponse.Application.LogoUrl"));
		application.setManagedServiceCode(_ctx.stringValue("GetApplicationResponse.Application.ManagedServiceCode"));
		application.setServiceManaged(_ctx.booleanValue("GetApplicationResponse.Application.ServiceManaged"));
		application.setSsoType(_ctx.stringValue("GetApplicationResponse.Application.SsoType"));
		application.setStatus(_ctx.stringValue("GetApplicationResponse.Application.Status"));
		application.setUpdateTime(_ctx.longValue("GetApplicationResponse.Application.UpdateTime"));
		application.setM2MClientStatus(_ctx.stringValue("GetApplicationResponse.Application.M2MClientStatus"));
		application.setResourceServerStatus(_ctx.stringValue("GetApplicationResponse.Application.ResourceServerStatus"));
		application.setResourceServerIdentifier(_ctx.stringValue("GetApplicationResponse.Application.ResourceServerIdentifier"));
		application.setCustomSubjectStatus(_ctx.stringValue("GetApplicationResponse.Application.CustomSubjectStatus"));

		List<String> applicationVisibility = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationResponse.Application.ApplicationVisibility.Length"); i++) {
			applicationVisibility.add(_ctx.stringValue("GetApplicationResponse.Application.ApplicationVisibility["+ i +"]"));
		}
		application.setApplicationVisibility(applicationVisibility);
		getApplicationResponse.setApplication(application);
	 
	 	return getApplicationResponse;
	}
}