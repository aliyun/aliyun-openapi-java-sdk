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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDetailResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDetailResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDetailResponse.Data.TemplateInfo;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordPlanDetailResponseUnmarshaller {

	public static QueryRecordPlanDetailResponse unmarshall(QueryRecordPlanDetailResponse queryRecordPlanDetailResponse, UnmarshallerContext _ctx) {
		
		queryRecordPlanDetailResponse.setRequestId(_ctx.stringValue("QueryRecordPlanDetailResponse.RequestId"));
		queryRecordPlanDetailResponse.setCode(_ctx.stringValue("QueryRecordPlanDetailResponse.Code"));
		queryRecordPlanDetailResponse.setErrorMessage(_ctx.stringValue("QueryRecordPlanDetailResponse.ErrorMessage"));
		queryRecordPlanDetailResponse.setSuccess(_ctx.booleanValue("QueryRecordPlanDetailResponse.Success"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("QueryRecordPlanDetailResponse.Data.PlanId"));
		data.setName(_ctx.stringValue("QueryRecordPlanDetailResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("QueryRecordPlanDetailResponse.Data.TemplateId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setAllDay(_ctx.integerValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.AllDay"));
		templateInfo.set_Default(_ctx.integerValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.Default"));
		templateInfo.setName(_ctx.stringValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.Name"));
		templateInfo.setTemplateId(_ctx.stringValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.TemplateId"));

		List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList.Length"); i++) {
			TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
			timeSectionListItem.setEnd(_ctx.integerValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].End"));
			timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].DayOfWeek"));
			timeSectionListItem.setBegin(_ctx.integerValue("QueryRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].Begin"));

			timeSectionList.add(timeSectionListItem);
		}
		templateInfo.setTimeSectionList(timeSectionList);
		data.setTemplateInfo(templateInfo);
		queryRecordPlanDetailResponse.setData(data);
	 
	 	return queryRecordPlanDetailResponse;
	}
}