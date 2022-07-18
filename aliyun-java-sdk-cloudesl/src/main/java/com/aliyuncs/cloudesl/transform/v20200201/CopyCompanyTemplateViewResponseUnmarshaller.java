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

import com.aliyuncs.cloudesl.model.v20200201.CopyCompanyTemplateViewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CopyCompanyTemplateViewResponseUnmarshaller {

	public static CopyCompanyTemplateViewResponse unmarshall(CopyCompanyTemplateViewResponse copyCompanyTemplateViewResponse, UnmarshallerContext _ctx) {
		
		copyCompanyTemplateViewResponse.setRequestId(_ctx.stringValue("CopyCompanyTemplateViewResponse.RequestId"));
		copyCompanyTemplateViewResponse.setErrorMessage(_ctx.stringValue("CopyCompanyTemplateViewResponse.ErrorMessage"));
		copyCompanyTemplateViewResponse.setSuccess(_ctx.booleanValue("CopyCompanyTemplateViewResponse.Success"));
		copyCompanyTemplateViewResponse.setErrorCode(_ctx.stringValue("CopyCompanyTemplateViewResponse.ErrorCode"));
		copyCompanyTemplateViewResponse.setCode(_ctx.stringValue("CopyCompanyTemplateViewResponse.Code"));
		copyCompanyTemplateViewResponse.setMessage(_ctx.stringValue("CopyCompanyTemplateViewResponse.Message"));
		copyCompanyTemplateViewResponse.setDynamicMessage(_ctx.stringValue("CopyCompanyTemplateViewResponse.DynamicMessage"));
		copyCompanyTemplateViewResponse.setDynamicCode(_ctx.stringValue("CopyCompanyTemplateViewResponse.DynamicCode"));
	 
	 	return copyCompanyTemplateViewResponse;
	}
}