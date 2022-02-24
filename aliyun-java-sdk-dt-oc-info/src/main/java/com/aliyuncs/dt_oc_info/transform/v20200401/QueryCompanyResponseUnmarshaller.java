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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import com.aliyuncs.dt_oc_info.model.v20200401.QueryCompanyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCompanyResponseUnmarshaller {

	public static QueryCompanyResponse unmarshall(QueryCompanyResponse queryCompanyResponse, UnmarshallerContext _ctx) {
		
		queryCompanyResponse.setRequestId(_ctx.stringValue("QueryCompanyResponse.RequestId"));
		queryCompanyResponse.setCode(_ctx.stringValue("QueryCompanyResponse.Code"));
		queryCompanyResponse.setMessage(_ctx.stringValue("QueryCompanyResponse.Message"));
		queryCompanyResponse.setData(_ctx.stringValue("QueryCompanyResponse.Data"));
		queryCompanyResponse.setTotal(_ctx.integerValue("QueryCompanyResponse.Total"));
	 
	 	return queryCompanyResponse;
	}
}