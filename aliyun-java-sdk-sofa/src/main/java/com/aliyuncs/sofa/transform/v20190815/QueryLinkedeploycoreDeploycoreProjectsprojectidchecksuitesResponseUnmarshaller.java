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

import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponseUnmarshaller {

	public static QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse unmarshall(QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse, UnmarshallerContext _ctx) {
		
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setRequestId(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.RequestId"));
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setResultCode(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.ResultCode"));
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setResultMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.ResultMessage"));
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setMessage(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Message"));
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setResponseStatusCode(_ctx.longValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.ResponseStatusCode"));
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setSuccess(_ctx.booleanValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Data["+ i +"].Id"));
			dataItem.setKey(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("QueryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse.setData(data);
	 
	 	return queryLinkedeploycoreDeploycoreProjectsprojectidchecksuitesResponse;
	}
}