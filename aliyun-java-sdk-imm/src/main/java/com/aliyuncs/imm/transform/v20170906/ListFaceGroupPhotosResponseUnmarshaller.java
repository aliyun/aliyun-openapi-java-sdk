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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListFaceGroupPhotosResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceGroupPhotosResponse.PhotosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceGroupPhotosResponseUnmarshaller {

	public static ListFaceGroupPhotosResponse unmarshall(ListFaceGroupPhotosResponse listFaceGroupPhotosResponse, UnmarshallerContext context) {
		
		listFaceGroupPhotosResponse.setRequestId(context.stringValue("ListFaceGroupPhotosResponse.RequestId"));
		listFaceGroupPhotosResponse.setNextMarker(context.stringValue("ListFaceGroupPhotosResponse.NextMarker"));

		List<PhotosItem> photos = new ArrayList<PhotosItem>();
		for (int i = 0; i < context.lengthValue("ListFaceGroupPhotosResponse.Photos.Length"); i++) {
			PhotosItem photosItem = new PhotosItem();
			photosItem.setPhotoUri(context.stringValue("ListFaceGroupPhotosResponse.Photos["+ i +"].PhotoUri"));
			photosItem.setFaceId(context.stringValue("ListFaceGroupPhotosResponse.Photos["+ i +"].FaceId"));

			photos.add(photosItem);
		}
		listFaceGroupPhotosResponse.setPhotos(photos);
	 
	 	return listFaceGroupPhotosResponse;
	}
}