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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.DeployFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeployFileResponseUnmarshaller {

	public static DeployFileResponse unmarshall(DeployFileResponse deployFileResponse, UnmarshallerContext _ctx) {
		
		deployFileResponse.setRequestId(_ctx.stringValue("DeployFileResponse.RequestId"));
		deployFileResponse.setSuccess(_ctx.booleanValue("DeployFileResponse.Success"));
		deployFileResponse.setErrorCode(_ctx.stringValue("DeployFileResponse.ErrorCode"));
		deployFileResponse.setErrorMessage(_ctx.stringValue("DeployFileResponse.ErrorMessage"));
		deployFileResponse.setData(_ctx.longValue("DeployFileResponse.Data"));
		deployFileResponse.setHttpStatusCode(_ctx.integerValue("DeployFileResponse.HttpStatusCode"));
	 
	 	return deployFileResponse;
	}
}