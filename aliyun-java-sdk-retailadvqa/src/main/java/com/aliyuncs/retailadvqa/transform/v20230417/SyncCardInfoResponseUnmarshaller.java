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

import com.aliyuncs.retailadvqa.model.v20230417.SyncCardInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncCardInfoResponseUnmarshaller {

	public static SyncCardInfoResponse unmarshall(SyncCardInfoResponse syncCardInfoResponse, UnmarshallerContext _ctx) {
		
		syncCardInfoResponse.setRequestId(_ctx.stringValue("SyncCardInfoResponse.RequestId"));
		syncCardInfoResponse.setSuccess(_ctx.stringValue("SyncCardInfoResponse.Success"));
		syncCardInfoResponse.setHttpStatusCode(_ctx.stringValue("SyncCardInfoResponse.HttpStatusCode"));
		syncCardInfoResponse.setErrorCode(_ctx.stringValue("SyncCardInfoResponse.ErrorCode"));
		syncCardInfoResponse.setErrorMessage(_ctx.stringValue("SyncCardInfoResponse.ErrorMessage"));
	 
	 	return syncCardInfoResponse;
	}
}