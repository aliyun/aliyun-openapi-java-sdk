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

import com.aliyuncs.cloudphoto.model.v20170711.ListPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhotosResponseUnmarshaller {

	public static ListPhotosResponse unmarshall(ListPhotosResponse listPhotosResponse, UnmarshallerContext context) {
		
		listPhotosResponse.setRequestId(context.stringValue("ListPhotosResponse.RequestId"));
		listPhotosResponse.setCode(context.stringValue("ListPhotosResponse.Code"));
		listPhotosResponse.setMessage(context.stringValue("ListPhotosResponse.Message"));
		listPhotosResponse.setNextCursor(context.stringValue("ListPhotosResponse.NextCursor"));
		listPhotosResponse.setTotalCount(context.integerValue("ListPhotosResponse.TotalCount"));
		listPhotosResponse.setAction(context.stringValue("ListPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("ListPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("ListPhotosResponse.Photos["+ i +"].Id"));
			photo.setTitle(context.stringValue("ListPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("ListPhotosResponse.Photos["+ i +"].FileId"));
			photo.setState(context.stringValue("ListPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("ListPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("ListPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("ListPhotosResponse.Photos["+ i +"].Remark"));
			photo.setWidth(context.longValue("ListPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("ListPhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("ListPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("ListPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("ListPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setInactiveTime(context.longValue("ListPhotosResponse.Photos["+ i +"].InactiveTime"));
			photo.setShareExpireTime(context.longValue("ListPhotosResponse.Photos["+ i +"].ShareExpireTime"));

			photos.add(photo);
		}
		listPhotosResponse.setPhotos(photos);
	 
	 	return listPhotosResponse;
	}
}