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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnAclFieldsResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnAclFieldsResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnAclFieldsResponseUnmarshaller {

	public static DescribeDcdnAclFieldsResponse unmarshall(DescribeDcdnAclFieldsResponse describeDcdnAclFieldsResponse, UnmarshallerContext _ctx) {
		
		describeDcdnAclFieldsResponse.setRequestId(_ctx.stringValue("DescribeDcdnAclFieldsResponse.RequestId"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnAclFieldsResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setFields(_ctx.stringValue("DescribeDcdnAclFieldsResponse.Content["+ i +"].Fields"));

			content.add(contentItem);
		}
		describeDcdnAclFieldsResponse.setContent(content);
	 
	 	return describeDcdnAclFieldsResponse;
	}
}