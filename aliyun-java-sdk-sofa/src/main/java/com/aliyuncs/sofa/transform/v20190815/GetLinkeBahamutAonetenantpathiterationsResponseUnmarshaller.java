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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAonetenantpathiterationsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAonetenantpathiterationsResponse.ResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAonetenantpathiterationsResponseUnmarshaller {

	public static GetLinkeBahamutAonetenantpathiterationsResponse unmarshall(GetLinkeBahamutAonetenantpathiterationsResponse getLinkeBahamutAonetenantpathiterationsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAonetenantpathiterationsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.RequestId"));
		getLinkeBahamutAonetenantpathiterationsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.ResultCode"));
		getLinkeBahamutAonetenantpathiterationsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.ResultMessage"));
		getLinkeBahamutAonetenantpathiterationsResponse.setCode(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.Code"));
		getLinkeBahamutAonetenantpathiterationsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.Message"));
		getLinkeBahamutAonetenantpathiterationsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAonetenantpathiterationsResponse.ResponseStatusCode"));

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAonetenantpathiterationsResponse.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();
			resultsItem.setText(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.Results["+ i +"].Text"));
			resultsItem.setUrl(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.Results["+ i +"].Url"));
			resultsItem.setValue(_ctx.stringValue("GetLinkeBahamutAonetenantpathiterationsResponse.Results["+ i +"].Value"));

			results.add(resultsItem);
		}
		getLinkeBahamutAonetenantpathiterationsResponse.setResults(results);
	 
	 	return getLinkeBahamutAonetenantpathiterationsResponse;
	}
}