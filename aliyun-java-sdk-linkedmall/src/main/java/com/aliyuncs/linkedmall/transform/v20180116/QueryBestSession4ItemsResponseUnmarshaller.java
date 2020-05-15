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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryBestSession4ItemsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryBestSession4ItemsResponse.LmItemActivitySessionModel;
import com.aliyuncs.linkedmall.model.v20180116.QueryBestSession4ItemsResponse.LmItemActivitySessionModel.LmActivitySessionModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBestSession4ItemsResponseUnmarshaller {

	public static QueryBestSession4ItemsResponse unmarshall(QueryBestSession4ItemsResponse queryBestSession4ItemsResponse, UnmarshallerContext _ctx) {
		
		queryBestSession4ItemsResponse.setRequestId(_ctx.stringValue("QueryBestSession4ItemsResponse.RequestId"));
		queryBestSession4ItemsResponse.setCode(_ctx.stringValue("QueryBestSession4ItemsResponse.Code"));
		queryBestSession4ItemsResponse.setMessage(_ctx.stringValue("QueryBestSession4ItemsResponse.Message"));

		List<LmItemActivitySessionModel> lmItemActivitySessionModelList = new ArrayList<LmItemActivitySessionModel>();
		for (int i = 0; i < _ctx.lengthValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList.Length"); i++) {
			LmItemActivitySessionModel lmItemActivitySessionModel = new LmItemActivitySessionModel();
			lmItemActivitySessionModel.setItemId(_ctx.longValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].ItemId"));
			lmItemActivitySessionModel.setLmItemId(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmItemId"));

			LmActivitySessionModel lmActivitySessionModel = new LmActivitySessionModel();
			lmActivitySessionModel.setBizId(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.BizId"));
			lmActivitySessionModel.setDescription(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.Description"));
			lmActivitySessionModel.setDisplayDate(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.DisplayDate"));
			lmActivitySessionModel.setEndDate(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.EndDate"));
			lmActivitySessionModel.setExtInfo(_ctx.mapValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.ExtInfo"));
			lmActivitySessionModel.setLmActivityId(_ctx.longValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.LmActivityId"));
			lmActivitySessionModel.setLmSessionId(_ctx.longValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.LmSessionId"));
			lmActivitySessionModel.setName(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.Name"));
			lmActivitySessionModel.setStartDate(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.StartDate"));
			lmActivitySessionModel.setSubBizCode(_ctx.stringValue("QueryBestSession4ItemsResponse.LmItemActivitySessionModelList["+ i +"].LmActivitySessionModel.SubBizCode"));
			lmItemActivitySessionModel.setLmActivitySessionModel(lmActivitySessionModel);

			lmItemActivitySessionModelList.add(lmItemActivitySessionModel);
		}
		queryBestSession4ItemsResponse.setLmItemActivitySessionModelList(lmItemActivitySessionModelList);
	 
	 	return queryBestSession4ItemsResponse;
	}
}