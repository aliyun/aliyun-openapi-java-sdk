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

import com.aliyuncs.cloudphoto.model.v20170711.GetSimilarPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetSimilarPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSimilarPhotosResponseUnmarshaller {

	public static GetSimilarPhotosResponse unmarshall(GetSimilarPhotosResponse getSimilarPhotosResponse, UnmarshallerContext context) {
		
		getSimilarPhotosResponse.setRequestId(context.stringValue("GetSimilarPhotosResponse.RequestId"));
		getSimilarPhotosResponse.setCode(context.stringValue("GetSimilarPhotosResponse.Code"));
		getSimilarPhotosResponse.setMessage(context.stringValue("GetSimilarPhotosResponse.Message"));
		getSimilarPhotosResponse.setAction(context.stringValue("GetSimilarPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("GetSimilarPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Id"));
			photo.setTitle(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("GetSimilarPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("GetSimilarPhotosResponse.Photos["+ i +"].Remark"));
			photo.setSize(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Size"));
			photo.setWidth(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setInactiveTime(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].InactiveTime"));
			photo.setShareExpireTime(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].ShareExpireTime"));
			photo.setLike(context.longValue("GetSimilarPhotosResponse.Photos["+ i +"].Like"));

			photos.add(photo);
		}
		getSimilarPhotosResponse.setPhotos(photos);
	 
	 	return getSimilarPhotosResponse;
	}
}