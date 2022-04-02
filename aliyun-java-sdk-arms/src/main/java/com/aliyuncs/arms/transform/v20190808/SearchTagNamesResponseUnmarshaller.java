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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.SearchTagNamesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTagNamesResponseUnmarshaller {

	public static SearchTagNamesResponse unmarshall(SearchTagNamesResponse searchTagNamesResponse, UnmarshallerContext _ctx) {
		
		searchTagNamesResponse.setRequestId(_ctx.stringValue("SearchTagNamesResponse.RequestId"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SearchTagNamesResponse.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("SearchTagNamesResponse.Tags["+ i +"]"));
		}
		searchTagNamesResponse.setTags(tags);
	 
	 	return searchTagNamesResponse;
	}
}