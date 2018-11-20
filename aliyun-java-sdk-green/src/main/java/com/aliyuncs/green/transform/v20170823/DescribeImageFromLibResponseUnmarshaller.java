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

import com.aliyuncs.green.model.v20170823.DescribeImageFromLibResponse;
import com.aliyuncs.green.model.v20170823.DescribeImageFromLibResponse.ImageFromLib;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageFromLibResponseUnmarshaller {

	public static DescribeImageFromLibResponse unmarshall(DescribeImageFromLibResponse describeImageFromLibResponse, UnmarshallerContext context) {
		
		describeImageFromLibResponse.setRequestId(context.stringValue("DescribeImageFromLibResponse.RequestId"));
		describeImageFromLibResponse.setPageSize(context.integerValue("DescribeImageFromLibResponse.PageSize"));
		describeImageFromLibResponse.setCurrentPage(context.integerValue("DescribeImageFromLibResponse.CurrentPage"));
		describeImageFromLibResponse.setTotalCount(context.integerValue("DescribeImageFromLibResponse.TotalCount"));

		List<ImageFromLib> imageFromLibList = new ArrayList<ImageFromLib>();
		for (int i = 0; i < context.lengthValue("DescribeImageFromLibResponse.ImageFromLibList.Length"); i++) {
			ImageFromLib imageFromLib = new ImageFromLib();
			imageFromLib.setImage(context.stringValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Image"));
			imageFromLib.setThumbnail(context.stringValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Thumbnail"));
			imageFromLib.setId(context.integerValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Id"));

			imageFromLibList.add(imageFromLib);
		}
		describeImageFromLibResponse.setImageFromLibList(imageFromLibList);
	 
	 	return describeImageFromLibResponse;
	}
}