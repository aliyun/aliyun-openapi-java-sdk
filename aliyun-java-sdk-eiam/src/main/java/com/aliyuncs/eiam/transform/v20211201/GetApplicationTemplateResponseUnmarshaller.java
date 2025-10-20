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

import com.aliyuncs.eiam.model.v20211201.GetApplicationTemplateResponse;
import com.aliyuncs.eiam.model.v20211201.GetApplicationTemplateResponse.ApplicationTemplate;
import com.aliyuncs.eiam.model.v20211201.GetApplicationTemplateResponse.ApplicationTemplate.SaleInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationTemplateResponseUnmarshaller {

	public static GetApplicationTemplateResponse unmarshall(GetApplicationTemplateResponse getApplicationTemplateResponse, UnmarshallerContext _ctx) {
		
		getApplicationTemplateResponse.setRequestId(_ctx.stringValue("GetApplicationTemplateResponse.RequestId"));

		ApplicationTemplate applicationTemplate = new ApplicationTemplate();
		applicationTemplate.setApplicationTemplateId(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.ApplicationTemplateId"));
		applicationTemplate.setApplicationTemplateName(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.ApplicationTemplateName"));
		applicationTemplate.setDescription(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.Description"));
		applicationTemplate.setLogoUrl(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.LogoUrl"));
		applicationTemplate.setHelpDocumentUrl(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.HelpDocumentUrl"));
		applicationTemplate.setCreateTime(_ctx.longValue("GetApplicationTemplateResponse.ApplicationTemplate.CreateTime"));
		applicationTemplate.setUpdateTime(_ctx.longValue("GetApplicationTemplateResponse.ApplicationTemplate.UpdateTime"));
		applicationTemplate.setServiceManaged(_ctx.booleanValue("GetApplicationTemplateResponse.ApplicationTemplate.ServiceManaged"));
		applicationTemplate.setManagedServiceCode(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.ManagedServiceCode"));
		applicationTemplate.setServiceConsoleUrl(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.ServiceConsoleUrl"));

		List<String> ssoTypes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationTemplateResponse.ApplicationTemplate.SsoTypes.Length"); i++) {
			ssoTypes.add(_ctx.stringValue("GetApplicationTemplateResponse.ApplicationTemplate.SsoTypes["+ i +"]"));
		}
		applicationTemplate.setSsoTypes(ssoTypes);

		SaleInfo saleInfo = new SaleInfo();
		saleInfo.setAlwaysFree(_ctx.booleanValue("GetApplicationTemplateResponse.ApplicationTemplate.SaleInfo.AlwaysFree"));
		applicationTemplate.setSaleInfo(saleInfo);
		getApplicationTemplateResponse.setApplicationTemplate(applicationTemplate);
	 
	 	return getApplicationTemplateResponse;
	}
}