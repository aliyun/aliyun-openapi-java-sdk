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

package com.aliyuncs.retailadvqa.transform.v20230417;

import com.aliyuncs.retailadvqa.model.v20230417.SyncMemberBehaviorInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncMemberBehaviorInfoResponseUnmarshaller {

	public static SyncMemberBehaviorInfoResponse unmarshall(SyncMemberBehaviorInfoResponse syncMemberBehaviorInfoResponse, UnmarshallerContext _ctx) {
		
		syncMemberBehaviorInfoResponse.setRequestId(_ctx.stringValue("SyncMemberBehaviorInfoResponse.RequestId"));
		syncMemberBehaviorInfoResponse.setSuccess(_ctx.booleanValue("SyncMemberBehaviorInfoResponse.Success"));
		syncMemberBehaviorInfoResponse.setHttpStatusCode(_ctx.stringValue("SyncMemberBehaviorInfoResponse.HttpStatusCode"));
		syncMemberBehaviorInfoResponse.setErrorCode(_ctx.stringValue("SyncMemberBehaviorInfoResponse.ErrorCode"));
		syncMemberBehaviorInfoResponse.setErrorMessage(_ctx.stringValue("SyncMemberBehaviorInfoResponse.ErrorMessage"));
		syncMemberBehaviorInfoResponse.setMessage(_ctx.stringValue("SyncMemberBehaviorInfoResponse.Message"));
	 
	 	return syncMemberBehaviorInfoResponse;
	}
}