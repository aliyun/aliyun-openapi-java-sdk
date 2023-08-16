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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueDataServiceAPIsResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueDataServiceAPIsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceIssueDataServiceAPIsResponse.Data.API;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGovernanceIssueDataServiceAPIsResponseUnmarshaller {

	public static ListGovernanceIssueDataServiceAPIsResponse unmarshall(ListGovernanceIssueDataServiceAPIsResponse listGovernanceIssueDataServiceAPIsResponse, UnmarshallerContext _ctx) {
		
		listGovernanceIssueDataServiceAPIsResponse.setRequestId(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.RequestId"));
		listGovernanceIssueDataServiceAPIsResponse.setSuccess(_ctx.booleanValue("ListGovernanceIssueDataServiceAPIsResponse.Success"));
		listGovernanceIssueDataServiceAPIsResponse.setErrorCode(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.ErrorCode"));
		listGovernanceIssueDataServiceAPIsResponse.setErrorMessage(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.ErrorMessage"));
		listGovernanceIssueDataServiceAPIsResponse.setHttpStatusCode(_ctx.integerValue("ListGovernanceIssueDataServiceAPIsResponse.HttpStatusCode"));
		listGovernanceIssueDataServiceAPIsResponse.setDynamicErrorCode(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.DynamicErrorCode"));
		listGovernanceIssueDataServiceAPIsResponse.setDynamicErrorMessage(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListGovernanceIssueDataServiceAPIsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGovernanceIssueDataServiceAPIsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListGovernanceIssueDataServiceAPIsResponse.Data.TotalCount"));

		List<API> aPIs = new ArrayList<API>();
		for (int i = 0; i < _ctx.lengthValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs.Length"); i++) {
			API aPI = new API();
			aPI.setApiName(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].ApiName"));
			aPI.setApiId(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].ApiId"));
			aPI.setRuleId(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].RuleId"));
			aPI.setRuleCategory(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].RuleCategory"));
			aPI.setProjectId(_ctx.longValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].ProjectId"));
			aPI.setOwnerId(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].OwnerId"));
			aPI.setBizDate(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].BizDate"));
			aPI.setProperties(_ctx.stringValue("ListGovernanceIssueDataServiceAPIsResponse.Data.APIs["+ i +"].Properties"));

			aPIs.add(aPI);
		}
		data.setAPIs(aPIs);
		listGovernanceIssueDataServiceAPIsResponse.setData(data);
	 
	 	return listGovernanceIssueDataServiceAPIsResponse;
	}
}