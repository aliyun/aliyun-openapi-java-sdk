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

import com.aliyuncs.ens.model.v20171110.DescribeImageInfosResponse;
import com.aliyuncs.ens.model.v20171110.DescribeImageInfosResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageInfosResponseUnmarshaller {

	public static DescribeImageInfosResponse unmarshall(DescribeImageInfosResponse describeImageInfosResponse, UnmarshallerContext _ctx) {
		
		describeImageInfosResponse.setRequestId(_ctx.stringValue("DescribeImageInfosResponse.RequestId"));
		describeImageInfosResponse.setCode(_ctx.integerValue("DescribeImageInfosResponse.Code"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageInfosResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setImageId(_ctx.stringValue("DescribeImageInfosResponse.Images["+ i +"].ImageId"));
			image.setDescription(_ctx.stringValue("DescribeImageInfosResponse.Images["+ i +"].Description"));
			image.setImageVersion(_ctx.stringValue("DescribeImageInfosResponse.Images["+ i +"].ImageVersion"));
			image.setOSType(_ctx.stringValue("DescribeImageInfosResponse.Images["+ i +"].OSType"));
			image.setOSName(_ctx.integerValue("DescribeImageInfosResponse.Images["+ i +"].OSName"));
			image.setImageSize(_ctx.stringValue("DescribeImageInfosResponse.Images["+ i +"].ImageSize"));

			images.add(image);
		}
		describeImageInfosResponse.setImages(images);
	 
	 	return describeImageInfosResponse;
	}
}