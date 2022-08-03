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

package com.aliyuncs.resourcemanager.transform.v20200331;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcemanager.model.v20200331.ListTagValuesResponse;
import com.aliyuncs.resourcemanager.model.v20200331.ListTagValuesResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagValuesResponseUnmarshaller {

	public static ListTagValuesResponse unmarshall(ListTagValuesResponse listTagValuesResponse, UnmarshallerContext _ctx) {
		
		listTagValuesResponse.setRequestId(_ctx.stringValue("ListTagValuesResponse.RequestId"));
		listTagValuesResponse.setNextToken(_ctx.stringValue("ListTagValuesResponse.NextToken"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("ListTagValuesResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setValue(_ctx.stringValue("ListTagValuesResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		listTagValuesResponse.setTags(tags);
	 
	 	return listTagValuesResponse;
	}
}