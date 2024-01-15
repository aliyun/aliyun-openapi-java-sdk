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

package com.aliyuncs.trademark.transform.v20190902;

import com.aliyuncs.trademark.model.v20190902.QueryAliyunUidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAliyunUidResponseUnmarshaller {

	public static QueryAliyunUidResponse unmarshall(QueryAliyunUidResponse queryAliyunUidResponse, UnmarshallerContext _ctx) {
		
		queryAliyunUidResponse.setRequestId(_ctx.stringValue("QueryAliyunUidResponse.RequestId"));
		queryAliyunUidResponse.setCode(_ctx.stringValue("QueryAliyunUidResponse.Code"));
		queryAliyunUidResponse.setMessage(_ctx.stringValue("QueryAliyunUidResponse.Message"));
		queryAliyunUidResponse.setSuccess(_ctx.booleanValue("QueryAliyunUidResponse.Success"));
		queryAliyunUidResponse.setUid(_ctx.stringValue("QueryAliyunUidResponse.Uid"));
	 
	 	return queryAliyunUidResponse;
	}
}