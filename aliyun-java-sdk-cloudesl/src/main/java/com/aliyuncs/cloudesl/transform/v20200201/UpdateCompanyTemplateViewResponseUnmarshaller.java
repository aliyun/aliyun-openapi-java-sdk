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

import com.aliyuncs.cloudesl.model.v20200201.UpdateCompanyTemplateViewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCompanyTemplateViewResponseUnmarshaller {

	public static UpdateCompanyTemplateViewResponse unmarshall(UpdateCompanyTemplateViewResponse updateCompanyTemplateViewResponse, UnmarshallerContext _ctx) {
		
		updateCompanyTemplateViewResponse.setRequestId(_ctx.stringValue("UpdateCompanyTemplateViewResponse.RequestId"));
		updateCompanyTemplateViewResponse.setErrorMessage(_ctx.stringValue("UpdateCompanyTemplateViewResponse.ErrorMessage"));
		updateCompanyTemplateViewResponse.setSuccess(_ctx.booleanValue("UpdateCompanyTemplateViewResponse.Success"));
		updateCompanyTemplateViewResponse.setErrorCode(_ctx.stringValue("UpdateCompanyTemplateViewResponse.ErrorCode"));
		updateCompanyTemplateViewResponse.setCode(_ctx.stringValue("UpdateCompanyTemplateViewResponse.Code"));
		updateCompanyTemplateViewResponse.setMessage(_ctx.stringValue("UpdateCompanyTemplateViewResponse.Message"));
		updateCompanyTemplateViewResponse.setDynamicMessage(_ctx.stringValue("UpdateCompanyTemplateViewResponse.DynamicMessage"));
		updateCompanyTemplateViewResponse.setDynamicCode(_ctx.stringValue("UpdateCompanyTemplateViewResponse.DynamicCode"));
	 
	 	return updateCompanyTemplateViewResponse;
	}
}