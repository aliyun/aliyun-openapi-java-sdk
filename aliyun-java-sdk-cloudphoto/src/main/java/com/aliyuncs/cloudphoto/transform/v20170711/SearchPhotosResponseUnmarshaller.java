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

import com.aliyuncs.cloudphoto.model.v20170711.SearchPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.SearchPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchPhotosResponseUnmarshaller {

	public static SearchPhotosResponse unmarshall(SearchPhotosResponse searchPhotosResponse, UnmarshallerContext context) {
		
		searchPhotosResponse.setRequestId(context.stringValue("SearchPhotosResponse.RequestId"));
		searchPhotosResponse.setCode(context.stringValue("SearchPhotosResponse.Code"));
		searchPhotosResponse.setMessage(context.stringValue("SearchPhotosResponse.Message"));
		searchPhotosResponse.setTotalCount(context.integerValue("SearchPhotosResponse.TotalCount"));
		searchPhotosResponse.setAction(context.stringValue("SearchPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("SearchPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("SearchPhotosResponse.Photos["+ i +"].Id"));
			photo.setIdStr(context.stringValue("SearchPhotosResponse.Photos["+ i +"].IdStr"));
			photo.setTitle(context.stringValue("SearchPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("SearchPhotosResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("SearchPhotosResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("SearchPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("SearchPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("SearchPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setSize(context.longValue("SearchPhotosResponse.Photos["+ i +"].Size"));
			photo.setWidth(context.longValue("SearchPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("SearchPhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("SearchPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("SearchPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("SearchPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setShareExpireTime(context.longValue("SearchPhotosResponse.Photos["+ i +"].ShareExpireTime"));

			photos.add(photo);
		}
		searchPhotosResponse.setPhotos(photos);
	 
	 	return searchPhotosResponse;
	}
}