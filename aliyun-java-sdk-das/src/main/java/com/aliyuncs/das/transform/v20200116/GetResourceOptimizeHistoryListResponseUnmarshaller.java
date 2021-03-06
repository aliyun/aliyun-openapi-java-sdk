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

import com.aliyuncs.das.model.v20200116.GetResourceOptimizeHistoryListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResourceOptimizeHistoryListResponseUnmarshaller {

	public static GetResourceOptimizeHistoryListResponse unmarshall(GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryListResponse, UnmarshallerContext _ctx) {
		
		getResourceOptimizeHistoryListResponse.setRequestId(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.RequestId"));
		getResourceOptimizeHistoryListResponse.setCode(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.Code"));
		getResourceOptimizeHistoryListResponse.setData(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.Data"));
		getResourceOptimizeHistoryListResponse.setMessage(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.Message"));
		getResourceOptimizeHistoryListResponse.setSynchro(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.Synchro"));
		getResourceOptimizeHistoryListResponse.setSuccess(_ctx.stringValue("GetResourceOptimizeHistoryListResponse.Success"));
	 
	 	return getResourceOptimizeHistoryListResponse;
	}
}