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

package com.aliyuncs.devops.transform.v20210625;

import com.aliyuncs.devops.model.v20210625.TriggerRepositoryMirrorSyncResponse;
import com.aliyuncs.devops.model.v20210625.TriggerRepositoryMirrorSyncResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class TriggerRepositoryMirrorSyncResponseUnmarshaller {

	public static TriggerRepositoryMirrorSyncResponse unmarshall(TriggerRepositoryMirrorSyncResponse triggerRepositoryMirrorSyncResponse, UnmarshallerContext _ctx) {
		
		triggerRepositoryMirrorSyncResponse.setErrorMessage(_ctx.stringValue("TriggerRepositoryMirrorSyncResponse.errorMessage"));
		triggerRepositoryMirrorSyncResponse.setRequestId(_ctx.stringValue("TriggerRepositoryMirrorSyncResponse.requestId"));
		triggerRepositoryMirrorSyncResponse.setSuccess(_ctx.booleanValue("TriggerRepositoryMirrorSyncResponse.success"));
		triggerRepositoryMirrorSyncResponse.setErrorCode(_ctx.stringValue("TriggerRepositoryMirrorSyncResponse.errorCode"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("TriggerRepositoryMirrorSyncResponse.result.result"));
		triggerRepositoryMirrorSyncResponse.setResult(result);
	 
	 	return triggerRepositoryMirrorSyncResponse;
	}
}