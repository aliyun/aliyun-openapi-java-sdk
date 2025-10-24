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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.DelCacheOperateSyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DelCacheOperateSyncResponseUnmarshaller {

	public static DelCacheOperateSyncResponse unmarshall(DelCacheOperateSyncResponse delCacheOperateSyncResponse, UnmarshallerContext _ctx) {
		
		delCacheOperateSyncResponse.setRequestId(_ctx.stringValue("DelCacheOperateSyncResponse.RequestId"));
		delCacheOperateSyncResponse.setMessage(_ctx.stringValue("DelCacheOperateSyncResponse.Message"));
		delCacheOperateSyncResponse.setData(_ctx.stringValue("DelCacheOperateSyncResponse.Data"));
		delCacheOperateSyncResponse.setCode(_ctx.stringValue("DelCacheOperateSyncResponse.Code"));
		delCacheOperateSyncResponse.setSuccess(_ctx.booleanValue("DelCacheOperateSyncResponse.Success"));
	 
	 	return delCacheOperateSyncResponse;
	}
}