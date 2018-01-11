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

import com.aliyuncs.cloudphoto.model.v20170711.RegisterPhotoResponse;
import com.aliyuncs.cloudphoto.model.v20170711.RegisterPhotoResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterPhotoResponseUnmarshaller {

	public static RegisterPhotoResponse unmarshall(RegisterPhotoResponse registerPhotoResponse, UnmarshallerContext context) {
		
		registerPhotoResponse.setRequestId(context.stringValue("RegisterPhotoResponse.RequestId"));
		registerPhotoResponse.setCode(context.stringValue("RegisterPhotoResponse.Code"));
		registerPhotoResponse.setMessage(context.stringValue("RegisterPhotoResponse.Message"));
		registerPhotoResponse.setAction(context.stringValue("RegisterPhotoResponse.Action"));

		Photo photo = new Photo();
		photo.setId(context.longValue("RegisterPhotoResponse.Photo.Id"));
		photo.setTitle(context.stringValue("RegisterPhotoResponse.Photo.Title"));
		photo.setLocation(context.stringValue("RegisterPhotoResponse.Photo.Location"));
		photo.setFileId(context.stringValue("RegisterPhotoResponse.Photo.FileId"));
		photo.setState(context.stringValue("RegisterPhotoResponse.Photo.State"));
		photo.setMd5(context.stringValue("RegisterPhotoResponse.Photo.Md5"));
		photo.setIsVideo(context.booleanValue("RegisterPhotoResponse.Photo.IsVideo"));
		photo.setSize(context.longValue("RegisterPhotoResponse.Photo.Size"));
		photo.setRemark(context.stringValue("RegisterPhotoResponse.Photo.Remark"));
		photo.setWidth(context.longValue("RegisterPhotoResponse.Photo.Width"));
		photo.setHeight(context.longValue("RegisterPhotoResponse.Photo.Height"));
		photo.setCtime(context.longValue("RegisterPhotoResponse.Photo.Ctime"));
		photo.setMtime(context.longValue("RegisterPhotoResponse.Photo.Mtime"));
		photo.setTakenAt(context.longValue("RegisterPhotoResponse.Photo.TakenAt"));
		photo.setShareExpireTime(context.longValue("RegisterPhotoResponse.Photo.ShareExpireTime"));
		registerPhotoResponse.setPhoto(photo);
	 
	 	return registerPhotoResponse;
	}
}