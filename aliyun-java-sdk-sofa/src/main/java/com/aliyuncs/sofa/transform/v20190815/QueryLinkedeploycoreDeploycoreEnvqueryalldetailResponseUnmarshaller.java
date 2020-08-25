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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse unmarshall(QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.RequestId"));
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Message"));
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDescription(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].Description"));
			dataItem.setDevStage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].DevStage"));
			dataItem.setDisplayName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].DisplayName"));
			dataItem.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].Id"));
			dataItem.setName(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].Name"));
			dataItem.setNamespace(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].Namespace"));
			dataItem.setType(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].Type"));
			dataItem.setWorkspaceGroupId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].WorkspaceGroupId"));
			dataItem.setWorkspaceId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.Data["+ i +"].WorkspaceId"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreEnvqueryalldetailResponse;
	}
}