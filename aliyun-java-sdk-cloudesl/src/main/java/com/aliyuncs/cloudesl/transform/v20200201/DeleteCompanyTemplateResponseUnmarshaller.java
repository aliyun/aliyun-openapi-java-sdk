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

import com.aliyuncs.cloudesl.model.v20200201.DeleteCompanyTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCompanyTemplateResponseUnmarshaller {

	public static DeleteCompanyTemplateResponse unmarshall(DeleteCompanyTemplateResponse deleteCompanyTemplateResponse, UnmarshallerContext _ctx) {
		
		deleteCompanyTemplateResponse.setRequestId(_ctx.stringValue("DeleteCompanyTemplateResponse.RequestId"));
		deleteCompanyTemplateResponse.setErrorMessage(_ctx.stringValue("DeleteCompanyTemplateResponse.ErrorMessage"));
		deleteCompanyTemplateResponse.setSuccess(_ctx.booleanValue("DeleteCompanyTemplateResponse.Success"));
		deleteCompanyTemplateResponse.setErrorCode(_ctx.stringValue("DeleteCompanyTemplateResponse.ErrorCode"));
		deleteCompanyTemplateResponse.setCode(_ctx.stringValue("DeleteCompanyTemplateResponse.Code"));
		deleteCompanyTemplateResponse.setMessage(_ctx.stringValue("DeleteCompanyTemplateResponse.Message"));
		deleteCompanyTemplateResponse.setDynamicMessage(_ctx.stringValue("DeleteCompanyTemplateResponse.DynamicMessage"));
		deleteCompanyTemplateResponse.setDynamicCode(_ctx.stringValue("DeleteCompanyTemplateResponse.DynamicCode"));
	 
	 	return deleteCompanyTemplateResponse;
	}
}