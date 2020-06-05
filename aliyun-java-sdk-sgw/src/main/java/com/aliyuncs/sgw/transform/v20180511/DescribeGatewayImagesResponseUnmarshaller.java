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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayImagesResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewayImagesResponse.Image;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayImagesResponseUnmarshaller {

	public static DescribeGatewayImagesResponse unmarshall(DescribeGatewayImagesResponse describeGatewayImagesResponse, UnmarshallerContext _ctx) {
		
		describeGatewayImagesResponse.setRequestId(_ctx.stringValue("DescribeGatewayImagesResponse.RequestId"));
		describeGatewayImagesResponse.setSuccess(_ctx.booleanValue("DescribeGatewayImagesResponse.Success"));
		describeGatewayImagesResponse.setCode(_ctx.stringValue("DescribeGatewayImagesResponse.Code"));
		describeGatewayImagesResponse.setMessage(_ctx.stringValue("DescribeGatewayImagesResponse.Message"));

		List<Image> images = new ArrayList<Image>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayImagesResponse.Images.Length"); i++) {
			Image image = new Image();
			image.setName(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Name"));
			image.setDescription(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Description"));
			image.setSize(_ctx.longValue("DescribeGatewayImagesResponse.Images["+ i +"].Size"));
			image.setModifiedDate(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].ModifiedDate"));
			image.setVersion(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Version"));
			image.setTitle(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Title"));
			image.setType(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Type"));
			image.setMD5(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].MD5"));
			image.setUrl(_ctx.stringValue("DescribeGatewayImagesResponse.Images["+ i +"].Url"));

			images.add(image);
		}
		describeGatewayImagesResponse.setImages(images);
	 
	 	return describeGatewayImagesResponse;
	}
}