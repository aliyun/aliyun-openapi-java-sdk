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

package com.aliyuncs.riskpunish.transform.v20240319;

import com.aliyuncs.riskpunish.model.v20240319.QueryPunishListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPunishListResponseUnmarshaller {

	public static QueryPunishListResponse unmarshall(QueryPunishListResponse queryPunishListResponse, UnmarshallerContext _ctx) {
		
		queryPunishListResponse.setRequestId(_ctx.stringValue("QueryPunishListResponse.RequestId"));
		queryPunishListResponse.setCode(_ctx.stringValue("QueryPunishListResponse.Code"));
		queryPunishListResponse.setMessage(_ctx.stringValue("QueryPunishListResponse.Message"));
		queryPunishListResponse.setData(_ctx.stringValue("QueryPunishListResponse.Data"));
		queryPunishListResponse.setSuccess(_ctx.booleanValue("QueryPunishListResponse.Success"));
	 
	 	return queryPunishListResponse;
	}
}