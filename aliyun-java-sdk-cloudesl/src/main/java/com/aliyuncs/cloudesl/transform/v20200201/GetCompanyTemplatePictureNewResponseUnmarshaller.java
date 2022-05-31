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

import com.aliyuncs.cloudesl.model.v20200201.GetCompanyTemplatePictureNewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyTemplatePictureNewResponseUnmarshaller {

	public static GetCompanyTemplatePictureNewResponse unmarshall(GetCompanyTemplatePictureNewResponse getCompanyTemplatePictureNewResponse, UnmarshallerContext _ctx) {
		
		getCompanyTemplatePictureNewResponse.setRequestId(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.RequestId"));
		getCompanyTemplatePictureNewResponse.setBase64Picture(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.Base64Picture"));
		getCompanyTemplatePictureNewResponse.setJobId(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.JobId"));
		getCompanyTemplatePictureNewResponse.setType(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.Type"));
		getCompanyTemplatePictureNewResponse.setUrl(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.Url"));
		getCompanyTemplatePictureNewResponse.setSuccess(_ctx.booleanValue("GetCompanyTemplatePictureNewResponse.Success"));
		getCompanyTemplatePictureNewResponse.setMessage(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.Message"));
		getCompanyTemplatePictureNewResponse.setErrorCode(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.ErrorCode"));
		getCompanyTemplatePictureNewResponse.setErrorMessage(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.ErrorMessage"));
		getCompanyTemplatePictureNewResponse.setCode(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.Code"));
		getCompanyTemplatePictureNewResponse.setDynamicCode(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.DynamicCode"));
		getCompanyTemplatePictureNewResponse.setDynamicMessage(_ctx.stringValue("GetCompanyTemplatePictureNewResponse.DynamicMessage"));
	 
	 	return getCompanyTemplatePictureNewResponse;
	}
}