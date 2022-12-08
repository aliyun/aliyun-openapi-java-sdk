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

import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByDeviceResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEventRecordPlanDeviceByDeviceResponseUnmarshaller {

	public static QueryEventRecordPlanDeviceByDeviceResponse unmarshall(QueryEventRecordPlanDeviceByDeviceResponse queryEventRecordPlanDeviceByDeviceResponse, UnmarshallerContext _ctx) {
		
		queryEventRecordPlanDeviceByDeviceResponse.setRequestId(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.RequestId"));
		queryEventRecordPlanDeviceByDeviceResponse.setCode(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Code"));
		queryEventRecordPlanDeviceByDeviceResponse.setErrorMessage(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.ErrorMessage"));
		queryEventRecordPlanDeviceByDeviceResponse.setSuccess(_ctx.booleanValue("QueryEventRecordPlanDeviceByDeviceResponse.Success"));

		Data data = new Data();
		data.setPreRecordDuration(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.PreRecordDuration"));
		data.setName(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.Name"));
		data.setPlanId(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.PlanId"));
		data.setTemplateId(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateId"));
		data.setRecordDuration(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.RecordDuration"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setAllDay(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.AllDay"));
		templateInfo.set_Default(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.Default"));
		templateInfo.setName(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.Name"));
		templateInfo.setTemplateId(_ctx.stringValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TemplateId"));

		List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList.Length"); i++) {
			TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
			timeSectionListItem.setEnd(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].End"));
			timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].DayOfWeek"));
			timeSectionListItem.setBegin(_ctx.integerValue("QueryEventRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].Begin"));

			timeSectionList.add(timeSectionListItem);
		}
		templateInfo.setTimeSectionList(timeSectionList);
		data.setTemplateInfo(templateInfo);
		queryEventRecordPlanDeviceByDeviceResponse.setData(data);
	 
	 	return queryEventRecordPlanDeviceByDeviceResponse;
	}
}