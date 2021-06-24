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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryDeployTaskResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryDeployTaskResponse.QueryDeployTaskResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryDeployTaskResponseUnmarshaller {

	public static OpsQueryDeployTaskResponse unmarshall(OpsQueryDeployTaskResponse opsQueryDeployTaskResponse, UnmarshallerContext _ctx) {
		
		opsQueryDeployTaskResponse.setRequestId(_ctx.stringValue("OpsQueryDeployTaskResponse.RequestId"));
		opsQueryDeployTaskResponse.setCode(_ctx.stringValue("OpsQueryDeployTaskResponse.Code"));
		opsQueryDeployTaskResponse.setMessage(_ctx.stringValue("OpsQueryDeployTaskResponse.Message"));

		QueryDeployTaskResult queryDeployTaskResult = new QueryDeployTaskResult();
		queryDeployTaskResult.setTaskStatus(_ctx.stringValue("OpsQueryDeployTaskResponse.QueryDeployTaskResult.TaskStatus"));
		queryDeployTaskResult.setTaskMsg(_ctx.stringValue("OpsQueryDeployTaskResponse.QueryDeployTaskResult.TaskMsg"));
		opsQueryDeployTaskResponse.setQueryDeployTaskResult(queryDeployTaskResult);
	 
	 	return opsQueryDeployTaskResponse;
	}
}