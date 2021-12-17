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

package com.aliyuncs.iotsoc.transform.v20181025;

import com.aliyuncs.iotsoc.model.v20181025.QueryPatchInfoListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPatchInfoListResponseUnmarshaller {

	public static QueryPatchInfoListResponse unmarshall(QueryPatchInfoListResponse queryPatchInfoListResponse, UnmarshallerContext _ctx) {
		
		queryPatchInfoListResponse.setRequestId(_ctx.stringValue("QueryPatchInfoListResponse.RequestId"));
		queryPatchInfoListResponse.setCode(_ctx.stringValue("QueryPatchInfoListResponse.Code"));
		queryPatchInfoListResponse.setData(_ctx.stringValue("QueryPatchInfoListResponse.Data"));
	 
	 	return queryPatchInfoListResponse;
	}
}