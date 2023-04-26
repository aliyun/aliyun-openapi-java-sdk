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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeImageFamiliesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageFamiliesResponseUnmarshaller {

	public static DescribeImageFamiliesResponse unmarshall(DescribeImageFamiliesResponse describeImageFamiliesResponse, UnmarshallerContext _ctx) {
		
		describeImageFamiliesResponse.setRequestId(_ctx.stringValue("DescribeImageFamiliesResponse.RequestId"));
		describeImageFamiliesResponse.setPageSize(_ctx.integerValue("DescribeImageFamiliesResponse.PageSize"));
		describeImageFamiliesResponse.setPageNumber(_ctx.integerValue("DescribeImageFamiliesResponse.PageNumber"));
		describeImageFamiliesResponse.setTotalCount(_ctx.integerValue("DescribeImageFamiliesResponse.TotalCount"));
		describeImageFamiliesResponse.setRegionId(_ctx.stringValue("DescribeImageFamiliesResponse.RegionId"));

		List<String> imageFamilies = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageFamiliesResponse.ImageFamilies.Length"); i++) {
			imageFamilies.add(_ctx.stringValue("DescribeImageFamiliesResponse.ImageFamilies["+ i +"]"));
		}
		describeImageFamiliesResponse.setImageFamilies(imageFamilies);
	 
	 	return describeImageFamiliesResponse;
	}
}