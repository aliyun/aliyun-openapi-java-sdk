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

import com.aliyuncs.account_crm.model.v20160606.QueryAccountSiteResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAccountSiteResponseUnmarshaller {

	public static QueryAccountSiteResponse unmarshall(QueryAccountSiteResponse queryAccountSiteResponse, UnmarshallerContext _ctx) {
		
		queryAccountSiteResponse.setRequestId(_ctx.stringValue("QueryAccountSiteResponse.RequestId"));
		queryAccountSiteResponse.setCode(_ctx.stringValue("QueryAccountSiteResponse.Code"));
		queryAccountSiteResponse.setSite(_ctx.stringValue("QueryAccountSiteResponse.Site"));
		queryAccountSiteResponse.setSuccess(_ctx.booleanValue("QueryAccountSiteResponse.Success"));
	 
	 	return queryAccountSiteResponse;
	}
}