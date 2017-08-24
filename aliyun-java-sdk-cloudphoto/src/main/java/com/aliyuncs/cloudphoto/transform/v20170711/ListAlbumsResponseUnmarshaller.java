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

import com.aliyuncs.cloudphoto.model.v20170711.ListAlbumsResponse;
import com.aliyuncs.cloudphoto.model.v20170711.ListAlbumsResponse.Album;
import com.aliyuncs.cloudphoto.model.v20170711.ListAlbumsResponse.Album.Cover;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlbumsResponseUnmarshaller {

	public static ListAlbumsResponse unmarshall(ListAlbumsResponse listAlbumsResponse, UnmarshallerContext context) {
		
		listAlbumsResponse.setRequestId(context.stringValue("ListAlbumsResponse.RequestId"));
		listAlbumsResponse.setCode(context.stringValue("ListAlbumsResponse.Code"));
		listAlbumsResponse.setMessage(context.stringValue("ListAlbumsResponse.Message"));
		listAlbumsResponse.setNextCursor(context.stringValue("ListAlbumsResponse.NextCursor"));
		listAlbumsResponse.setTotalCount(context.integerValue("ListAlbumsResponse.TotalCount"));
		listAlbumsResponse.setAction(context.stringValue("ListAlbumsResponse.Action"));

		List<Album> albums = new ArrayList<Album>();
		for (int i = 0; i < context.lengthValue("ListAlbumsResponse.Albums.Length"); i++) {
			Album album = new Album();
			album.setId(context.longValue("ListAlbumsResponse.Albums["+ i +"].Id"));
			album.setName(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Name"));
			album.setState(context.stringValue("ListAlbumsResponse.Albums["+ i +"].State"));
			album.setPhotosCount(context.longValue("ListAlbumsResponse.Albums["+ i +"].PhotosCount"));
			album.setCtime(context.longValue("ListAlbumsResponse.Albums["+ i +"].Ctime"));
			album.setMtime(context.longValue("ListAlbumsResponse.Albums["+ i +"].Mtime"));

			Cover cover = new Cover();
			cover.setId(context.longValue("ListAlbumsResponse.Albums["+ i +"].Cover.Id"));
			cover.setTitle(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Cover.Title"));
			cover.setFileId(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Cover.FileId"));
			cover.setState(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Cover.State"));
			cover.setMd5(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Cover.Md5"));
			cover.setIsVideo(context.booleanValue("ListAlbumsResponse.Albums["+ i +"].Cover.IsVideo"));
			cover.setRemark(context.stringValue("ListAlbumsResponse.Albums["+ i +"].Cover.Remark"));
			cover.setWidth(context.longValue("ListAlbumsResponse.Albums["+ i +"].Cover.Width"));
			cover.setHeight(context.longValue("ListAlbumsResponse.Albums["+ i +"].Cover.Height"));
			cover.setCtime(context.longValue("ListAlbumsResponse.Albums["+ i +"].Cover.Ctime"));
			cover.setMtime(context.longValue("ListAlbumsResponse.Albums["+ i +"].Cover.Mtime"));
			album.setCover(cover);

			albums.add(album);
		}
		listAlbumsResponse.setAlbums(albums);
	 
	 	return listAlbumsResponse;
	}
}