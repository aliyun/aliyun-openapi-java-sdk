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

package com.aliyuncs.rdc.transform.v20180821;

import com.aliyuncs.rdc.model.v20180821.SearchTestCaseResponse;
import com.aliyuncs.rdc.model.v20180821.SearchTestCaseResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTestCaseResponseUnmarshaller {

	public static SearchTestCaseResponse unmarshall(SearchTestCaseResponse searchTestCaseResponse, UnmarshallerContext _ctx) {
		
		searchTestCaseResponse.setRequestId(_ctx.stringValue("SearchTestCaseResponse.RequestId"));
		searchTestCaseResponse.setCode(_ctx.integerValue("SearchTestCaseResponse.Code"));
		searchTestCaseResponse.setSuccess(_ctx.booleanValue("SearchTestCaseResponse.Success"));
		searchTestCaseResponse.setMessage(_ctx.stringValue("SearchTestCaseResponse.Message"));

		Data data = new Data();
		data.setPageTotal(_ctx.stringValue("SearchTestCaseResponse.Data.PageTotal"));
		data.setPageSize(_ctx.stringValue("SearchTestCaseResponse.Data.PageSize"));
		data.setPageNum(_ctx.stringValue("SearchTestCaseResponse.Data.PageNum"));
		data.setTotalCount(_ctx.stringValue("SearchTestCaseResponse.Data.TotalCount"));
		data.setCases(_ctx.stringValue("SearchTestCaseResponse.Data.Cases"));
		searchTestCaseResponse.setData(data);
	 
	 	return searchTestCaseResponse;
	}
}