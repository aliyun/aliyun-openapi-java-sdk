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

import com.aliyuncs.cloudesl.model.v20200201.UpdateCompanyTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCompanyTemplateResponseUnmarshaller {

	public static UpdateCompanyTemplateResponse unmarshall(UpdateCompanyTemplateResponse updateCompanyTemplateResponse, UnmarshallerContext _ctx) {
		
		updateCompanyTemplateResponse.setRequestId(_ctx.stringValue("UpdateCompanyTemplateResponse.RequestId"));
		updateCompanyTemplateResponse.setErrorMessage(_ctx.stringValue("UpdateCompanyTemplateResponse.ErrorMessage"));
		updateCompanyTemplateResponse.setSuccess(_ctx.booleanValue("UpdateCompanyTemplateResponse.Success"));
		updateCompanyTemplateResponse.setErrorCode(_ctx.stringValue("UpdateCompanyTemplateResponse.ErrorCode"));
		updateCompanyTemplateResponse.setCode(_ctx.stringValue("UpdateCompanyTemplateResponse.Code"));
		updateCompanyTemplateResponse.setMessage(_ctx.stringValue("UpdateCompanyTemplateResponse.Message"));
		updateCompanyTemplateResponse.setDynamicMessage(_ctx.stringValue("UpdateCompanyTemplateResponse.DynamicMessage"));
		updateCompanyTemplateResponse.setDynamicCode(_ctx.stringValue("UpdateCompanyTemplateResponse.DynamicCode"));
	 
	 	return updateCompanyTemplateResponse;
	}
}