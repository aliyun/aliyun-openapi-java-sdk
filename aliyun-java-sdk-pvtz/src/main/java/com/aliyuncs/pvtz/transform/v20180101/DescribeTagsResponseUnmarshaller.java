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

package com.aliyuncs.pvtz.transform.v20180101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pvtz.model.v20180101.DescribeTagsResponse;
import com.aliyuncs.pvtz.model.v20180101.DescribeTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTagsResponseUnmarshaller {

	public static DescribeTagsResponse unmarshall(DescribeTagsResponse describeTagsResponse, UnmarshallerContext _ctx) {
		
		describeTagsResponse.setRequestId(_ctx.stringValue("DescribeTagsResponse.RequestId"));
		describeTagsResponse.setTotalCount(_ctx.integerValue("DescribeTagsResponse.TotalCount"));
		describeTagsResponse.setPageSize(_ctx.integerValue("DescribeTagsResponse.PageSize"));
		describeTagsResponse.setPageNumber(_ctx.integerValue("DescribeTagsResponse.PageNumber"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].Key"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTagsResponse.Tags["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("DescribeTagsResponse.Tags["+ i +"].Values["+ j +"]"));
			}
			tag.setValues(values);

			tags.add(tag);
		}
		describeTagsResponse.setTags(tags);
	 
	 	return describeTagsResponse;
	}
}