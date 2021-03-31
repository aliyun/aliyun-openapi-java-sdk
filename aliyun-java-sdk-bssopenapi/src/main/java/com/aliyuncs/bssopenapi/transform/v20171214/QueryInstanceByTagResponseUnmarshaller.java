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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceByTagResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceByTagResponse.TagResourceItem;
import com.aliyuncs.bssopenapi.model.v20171214.QueryInstanceByTagResponse.TagResourceItem.TagKeyValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInstanceByTagResponseUnmarshaller {

	public static QueryInstanceByTagResponse unmarshall(QueryInstanceByTagResponse queryInstanceByTagResponse, UnmarshallerContext _ctx) {
		
		queryInstanceByTagResponse.setRequestId(_ctx.stringValue("QueryInstanceByTagResponse.RequestId"));
		queryInstanceByTagResponse.setCode(_ctx.stringValue("QueryInstanceByTagResponse.Code"));
		queryInstanceByTagResponse.setSuccess(_ctx.booleanValue("QueryInstanceByTagResponse.Success"));
		queryInstanceByTagResponse.setMessage(_ctx.stringValue("QueryInstanceByTagResponse.Message"));
		queryInstanceByTagResponse.setNextToken(_ctx.stringValue("QueryInstanceByTagResponse.NextToken"));

		List<TagResourceItem> tagResource = new ArrayList<TagResourceItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInstanceByTagResponse.TagResource.Length"); i++) {
			TagResourceItem tagResourceItem = new TagResourceItem();
			tagResourceItem.setResourceId(_ctx.stringValue("QueryInstanceByTagResponse.TagResource["+ i +"].ResourceId"));
			tagResourceItem.setResourceType(_ctx.stringValue("QueryInstanceByTagResponse.TagResource["+ i +"].ResourceType"));

			List<TagKeyValue> tag = new ArrayList<TagKeyValue>();
			for (int j = 0; j < _ctx.lengthValue("QueryInstanceByTagResponse.TagResource["+ i +"].Tag.Length"); j++) {
				TagKeyValue tagKeyValue = new TagKeyValue();
				tagKeyValue.setKey(_ctx.stringValue("QueryInstanceByTagResponse.TagResource["+ i +"].Tag["+ j +"].Key"));
				tagKeyValue.setValue(_ctx.stringValue("QueryInstanceByTagResponse.TagResource["+ i +"].Tag["+ j +"].Value"));

				tag.add(tagKeyValue);
			}
			tagResourceItem.setTag(tag);

			tagResource.add(tagResourceItem);
		}
		queryInstanceByTagResponse.setTagResource(tagResource);
	 
	 	return queryInstanceByTagResponse;
	}
}