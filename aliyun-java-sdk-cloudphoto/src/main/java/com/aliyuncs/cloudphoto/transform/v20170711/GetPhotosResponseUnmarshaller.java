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

import com.aliyuncs.cloudphoto.model.v20170711.GetPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhotosResponseUnmarshaller {

	public static GetPhotosResponse unmarshall(GetPhotosResponse getPhotosResponse, UnmarshallerContext context) {
		
		getPhotosResponse.setRequestId(context.stringValue("GetPhotosResponse.RequestId"));
		getPhotosResponse.setCode(context.stringValue("GetPhotosResponse.Code"));
		getPhotosResponse.setMessage(context.stringValue("GetPhotosResponse.Message"));
		getPhotosResponse.setAction(context.stringValue("GetPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("GetPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("GetPhotosResponse.Photos["+ i +"].Id"));
			photo.setTitle(context.stringValue("GetPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("GetPhotosResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("GetPhotosResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("GetPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("GetPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("GetPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("GetPhotosResponse.Photos["+ i +"].Remark"));
			photo.setWidth(context.longValue("GetPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("GetPhotosResponse.Photos["+ i +"].Height"));
			photo.setSize(context.longValue("GetPhotosResponse.Photos["+ i +"].Size"));
			photo.setCtime(context.longValue("GetPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("GetPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("GetPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setInactiveTime(context.longValue("GetPhotosResponse.Photos["+ i +"].InactiveTime"));
			photo.setShareExpireTime(context.longValue("GetPhotosResponse.Photos["+ i +"].ShareExpireTime"));
			photo.setLike(context.longValue("GetPhotosResponse.Photos["+ i +"].Like"));

			photos.add(photo);
		}
		getPhotosResponse.setPhotos(photos);
	 
	 	return getPhotosResponse;
	}
}