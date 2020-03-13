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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.GetIAMCurrentAccessorResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIAMCurrentAccessorResponseUnmarshaller {

	public static GetIAMCurrentAccessorResponse unmarshall(GetIAMCurrentAccessorResponse getIAMCurrentAccessorResponse, UnmarshallerContext _ctx) {
		
		getIAMCurrentAccessorResponse.setRequestId(_ctx.stringValue("GetIAMCurrentAccessorResponse.RequestId"));
		getIAMCurrentAccessorResponse.setResultCode(_ctx.stringValue("GetIAMCurrentAccessorResponse.ResultCode"));
		getIAMCurrentAccessorResponse.setResultMessage(_ctx.stringValue("GetIAMCurrentAccessorResponse.ResultMessage"));
		getIAMCurrentAccessorResponse.setId(_ctx.stringValue("GetIAMCurrentAccessorResponse.Id"));
		getIAMCurrentAccessorResponse.setLoginName(_ctx.stringValue("GetIAMCurrentAccessorResponse.LoginName"));
		getIAMCurrentAccessorResponse.setName(_ctx.stringValue("GetIAMCurrentAccessorResponse.Name"));
		getIAMCurrentAccessorResponse.setTenant(_ctx.stringValue("GetIAMCurrentAccessorResponse.Tenant"));
		getIAMCurrentAccessorResponse.setType(_ctx.stringValue("GetIAMCurrentAccessorResponse.Type"));
	 
	 	return getIAMCurrentAccessorResponse;
	}
}