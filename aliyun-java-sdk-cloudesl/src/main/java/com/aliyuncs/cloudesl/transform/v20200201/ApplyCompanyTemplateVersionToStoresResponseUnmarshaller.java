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

package com.aliyuncs.cloudesl.transform.v20200201;

import com.aliyuncs.cloudesl.model.v20200201.ApplyCompanyTemplateVersionToStoresResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyCompanyTemplateVersionToStoresResponseUnmarshaller {

	public static ApplyCompanyTemplateVersionToStoresResponse unmarshall(ApplyCompanyTemplateVersionToStoresResponse applyCompanyTemplateVersionToStoresResponse, UnmarshallerContext _ctx) {
		
		applyCompanyTemplateVersionToStoresResponse.setRequestId(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.RequestId"));
		applyCompanyTemplateVersionToStoresResponse.setErrorMessage(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.ErrorMessage"));
		applyCompanyTemplateVersionToStoresResponse.setSuccess(_ctx.booleanValue("ApplyCompanyTemplateVersionToStoresResponse.Success"));
		applyCompanyTemplateVersionToStoresResponse.setErrorCode(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.ErrorCode"));
		applyCompanyTemplateVersionToStoresResponse.setCode(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.Code"));
		applyCompanyTemplateVersionToStoresResponse.setMessage(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.Message"));
		applyCompanyTemplateVersionToStoresResponse.setDynamicMessage(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.DynamicMessage"));
		applyCompanyTemplateVersionToStoresResponse.setDynamicCode(_ctx.stringValue("ApplyCompanyTemplateVersionToStoresResponse.DynamicCode"));
	 
	 	return applyCompanyTemplateVersionToStoresResponse;
	}
}