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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodUserTagsResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodUserTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserTagsResponseUnmarshaller {

	public static DescribeVodUserTagsResponse unmarshall(DescribeVodUserTagsResponse describeVodUserTagsResponse, UnmarshallerContext _ctx) {
		
		describeVodUserTagsResponse.setRequestId(_ctx.stringValue("DescribeVodUserTagsResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodUserTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeVodUserTagsResponse.Tags["+ i +"].Key"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodUserTagsResponse.Tags["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("DescribeVodUserTagsResponse.Tags["+ i +"].Value["+ j +"]"));
			}
			tag.setValue(value);

			tags.add(tag);
		}
		describeVodUserTagsResponse.setTags(tags);
	 
	 	return describeVodUserTagsResponse;
	}
}