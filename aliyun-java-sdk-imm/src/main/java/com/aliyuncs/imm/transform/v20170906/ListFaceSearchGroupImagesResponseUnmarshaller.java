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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceSearchGroupImagesResponseUnmarshaller {

	public static ListFaceSearchGroupImagesResponse unmarshall(ListFaceSearchGroupImagesResponse listFaceSearchGroupImagesResponse, UnmarshallerContext _ctx) {
		
		listFaceSearchGroupImagesResponse.setRequestId(_ctx.stringValue("ListFaceSearchGroupImagesResponse.RequestId"));
		listFaceSearchGroupImagesResponse.setNextMarker(_ctx.stringValue("ListFaceSearchGroupImagesResponse.NextMarker"));
		listFaceSearchGroupImagesResponse.setGroupName(_ctx.stringValue("ListFaceSearchGroupImagesResponse.GroupName"));
		listFaceSearchGroupImagesResponse.setGroupId(_ctx.stringValue("ListFaceSearchGroupImagesResponse.GroupId"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceSearchGroupImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setUser(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].User"));
			imagesItem.setImageId(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageId"));
			imagesItem.setImageUri(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageMd5(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].ImageMd5"));
			imagesItem.setRoll(_ctx.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Roll"));
			imagesItem.setFaceId(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].FaceId"));
			imagesItem.setYaw(_ctx.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Yaw"));
			imagesItem.setQuality(_ctx.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Quality"));
			imagesItem.setGlasses(_ctx.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Glasses"));
			imagesItem.setHat(_ctx.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Hat"));
			imagesItem.setPitch(_ctx.floatValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Pitch"));
			imagesItem.setAge(_ctx.integerValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Age"));
			imagesItem.setGender(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Gender"));

			List<String> axis = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Axis.Length"); j++) {
				axis.add(_ctx.stringValue("ListFaceSearchGroupImagesResponse.Images["+ i +"].Axis["+ j +"]"));
			}
			imagesItem.setAxis(axis);

			images.add(imagesItem);
		}
		listFaceSearchGroupImagesResponse.setImages(images);
	 
	 	return listFaceSearchGroupImagesResponse;
	}
}