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

package com.aliyuncs.opensearch.transform.v20171225;

import com.aliyuncs.opensearch.model.v20171225.ListSlowQueryQueriesResponse;
import com.aliyuncs.opensearch.model.v20171225.ListSlowQueryQueriesResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlowQueryQueriesResponseUnmarshaller {

	public static ListSlowQueryQueriesResponse unmarshall(ListSlowQueryQueriesResponse listSlowQueryQueriesResponse, UnmarshallerContext _ctx) {
		
		listSlowQueryQueriesResponse.setRequestId(_ctx.stringValue("ListSlowQueryQueriesResponse.requestId"));

		Result result = new Result();
		result.setStart(_ctx.integerValue("ListSlowQueryQueriesResponse.result.start"));
		result.setEnd(_ctx.integerValue("ListSlowQueryQueriesResponse.result.end"));
		result.setIndex(_ctx.integerValue("ListSlowQueryQueriesResponse.result.index"));
		result.setAppQuery(_ctx.stringValue("ListSlowQueryQueriesResponse.result.appQuery"));
		listSlowQueryQueriesResponse.setResult(result);
	 
	 	return listSlowQueryQueriesResponse;
	}
}