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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserTagsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserTagsResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserTagsResponseUnmarshaller {

	public static DescribeDcdnUserTagsResponse unmarshall(DescribeDcdnUserTagsResponse describeDcdnUserTagsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserTagsResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserTagsResponse.RequestId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserTagsResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeDcdnUserTagsResponse.Tags["+ i +"].Key"));

			List<String> value = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnUserTagsResponse.Tags["+ i +"].Value.Length"); j++) {
				value.add(_ctx.stringValue("DescribeDcdnUserTagsResponse.Tags["+ i +"].Value["+ j +"]"));
			}
			tag.setValue(value);

			tags.add(tag);
		}
		describeDcdnUserTagsResponse.setTags(tags);
	 
	 	return describeDcdnUserTagsResponse;
	}
}