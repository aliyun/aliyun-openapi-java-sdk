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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.QueryServerLockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryServerLockResponseUnmarshaller {

	public static QueryServerLockResponse unmarshall(QueryServerLockResponse queryServerLockResponse, UnmarshallerContext _ctx) {
		
		queryServerLockResponse.setRequestId(_ctx.stringValue("QueryServerLockResponse.RequestId"));
		queryServerLockResponse.setGmtCreate(_ctx.stringValue("QueryServerLockResponse.GmtCreate"));
		queryServerLockResponse.setGmtModified(_ctx.stringValue("QueryServerLockResponse.GmtModified"));
		queryServerLockResponse.setUserId(_ctx.stringValue("QueryServerLockResponse.UserId"));
		queryServerLockResponse.setDomainName(_ctx.stringValue("QueryServerLockResponse.DomainName"));
		queryServerLockResponse.setDomainInstanceId(_ctx.stringValue("QueryServerLockResponse.DomainInstanceId"));
		queryServerLockResponse.setLockProductId(_ctx.stringValue("QueryServerLockResponse.LockProductId"));
		queryServerLockResponse.setStartDate(_ctx.stringValue("QueryServerLockResponse.StartDate"));
		queryServerLockResponse.setExpireDate(_ctx.stringValue("QueryServerLockResponse.ExpireDate"));
		queryServerLockResponse.setLockInstanceId(_ctx.stringValue("QueryServerLockResponse.LockInstanceId"));
		queryServerLockResponse.setServerLockStatus(_ctx.integerValue("QueryServerLockResponse.ServerLockStatus"));
	 
	 	return queryServerLockResponse;
	}
}