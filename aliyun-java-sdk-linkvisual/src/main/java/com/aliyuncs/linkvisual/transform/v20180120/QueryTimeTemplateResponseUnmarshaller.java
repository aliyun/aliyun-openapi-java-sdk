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

import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateResponse.Data.ListItem;
import com.aliyuncs.linkvisual.model.v20180120.QueryTimeTemplateResponse.Data.ListItem.TimeSectionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTimeTemplateResponseUnmarshaller {

	public static QueryTimeTemplateResponse unmarshall(QueryTimeTemplateResponse queryTimeTemplateResponse, UnmarshallerContext _ctx) {
		
		queryTimeTemplateResponse.setRequestId(_ctx.stringValue("QueryTimeTemplateResponse.RequestId"));
		queryTimeTemplateResponse.setSuccess(_ctx.booleanValue("QueryTimeTemplateResponse.Success"));
		queryTimeTemplateResponse.setErrorMessage(_ctx.stringValue("QueryTimeTemplateResponse.ErrorMessage"));
		queryTimeTemplateResponse.setCode(_ctx.stringValue("QueryTimeTemplateResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryTimeTemplateResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryTimeTemplateResponse.Data.PageCount"));
		data.setPage(_ctx.integerValue("QueryTimeTemplateResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("QueryTimeTemplateResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTimeTemplateResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.set_Default(_ctx.integerValue("QueryTimeTemplateResponse.Data.List["+ i +"].Default"));
			listItem.setName(_ctx.stringValue("QueryTimeTemplateResponse.Data.List["+ i +"].Name"));
			listItem.setTemplateId(_ctx.stringValue("QueryTimeTemplateResponse.Data.List["+ i +"].TemplateId"));
			listItem.setAllDay(_ctx.integerValue("QueryTimeTemplateResponse.Data.List["+ i +"].AllDay"));

			List<TimeSectionListItem> timeSectionList = new ArrayList<TimeSectionListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryTimeTemplateResponse.Data.List["+ i +"].TimeSectionList.Length"); j++) {
				TimeSectionListItem timeSectionListItem = new TimeSectionListItem();
				timeSectionListItem.setDayOfWeek(_ctx.integerValue("QueryTimeTemplateResponse.Data.List["+ i +"].TimeSectionList["+ j +"].DayOfWeek"));
				timeSectionListItem.setBegin(_ctx.integerValue("QueryTimeTemplateResponse.Data.List["+ i +"].TimeSectionList["+ j +"].Begin"));
				timeSectionListItem.setEnd(_ctx.integerValue("QueryTimeTemplateResponse.Data.List["+ i +"].TimeSectionList["+ j +"].End"));

				timeSectionList.add(timeSectionListItem);
			}
			listItem.setTimeSectionList(timeSectionList);

			list.add(listItem);
		}
		data.setList(list);
		queryTimeTemplateResponse.setData(data);
	 
	 	return queryTimeTemplateResponse;
	}
}