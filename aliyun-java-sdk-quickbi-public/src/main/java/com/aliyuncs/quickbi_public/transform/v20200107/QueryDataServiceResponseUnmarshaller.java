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

package com.aliyuncs.quickbi_public.transform.v20200107;

import com.aliyuncs.quickbi_public.model.v20200107.QueryDataServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataServiceResponseUnmarshaller {

	public static QueryDataServiceResponse unmarshall(QueryDataServiceResponse queryDataServiceResponse, UnmarshallerContext _ctx) {
		
		queryDataServiceResponse.setRequestId(_ctx.stringValue("QueryDataServiceResponse.RequestId"));
		queryDataServiceResponse.setCode(_ctx.stringValue("QueryDataServiceResponse.Code"));
		queryDataServiceResponse.setMessage(_ctx.stringValue("QueryDataServiceResponse.Message"));
		queryDataServiceResponse.setResult(_ctx.stringValue("QueryDataServiceResponse.Result"));
		queryDataServiceResponse.setSuccess(_ctx.stringValue("QueryDataServiceResponse.Success"));
	 
	 	return queryDataServiceResponse;
	}
}