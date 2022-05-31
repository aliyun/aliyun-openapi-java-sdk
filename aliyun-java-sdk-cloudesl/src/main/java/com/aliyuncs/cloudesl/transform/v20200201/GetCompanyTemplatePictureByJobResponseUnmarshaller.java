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

import com.aliyuncs.cloudesl.model.v20200201.GetCompanyTemplatePictureByJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyTemplatePictureByJobResponseUnmarshaller {

	public static GetCompanyTemplatePictureByJobResponse unmarshall(GetCompanyTemplatePictureByJobResponse getCompanyTemplatePictureByJobResponse, UnmarshallerContext _ctx) {
		
		getCompanyTemplatePictureByJobResponse.setRequestId(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.RequestId"));
		getCompanyTemplatePictureByJobResponse.setBase64Picture(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.Base64Picture"));
		getCompanyTemplatePictureByJobResponse.setJobId(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.JobId"));
		getCompanyTemplatePictureByJobResponse.setType(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.Type"));
		getCompanyTemplatePictureByJobResponse.setUrl(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.Url"));
		getCompanyTemplatePictureByJobResponse.setSuccess(_ctx.booleanValue("GetCompanyTemplatePictureByJobResponse.Success"));
		getCompanyTemplatePictureByJobResponse.setMessage(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.Message"));
		getCompanyTemplatePictureByJobResponse.setErrorCode(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.ErrorCode"));
		getCompanyTemplatePictureByJobResponse.setErrorMessage(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.ErrorMessage"));
		getCompanyTemplatePictureByJobResponse.setCode(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.Code"));
		getCompanyTemplatePictureByJobResponse.setDynamicCode(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.DynamicCode"));
		getCompanyTemplatePictureByJobResponse.setDynamicMessage(_ctx.stringValue("GetCompanyTemplatePictureByJobResponse.DynamicMessage"));
	 
	 	return getCompanyTemplatePictureByJobResponse;
	}
}