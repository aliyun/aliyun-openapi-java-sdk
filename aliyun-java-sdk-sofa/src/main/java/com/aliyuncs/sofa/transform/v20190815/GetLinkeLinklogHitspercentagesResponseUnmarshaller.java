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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogHitspercentagesResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogHitspercentagesResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogHitspercentagesResponseUnmarshaller {

	public static GetLinkeLinklogHitspercentagesResponse unmarshall(GetLinkeLinklogHitspercentagesResponse getLinkeLinklogHitspercentagesResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogHitspercentagesResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.RequestId"));
		getLinkeLinklogHitspercentagesResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.ResultCode"));
		getLinkeLinklogHitspercentagesResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.ResultMessage"));
		getLinkeLinklogHitspercentagesResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.ErrorMsg"));
		getLinkeLinklogHitspercentagesResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.ResponseContentRange"));
		getLinkeLinklogHitspercentagesResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.ResponseContentType"));
		getLinkeLinklogHitspercentagesResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.ResponseStatusCode"));
		getLinkeLinklogHitspercentagesResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogHitspercentagesResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogHitspercentagesResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setBegin(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].Begin"));
			resultItem.setBeginText(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].BeginText"));
			resultItem.setEnd(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].End"));
			resultItem.setEndText(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].EndText"));
			resultItem.setFailCount(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].FailCount"));
			resultItem.setFailPercent(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].FailPercent"));
			resultItem.setFailPercentText(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].FailPercentText"));
			resultItem.setHitCount(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].HitCount"));
			resultItem.setHitPercent(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].HitPercent"));
			resultItem.setHitPercentText(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].HitPercentText"));
			resultItem.setStoreId(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].StoreId"));
			resultItem.setStoreName(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].StoreName"));
			resultItem.setTotalCount(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].TotalCount"));

			List<String> knowledgeHitsPercentageList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].KnowledgeHitsPercentageList.Length"); j++) {
				knowledgeHitsPercentageList.add(_ctx.stringValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].KnowledgeHitsPercentageList["+ j +"]"));
			}
			resultItem.setKnowledgeHitsPercentageList(knowledgeHitsPercentageList);

			List<Long> storeIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].StoreIds.Length"); j++) {
				storeIds.add(_ctx.longValue("GetLinkeLinklogHitspercentagesResponse.Result["+ i +"].StoreIds["+ j +"]"));
			}
			resultItem.setStoreIds(storeIds);

			result.add(resultItem);
		}
		getLinkeLinklogHitspercentagesResponse.setResult(result);
	 
	 	return getLinkeLinklogHitspercentagesResponse;
	}
}