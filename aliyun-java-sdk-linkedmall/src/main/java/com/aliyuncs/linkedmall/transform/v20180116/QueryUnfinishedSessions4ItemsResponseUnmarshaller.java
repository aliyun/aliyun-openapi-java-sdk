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

import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedSessions4ItemsResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelList;
import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelList.LmActivitySessionModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnfinishedSessions4ItemsResponseUnmarshaller {

	public static QueryUnfinishedSessions4ItemsResponse unmarshall(QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4ItemsResponse, UnmarshallerContext _ctx) {
		
		queryUnfinishedSessions4ItemsResponse.setRequestId(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.RequestId"));
		queryUnfinishedSessions4ItemsResponse.setCode(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.Code"));
		queryUnfinishedSessions4ItemsResponse.setMessage(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.Message"));

		List<LmItemActivitySessionModelList> lmItemActivitySessionModelListList = new ArrayList<LmItemActivitySessionModelList>();
		for (int i = 0; i < _ctx.lengthValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList.Length"); i++) {
			LmItemActivitySessionModelList lmItemActivitySessionModelList = new LmItemActivitySessionModelList();
			lmItemActivitySessionModelList.setItemId(_ctx.longValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].ItemId"));
			lmItemActivitySessionModelList.setLmItemId(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmItemId"));

			List<LmActivitySessionModel> lmActivitySessionModels = new ArrayList<LmActivitySessionModel>();
			for (int j = 0; j < _ctx.lengthValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels.Length"); j++) {
				LmActivitySessionModel lmActivitySessionModel = new LmActivitySessionModel();
				lmActivitySessionModel.setBizId(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].BizId"));
				lmActivitySessionModel.setDescription(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].Description"));
				lmActivitySessionModel.setDisplayDate(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].DisplayDate"));
				lmActivitySessionModel.setEndDate(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].EndDate"));
				lmActivitySessionModel.setExtInfo(_ctx.mapValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].ExtInfo"));
				lmActivitySessionModel.setLmActivityId(_ctx.longValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].LmActivityId"));
				lmActivitySessionModel.setLmSessionId(_ctx.longValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].LmSessionId"));
				lmActivitySessionModel.setName(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].Name"));
				lmActivitySessionModel.setStartDate(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].StartDate"));
				lmActivitySessionModel.setSubBizCode(_ctx.stringValue("QueryUnfinishedSessions4ItemsResponse.LmItemActivitySessionModelListList["+ i +"].LmActivitySessionModels["+ j +"].SubBizCode"));

				lmActivitySessionModels.add(lmActivitySessionModel);
			}
			lmItemActivitySessionModelList.setLmActivitySessionModels(lmActivitySessionModels);

			lmItemActivitySessionModelListList.add(lmItemActivitySessionModelList);
		}
		queryUnfinishedSessions4ItemsResponse.setLmItemActivitySessionModelListList(lmItemActivitySessionModelListList);
	 
	 	return queryUnfinishedSessions4ItemsResponse;
	}
}