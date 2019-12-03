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

package com.aliyuncs.multimediaai.transform.v20190810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.multimediaai.model.v20190810.ListFaceImagesResponse;
import com.aliyuncs.multimediaai.model.v20190810.ListFaceImagesResponse.FaceImage;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceImagesResponseUnmarshaller {

	public static ListFaceImagesResponse unmarshall(ListFaceImagesResponse listFaceImagesResponse, UnmarshallerContext _ctx) {
		
		listFaceImagesResponse.setRequestId(_ctx.stringValue("ListFaceImagesResponse.RequestId"));
		listFaceImagesResponse.setPageNumber(_ctx.integerValue("ListFaceImagesResponse.PageNumber"));
		listFaceImagesResponse.setPageSize(_ctx.integerValue("ListFaceImagesResponse.PageSize"));
		listFaceImagesResponse.setTotalCount(_ctx.longValue("ListFaceImagesResponse.TotalCount"));

		List<FaceImage> faceImages = new ArrayList<FaceImage>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceImagesResponse.FaceImages.Length"); i++) {
			FaceImage faceImage = new FaceImage();
			faceImage.setFaceImageId(_ctx.longValue("ListFaceImagesResponse.FaceImages["+ i +"].FaceImageId"));
			faceImage.setImageUrl(_ctx.stringValue("ListFaceImagesResponse.FaceImages["+ i +"].ImageUrl"));

			List<Float> faceRectangle = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ListFaceImagesResponse.FaceImages["+ i +"].FaceRectangle.Length"); j++) {
				faceRectangle.add(_ctx.floatValue("ListFaceImagesResponse.FaceImages["+ i +"].FaceRectangle["+ j +"]"));
			}
			faceImage.setFaceRectangle(faceRectangle);

			faceImages.add(faceImage);
		}
		listFaceImagesResponse.setFaceImages(faceImages);
	 
	 	return listFaceImagesResponse;
	}
}