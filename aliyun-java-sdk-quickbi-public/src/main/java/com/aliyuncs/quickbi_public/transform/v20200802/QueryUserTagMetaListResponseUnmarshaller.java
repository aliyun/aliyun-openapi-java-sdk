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

package com.aliyuncs.quickbi_public.transform.v20200802;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200802.QueryUserTagMetaListResponse;
import com.aliyuncs.quickbi_public.model.v20200802.QueryUserTagMetaListResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUserTagMetaListResponseUnmarshaller {

	public static QueryUserTagMetaListResponse unmarshall(QueryUserTagMetaListResponse queryUserTagMetaListResponse, UnmarshallerContext _ctx) {
		
		queryUserTagMetaListResponse.setRequestId(_ctx.stringValue("QueryUserTagMetaListResponse.RequestId"));
		queryUserTagMetaListResponse.setSuccess(_ctx.booleanValue("QueryUserTagMetaListResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryUserTagMetaListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTagId(_ctx.stringValue("QueryUserTagMetaListResponse.Result["+ i +"].TagId"));
			resultItem.setTagName(_ctx.stringValue("QueryUserTagMetaListResponse.Result["+ i +"].TagName"));
			resultItem.setTagDescription(_ctx.stringValue("QueryUserTagMetaListResponse.Result["+ i +"].TagDescription"));

			result.add(resultItem);
		}
		queryUserTagMetaListResponse.setResult(result);
	 
	 	return queryUserTagMetaListResponse;
	}
}