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

import com.aliyuncs.opensearch.model.v20171225.GetSortScriptFileResponse;
import com.aliyuncs.opensearch.model.v20171225.GetSortScriptFileResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSortScriptFileResponseUnmarshaller {

	public static GetSortScriptFileResponse unmarshall(GetSortScriptFileResponse getSortScriptFileResponse, UnmarshallerContext _ctx) {
		
		getSortScriptFileResponse.setRequestId(_ctx.stringValue("GetSortScriptFileResponse.requestId"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("GetSortScriptFileResponse.result.content"));
		result.setCreateTime(_ctx.stringValue("GetSortScriptFileResponse.result.createTime"));
		result.setModifyTime(_ctx.stringValue("GetSortScriptFileResponse.result.modifyTime"));
		result.setVersion(_ctx.longValue("GetSortScriptFileResponse.result.version"));
		getSortScriptFileResponse.setResult(result);
	 
	 	return getSortScriptFileResponse;
	}
}