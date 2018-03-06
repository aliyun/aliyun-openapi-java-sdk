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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.ListTimeLinesResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListTimeLinesResponse.TimeLine;
import com.aliyuncs.cloudphoto.model.v20170711.ListTimeLinesResponse.TimeLine.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTimeLinesResponseUnmarshaller {

	public static ListTimeLinesResponse unmarshall(ListTimeLinesResponse listTimeLinesResponse, UnmarshallerContext context) {
		
		listTimeLinesResponse.setRequestId(context.stringValue("ListTimeLinesResponse.RequestId"));
		listTimeLinesResponse.setCode(context.stringValue("ListTimeLinesResponse.Code"));
		listTimeLinesResponse.setMessage(context.stringValue("ListTimeLinesResponse.Message"));
		listTimeLinesResponse.setNextCursor(context.integerValue("ListTimeLinesResponse.NextCursor"));
		listTimeLinesResponse.setAction(context.stringValue("ListTimeLinesResponse.Action"));

		List<TimeLine> timeLines = new ArrayList<TimeLine>();
		for (int i = 0; i < context.lengthValue("ListTimeLinesResponse.TimeLines.Length"); i++) {
			TimeLine timeLine = new TimeLine();
			timeLine.setStartTime(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].StartTime"));
			timeLine.setEndTime(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].EndTime"));
			timeLine.setTotalCount(context.integerValue("ListTimeLinesResponse.TimeLines["+ i +"].TotalCount"));
			timeLine.setPhotosCount(context.integerValue("ListTimeLinesResponse.TimeLines["+ i +"].PhotosCount"));

			List<Photo> photos = new ArrayList<Photo>();
			for (int j = 0; j < context.lengthValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos.Length"); j++) {
				Photo photo = new Photo();
				photo.setId(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Id"));
				photo.setIdStr(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].IdStr"));
				photo.setTitle(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Title"));
				photo.setLocation(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Location"));
				photo.setFileId(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].FileId"));
				photo.setState(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].State"));
				photo.setMd5(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Md5"));
				photo.setIsVideo(context.booleanValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].IsVideo"));
				photo.setRemark(context.stringValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Remark"));
				photo.setSize(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Size"));
				photo.setWidth(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Width"));
				photo.setHeight(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Height"));
				photo.setCtime(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Ctime"));
				photo.setMtime(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Mtime"));
				photo.setTakenAt(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].TakenAt"));
				photo.setShareExpireTime(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].ShareExpireTime"));
				photo.setLike(context.longValue("ListTimeLinesResponse.TimeLines["+ i +"].Photos["+ j +"].Like"));

				photos.add(photo);
			}
			timeLine.setPhotos(photos);

			timeLines.add(timeLine);
		}
		listTimeLinesResponse.setTimeLines(timeLines);
	 
	 	return listTimeLinesResponse;
	}
}