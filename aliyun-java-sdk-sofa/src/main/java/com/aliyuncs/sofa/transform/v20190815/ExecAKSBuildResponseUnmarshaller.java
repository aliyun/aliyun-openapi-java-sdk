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

import com.aliyuncs.sofa.model.v20190815.ExecAKSBuildResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecAKSBuildResponseUnmarshaller {

	public static ExecAKSBuildResponse unmarshall(ExecAKSBuildResponse execAKSBuildResponse, UnmarshallerContext _ctx) {
		
		execAKSBuildResponse.setRequestId(_ctx.stringValue("ExecAKSBuildResponse.RequestId"));
		execAKSBuildResponse.setResultCode(_ctx.stringValue("ExecAKSBuildResponse.ResultCode"));
		execAKSBuildResponse.setResultMessage(_ctx.stringValue("ExecAKSBuildResponse.ResultMessage"));
		execAKSBuildResponse.setAppId(_ctx.stringValue("ExecAKSBuildResponse.AppId"));
		execAKSBuildResponse.setBuildNumber(_ctx.longValue("ExecAKSBuildResponse.BuildNumber"));
		execAKSBuildResponse.setMessage(_ctx.stringValue("ExecAKSBuildResponse.Message"));
		execAKSBuildResponse.setStatus(_ctx.stringValue("ExecAKSBuildResponse.Status"));
		execAKSBuildResponse.setToken(_ctx.stringValue("ExecAKSBuildResponse.Token"));
	 
	 	return execAKSBuildResponse;
	}
}