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

import com.aliyuncs.cloudphoto.model.v20170711.CreatePhotoResponse;
import com.aliyuncs.cloudphoto.model.v20170711.CreatePhotoResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePhotoResponseUnmarshaller {

	public static CreatePhotoResponse unmarshall(CreatePhotoResponse createPhotoResponse, UnmarshallerContext context) {
		
		createPhotoResponse.setRequestId(context.stringValue("CreatePhotoResponse.RequestId"));
		createPhotoResponse.setCode(context.stringValue("CreatePhotoResponse.Code"));
		createPhotoResponse.setMessage(context.stringValue("CreatePhotoResponse.Message"));
		createPhotoResponse.setAction(context.stringValue("CreatePhotoResponse.Action"));

		Photo photo = new Photo();
		photo.setId(context.longValue("CreatePhotoResponse.Photo.Id"));
		photo.setTitle(context.stringValue("CreatePhotoResponse.Photo.Title"));
		photo.setFileId(context.stringValue("CreatePhotoResponse.Photo.FileId"));
		photo.setState(context.stringValue("CreatePhotoResponse.Photo.State"));
		photo.setMd5(context.stringValue("CreatePhotoResponse.Photo.Md5"));
		photo.setIsVideo(context.booleanValue("CreatePhotoResponse.Photo.IsVideo"));
		photo.setRemark(context.stringValue("CreatePhotoResponse.Photo.Remark"));
		photo.setWidth(context.longValue("CreatePhotoResponse.Photo.Width"));
		photo.setHeight(context.longValue("CreatePhotoResponse.Photo.Height"));
		photo.setCtime(context.longValue("CreatePhotoResponse.Photo.Ctime"));
		photo.setMtime(context.longValue("CreatePhotoResponse.Photo.Mtime"));
		photo.setTakenAt(context.longValue("CreatePhotoResponse.Photo.TakenAt"));
		createPhotoResponse.setPhoto(photo);
	 
	 	return createPhotoResponse;
	}
}