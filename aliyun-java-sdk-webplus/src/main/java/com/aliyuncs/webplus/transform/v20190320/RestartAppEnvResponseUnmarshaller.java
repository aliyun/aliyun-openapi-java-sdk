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

import com.aliyuncs.webplus.model.v20190320.RestartAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.RestartAppEnvResponse.EnvChange;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestartAppEnvResponseUnmarshaller {

	public static RestartAppEnvResponse unmarshall(RestartAppEnvResponse restartAppEnvResponse, UnmarshallerContext _ctx) {
		
		restartAppEnvResponse.setRequestId(_ctx.stringValue("RestartAppEnvResponse.RequestId"));
		restartAppEnvResponse.setCode(_ctx.stringValue("RestartAppEnvResponse.Code"));
		restartAppEnvResponse.setMessage(_ctx.stringValue("RestartAppEnvResponse.Message"));

		EnvChange envChange = new EnvChange();
		envChange.setEnvId(_ctx.stringValue("RestartAppEnvResponse.EnvChange.EnvId"));
		envChange.setChangeId(_ctx.stringValue("RestartAppEnvResponse.EnvChange.ChangeId"));
		envChange.setStartTime(_ctx.stringValue("RestartAppEnvResponse.EnvChange.StartTime"));
		restartAppEnvResponse.setEnvChange(envChange);
	 
	 	return restartAppEnvResponse;
	}
}