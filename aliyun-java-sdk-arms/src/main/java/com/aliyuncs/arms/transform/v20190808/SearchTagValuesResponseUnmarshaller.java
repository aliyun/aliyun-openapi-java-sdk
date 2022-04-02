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

import com.aliyuncs.arms.model.v20190808.SearchTagValuesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTagValuesResponseUnmarshaller {

	public static SearchTagValuesResponse unmarshall(SearchTagValuesResponse searchTagValuesResponse, UnmarshallerContext _ctx) {
		
		searchTagValuesResponse.setRequestId(_ctx.stringValue("SearchTagValuesResponse.RequestId"));

		List<String> values = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SearchTagValuesResponse.Values.Length"); i++) {
			values.add(_ctx.stringValue("SearchTagValuesResponse.Values["+ i +"]"));
		}
		searchTagValuesResponse.setValues(values);
	 
	 	return searchTagValuesResponse;
	}
}