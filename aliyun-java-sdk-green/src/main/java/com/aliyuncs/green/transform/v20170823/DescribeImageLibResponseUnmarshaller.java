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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeImageLibResponse;
import com.aliyuncs.green.model.v20170823.DescribeImageLibResponse.ImageLib;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageLibResponseUnmarshaller {

	public static DescribeImageLibResponse unmarshall(DescribeImageLibResponse describeImageLibResponse, UnmarshallerContext _ctx) {
		
		describeImageLibResponse.setRequestId(_ctx.stringValue("DescribeImageLibResponse.RequestId"));
		describeImageLibResponse.setTotalCount(_ctx.integerValue("DescribeImageLibResponse.TotalCount"));

		List<ImageLib> imageLibList = new ArrayList<ImageLib>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageLibResponse.ImageLibList.Length"); i++) {
			ImageLib imageLib = new ImageLib();
			imageLib.setImageCount(_ctx.integerValue("DescribeImageLibResponse.ImageLibList["+ i +"].ImageCount"));
			imageLib.setModifiedTime(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].ModifiedTime"));
			imageLib.setCode(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Code"));
			imageLib.setName(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Name"));
			imageLib.setId(_ctx.integerValue("DescribeImageLibResponse.ImageLibList["+ i +"].Id"));
			imageLib.setSource(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Source"));
			imageLib.setCategory(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Category"));
			imageLib.setServiceModule(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].ServiceModule"));
			imageLib.setScene(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Scene"));
			imageLib.setEnable(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].Enable"));

			List<String> bizTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeImageLibResponse.ImageLibList["+ i +"].BizTypes.Length"); j++) {
				bizTypes.add(_ctx.stringValue("DescribeImageLibResponse.ImageLibList["+ i +"].BizTypes["+ j +"]"));
			}
			imageLib.setBizTypes(bizTypes);

			imageLibList.add(imageLib);
		}
		describeImageLibResponse.setImageLibList(imageLibList);
	 
	 	return describeImageLibResponse;
	}
}