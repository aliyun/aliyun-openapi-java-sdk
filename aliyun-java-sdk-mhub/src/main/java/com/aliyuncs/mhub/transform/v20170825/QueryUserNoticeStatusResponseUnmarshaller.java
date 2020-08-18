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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.QueryUserNoticeStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserNoticeStatusResponseUnmarshaller {

	public static QueryUserNoticeStatusResponse unmarshall(QueryUserNoticeStatusResponse queryUserNoticeStatusResponse, UnmarshallerContext _ctx) {
		
		queryUserNoticeStatusResponse.setRequestId(_ctx.stringValue("QueryUserNoticeStatusResponse.RequestId"));
		queryUserNoticeStatusResponse.setStatus(_ctx.booleanValue("QueryUserNoticeStatusResponse.Status"));
	 
	 	return queryUserNoticeStatusResponse;
	}
}