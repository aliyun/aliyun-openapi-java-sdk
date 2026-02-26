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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.ResumeLocationServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeLocationServiceResponseUnmarshaller {

	public static ResumeLocationServiceResponse unmarshall(ResumeLocationServiceResponse resumeLocationServiceResponse, UnmarshallerContext _ctx) {
		
		resumeLocationServiceResponse.setRequestId(_ctx.stringValue("ResumeLocationServiceResponse.RequestId"));
		resumeLocationServiceResponse.setSuccess(_ctx.booleanValue("ResumeLocationServiceResponse.Success"));
		resumeLocationServiceResponse.setCode(_ctx.stringValue("ResumeLocationServiceResponse.Code"));
		resumeLocationServiceResponse.setMessage(_ctx.stringValue("ResumeLocationServiceResponse.Message"));
		resumeLocationServiceResponse.setErrorName(_ctx.stringValue("ResumeLocationServiceResponse.ErrorName"));
		resumeLocationServiceResponse.setHttpCode(_ctx.integerValue("ResumeLocationServiceResponse.HttpCode"));
		resumeLocationServiceResponse.setData(_ctx.booleanValue("ResumeLocationServiceResponse.Data"));
	 
	 	return resumeLocationServiceResponse;
	}
}