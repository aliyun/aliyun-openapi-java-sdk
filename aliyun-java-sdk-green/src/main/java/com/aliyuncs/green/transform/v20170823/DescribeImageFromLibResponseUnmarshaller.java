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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageFromLibResponseUnmarshaller {

	public static DescribeImageFromLibResponse unmarshall(DescribeImageFromLibResponse describeImageFromLibResponse, UnmarshallerContext _ctx) {
		
		describeImageFromLibResponse.setRequestId(_ctx.stringValue("DescribeImageFromLibResponse.RequestId"));
		describeImageFromLibResponse.setPageSize(_ctx.integerValue("DescribeImageFromLibResponse.PageSize"));
		describeImageFromLibResponse.setCurrentPage(_ctx.integerValue("DescribeImageFromLibResponse.CurrentPage"));
		describeImageFromLibResponse.setTotalCount(_ctx.integerValue("DescribeImageFromLibResponse.TotalCount"));

		List<ImageFromLib> imageFromLibList = new ArrayList<ImageFromLib>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageFromLibResponse.ImageFromLibList.Length"); i++) {
			ImageFromLib imageFromLib = new ImageFromLib();
			imageFromLib.setImage(_ctx.stringValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Image"));
			imageFromLib.setThumbnail(_ctx.stringValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Thumbnail"));
			imageFromLib.setId(_ctx.longValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].Id"));
			imageFromLib.setImageHitCount(_ctx.longValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].ImageHitCount"));
			imageFromLib.setVideoHitCount(_ctx.longValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].VideoHitCount"));
			imageFromLib.setCreateTime(_ctx.stringValue("DescribeImageFromLibResponse.ImageFromLibList["+ i +"].CreateTime"));

			imageFromLibList.add(imageFromLib);
		}
		describeImageFromLibResponse.setImageFromLibList(imageFromLibList);
	 
	 	return describeImageFromLibResponse;
	}
}