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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.QueryMsSgAppRelationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgAppRelationsResponseUnmarshaller {

	public static QueryMsSgAppRelationsResponse unmarshall(QueryMsSgAppRelationsResponse queryMsSgAppRelationsResponse, UnmarshallerContext _ctx) {
		
		queryMsSgAppRelationsResponse.setRequestId(_ctx.stringValue("QueryMsSgAppRelationsResponse.RequestId"));
		queryMsSgAppRelationsResponse.setResultCode(_ctx.stringValue("QueryMsSgAppRelationsResponse.ResultCode"));
		queryMsSgAppRelationsResponse.setResultMessage(_ctx.stringValue("QueryMsSgAppRelationsResponse.ResultMessage"));
		queryMsSgAppRelationsResponse.setGraphData(_ctx.stringValue("QueryMsSgAppRelationsResponse.GraphData"));
	 
	 	return queryMsSgAppRelationsResponse;
	}
}