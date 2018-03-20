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

import com.aliyuncs.cloudphoto.model.v20170711.GetEventResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetEventResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventResponseUnmarshaller {

	public static GetEventResponse unmarshall(GetEventResponse getEventResponse, UnmarshallerContext context) {
		
		getEventResponse.setRequestId(context.stringValue("GetEventResponse.RequestId"));
		getEventResponse.setCode(context.stringValue("GetEventResponse.Code"));
		getEventResponse.setMessage(context.stringValue("GetEventResponse.Message"));
		getEventResponse.setAction(context.stringValue("GetEventResponse.Action"));

		Event event = new Event();
		event.setId(context.longValue("GetEventResponse.Event.Id"));
		event.setIdStr(context.stringValue("GetEventResponse.Event.IdStr"));
		event.setTitle(context.stringValue("GetEventResponse.Event.Title"));
		event.setBannerPhotoId(context.stringValue("GetEventResponse.Event.BannerPhotoId"));
		event.setIdentity(context.stringValue("GetEventResponse.Event.Identity"));
		event.setSplashPhotoId(context.stringValue("GetEventResponse.Event.SplashPhotoId"));
		event.setState(context.stringValue("GetEventResponse.Event.State"));
		event.setWeixinTitle(context.stringValue("GetEventResponse.Event.WeixinTitle"));
		event.setWatermarkPhotoId(context.stringValue("GetEventResponse.Event.WatermarkPhotoId"));
		event.setStartAt(context.longValue("GetEventResponse.Event.StartAt"));
		event.setEndAt(context.longValue("GetEventResponse.Event.EndAt"));
		event.setCtime(context.longValue("GetEventResponse.Event.Ctime"));
		event.setMtime(context.longValue("GetEventResponse.Event.Mtime"));
		event.setViewsCount(context.longValue("GetEventResponse.Event.ViewsCount"));
		event.setLibraryId(context.stringValue("GetEventResponse.Event.LibraryId"));
		event.setIdStr1(context.stringValue("GetEventResponse.Event.IdStr"));
		getEventResponse.setEvent(event);
	 
	 	return getEventResponse;
	}
}