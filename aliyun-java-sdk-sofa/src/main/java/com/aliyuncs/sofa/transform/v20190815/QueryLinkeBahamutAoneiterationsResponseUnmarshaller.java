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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAoneiterationsResponse.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAoneiterationsResponseUnmarshaller {

	public static QueryLinkeBahamutAoneiterationsResponse unmarshall(QueryLinkeBahamutAoneiterationsResponse queryLinkeBahamutAoneiterationsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAoneiterationsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.RequestId"));
		queryLinkeBahamutAoneiterationsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.ResultCode"));
		queryLinkeBahamutAoneiterationsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.ResultMessage"));
		queryLinkeBahamutAoneiterationsResponse.setCode(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.Code"));
		queryLinkeBahamutAoneiterationsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.Message"));
		queryLinkeBahamutAoneiterationsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAoneiterationsResponse.ResponseStatusCode"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutAoneiterationsResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setText(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.Results["+ i +"].Text"));
			resultsItem.setUrl(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.Results["+ i +"].Url"));
			resultsItem.setValue(_ctx.stringValue("QueryLinkeBahamutAoneiterationsResponse.Results["+ i +"].Value"));

			results.add(resultsItem);
		}
		queryLinkeBahamutAoneiterationsResponse.setResults(results);
	 
	 	return queryLinkeBahamutAoneiterationsResponse;
	}
}