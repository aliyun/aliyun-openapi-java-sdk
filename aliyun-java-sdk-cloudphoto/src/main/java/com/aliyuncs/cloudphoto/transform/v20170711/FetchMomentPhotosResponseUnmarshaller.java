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

import com.aliyuncs.cloudphoto.model.v20170711.FetchMomentPhotosResponse;
import com.aliyuncs.cloudphoto.model.v20170711.FetchMomentPhotosResponse.Photo;
import com.aliyuncs.transform.UnmarshallerContext;


public class FetchMomentPhotosResponseUnmarshaller {

	public static FetchMomentPhotosResponse unmarshall(FetchMomentPhotosResponse fetchMomentPhotosResponse, UnmarshallerContext context) {
		
		fetchMomentPhotosResponse.setRequestId(context.stringValue("FetchMomentPhotosResponse.RequestId"));
		fetchMomentPhotosResponse.setCode(context.stringValue("FetchMomentPhotosResponse.Code"));
		fetchMomentPhotosResponse.setMessage(context.stringValue("FetchMomentPhotosResponse.Message"));
		fetchMomentPhotosResponse.setTotalCount(context.integerValue("FetchMomentPhotosResponse.TotalCount"));
		fetchMomentPhotosResponse.setAction(context.stringValue("FetchMomentPhotosResponse.Action"));

		List<Photo> photos = new ArrayList<Photo>();
		for (int i = 0; i < context.lengthValue("FetchMomentPhotosResponse.Photos.Length"); i++) {
			Photo photo = new Photo();
			photo.setId(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Id"));
			photo.setIdStr(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].IdStr"));
			photo.setTitle(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].Title"));
			photo.setFileId(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].FileId"));
			photo.setLocation(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].Location"));
			photo.setState(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].State"));
			photo.setMd5(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].Md5"));
			photo.setIsVideo(context.booleanValue("FetchMomentPhotosResponse.Photos["+ i +"].IsVideo"));
			photo.setRemark(context.stringValue("FetchMomentPhotosResponse.Photos["+ i +"].Remark"));
			photo.setSize(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Size"));
			photo.setWidth(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Width"));
			photo.setHeight(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Height"));
			photo.setCtime(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Ctime"));
			photo.setMtime(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].Mtime"));
			photo.setTakenAt(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].TakenAt"));
			photo.setInactiveTime(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].InactiveTime"));
			photo.setShareExpireTime(context.longValue("FetchMomentPhotosResponse.Photos["+ i +"].ShareExpireTime"));

			photos.add(photo);
		}
		fetchMomentPhotosResponse.setPhotos(photos);
	 
	 	return fetchMomentPhotosResponse;
	}
}