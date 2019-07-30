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

import com.aliyuncs.ens.model.v20171110.DescribeImagesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImagesResponseUnmarshaller {

	public static DescribeImagesResponse unmarshall(DescribeImagesResponse describeImagesResponse, UnmarshallerContext _ctx) {
		
		describeImagesResponse.setRequestId(_ctx.stringValue("DescribeImagesResponse.RequestId"));
		describeImagesResponse.setCode(_ctx.integerValue("DescribeImagesResponse.Code"));
		describeImagesResponse.setTotalCount(_ctx.integerValue("DescribeImagesResponse.TotalCount"));
		describeImagesResponse.setPageNumber(_ctx.integerValue("DescribeImagesResponse.PageNumber"));
		describeImagesResponse.setPageSize(_ctx.integerValue("DescribeImagesResponse.PageSize"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageId(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageId"));
			image.setImageName(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageName"));
			image.setImageOwnerAlias(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageOwnerAlias"));
			image.setPlatform(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Platform"));
			image.setArchitecture(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].Architecture"));
			image.setCreationTime(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].CreationTime"));
			image.setImageSize(_ctx.stringValue("DescribeImagesResponse.Images["+ i +"].ImageSize"));

			images.add(image);
		}
		describeImagesResponse.setImages(images);
	 
	 	return describeImagesResponse;
	}
}