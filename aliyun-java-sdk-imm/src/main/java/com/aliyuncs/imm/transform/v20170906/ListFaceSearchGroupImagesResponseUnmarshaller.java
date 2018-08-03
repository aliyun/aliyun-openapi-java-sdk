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

import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupImagesResponse;
import com.aliyuncs.imm.model.v20170906.ListFaceSearchGroupImagesResponse.ImagesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceSearchGroupImagesResponseUnmarshaller {

	public static ListFaceSearchGroupImagesResponse unmarshall(ListFaceSearchGroupImagesResponse listFaceSearchGroupImagesResponse, UnmarshallerContext context) {
		
		listFaceSearchGroupImagesResponse.setRequestId(context.stringValue("ListFaceSearchGroupImagesResponse.RequestId"));
		listFaceSearchGroupImagesResponse.setNextMarker(context.stringValue("ListFaceSearchGroupImagesResponse.NextMarker"));
		listFaceSearchGroupImagesResponse.setGroupName(context.stringValue("ListFaceSearchGroupImagesResponse.GroupName"));
		listFaceSearchGroupImagesResponse.setGroupId(context.stringValue("ListFaceSearchGroupImagesResponse.GroupId"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < context.lengthValue("ListFaceSearchGroupImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setUser(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].User"));
			imagesItem.setImageId(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageId"));
			imagesItem.setImageUrl(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageUrl"));
			imagesItem.setImageMd5(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageMd5"));
			imagesItem.setRoll(context.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Roll"));
			imagesItem.setFaceId(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].FaceId"));
			imagesItem.setYaw(context.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Yaw"));
			imagesItem.setQuality(context.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Quality"));
			imagesItem.setGlasses(context.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Glasses"));
			imagesItem.setHat(context.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Hat"));
			imagesItem.setPitch(context.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Pitch"));
			imagesItem.setAge(context.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Age"));
			imagesItem.setGender(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Gender"));

			List<String> axis = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Axis.Length"); j++) {
				axis.add(context.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Axis["+ j +"]"));
			}
			imagesItem.setAxis(axis);

			images.add(imagesItem);
		}
		listFaceSearchGroupImagesResponse.setImages(images);
	 
	 	return listFaceSearchGroupImagesResponse;
	}
}