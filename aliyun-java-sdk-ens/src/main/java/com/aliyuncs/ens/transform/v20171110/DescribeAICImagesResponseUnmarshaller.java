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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeAICImagesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeAICImagesResponse.ImagesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAICImagesResponseUnmarshaller {

	public static DescribeAICImagesResponse unmarshall(DescribeAICImagesResponse describeAICImagesResponse, UnmarshallerContext _ctx) {
		
		describeAICImagesResponse.setRequestId(_ctx.stringValue("DescribeAICImagesResponse.RequestId"));
		describeAICImagesResponse.setPageNumber(_ctx.integerValue("DescribeAICImagesResponse.PageNumber"));
		describeAICImagesResponse.setPageSize(_ctx.integerValue("DescribeAICImagesResponse.PageSize"));
		describeAICImagesResponse.setTotalCount(_ctx.integerValue("DescribeAICImagesResponse.TotalCount"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAICImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setImageUrl(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].ImageUrl"));
			imagesItem.setImageId(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].ImageId"));
			imagesItem.setUser(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].User"));
			imagesItem.setStatus(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].Status"));
			imagesItem.setCreationTime(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].CreationTime"));
			imagesItem.setDescription(_ctx.stringValue("DescribeAICImagesResponse.Images["+ i +"].Description"));

			images.add(imagesItem);
		}
		describeAICImagesResponse.setImages(images);
	 
	 	return describeAICImagesResponse;
	}
}