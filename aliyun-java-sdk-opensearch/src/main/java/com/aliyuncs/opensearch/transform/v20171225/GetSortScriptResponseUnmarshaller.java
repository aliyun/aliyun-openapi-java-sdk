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

import com.aliyuncs.opensearch.model.v20171225.GetSortScriptResponse;
import com.aliyuncs.opensearch.model.v20171225.GetSortScriptResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSortScriptResponseUnmarshaller {

	public static GetSortScriptResponse unmarshall(GetSortScriptResponse getSortScriptResponse, UnmarshallerContext _ctx) {
		
		getSortScriptResponse.setRequestId(_ctx.stringValue("GetSortScriptResponse.requestId"));

		Result result = new Result();
		result.setType(_ctx.stringValue("GetSortScriptResponse.result.type"));
		result.setScope(_ctx.stringValue("GetSortScriptResponse.result.scope"));
		result.setStatus(_ctx.stringValue("GetSortScriptResponse.result.status"));
		result.setCreateTime(_ctx.stringValue("GetSortScriptResponse.result.createTime"));
		result.setModifyTime(_ctx.stringValue("GetSortScriptResponse.result.modifyTime"));
		getSortScriptResponse.setResult(result);
	 
	 	return getSortScriptResponse;
	}
}