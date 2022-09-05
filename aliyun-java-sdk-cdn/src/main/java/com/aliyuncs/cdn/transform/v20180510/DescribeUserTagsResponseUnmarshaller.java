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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeUserTagsResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeUserTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUserTagsResponseUnmarshaller {

	public static DescribeUserTagsResponse unmarshall(DescribeUserTagsResponse describeUserTagsResponse, UnmarshallerContext _ctx) {
		
		describeUserTagsResponse.setRequestId(_ctx.stringValue("DescribeUserTagsResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUserTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeUserTagsResponse.Tags["+ i +"].Key"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeUserTagsResponse.Tags["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("DescribeUserTagsResponse.Tags["+ i +"].Value["+ j +"]"));
			}
			tag.setValue(value);

			tags.add(tag);
		}
		describeUserTagsResponse.setTags(tags);
	 
	 	return describeUserTagsResponse;
	}
}