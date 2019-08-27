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

import com.aliyuncs.webplus.model.v20190320.StopAppEnvResponse;
import com.aliyuncs.webplus.model.v20190320.StopAppEnvResponse.EnvChange;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopAppEnvResponseUnmarshaller {

	public static StopAppEnvResponse unmarshall(StopAppEnvResponse stopAppEnvResponse, UnmarshallerContext _ctx) {
		
		stopAppEnvResponse.setRequestId(_ctx.stringValue("StopAppEnvResponse.RequestId"));
		stopAppEnvResponse.setCode(_ctx.stringValue("StopAppEnvResponse.Code"));
		stopAppEnvResponse.setMessage(_ctx.stringValue("StopAppEnvResponse.Message"));

		EnvChange envChange = new EnvChange();
		envChange.setEnvId(_ctx.stringValue("StopAppEnvResponse.EnvChange.EnvId"));
		envChange.setChangeId(_ctx.stringValue("StopAppEnvResponse.EnvChange.ChangeId"));
		envChange.setStartTime(_ctx.stringValue("StopAppEnvResponse.EnvChange.StartTime"));
		stopAppEnvResponse.setEnvChange(envChange);
	 
	 	return stopAppEnvResponse;
	}
}