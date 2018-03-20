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

import com.aliyuncs.cloudphoto.model.v20170711.EditEventResponse;
import com.aliyuncs.cloudphoto.model.v20170711.EditEventResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class EditEventResponseUnmarshaller {

	public static EditEventResponse unmarshall(EditEventResponse editEventResponse, UnmarshallerContext context) {
		
		editEventResponse.setRequestId(context.stringValue("EditEventResponse.RequestId"));
		editEventResponse.setCode(context.stringValue("EditEventResponse.Code"));
		editEventResponse.setMessage(context.stringValue("EditEventResponse.Message"));
		editEventResponse.setAction(context.stringValue("EditEventResponse.Action"));

		Event event = new Event();
		event.setId(context.longValue("EditEventResponse.Event.Id"));
		event.setIdStr(context.stringValue("EditEventResponse.Event.IdStr"));
		event.setTitle(context.stringValue("EditEventResponse.Event.Title"));
		event.setBannerPhotoId(context.stringValue("EditEventResponse.Event.BannerPhotoId"));
		event.setIdentity(context.stringValue("EditEventResponse.Event.Identity"));
		event.setSplashPhotoId(context.stringValue("EditEventResponse.Event.SplashPhotoId"));
		event.setState(context.stringValue("EditEventResponse.Event.State"));
		event.setWeixinTitle(context.stringValue("EditEventResponse.Event.WeixinTitle"));
		event.setWatermarkPhotoId(context.stringValue("EditEventResponse.Event.WatermarkPhotoId"));
		event.setStartAt(context.longValue("EditEventResponse.Event.StartAt"));
		event.setEndAt(context.longValue("EditEventResponse.Event.EndAt"));
		event.setCtime(context.longValue("EditEventResponse.Event.Ctime"));
		event.setMtime(context.longValue("EditEventResponse.Event.Mtime"));
		event.setViewsCount(context.longValue("EditEventResponse.Event.ViewsCount"));
		event.setLibraryId(context.stringValue("EditEventResponse.Event.LibraryId"));
		event.setIdStr1(context.stringValue("EditEventResponse.Event.IdStr"));
		editEventResponse.setEvent(event);
	 
	 	return editEventResponse;
	}
}