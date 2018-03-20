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

package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.ListEventsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListEventsResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventsResponseUnmarshaller {

	public static ListEventsResponse unmarshall(ListEventsResponse listEventsResponse, UnmarshallerContext context) {
		
		listEventsResponse.setRequestId(context.stringValue("ListEventsResponse.RequestId"));
		listEventsResponse.setCode(context.stringValue("ListEventsResponse.Code"));
		listEventsResponse.setMessage(context.stringValue("ListEventsResponse.Message"));
		listEventsResponse.setNextCursor(context.stringValue("ListEventsResponse.NextCursor"));
		listEventsResponse.setTotalCount(context.integerValue("ListEventsResponse.TotalCount"));
		listEventsResponse.setAction(context.stringValue("ListEventsResponse.Action"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < context.lengthValue("ListEventsResponse.Events.Length"); i++) {
			Event event = new Event();
			event.setId(context.longValue("ListEventsResponse.Events["+ i +"].Id"));
			event.setIdStr(context.stringValue("ListEventsResponse.Events["+ i +"].IdStr"));
			event.setTitle(context.stringValue("ListEventsResponse.Events["+ i +"].Title"));
			event.setBannerPhotoId(context.stringValue("ListEventsResponse.Events["+ i +"].BannerPhotoId"));
			event.setIdentity(context.stringValue("ListEventsResponse.Events["+ i +"].Identity"));
			event.setSplashPhotoId(context.stringValue("ListEventsResponse.Events["+ i +"].SplashPhotoId"));
			event.setState(context.stringValue("ListEventsResponse.Events["+ i +"].State"));
			event.setWeixinTitle(context.stringValue("ListEventsResponse.Events["+ i +"].WeixinTitle"));
			event.setWatermarkPhotoId(context.stringValue("ListEventsResponse.Events["+ i +"].WatermarkPhotoId"));
			event.setStartAt(context.longValue("ListEventsResponse.Events["+ i +"].StartAt"));
			event.setEndAt(context.longValue("ListEventsResponse.Events["+ i +"].EndAt"));
			event.setCtime(context.longValue("ListEventsResponse.Events["+ i +"].Ctime"));
			event.setMtime(context.longValue("ListEventsResponse.Events["+ i +"].Mtime"));
			event.setViewsCount(context.longValue("ListEventsResponse.Events["+ i +"].ViewsCount"));
			event.setLibraryId(context.stringValue("ListEventsResponse.Events["+ i +"].LibraryId"));
			event.setIdStr1(context.stringValue("ListEventsResponse.Events["+ i +"].IdStr"));

			events.add(event);
		}
		listEventsResponse.setEvents(events);
	 
	 	return listEventsResponse;
	}
}