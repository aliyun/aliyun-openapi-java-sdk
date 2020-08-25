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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse unmarshall(QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.RequestId"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Message"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Success"));

		Data data = new Data();
		data.setAuthorName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.AuthorName"));
		data.setCommittedDate(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.CommittedDate"));
		data.setCommitterName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.CommitterName"));
		data.setCommitId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.CommitId"));
		data.setCreatedDate(_ctx.longValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.CreatedDate"));
		data.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.Message"));
		data.setTitle(_ctx.stringValue("QueryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.Data.Title"));
		queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreAppquerybranchcommitResponse;
	}
}