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

import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyLogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsTransparentProxyLogResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsTransparentProxyLogResponseUnmarshaller {

	public static QueryMsTransparentProxyLogResponse unmarshall(QueryMsTransparentProxyLogResponse queryMsTransparentProxyLogResponse, UnmarshallerContext _ctx) {
		
		queryMsTransparentProxyLogResponse.setRequestId(_ctx.stringValue("QueryMsTransparentProxyLogResponse.RequestId"));
		queryMsTransparentProxyLogResponse.setResultCode(_ctx.stringValue("QueryMsTransparentProxyLogResponse.ResultCode"));
		queryMsTransparentProxyLogResponse.setResultMessage(_ctx.stringValue("QueryMsTransparentProxyLogResponse.ResultMessage"));
		queryMsTransparentProxyLogResponse.setCurrentPage(_ctx.longValue("QueryMsTransparentProxyLogResponse.CurrentPage"));
		queryMsTransparentProxyLogResponse.setPageSize(_ctx.longValue("QueryMsTransparentProxyLogResponse.PageSize"));
		queryMsTransparentProxyLogResponse.setStartIndex(_ctx.longValue("QueryMsTransparentProxyLogResponse.StartIndex"));
		queryMsTransparentProxyLogResponse.setTotalSize(_ctx.longValue("QueryMsTransparentProxyLogResponse.TotalSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsTransparentProxyLogResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("QueryMsTransparentProxyLogResponse.List["+ i +"].Id"));
			listItem.setModifyContent(_ctx.stringValue("QueryMsTransparentProxyLogResponse.List["+ i +"].ModifyContent"));
			listItem.setModifyName(_ctx.stringValue("QueryMsTransparentProxyLogResponse.List["+ i +"].ModifyName"));
			listItem.setModifyTime(_ctx.stringValue("QueryMsTransparentProxyLogResponse.List["+ i +"].ModifyTime"));
			listItem.setPort(_ctx.longValue("QueryMsTransparentProxyLogResponse.List["+ i +"].Port"));

			list.add(listItem);
		}
		queryMsTransparentProxyLogResponse.setList(list);
	 
	 	return queryMsTransparentProxyLogResponse;
	}
}