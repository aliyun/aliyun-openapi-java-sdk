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

import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogHitspercentageResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeLinklogHitspercentageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeLinklogHitspercentageResponseUnmarshaller {

	public static GetLinkeLinklogHitspercentageResponse unmarshall(GetLinkeLinklogHitspercentageResponse getLinkeLinklogHitspercentageResponse, UnmarshallerContext _ctx) {
		
		getLinkeLinklogHitspercentageResponse.setRequestId(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.RequestId"));
		getLinkeLinklogHitspercentageResponse.setResultCode(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.ResultCode"));
		getLinkeLinklogHitspercentageResponse.setResultMessage(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.ResultMessage"));
		getLinkeLinklogHitspercentageResponse.setErrorMsg(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.ErrorMsg"));
		getLinkeLinklogHitspercentageResponse.setResponseContentRange(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.ResponseContentRange"));
		getLinkeLinklogHitspercentageResponse.setResponseContentType(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.ResponseContentType"));
		getLinkeLinklogHitspercentageResponse.setResponseStatusCode(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.ResponseStatusCode"));
		getLinkeLinklogHitspercentageResponse.setSuccess(_ctx.booleanValue("GetLinkeLinklogHitspercentageResponse.Success"));

		Result result = new Result();
		result.setBegin(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.Begin"));
		result.setBeginText(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.BeginText"));
		result.setEnd(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.End"));
		result.setEndText(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.EndText"));
		result.setFailCount(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.FailCount"));
		result.setFailPercent(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.FailPercent"));
		result.setFailPercentText(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.FailPercentText"));
		result.setHitCount(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.HitCount"));
		result.setHitPercent(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.HitPercent"));
		result.setHitPercentText(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.HitPercentText"));
		result.setStoreId(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.StoreId"));
		result.setStoreName(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.StoreName"));
		result.setTotalCount(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.TotalCount"));

		List<String> knowledgeHitsPercentageList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogHitspercentageResponse.Result.KnowledgeHitsPercentageList.Length"); i++) {
			knowledgeHitsPercentageList.add(_ctx.stringValue("GetLinkeLinklogHitspercentageResponse.Result.KnowledgeHitsPercentageList["+ i +"]"));
		}
		result.setKnowledgeHitsPercentageList(knowledgeHitsPercentageList);

		List<Long> storeIds = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeLinklogHitspercentageResponse.Result.StoreIds.Length"); i++) {
			storeIds.add(_ctx.longValue("GetLinkeLinklogHitspercentageResponse.Result.StoreIds["+ i +"]"));
		}
		result.setStoreIds(storeIds);
		getLinkeLinklogHitspercentageResponse.setResult(result);
	 
	 	return getLinkeLinklogHitspercentageResponse;
	}
}