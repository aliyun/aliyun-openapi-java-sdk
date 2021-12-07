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

package com.aliyuncs.tag.transform.v20180828;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.tag.model.v20180828.ListResourcesByTagResponse;
import com.aliyuncs.tag.model.v20180828.ListResourcesByTagResponse.TagResource;
import com.aliyuncs.tag.model.v20180828.ListResourcesByTagResponse.TagResource.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcesByTagResponseUnmarshaller {

	public static ListResourcesByTagResponse unmarshall(ListResourcesByTagResponse listResourcesByTagResponse, UnmarshallerContext _ctx) {
		
		listResourcesByTagResponse.setRequestId(_ctx.stringValue("ListResourcesByTagResponse.RequestId"));
		listResourcesByTagResponse.setNextToken(_ctx.stringValue("ListResourcesByTagResponse.NextToken"));

		List<TagResource> resources = new ArrayList<TagResource>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcesByTagResponse.Resources.Length"); i++) {
			TagResource tagResource = new TagResource();
			tagResource.setResourceId(_ctx.stringValue("ListResourcesByTagResponse.Resources["+ i +"].ResourceId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListResourcesByTagResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListResourcesByTagResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListResourcesByTagResponse.Resources["+ i +"].Tags["+ j +"].Value"));
				tag.setCategory(_ctx.stringValue("ListResourcesByTagResponse.Resources["+ i +"].Tags["+ j +"].Category"));

				tags.add(tag);
			}
			tagResource.setTags(tags);

			resources.add(tagResource);
		}
		listResourcesByTagResponse.setResources(resources);
	 
	 	return listResourcesByTagResponse;
	}
}