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

import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateDetailResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateDetailResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateDetailResponse.Data.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTimeTemplateDetailResponseUnmarshaller {

	public static QueryTimeTemplateDetailResponse unmarshall(QueryTimeTemplateDetailResponse queryTimeTemplateDetailResponse, UnmarshallerContext _ctx) {
		
		queryTimeTemplateDetailResponse.setRequestId(_ctx.stringValue("QueryTimeTemplateDetailResponse.RequestId"));
		queryTimeTemplateDetailResponse.setSuccess(_ctx.booleanValue("QueryTimeTemplateDetailResponse.Success"));
		queryTimeTemplateDetailResponse.setErrorMessage(_ctx.stringValue("QueryTimeTemplateDetailResponse.ErrorMessage"));
		queryTimeTemplateDetailResponse.setCode(_ctx.stringValue("QueryTimeTemplateDetailResponse.Code"));

		Data data = new Data();
		data.set_Default(_ctx.integerValue("QueryTimeTemplateDetailResponse.Data.Default"));
		data.setName(_ctx.stringValue("QueryTimeTemplateDetailResponse.Data.Name"));
		data.setTemplateId(_ctx.stringValue("QueryTimeTemplateDetailResponse.Data.TemplateId"));
		data.setAllDay(_ctx.integerValue("QueryTimeTemplateDetailResponse.Data.AllDay"));

		List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTimeTemplateDetailResponse.Data.TimeSectionList.Length"); i++) {
			TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
			timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryTimeTemplateDetailResponse.Data.TimeSectionList["+ i +"].DayOfWeek"));
			timeSectionListItem.setBegin(_ctx.integerValue("QueryTimeTemplateDetailResponse.Data.TimeSectionList["+ i +"].Begin"));
			timeSectionListItem.setEnd(_ctx.integerValue("QueryTimeTemplateDetailResponse.Data.TimeSectionList["+ i +"].End"));

			timeSectionList.add(timeSectionListItem);
		}
		data.setTimeSectionList(timeSectionList);
		queryTimeTemplateDetailResponse.setData(data);
	 
	 	return queryTimeTemplateDetailResponse;
	}
}