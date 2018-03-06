/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.transform.v20170711;

import com.aliyuncs.cloudphoto.model.v20170711.CreateEventResponse;
import com.aliyuncs.cloudphoto.model.v20170711.CreateEventResponse.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEventResponseUnmarshaller {

	public static CreateEventResponse unmarshall(CreateEventResponse createEventResponse, UnmarshallerContext context) {
		
		createEventResponse.setRequestId(context.stringValue("CreateEventResponse.RequestId"));
		createEventResponse.setCode(context.stringValue("CreateEventResponse.Code"));
		createEventResponse.setMessage(context.stringValue("CreateEventResponse.Message"));
		createEventResponse.setAction(context.stringValue("CreateEventResponse.Action"));

		Event event = new Event();
		event.setId(context.longValue("CreateEventResponse.Event.Id"));
		event.setIdStr(context.stringValue("CreateEventResponse.Event.IdStr"));
		event.setTitle(context.stringValue("CreateEventResponse.Event.Title"));
		event.setBannerPhotoId(context.stringValue("CreateEventResponse.Event.BannerPhotoId"));
		event.setIdentity(context.stringValue("CreateEventResponse.Event.Identity"));
		event.setSplashPhotoId(context.stringValue("CreateEventResponse.Event.SplashPhotoId"));
		event.setState(context.stringValue("CreateEventResponse.Event.State"));
		event.setWeixinTitle(context.stringValue("CreateEventResponse.Event.WeixinTitle"));
		event.setWatermarkPhotoId(context.stringValue("CreateEventResponse.Event.WatermarkPhotoId"));
		event.setStartAt(context.longValue("CreateEventResponse.Event.StartAt"));
		event.setEndAt(context.longValue("CreateEventResponse.Event.EndAt"));
		event.setCtime(context.longValue("CreateEventResponse.Event.Ctime"));
		event.setMtime(context.longValue("CreateEventResponse.Event.Mtime"));
		event.setViewsCount(context.longValue("CreateEventResponse.Event.ViewsCount"));
		event.setLibraryId(context.stringValue("CreateEventResponse.Event.LibraryId"));
		event.setIdStr1(context.stringValue("CreateEventResponse.Event.IdStr"));
		createEventResponse.setEvent(event);
	 
	 	return createEventResponse;
	}
}