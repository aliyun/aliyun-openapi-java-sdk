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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.RemoveTagsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveTagsResponseUnmarshaller {

	public static RemoveTagsResponse unmarshall(RemoveTagsResponse removeTagsResponse, UnmarshallerContext _ctx) {
		
		removeTagsResponse.setRequestId(_ctx.stringValue("RemoveTagsResponse.RequestId"));
		removeTagsResponse.setCode(_ctx.stringValue("RemoveTagsResponse.Code"));
		removeTagsResponse.setMessage(_ctx.stringValue("RemoveTagsResponse.Message"));
		removeTagsResponse.setSuccess(_ctx.booleanValue("RemoveTagsResponse.Success"));

		List<String> tag = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveTagsResponse.Tag.Length"); i++) {
			tag.add(_ctx.stringValue("RemoveTagsResponse.Tag["+ i +"]"));
		}
		removeTagsResponse.setTag(tag);
	 
	 	return removeTagsResponse;
	}
}