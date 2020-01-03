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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeGWSImagesResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeGWSImagesResponse.ImageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGWSImagesResponseUnmarshaller {

	public static DescribeGWSImagesResponse unmarshall(DescribeGWSImagesResponse describeGWSImagesResponse, UnmarshallerContext _ctx) {
		
		describeGWSImagesResponse.setRequestId(_ctx.stringValue("DescribeGWSImagesResponse.RequestId"));
		describeGWSImagesResponse.setTotalCount(_ctx.integerValue("DescribeGWSImagesResponse.TotalCount"));
		describeGWSImagesResponse.setPageNumber(_ctx.integerValue("DescribeGWSImagesResponse.PageNumber"));
		describeGWSImagesResponse.setPageSize(_ctx.integerValue("DescribeGWSImagesResponse.PageSize"));

		List<ImageInfo> images = new ArrayList<ImageInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGWSImagesResponse.Images.Length"); i++) {
			ImageInfo imageInfo = new ImageInfo();
			imageInfo.setImageId(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].ImageId"));
			imageInfo.setStatus(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].Status"));
			imageInfo.setCreateTime(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].CreateTime"));
			imageInfo.setName(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].Name"));
			imageInfo.setImageType(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].ImageType"));
			imageInfo.setProgress(_ctx.stringValue("DescribeGWSImagesResponse.Images["+ i +"].Progress"));
			imageInfo.setSize(_ctx.integerValue("DescribeGWSImagesResponse.Images["+ i +"].Size"));

			images.add(imageInfo);
		}
		describeGWSImagesResponse.setImages(images);
	 
	 	return describeGWSImagesResponse;
	}
}