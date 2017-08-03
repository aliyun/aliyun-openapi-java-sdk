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

import com.aliyuncs.cloudphoto.model.v20170711.CreateAlbumResponse;
import com.aliyuncs.cloudphoto.model.v20170711.CreateAlbumResponse.Album;
import com.aliyuncs.cloudphoto.model.v20170711.CreateAlbumResponse.Album.Cover;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAlbumResponseUnmarshaller {

	public static CreateAlbumResponse unmarshall(CreateAlbumResponse createAlbumResponse, UnmarshallerContext context) {
		
		createAlbumResponse.setRequestId(context.stringValue("CreateAlbumResponse.RequestId"));
		createAlbumResponse.setCode(context.stringValue("CreateAlbumResponse.Code"));
		createAlbumResponse.setMessage(context.stringValue("CreateAlbumResponse.Message"));
		createAlbumResponse.setAction(context.stringValue("CreateAlbumResponse.Action"));

		Album album = new Album();
		album.setId(context.longValue("CreateAlbumResponse.Album.Id"));
		album.setName(context.stringValue("CreateAlbumResponse.Album.Name"));
		album.setState(context.stringValue("CreateAlbumResponse.Album.State"));
		album.setPhotosCount(context.longValue("CreateAlbumResponse.Album.PhotosCount"));
		album.setCtime(context.longValue("CreateAlbumResponse.Album.Ctime"));
		album.setMtime(context.longValue("CreateAlbumResponse.Album.Mtime"));

		Cover cover = new Cover();
		cover.setId(context.longValue("CreateAlbumResponse.Album.Cover.Id"));
		cover.setTitle(context.stringValue("CreateAlbumResponse.Album.Cover.Title"));
		cover.setFileId(context.stringValue("CreateAlbumResponse.Album.Cover.FileId"));
		cover.setState(context.stringValue("CreateAlbumResponse.Album.Cover.State"));
		cover.setMd5(context.stringValue("CreateAlbumResponse.Album.Cover.Md5"));
		cover.setIsVideo(context.booleanValue("CreateAlbumResponse.Album.Cover.IsVideo"));
		cover.setWidth(context.longValue("CreateAlbumResponse.Album.Cover.Width"));
		cover.setHeight(context.longValue("CreateAlbumResponse.Album.Cover.Height"));
		cover.setCtime(context.longValue("CreateAlbumResponse.Album.Cover.Ctime"));
		cover.setMtime(context.longValue("CreateAlbumResponse.Album.Cover.Mtime"));
		album.setCover(cover);
		createAlbumResponse.setAlbum(album);
	 
	 	return createAlbumResponse;
	}
}