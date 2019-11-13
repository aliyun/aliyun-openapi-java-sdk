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

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByDeviceResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByDeviceResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordPlanDeviceByDeviceResponseUnmarshaller {

	public static QueryRecordPlanDeviceByDeviceResponse unmarshall(QueryRecordPlanDeviceByDeviceResponse queryRecordPlanDeviceByDeviceResponse, UnmarshallerContext _ctx) {
		
		queryRecordPlanDeviceByDeviceResponse.setRequestId(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.RequestId"));
		queryRecordPlanDeviceByDeviceResponse.setSuccess(_ctx.booleanValue("QueryRecordPlanDeviceByDeviceResponse.Success"));
		queryRecordPlanDeviceByDeviceResponse.setErrorMessage(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.ErrorMessage"));
		queryRecordPlanDeviceByDeviceResponse.setCode(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Code"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Data.PlanId"));
		data.setName(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateId"));

		TemplateInfo templateInfo = new TemplateInfo();
		templateInfo.setTemplateId(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TemplateId"));
		templateInfo.setName(_ctx.stringValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.Name"));
		templateInfo.set_Default(_ctx.integerValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.Default"));
		templateInfo.setAllDay(_ctx.integerValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.AllDay"));

		List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList.Length"); i++) {
			TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
			timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].DayOfWeek"));
			timeSectionListItem.setBegin(_ctx.integerValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].Begin"));
			timeSectionListItem.setEnd(_ctx.integerValue("QueryRecordPlanDeviceByDeviceResponse.Data.TemplateInfo.TimeSectionList["+ i +"].End"));

			timeSectionList.add(timeSectionListItem);
		}
		templateInfo.setTimeSectionList(timeSectionList);
		data.setTemplateInfo(templateInfo);
		queryRecordPlanDeviceByDeviceResponse.setData(data);
	 
	 	return queryRecordPlanDeviceByDeviceResponse;
	}
}