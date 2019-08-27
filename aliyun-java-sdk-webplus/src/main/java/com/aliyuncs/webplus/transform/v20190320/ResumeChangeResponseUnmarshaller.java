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

package com.aliyuncs.webplus.transform.v20190320;

import com.aliyuncs.webplus.model.v20190320.ResumeChangeResponse;
import com.aliyuncs.webplus.model.v20190320.ResumeChangeResponse.EnvChange;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResumeChangeResponseUnmarshaller {

	public static ResumeChangeResponse unmarshall(ResumeChangeResponse resumeChangeResponse, UnmarshallerContext _ctx) {
		
		resumeChangeResponse.setRequestId(_ctx.stringValue("ResumeChangeResponse.RequestId"));
		resumeChangeResponse.setCode(_ctx.stringValue("ResumeChangeResponse.Code"));
		resumeChangeResponse.setMessage(_ctx.stringValue("ResumeChangeResponse.Message"));

		EnvChange envChange = new EnvChange();
		envChange.setEnvId(_ctx.stringValue("ResumeChangeResponse.EnvChange.EnvId"));
		envChange.setChangeId(_ctx.stringValue("ResumeChangeResponse.EnvChange.ChangeId"));
		envChange.setStartTime(_ctx.stringValue("ResumeChangeResponse.EnvChange.StartTime"));
		resumeChangeResponse.setEnvChange(envChange);
	 
	 	return resumeChangeResponse;
	}
}