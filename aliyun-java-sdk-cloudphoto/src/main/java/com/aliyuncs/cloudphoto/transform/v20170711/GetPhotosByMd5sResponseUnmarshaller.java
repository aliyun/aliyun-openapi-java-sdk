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

import com.aliyuncs.cloudphoto.model.v20170711.GetPhotosByMd5sResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetPhotosByMd5sResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhotosByMd5sResponseUnmarshaller {

	public static GetPhotosByMd5sResponse unmarshall(GetPhotosByMd5sResponse getPhotosByMd5sResponse, UnmarshallerContext context) {
		
		getPhotosByMd5sResponse.setRequestId(context.stringValue("GetPhotosByMd5sResponse.RequestId"));
		getPhotosByMd5sResponse.setCode(context.stringValue("GetPhotosByMd5sResponse.Code"));
		getPhotosByMd5sResponse.setMessage(context.stringValue("GetPhotosByMd5sResponse.Message"));
		getPhotosByMd5sResponse.setAction(context.stringValue("GetPhotosByMd5sResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("GetPhotosByMd5sResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Id"));
			photo.setTitle(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("GetPhotosByMd5sResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("GetPhotosByMd5sResponse.Photos["+ i +"].Remark"));
			photo.setSize(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Size"));
			photo.setWidth(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].TakenAt"));
			photo.setShareExpireTime(context.longValue("GetPhotosByMd5sResponse.Photos["+ i +"].ShareExpireTime"));

			photos.add(photo);
		}
		getPhotosByMd5sResponse.setPhotos(photos);
	 
	 	return getPhotosByMd5sResponse;
	}
}