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

import com.aliyuncs.imm.model.v20170906.GetTagPhotosResponse;
import com.aliyuncs.imm.model.v20170906.GetTagPhotosResponse.PhotosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTagPhotosResponseUnmarshaller {

	public static GetTagPhotosResponse unmarshall(GetTagPhotosResponse getTagPhotosResponse, UnmarshallerContext context) {
		
		getTagPhotosResponse.setRequestId(context.stringValue("GetTagPhotosResponse.RequestId"));
		getTagPhotosResponse.setNextMarker(context.stringValue("GetTagPhotosResponse.NextMarker"));

		List<PhotosItem> photos = new ArrayList<PhotosItem>();
		for (int i = 0; i < context.lengthValue("GetTagPhotosResponse.Photos.Length"); i++) {
			PhotosItem photosItem = new PhotosItem();
			photosItem.setSrcUri(context.stringValue("GetTagPhotosResponse.Photos["+ i +"].SrcUri"));
			photosItem.setTagScore(context.floatValue("GetTagPhotosResponse.Photos["+ i +"].TagScore"));

			photos.add(photosItem);
		}
		getTagPhotosResponse.setPhotos(photos);
	 
	 	return getTagPhotosResponse;
	}
}