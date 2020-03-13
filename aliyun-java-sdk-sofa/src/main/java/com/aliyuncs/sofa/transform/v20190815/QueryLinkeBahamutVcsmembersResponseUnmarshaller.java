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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutVcsmembersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutVcsmembersResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutVcsmembersResponseUnmarshaller {

	public static QueryLinkeBahamutVcsmembersResponse unmarshall(QueryLinkeBahamutVcsmembersResponse queryLinkeBahamutVcsmembersResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutVcsmembersResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.RequestId"));
		queryLinkeBahamutVcsmembersResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.ResultCode"));
		queryLinkeBahamutVcsmembersResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.ResultMessage"));
		queryLinkeBahamutVcsmembersResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.ErrorMessage"));
		queryLinkeBahamutVcsmembersResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Message"));
		queryLinkeBahamutVcsmembersResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutVcsmembersResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutVcsmembersResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAccessLevel(_ctx.longValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].AccessLevel"));
			resultItem.setEmail(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].Email"));
			resultItem.setExternUid(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].ExternUid"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].Name"));
			resultItem.setUsername(_ctx.stringValue("QueryLinkeBahamutVcsmembersResponse.Result["+ i +"].Username"));

			result.add(resultItem);
		}
		queryLinkeBahamutVcsmembersResponse.setResult(result);
	 
	 	return queryLinkeBahamutVcsmembersResponse;
	}
}