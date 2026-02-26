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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.QueryDataFromTairResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDataFromTairResponseUnmarshaller {

	public static QueryDataFromTairResponse unmarshall(QueryDataFromTairResponse queryDataFromTairResponse, UnmarshallerContext _ctx) {
		
		queryDataFromTairResponse.setRequestId(_ctx.stringValue("QueryDataFromTairResponse.RequestId"));
		queryDataFromTairResponse.setSuccess(_ctx.booleanValue("QueryDataFromTairResponse.Success"));
		queryDataFromTairResponse.setMessage(_ctx.stringValue("QueryDataFromTairResponse.Message"));
		queryDataFromTairResponse.setModule(_ctx.stringValue("QueryDataFromTairResponse.Module"));
	 
	 	return queryDataFromTairResponse;
	}
}