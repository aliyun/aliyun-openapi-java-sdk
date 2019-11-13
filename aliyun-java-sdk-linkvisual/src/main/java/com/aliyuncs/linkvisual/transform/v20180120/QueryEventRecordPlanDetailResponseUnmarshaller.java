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

import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDetailResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDetailResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDetailResponse.Data.TemplateInfo;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEventRecordPlanDetailResponseUnmarshaller {

	public static QueryEventRecordPlanDetailResponse unmarshall(QueryEventRecordPlanDetailResponse queryEventRecordPlanDetailResponse, UnmarshallerContext _ctx) {
		
		queryEventRecordPlanDetailResponse.setRequestId(_ctx.stringValue("QueryEventRecordPlanDetailResponse.RequestId"));
		queryEventRecordPlanDetailResponse.setSuccess(_ctx.booleanValue("QueryEventRecordPlanDetailResponse.Success"));
		queryEventRecordPlanDetailResponse.setErrorMessage(_ctx.stringValue("QueryEventRecordPlanDetailResponse.ErrorMessage"));
		queryEventRecordPlanDetailResponse.setCode(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Code"));

		Data data = new Data();
		data.setPreRecordDuration(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.PreRecordDuration"));
		data.setRecordDuration(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.RecordDuration"));
		data.setPlanId(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Data.PlanId"));
		data.setName(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Data.TemplateId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TemplateId"));
		templateInfo.setName(_ctx.stringValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.Name"));
		templateInfo.set_Default(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.Default"));
		templateInfo.setAllDay(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.AllDay"));

		List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList.Length"); i++) {
			TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
			timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].DayOfWeek"));
			timeSectionListItem.setBegin(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].Begin"));
			timeSectionListItem.setEnd(_ctx.integerValue("QueryEventRecordPlanDetailResponse.Data.TemplateInfo.TimeSectionList["+ i +"].End"));

			timeSectionList.add(timeSectionListItem);
		}
		templateInfo.setTimeSectionList(timeSectionList);
		data.setTemplateInfo(templateInfo);
		queryEventRecordPlanDetailResponse.setData(data);
	 
	 	return queryEventRecordPlanDetailResponse;
	}
}