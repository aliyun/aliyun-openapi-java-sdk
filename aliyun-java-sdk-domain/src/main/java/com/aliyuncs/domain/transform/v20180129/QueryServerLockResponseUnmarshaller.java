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

	public static QueryServerLockResponse unmarshall(QueryServerLockResponse queryServerLockResponse, UnmarshallerContext context) {
		
		queryServerLockResponse.setRequestId(context.stringValue("QueryServerLockResponse.RequestId"));
		queryServerLockResponse.setGmtCreate(context.stringValue("QueryServerLockResponse.GmtCreate"));
		queryServerLockResponse.setGmtModified(context.stringValue("QueryServerLockResponse.GmtModified"));
		queryServerLockResponse.setUserId(context.stringValue("QueryServerLockResponse.UserId"));
		queryServerLockResponse.setDomainName(context.stringValue("QueryServerLockResponse.DomainName"));
		queryServerLockResponse.setDomainInstanceId(context.stringValue("QueryServerLockResponse.DomainInstanceId"));
		queryServerLockResponse.setLockProductId(context.stringValue("QueryServerLockResponse.LockProductId"));
		queryServerLockResponse.setStartDate(context.stringValue("QueryServerLockResponse.StartDate"));
		queryServerLockResponse.setExpireDate(context.stringValue("QueryServerLockResponse.ExpireDate"));
		queryServerLockResponse.setLockInstanceId(context.stringValue("QueryServerLockResponse.LockInstanceId"));
		queryServerLockResponse.setServerLockStatus(context.integerValue("QueryServerLockResponse.ServerLockStatus"));
	 
	 	return queryServerLockResponse;
	}
}