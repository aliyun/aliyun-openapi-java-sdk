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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.DescribeLogoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogoResponseUnmarshaller {

	public static DescribeLogoResponse unmarshall(DescribeLogoResponse describeLogoResponse, UnmarshallerContext _ctx) {
		
		describeLogoResponse.setRequestId(_ctx.stringValue("DescribeLogoResponse.RequestId"));
		describeLogoResponse.setSuccess(_ctx.booleanValue("DescribeLogoResponse.Success"));
		describeLogoResponse.setColorOne(_ctx.stringValue("DescribeLogoResponse.ColorOne"));
		describeLogoResponse.setColorTwo(_ctx.stringValue("DescribeLogoResponse.ColorTwo"));
		describeLogoResponse.setColorThree(_ctx.stringValue("DescribeLogoResponse.ColorThree"));
		describeLogoResponse.setColorDescription(_ctx.stringValue("DescribeLogoResponse.ColorDescription"));
		describeLogoResponse.setNamePath(_ctx.stringValue("DescribeLogoResponse.NamePath"));
		describeLogoResponse.setFontDescription(_ctx.stringValue("DescribeLogoResponse.FontDescription"));
		describeLogoResponse.setBrandName(_ctx.stringValue("DescribeLogoResponse.BrandName"));

		List<String> images = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogoResponse.Images.Length"); i++) {
			images.add(_ctx.stringValue("DescribeLogoResponse.Images["+ i +"]"));
		}
		describeLogoResponse.setImages(images);
	 
	 	return describeLogoResponse;
	}
}