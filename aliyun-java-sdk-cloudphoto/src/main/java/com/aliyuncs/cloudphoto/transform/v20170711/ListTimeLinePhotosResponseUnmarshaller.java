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

import com.aliyuncs.cloudphoto.model.v20170711.ListTimeLinePhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListTimeLinePhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTimeLinePhotosResponseUnmarshaller {

	public static ListTimeLinePhotosResponse unmarshall(ListTimeLinePhotosResponse listTimeLinePhotosResponse, UnmarshallerContext context) {
		
		listTimeLinePhotosResponse.setRequestId(context.stringValue("ListTimeLinePhotosResponse.RequestId"));
		listTimeLinePhotosResponse.setCode(context.stringValue("ListTimeLinePhotosResponse.Code"));
		listTimeLinePhotosResponse.setMessage(context.stringValue("ListTimeLinePhotosResponse.Message"));
		listTimeLinePhotosResponse.setTotalCount(context.integerValue("ListTimeLinePhotosResponse.TotalCount"));
		listTimeLinePhotosResponse.setAction(context.stringValue("ListTimeLinePhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("ListTimeLinePhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Id"));
			photo.setTitle(context.stringValue("ListTimeLinePhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("ListTimeLinePhotosResponse.Photos["+ i +"].FileId"));
			photo.setState(context.stringValue("ListTimeLinePhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("ListTimeLinePhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("ListTimeLinePhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("ListTimeLinePhotosResponse.Photos["+ i +"].Remark"));
			photo.setWidth(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setShareExpireTime(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].ShareExpireTime"));
			photo.setLike(context.longValue("ListTimeLinePhotosResponse.Photos["+ i +"].Like"));

			photos.add(photo);
		}
		listTimeLinePhotosResponse.setPhotos(photos);
	 
	 	return listTimeLinePhotosResponse;
	}
}