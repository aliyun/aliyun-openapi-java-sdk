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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GrantTemplateAuthorityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GrantTemplateAuthorityResponseUnmarshaller {

	public static GrantTemplateAuthorityResponse unmarshall(GrantTemplateAuthorityResponse grantTemplateAuthorityResponse, UnmarshallerContext _ctx) {
		
		grantTemplateAuthorityResponse.setRequestId(_ctx.stringValue("GrantTemplateAuthorityResponse.RequestId"));
		grantTemplateAuthorityResponse.setSuccess(_ctx.booleanValue("GrantTemplateAuthorityResponse.Success"));
		grantTemplateAuthorityResponse.setErrorMessage(_ctx.stringValue("GrantTemplateAuthorityResponse.ErrorMessage"));
		grantTemplateAuthorityResponse.setErrorCode(_ctx.stringValue("GrantTemplateAuthorityResponse.ErrorCode"));
		grantTemplateAuthorityResponse.setResult(_ctx.booleanValue("GrantTemplateAuthorityResponse.Result"));
	 
	 	return grantTemplateAuthorityResponse;
	}
}