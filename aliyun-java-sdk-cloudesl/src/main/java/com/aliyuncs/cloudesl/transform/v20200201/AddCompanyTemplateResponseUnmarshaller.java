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

import com.aliyuncs.cloudesl.model.v20200201.AddCompanyTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCompanyTemplateResponseUnmarshaller {

	public static AddCompanyTemplateResponse unmarshall(AddCompanyTemplateResponse addCompanyTemplateResponse, UnmarshallerContext _ctx) {
		
		addCompanyTemplateResponse.setRequestId(_ctx.stringValue("AddCompanyTemplateResponse.RequestId"));
		addCompanyTemplateResponse.setErrorMessage(_ctx.stringValue("AddCompanyTemplateResponse.ErrorMessage"));
		addCompanyTemplateResponse.setSuccess(_ctx.booleanValue("AddCompanyTemplateResponse.Success"));
		addCompanyTemplateResponse.setErrorCode(_ctx.stringValue("AddCompanyTemplateResponse.ErrorCode"));
		addCompanyTemplateResponse.setCode(_ctx.stringValue("AddCompanyTemplateResponse.Code"));
		addCompanyTemplateResponse.setMessage(_ctx.stringValue("AddCompanyTemplateResponse.Message"));
		addCompanyTemplateResponse.setDynamicMessage(_ctx.stringValue("AddCompanyTemplateResponse.DynamicMessage"));
		addCompanyTemplateResponse.setDynamicCode(_ctx.stringValue("AddCompanyTemplateResponse.DynamicCode"));
	 
	 	return addCompanyTemplateResponse;
	}
}