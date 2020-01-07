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

package com.aliyuncs.retailcloud.transform.v20180313;

import com.aliyuncs.retailcloud.model.v20180313.ResumeDeployResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeDeployResponseUnmarshaller {

	public static ResumeDeployResponse unmarshall(ResumeDeployResponse resumeDeployResponse, UnmarshallerContext _ctx) {
		
		resumeDeployResponse.setRequestId(_ctx.stringValue("ResumeDeployResponse.RequestId"));
		resumeDeployResponse.setCode(_ctx.integerValue("ResumeDeployResponse.Code"));
		resumeDeployResponse.setErrMsg(_ctx.stringValue("ResumeDeployResponse.ErrMsg"));
		resumeDeployResponse.setSuccess(_ctx.booleanValue("ResumeDeployResponse.Success"));
	 
	 	return resumeDeployResponse;
	}
}