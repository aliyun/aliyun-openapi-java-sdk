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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.ListTagKeysResponse;
import com.aliyuncs.alb.model.v20200616.ListTagKeysResponse.TagKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagKeysResponseUnmarshaller {

	public static ListTagKeysResponse unmarshall(ListTagKeysResponse listTagKeysResponse, UnmarshallerContext _ctx) {
		
		listTagKeysResponse.setRequestId(_ctx.stringValue("ListTagKeysResponse.RequestId"));
		listTagKeysResponse.setMaxResults(_ctx.integerValue("ListTagKeysResponse.MaxResults"));
		listTagKeysResponse.setNextToken(_ctx.stringValue("ListTagKeysResponse.NextToken"));
		listTagKeysResponse.setTotalCount(_ctx.integerValue("ListTagKeysResponse.TotalCount"));

		List<TagKey> tagKeys = new ArrayList<TagKey>();
		for (int i = 0; i < _ctx.lengthValue("ListTagKeysResponse.TagKeys.Length"); i++) {
			TagKey tagKey = new TagKey();
			tagKey.setCategory(_ctx.stringValue("ListTagKeysResponse.TagKeys["+ i +"].Category"));
			tagKey.setTagKey(_ctx.stringValue("ListTagKeysResponse.TagKeys["+ i +"].TagKey"));

			tagKeys.add(tagKey);
		}
		listTagKeysResponse.setTagKeys(tagKeys);
	 
	 	return listTagKeysResponse;
	}
}