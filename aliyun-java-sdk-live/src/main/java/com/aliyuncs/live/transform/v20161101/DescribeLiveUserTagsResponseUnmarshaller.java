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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveUserTagsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUserTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUserTagsResponseUnmarshaller {

	public static DescribeLiveUserTagsResponse unmarshall(DescribeLiveUserTagsResponse describeLiveUserTagsResponse, UnmarshallerContext _ctx) {
		
		describeLiveUserTagsResponse.setRequestId(_ctx.stringValue("DescribeLiveUserTagsResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUserTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeLiveUserTagsResponse.Tags["+ i +"].Key"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUserTagsResponse.Tags["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("DescribeLiveUserTagsResponse.Tags["+ i +"].Value["+ j +"]"));
			}
			tag.setValue(value);

			tags.add(tag);
		}
		describeLiveUserTagsResponse.setTags(tags);
	 
	 	return describeLiveUserTagsResponse;
	}
}