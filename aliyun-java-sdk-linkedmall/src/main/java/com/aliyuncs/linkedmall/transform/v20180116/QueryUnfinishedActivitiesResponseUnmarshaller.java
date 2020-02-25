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

import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedActivitiesResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedActivitiesResponse.LmActivityModelV2Ext;
import com.aliyuncs.linkedmall.model.v20180116.QueryUnfinishedActivitiesResponse.LmActivityModelV2Ext.LmActivitySessionModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnfinishedActivitiesResponseUnmarshaller {

	public static QueryUnfinishedActivitiesResponse unmarshall(QueryUnfinishedActivitiesResponse queryUnfinishedActivitiesResponse, UnmarshallerContext _ctx) {
		
		queryUnfinishedActivitiesResponse.setRequestId(_ctx.stringValue("QueryUnfinishedActivitiesResponse.RequestId"));
		queryUnfinishedActivitiesResponse.setCode(_ctx.stringValue("QueryUnfinishedActivitiesResponse.Code"));
		queryUnfinishedActivitiesResponse.setMessage(_ctx.stringValue("QueryUnfinishedActivitiesResponse.Message"));
		queryUnfinishedActivitiesResponse.setPageSize(_ctx.longValue("QueryUnfinishedActivitiesResponse.PageSize"));
		queryUnfinishedActivitiesResponse.setPageNumber(_ctx.longValue("QueryUnfinishedActivitiesResponse.PageNumber"));
		queryUnfinishedActivitiesResponse.setTotalCount(_ctx.longValue("QueryUnfinishedActivitiesResponse.TotalCount"));

		List<LmActivityModelV2Ext> lmActivityModelExtList = new ArrayList<LmActivityModelV2Ext>();
		for (int i = 0; i < _ctx.lengthValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList.Length"); i++) {
			LmActivityModelV2Ext lmActivityModelV2Ext = new LmActivityModelV2Ext();
			lmActivityModelV2Ext.setStartDate(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].StartDate"));
			lmActivityModelV2Ext.setName(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].Name"));
			lmActivityModelV2Ext.setLmActivityId(_ctx.longValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivityId"));
			lmActivityModelV2Ext.setEndDate(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].EndDate"));
			lmActivityModelV2Ext.setDescription(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].Description"));
			lmActivityModelV2Ext.setBizId(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].BizId"));
			lmActivityModelV2Ext.setActivityPicUrl(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].ActivityPicUrl"));

			List<LmActivitySessionModel> lmActivitySessionModels = new ArrayList<LmActivitySessionModel>();
			for (int j = 0; j < _ctx.lengthValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels.Length"); j++) {
				LmActivitySessionModel lmActivitySessionModel = new LmActivitySessionModel();
				lmActivitySessionModel.setLmActivityId(_ctx.longValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].LmActivityId"));
				lmActivitySessionModel.setLmSessionId(_ctx.longValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].LmSessionId"));
				lmActivitySessionModel.setName(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].Name"));
				lmActivitySessionModel.setDescription(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].Description"));
				lmActivitySessionModel.setBizId(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].BizId"));
				lmActivitySessionModel.setSubBizCode(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].SubBizCode"));
				lmActivitySessionModel.setDisplayDate(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].DisplayDate"));
				lmActivitySessionModel.setStartDate(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].StartDate"));
				lmActivitySessionModel.setEndDate(_ctx.stringValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].EndDate"));
				lmActivitySessionModel.setExtInfo(_ctx.mapValue("QueryUnfinishedActivitiesResponse.LmActivityModelExtList["+ i +"].LmActivitySessionModels["+ j +"].ExtInfo"));

				lmActivitySessionModels.add(lmActivitySessionModel);
			}
			lmActivityModelV2Ext.setLmActivitySessionModels(lmActivitySessionModels);

			lmActivityModelExtList.add(lmActivityModelV2Ext);
		}
		queryUnfinishedActivitiesResponse.setLmActivityModelExtList(lmActivityModelExtList);
	 
	 	return queryUnfinishedActivitiesResponse;
	}
}