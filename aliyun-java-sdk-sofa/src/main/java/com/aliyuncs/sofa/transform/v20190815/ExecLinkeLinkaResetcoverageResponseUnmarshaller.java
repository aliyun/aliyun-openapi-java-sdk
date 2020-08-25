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

import com.aliyuncs.sofa.model.v20190815.ExecLinkeLinkaResetcoverageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecLinkeLinkaResetcoverageResponseUnmarshaller {

	public static ExecLinkeLinkaResetcoverageResponse unmarshall(ExecLinkeLinkaResetcoverageResponse execLinkeLinkaResetcoverageResponse, UnmarshallerContext _ctx) {
		
		execLinkeLinkaResetcoverageResponse.setRequestId(_ctx.stringValue("ExecLinkeLinkaResetcoverageResponse.RequestId"));
		execLinkeLinkaResetcoverageResponse.setResultCode(_ctx.stringValue("ExecLinkeLinkaResetcoverageResponse.ResultCode"));
		execLinkeLinkaResetcoverageResponse.setResultMessage(_ctx.stringValue("ExecLinkeLinkaResetcoverageResponse.ResultMessage"));
		execLinkeLinkaResetcoverageResponse.setErrorCode(_ctx.stringValue("ExecLinkeLinkaResetcoverageResponse.ErrorCode"));
		execLinkeLinkaResetcoverageResponse.setErrorMsg(_ctx.stringValue("ExecLinkeLinkaResetcoverageResponse.ErrorMsg"));
		execLinkeLinkaResetcoverageResponse.setResponseStatusCode(_ctx.longValue("ExecLinkeLinkaResetcoverageResponse.ResponseStatusCode"));
		execLinkeLinkaResetcoverageResponse.setSuccess(_ctx.booleanValue("ExecLinkeLinkaResetcoverageResponse.Success"));
	 
	 	return execLinkeLinkaResetcoverageResponse;
	}
}