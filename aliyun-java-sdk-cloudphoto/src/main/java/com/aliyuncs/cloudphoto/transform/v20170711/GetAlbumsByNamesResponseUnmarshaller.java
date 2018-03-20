/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cloudphoto.transform.v20170711;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudphoto.model.v20170711.GetAlbumsByNamesResponse;
import com.aliyuncs.cloudphoto.model.v20170711.GetAlbumsByNamesResponse.Album;
import com.aliyuncs.cloudphoto.model.v20170711.GetAlbumsByNamesResponse.Album.Cover;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAlbumsByNamesResponseUnmarshaller {

	public static GetAlbumsByNamesResponse unmarshall(GetAlbumsByNamesResponse getAlbumsByNamesResponse, UnmarshallerContext context) {
		
		getAlbumsByNamesResponse.setRequestId(context.stringValue("GetAlbumsByNamesResponse.RequestId"));
		getAlbumsByNamesResponse.setCode(context.stringValue("GetAlbumsByNamesResponse.Code"));
		getAlbumsByNamesResponse.setMessage(context.stringValue("GetAlbumsByNamesResponse.Message"));
		getAlbumsByNamesResponse.setAction(context.stringValue("GetAlbumsByNamesResponse.Action"));

		List<Album> albums = new ArrayList<Album>();
		for (int i = 0; i < context.lengthValue("GetAlbumsByNamesResponse.Albums.Length"); i++) {
			Album album = new Album();
			album.setId(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Id"));
			album.setIdStr(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].IdStr"));
			album.setName(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Name"));
			album.setState(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].State"));
			album.setPhotosCount(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].PhotosCount"));
			album.setCtime(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Ctime"));
			album.setMtime(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Mtime"));

			Cover cover = new Cover();
			cover.setId(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Id"));
			cover.setIdStr(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.IdStr"));
			cover.setTitle(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Title"));
			cover.setFileId(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.FileId"));
			cover.setState(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.State"));
			cover.setMd5(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Md5"));
			cover.setIsVideo(context.booleanValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.IsVideo"));
			cover.setRemark(context.stringValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Remark"));
			cover.setWidth(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Width"));
			cover.setHeight(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Height"));
			cover.setCtime(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Ctime"));
			cover.setMtime(context.longValue("GetAlbumsByNamesResponse.Albums["+ i +"].Cover.Mtime"));
			album.setCover(cover);

			albums.add(album);
		}
		getAlbumsByNamesResponse.setAlbums(albums);
	 
	 	return getAlbumsByNamesResponse;
	}
}