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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeSearchblobsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeantcodeAntcodeSearchblobsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeantcodeAntcodeSearchblobsResponseUnmarshaller {

	public static QueryLinkeantcodeAntcodeSearchblobsResponse unmarshall(QueryLinkeantcodeAntcodeSearchblobsResponse queryLinkeantcodeAntcodeSearchblobsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeantcodeAntcodeSearchblobsResponse.setRequestId(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.RequestId"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setResultCode(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.ResultCode"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setResultMessage(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.ResultMessage"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setAmount(_ctx.longValue("QueryLinkeantcodeAntcodeSearchblobsResponse.Amount"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setEmptyPage(_ctx.booleanValue("QueryLinkeantcodeAntcodeSearchblobsResponse.EmptyPage"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeantcodeAntcodeSearchblobsResponse.ResponseStatusCode"));
		queryLinkeantcodeAntcodeSearchblobsResponse.setTotal(_ctx.longValue("QueryLinkeantcodeAntcodeSearchblobsResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setContent(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].Content"));
			listItem.setFileName(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].FileName"));
			listItem.setHighlightedContent(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].HighlightedContent"));
			listItem.setIndexedAt(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].IndexedAt"));
			listItem.setLanguage(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].Language"));
			listItem.setPath(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].Path"));
			listItem.setProject(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].Project"));
			listItem.setRef(_ctx.stringValue("QueryLinkeantcodeAntcodeSearchblobsResponse.List["+ i +"].Ref"));

			list.add(listItem);
		}
		queryLinkeantcodeAntcodeSearchblobsResponse.setList(list);
	 
	 	return queryLinkeantcodeAntcodeSearchblobsResponse;
	}
}