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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryRobotListResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryRobotListResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRobotListResponseUnmarshaller {

	public static QueryRobotListResponse unmarshall(QueryRobotListResponse queryRobotListResponse, UnmarshallerContext _ctx) {
		
		queryRobotListResponse.setErrorMsg(_ctx.stringValue("QueryRobotListResponse.ErrorMsg"));
		queryRobotListResponse.setDingOpenErrcode(_ctx.integerValue("QueryRobotListResponse.DingOpenErrcode"));
		queryRobotListResponse.setSuccess(_ctx.booleanValue("QueryRobotListResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRobotListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("QueryRobotListResponse.Result["+ i +"].id"));
			resultItem.setName(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].name"));
			resultItem.setAppKey(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].appKey"));
			resultItem.setSecret(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].secret"));
			resultItem.setConfig(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].config"));
			resultItem.setAccountId(_ctx.integerValue("QueryRobotListResponse.Result["+ i +"].accountId"));
			resultItem.setAccountType(_ctx.integerValue("QueryRobotListResponse.Result["+ i +"].accountType"));
			resultItem.setSource(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].source"));
			resultItem.setAppType(_ctx.integerValue("QueryRobotListResponse.Result["+ i +"].appType"));
			resultItem.setStatus(_ctx.integerValue("QueryRobotListResponse.Result["+ i +"].status"));
			resultItem.setCorpId(_ctx.stringValue("QueryRobotListResponse.Result["+ i +"].corpId"));

			result.add(resultItem);
		}
		queryRobotListResponse.setResult(result);
	 
	 	return queryRobotListResponse;
	}
}