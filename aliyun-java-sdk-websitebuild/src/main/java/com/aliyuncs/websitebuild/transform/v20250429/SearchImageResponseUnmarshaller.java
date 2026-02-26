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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.SearchImageResponse;
import com.aliyuncs.websitebuild.model.v20250429.SearchImageResponse.ImageResponse;
import com.aliyuncs.websitebuild.model.v20250429.SearchImageResponse.ImageResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImageResponseUnmarshaller {

	public static SearchImageResponse unmarshall(SearchImageResponse searchImageResponse, UnmarshallerContext _ctx) {
		
		searchImageResponse.setRequestId(_ctx.stringValue("SearchImageResponse.RequestId"));
		searchImageResponse.setErrorMsg(_ctx.stringValue("SearchImageResponse.ErrorMsg"));
		searchImageResponse.setSuccess(_ctx.stringValue("SearchImageResponse.Success"));
		searchImageResponse.setErrorCode(_ctx.stringValue("SearchImageResponse.ErrorCode"));

		ImageResponse imageResponse = new ImageResponse();
		imageResponse.setMaxResults(_ctx.integerValue("SearchImageResponse.ImageResponse.MaxResults"));
		imageResponse.setNextToken(_ctx.stringValue("SearchImageResponse.ImageResponse.NextToken"));

		List<Image> imageList = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("SearchImageResponse.ImageResponse.ImageList.Length"); i++) {
			Image image = new Image();
			image.setImageUuid(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].ImageUuid"));
			image.setOssKey(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].OssKey"));
			image.setUrl(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].Url"));
			image.setWidth(_ctx.integerValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].Width"));
			image.setHeight(_ctx.integerValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].Height"));
			image.setImageRatio(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].ImageRatio"));
			image.setImageCategory(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].ImageCategory"));
			image.setTagsFromImage(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].TagsFromImage"));
			image.setDescriptiveTones(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].DescriptiveTones"));
			image.setQuantitativePalette(_ctx.stringValue("SearchImageResponse.ImageResponse.ImageList["+ i +"].QuantitativePalette"));

			imageList.add(image);
		}
		imageResponse.setImageList(imageList);
		searchImageResponse.setImageResponse(imageResponse);
	 
	 	return searchImageResponse;
	}
}