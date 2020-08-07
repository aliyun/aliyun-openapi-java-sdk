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

package com.aliyuncs.premiumpics.transform.v20190619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20190619.SearchImagesResponse;
import com.aliyuncs.premiumpics.model.v20190619.SearchImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImagesResponseUnmarshaller {

	public static SearchImagesResponse unmarshall(SearchImagesResponse searchImagesResponse, UnmarshallerContext _ctx) {
		
		searchImagesResponse.setRequestId(_ctx.stringValue("SearchImagesResponse.RequestId"));
		searchImagesResponse.setSuccess(_ctx.booleanValue("SearchImagesResponse.Success"));
		searchImagesResponse.setErrorMsg(_ctx.stringValue("SearchImagesResponse.ErrorMsg"));
		searchImagesResponse.setErrorCode(_ctx.stringValue("SearchImagesResponse.ErrorCode"));
		searchImagesResponse.setHasNext(_ctx.booleanValue("SearchImagesResponse.HasNext"));
		searchImagesResponse.setTotal(_ctx.integerValue("SearchImagesResponse.Total"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("SearchImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageId(_ctx.stringValue("SearchImagesResponse.Images["+ i +"].ImageId"));
			image.setBuy(_ctx.booleanValue("SearchImagesResponse.Images["+ i +"].Buy"));
			image.setThumbnailUrl(_ctx.stringValue("SearchImagesResponse.Images["+ i +"].ThumbnailUrl"));

			images.add(image);
		}
		searchImagesResponse.setImages(images);
	 
	 	return searchImagesResponse;
	}
}