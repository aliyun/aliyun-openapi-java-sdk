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

import com.aliyuncs.cloudesl.model.v20200201.GetCompanyTemplatePictureResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyTemplatePictureResponseUnmarshaller {

	public static GetCompanyTemplatePictureResponse unmarshall(GetCompanyTemplatePictureResponse getCompanyTemplatePictureResponse, UnmarshallerContext _ctx) {
		
		getCompanyTemplatePictureResponse.setRequestId(_ctx.stringValue("GetCompanyTemplatePictureResponse.RequestId"));
		getCompanyTemplatePictureResponse.setErrorMessage(_ctx.stringValue("GetCompanyTemplatePictureResponse.ErrorMessage"));
		getCompanyTemplatePictureResponse.setSuccess(_ctx.booleanValue("GetCompanyTemplatePictureResponse.Success"));
		getCompanyTemplatePictureResponse.setErrorCode(_ctx.stringValue("GetCompanyTemplatePictureResponse.ErrorCode"));
		getCompanyTemplatePictureResponse.setCode(_ctx.stringValue("GetCompanyTemplatePictureResponse.Code"));
		getCompanyTemplatePictureResponse.setBase64Picture(_ctx.stringValue("GetCompanyTemplatePictureResponse.Base64Picture"));
		getCompanyTemplatePictureResponse.setMessage(_ctx.stringValue("GetCompanyTemplatePictureResponse.Message"));
		getCompanyTemplatePictureResponse.setDynamicMessage(_ctx.stringValue("GetCompanyTemplatePictureResponse.DynamicMessage"));
		getCompanyTemplatePictureResponse.setDynamicCode(_ctx.stringValue("GetCompanyTemplatePictureResponse.DynamicCode"));
	 
	 	return getCompanyTemplatePictureResponse;
	}
}