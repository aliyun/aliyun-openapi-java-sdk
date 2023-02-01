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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.SyncAllEduInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncAllEduInfoResponseUnmarshaller {

	public static SyncAllEduInfoResponse unmarshall(SyncAllEduInfoResponse syncAllEduInfoResponse, UnmarshallerContext _ctx) {
		
		syncAllEduInfoResponse.setRequestId(_ctx.stringValue("SyncAllEduInfoResponse.RequestId"));
		syncAllEduInfoResponse.setData(_ctx.stringValue("SyncAllEduInfoResponse.Data"));
		syncAllEduInfoResponse.setSuccess(_ctx.booleanValue("SyncAllEduInfoResponse.Success"));
		syncAllEduInfoResponse.setCode(_ctx.stringValue("SyncAllEduInfoResponse.Code"));
		syncAllEduInfoResponse.setMessage(_ctx.stringValue("SyncAllEduInfoResponse.Message"));
		syncAllEduInfoResponse.setHttpStatusCode(_ctx.integerValue("SyncAllEduInfoResponse.HttpStatusCode"));
	 
	 	return syncAllEduInfoResponse;
	}
}