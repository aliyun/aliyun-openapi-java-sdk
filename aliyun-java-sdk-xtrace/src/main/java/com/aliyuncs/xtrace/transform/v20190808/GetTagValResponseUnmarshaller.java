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

package com.aliyuncs.xtrace.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xtrace.model.v20190808.GetTagValResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTagValResponseUnmarshaller {

	public static GetTagValResponse unmarshall(GetTagValResponse getTagValResponse, UnmarshallerContext _ctx) {
		
		getTagValResponse.setRequestId(_ctx.stringValue("GetTagValResponse.RequestId"));

		List<String> tagValues = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetTagValResponse.TagValues.Length"); i++) {
			tagValues.add(_ctx.stringValue("GetTagValResponse.TagValues["+ i +"]"));
		}
		getTagValResponse.setTagValues(tagValues);
	 
	 	return getTagValResponse;
	}
}