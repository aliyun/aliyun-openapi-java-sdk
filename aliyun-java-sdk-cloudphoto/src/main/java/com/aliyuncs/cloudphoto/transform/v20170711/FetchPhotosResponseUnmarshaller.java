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

import com.aliyuncs.cloudphoto.model.v20170711.FetchPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.FetchPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchPhotosResponseUnmarshaller {

	public static FetchPhotosResponse unmarshall(FetchPhotosResponse fetchPhotosResponse, UnmarshallerContext context) {
		
		fetchPhotosResponse.setRequestId(context.stringValue("FetchPhotosResponse.RequestId"));
		fetchPhotosResponse.setCode(context.stringValue("FetchPhotosResponse.Code"));
		fetchPhotosResponse.setMessage(context.stringValue("FetchPhotosResponse.Message"));
		fetchPhotosResponse.setTotalCount(context.integerValue("FetchPhotosResponse.TotalCount"));
		fetchPhotosResponse.setAction(context.stringValue("FetchPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("FetchPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("FetchPhotosResponse.Photos["+ i +"].Id"));
			photo.setIdStr(context.stringValue("FetchPhotosResponse.Photos["+ i +"].IdStr"));
			photo.setTitle(context.stringValue("FetchPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("FetchPhotosResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("FetchPhotosResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("FetchPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("FetchPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("FetchPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("FetchPhotosResponse.Photos["+ i +"].Remark"));
			photo.setSize(context.longValue("FetchPhotosResponse.Photos["+ i +"].Size"));
			photo.setWidth(context.longValue("FetchPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("FetchPhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("FetchPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("FetchPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("FetchPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setInactiveTime(context.longValue("FetchPhotosResponse.Photos["+ i +"].InactiveTime"));
			photo.setShareExpireTime(context.longValue("FetchPhotosResponse.Photos["+ i +"].ShareExpireTime"));

			photos.add(photo);
		}
		fetchPhotosResponse.setPhotos(photos);
	 
	 	return fetchPhotosResponse;
	}
}