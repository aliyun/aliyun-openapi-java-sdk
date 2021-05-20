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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.QueryRingDetailListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRingDetailListResponseUnmarshaller {

	public static QueryRingDetailListResponse unmarshall(QueryRingDetailListResponse queryRingDetailListResponse, UnmarshallerContext _ctx) {
		
		queryRingDetailListResponse.setRequestId(_ctx.stringValue("QueryRingDetailListResponse.RequestId"));
		queryRingDetailListResponse.setMessage(_ctx.stringValue("QueryRingDetailListResponse.Message"));
		queryRingDetailListResponse.setData(_ctx.stringValue("QueryRingDetailListResponse.Data"));
		queryRingDetailListResponse.setCode(_ctx.stringValue("QueryRingDetailListResponse.Code"));
		queryRingDetailListResponse.setSuccess(_ctx.booleanValue("QueryRingDetailListResponse.Success"));
		queryRingDetailListResponse.setHttpStatusCode(_ctx.longValue("QueryRingDetailListResponse.HttpStatusCode"));
	 
	 	return queryRingDetailListResponse;
	}
}