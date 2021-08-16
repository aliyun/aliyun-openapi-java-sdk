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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.StopOrRollbackOptimizeTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopOrRollbackOptimizeTaskResponseUnmarshaller {

	public static StopOrRollbackOptimizeTaskResponse unmarshall(StopOrRollbackOptimizeTaskResponse stopOrRollbackOptimizeTaskResponse, UnmarshallerContext _ctx) {
		
		stopOrRollbackOptimizeTaskResponse.setRequestId(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.RequestId"));
		stopOrRollbackOptimizeTaskResponse.setMessage(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.Message"));
		stopOrRollbackOptimizeTaskResponse.setSynchro(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.Synchro"));
		stopOrRollbackOptimizeTaskResponse.setData(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.Data"));
		stopOrRollbackOptimizeTaskResponse.setCode(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.Code"));
		stopOrRollbackOptimizeTaskResponse.setSuccess(_ctx.stringValue("StopOrRollbackOptimizeTaskResponse.Success"));
	 
	 	return stopOrRollbackOptimizeTaskResponse;
	}
}