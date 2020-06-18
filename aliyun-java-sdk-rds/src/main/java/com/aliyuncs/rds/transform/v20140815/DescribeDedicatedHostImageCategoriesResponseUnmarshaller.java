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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostImageCategoriesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDedicatedHostImageCategoriesResponse.ImagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostImageCategoriesResponseUnmarshaller {

	public static DescribeDedicatedHostImageCategoriesResponse unmarshall(DescribeDedicatedHostImageCategoriesResponse describeDedicatedHostImageCategoriesResponse, UnmarshallerContext _ctx) {
		
		describeDedicatedHostImageCategoriesResponse.setRequestId(_ctx.stringValue("DescribeDedicatedHostImageCategoriesResponse.RequestId"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDedicatedHostImageCategoriesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setImageName(_ctx.stringValue("DescribeDedicatedHostImageCategoriesResponse.Images["+ i +"].ImageName"));
			imagesItem.setImageCode(_ctx.stringValue("DescribeDedicatedHostImageCategoriesResponse.Images["+ i +"].ImageCode"));

			images.add(imagesItem);
		}
		describeDedicatedHostImageCategoriesResponse.setImages(images);
	 
	 	return describeDedicatedHostImageCategoriesResponse;
	}
}