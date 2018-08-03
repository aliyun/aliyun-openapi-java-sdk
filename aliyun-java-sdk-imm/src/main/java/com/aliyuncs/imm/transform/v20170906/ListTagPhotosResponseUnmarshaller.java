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

import com.aliyuncs.imm.model.v20170906.ListTagPhotosResponse;
import com.aliyuncs.imm.model.v20170906.ListTagPhotosResponse.PhotosItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagPhotosResponseUnmarshaller {

	public static ListTagPhotosResponse unmarshall(ListTagPhotosResponse listTagPhotosResponse, UnmarshallerContext context) {
		
		listTagPhotosResponse.setRequestId(context.stringValue("ListTagPhotosResponse.RequestId"));
		listTagPhotosResponse.setNextMarker(context.stringValue("ListTagPhotosResponse.NextMarker"));

		List<PhotosItem> photos = new ArrayList<PhotosItem>();
		for (int i = 0; i < context.lengthValue("ListTagPhotosResponse.Photos.Length"); i++) {
			PhotosItem photosItem = new PhotosItem();
			photosItem.setSrcUri(context.stringValue("ListTagPhotosResponse.Photos["+ i +"].SrcUri"));
			photosItem.setTagScore(context.floatValue("ListTagPhotosResponse.Photos["+ i +"].TagScore"));

			photos.add(photosItem);
		}
		listTagPhotosResponse.setPhotos(photos);
	 
	 	return listTagPhotosResponse;
	}
}