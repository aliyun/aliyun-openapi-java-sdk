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

import com.aliyuncs.ehpc.model.v20180412.DescribeEstackImageResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeEstackImageResponse.ImageListInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEstackImageResponseUnmarshaller {

	public static DescribeEstackImageResponse unmarshall(DescribeEstackImageResponse describeEstackImageResponse, UnmarshallerContext _ctx) {
		
		describeEstackImageResponse.setRequestId(_ctx.stringValue("DescribeEstackImageResponse.RequestId"));
		describeEstackImageResponse.setPageSize(_ctx.integerValue("DescribeEstackImageResponse.PageSize"));
		describeEstackImageResponse.setPageNumber(_ctx.integerValue("DescribeEstackImageResponse.PageNumber"));
		describeEstackImageResponse.setTotalCount(_ctx.integerValue("DescribeEstackImageResponse.TotalCount"));

		List<ImageListInfo> imageList = new ArrayList<ImageListInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEstackImageResponse.ImageList.Length"); i++) {
			ImageListInfo imageListInfo = new ImageListInfo();
			imageListInfo.setImageName(_ctx.stringValue("DescribeEstackImageResponse.ImageList["+ i +"].ImageName"));
			imageListInfo.setImageSize(_ctx.integerValue("DescribeEstackImageResponse.ImageList["+ i +"].ImageSize"));
			imageListInfo.setRecentUpdateTime(_ctx.stringValue("DescribeEstackImageResponse.ImageList["+ i +"].RecentUpdateTime"));
			imageListInfo.setImageUrl(_ctx.stringValue("DescribeEstackImageResponse.ImageList["+ i +"].ImageUrl"));
			imageListInfo.setImageType(_ctx.stringValue("DescribeEstackImageResponse.ImageList["+ i +"].ImageType"));

			imageList.add(imageListInfo);
		}
		describeEstackImageResponse.setImageList(imageList);
	 
	 	return describeEstackImageResponse;
	}
}