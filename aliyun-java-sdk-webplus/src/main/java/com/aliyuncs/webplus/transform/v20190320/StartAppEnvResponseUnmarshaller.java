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

import com.aliyuncs.webplus.model.v20190320.StartAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.StartAppEnvResponse.EnvChange;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartAppEnvResponseUnmarshaller {

	public static StartAppEnvResponse unmarshall(StartAppEnvResponse startAppEnvResponse, UnmarshallerContext _ctx) {
		
		startAppEnvResponse.setRequestId(_ctx.stringValue("StartAppEnvResponse.RequestId"));
		startAppEnvResponse.setCode(_ctx.stringValue("StartAppEnvResponse.Code"));
		startAppEnvResponse.setMessage(_ctx.stringValue("StartAppEnvResponse.Message"));

		EnvChange envChange = new EnvChange();
		envChange.setEnvId(_ctx.stringValue("StartAppEnvResponse.EnvChange.EnvId"));
		envChange.setChangeId(_ctx.stringValue("StartAppEnvResponse.EnvChange.ChangeId"));
		envChange.setStartTime(_ctx.stringValue("StartAppEnvResponse.EnvChange.StartTime"));
		startAppEnvResponse.setEnvChange(envChange);
	 
	 	return startAppEnvResponse;
	}
}