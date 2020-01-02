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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchEventsResponse;
import com.aliyuncs.arms.model.v20190808.SearchEventsResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.SearchEventsResponse.PageBean.EventItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchEventsResponseUnmarshaller {

	public static SearchEventsResponse unmarshall(SearchEventsResponse searchEventsResponse, UnmarshallerContext _ctx) {
		
		searchEventsResponse.setRequestId(_ctx.stringValue("SearchEventsResponse.RequestId"));
		searchEventsResponse.setIsTrigger(_ctx.integerValue("SearchEventsResponse.IsTrigger"));

		PageBean pageBean = new PageBean();
		pageBean.setTotalCount(_ctx.integerValue("SearchEventsResponse.PageBean.TotalCount"));
		pageBean.setPageNumber(_ctx.integerValue("SearchEventsResponse.PageBean.PageNumber"));
		pageBean.setPageSize(_ctx.integerValue("SearchEventsResponse.PageBean.PageSize"));

		List<EventItem> event = new ArrayList<EventItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchEventsResponse.PageBean.Event.Length"); i++) {
			EventItem eventItem = new EventItem();
			eventItem.setId(_ctx.longValue("SearchEventsResponse.PageBean.Event["+ i +"].Id"));
			eventItem.setEventTime(_ctx.longValue("SearchEventsResponse.PageBean.Event["+ i +"].EventTime"));
			eventItem.setAlertType(_ctx.integerValue("SearchEventsResponse.PageBean.Event["+ i +"].AlertType"));
			eventItem.setEventLevel(_ctx.integerValue("SearchEventsResponse.PageBean.Event["+ i +"].EventLevel"));
			eventItem.setMessage(_ctx.stringValue("SearchEventsResponse.PageBean.Event["+ i +"].Message"));
			eventItem.setAlertId(_ctx.longValue("SearchEventsResponse.PageBean.Event["+ i +"].AlertId"));
			eventItem.setAlertName(_ctx.stringValue("SearchEventsResponse.PageBean.Event["+ i +"].AlertName"));
			eventItem.setAlertRule(_ctx.stringValue("SearchEventsResponse.PageBean.Event["+ i +"].AlertRule"));

			List<String> links = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchEventsResponse.PageBean.Event["+ i +"].Links.Length"); j++) {
				links.add(_ctx.stringValue("SearchEventsResponse.PageBean.Event["+ i +"].Links["+ j +"]"));
			}
			eventItem.setLinks(links);

			event.add(eventItem);
		}
		pageBean.setEvent(event);
		searchEventsResponse.setPageBean(pageBean);
	 
	 	return searchEventsResponse;
	}
}