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

package com.aliyuncs.dyvms.transform.v20170620;

import com.aliyuncs.dyvms.model.v20170620.RequestExperienceVerifyCodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RequestExperienceVerifyCodeResponseUnmarshaller {

	public static RequestExperienceVerifyCodeResponse unmarshall(RequestExperienceVerifyCodeResponse requestExperienceVerifyCodeResponse, UnmarshallerContext _ctx) {
		
		requestExperienceVerifyCodeResponse.setRequestId(_ctx.stringValue("RequestExperienceVerifyCodeResponse.RequestId"));
		requestExperienceVerifyCodeResponse.setCode(_ctx.stringValue("RequestExperienceVerifyCodeResponse.code"));
		requestExperienceVerifyCodeResponse.setData(_ctx.stringValue("RequestExperienceVerifyCodeResponse.data"));
	 
	 	return requestExperienceVerifyCodeResponse;
	}
}