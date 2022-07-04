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

package com.aliyuncs.quickbi_public.transform.v20220101;

import com.aliyuncs.quickbi_public.model.v20220101.QueryEmbeddedStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEmbeddedStatusResponseUnmarshaller {

	public static QueryEmbeddedStatusResponse unmarshall(QueryEmbeddedStatusResponse queryEmbeddedStatusResponse, UnmarshallerContext _ctx) {
		
		queryEmbeddedStatusResponse.setRequestId(_ctx.stringValue("QueryEmbeddedStatusResponse.RequestId"));
		queryEmbeddedStatusResponse.setResult(_ctx.booleanValue("QueryEmbeddedStatusResponse.Result"));
		queryEmbeddedStatusResponse.setSuccess(_ctx.booleanValue("QueryEmbeddedStatusResponse.Success"));
	 
	 	return queryEmbeddedStatusResponse;
	}
}