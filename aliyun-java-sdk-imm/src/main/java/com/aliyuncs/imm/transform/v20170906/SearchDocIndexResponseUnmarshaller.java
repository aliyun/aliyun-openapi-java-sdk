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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.SearchDocIndexResponse;
import com.aliyuncs.imm.model.v20170906.SearchDocIndexResponse.DocInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDocIndexResponseUnmarshaller {

	public static SearchDocIndexResponse unmarshall(SearchDocIndexResponse searchDocIndexResponse, UnmarshallerContext context) {
		
		searchDocIndexResponse.setRequestId(context.stringValue("SearchDocIndexResponse.RequestId"));

		List<DocInfosItem> docInfos = new ArrayList<DocInfosItem>();
		for (int i = 0; i < context.lengthValue("SearchDocIndexResponse.DocInfos.Length"); i++) {
			DocInfosItem docInfosItem = new DocInfosItem();
			docInfosItem.setUniqueId(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].UniqueId"));
			docInfosItem.setSrcUri(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].SrcUri"));
			docInfosItem.setName(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].Name"));
			docInfosItem.setContentType(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].ContentType"));
			docInfosItem.setLastModified(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].LastModified"));
			docInfosItem.setSize(context.integerValue("SearchDocIndexResponse.DocInfos["+ i +"].Size"));
			docInfosItem.setPageNum(context.integerValue("SearchDocIndexResponse.DocInfos["+ i +"].PageNum"));
			docInfosItem.setCustomKey1(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey1"));
			docInfosItem.setCustomKey2(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey2"));
			docInfosItem.setCustomKey3(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey3"));
			docInfosItem.setCustomKey4(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey4"));
			docInfosItem.setCustomKey5(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey5"));
			docInfosItem.setCustomKey6(context.stringValue("SearchDocIndexResponse.DocInfos["+ i +"].CustomKey6"));

			docInfos.add(docInfosItem);
		}
		searchDocIndexResponse.setDocInfos(docInfos);
	 
	 	return searchDocIndexResponse;
	}
}