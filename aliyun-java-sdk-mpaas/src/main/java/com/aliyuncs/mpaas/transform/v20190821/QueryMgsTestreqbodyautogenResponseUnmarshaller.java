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

package com.aliyuncs.mpaas.transform.v20190821;

import com.aliyuncs.mpaas.model.v20190821.QueryMgsTestreqbodyautogenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMgsTestreqbodyautogenResponseUnmarshaller {

	public static QueryMgsTestreqbodyautogenResponse unmarshall(QueryMgsTestreqbodyautogenResponse queryMgsTestreqbodyautogenResponse, UnmarshallerContext _ctx) {
		
		queryMgsTestreqbodyautogenResponse.setRequestId(_ctx.stringValue("QueryMgsTestreqbodyautogenResponse.RequestId"));
		queryMgsTestreqbodyautogenResponse.setResultCode(_ctx.stringValue("QueryMgsTestreqbodyautogenResponse.ResultCode"));
		queryMgsTestreqbodyautogenResponse.setResultMessage(_ctx.stringValue("QueryMgsTestreqbodyautogenResponse.ResultMessage"));
		queryMgsTestreqbodyautogenResponse.setResultContent(_ctx.stringValue("QueryMgsTestreqbodyautogenResponse.ResultContent"));
	 
	 	return queryMgsTestreqbodyautogenResponse;
	}
}