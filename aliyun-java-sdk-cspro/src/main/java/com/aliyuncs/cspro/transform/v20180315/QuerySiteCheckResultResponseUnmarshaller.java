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

package com.aliyuncs.cspro.transform.v20180315;

import com.aliyuncs.cspro.model.v20180315.QuerySiteCheckResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySiteCheckResultResponseUnmarshaller {

	public static QuerySiteCheckResultResponse unmarshall(QuerySiteCheckResultResponse querySiteCheckResultResponse, UnmarshallerContext _ctx) {
		
		querySiteCheckResultResponse.setRequestId(_ctx.stringValue("QuerySiteCheckResultResponse.RequestId"));
		querySiteCheckResultResponse.setSuccess(_ctx.booleanValue("QuerySiteCheckResultResponse.Success"));
		querySiteCheckResultResponse.setCode(_ctx.stringValue("QuerySiteCheckResultResponse.Code"));
		querySiteCheckResultResponse.setMessage(_ctx.stringValue("QuerySiteCheckResultResponse.Message"));
		querySiteCheckResultResponse.setData(_ctx.stringValue("QuerySiteCheckResultResponse.Data"));
	 
	 	return querySiteCheckResultResponse;
	}
}