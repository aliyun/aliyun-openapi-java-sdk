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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.QueryNotifyResponse;
import com.aliyuncs.rds.model.v20140815.QueryNotifyResponse.Data;
import com.aliyuncs.rds.model.v20140815.QueryNotifyResponse.Data.NotifyItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryNotifyResponseUnmarshaller {

	public static QueryNotifyResponse unmarshall(QueryNotifyResponse queryNotifyResponse, UnmarshallerContext _ctx) {
		
		queryNotifyResponse.setRequestId(_ctx.stringValue("QueryNotifyResponse.RequestId"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryNotifyResponse.Data.PageSize"));
		data.setPageNumber(_ctx.integerValue("QueryNotifyResponse.Data.PageNumber"));
		data.setTotalRecordCount(_ctx.integerValue("QueryNotifyResponse.Data.TotalRecordCount"));

		List<NotifyItemListItem> notifyItemList = new ArrayList<NotifyItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryNotifyResponse.Data.NotifyItemList.Length"); i++) {
			NotifyItemListItem notifyItemListItem = new NotifyItemListItem();
			notifyItemListItem.setId(_ctx.longValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].Id"));
			notifyItemListItem.setGmtCreated(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].GmtCreated"));
			notifyItemListItem.setGmtModified(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].GmtModified"));
			notifyItemListItem.setAliUid(_ctx.longValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].AliUid"));
			notifyItemListItem.setIdempotentId(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].IdempotentId"));
			notifyItemListItem.setIdempotentCount(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].IdempotentCount"));
			notifyItemListItem.setType(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].Type"));
			notifyItemListItem.setLevel(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].Level"));
			notifyItemListItem.setTemplateName(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].TemplateName"));
			notifyItemListItem.setNotifyElement(_ctx.stringValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].NotifyElement"));
			notifyItemListItem.setConfirmFlag(_ctx.booleanValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].ConfirmFlag"));
			notifyItemListItem.setConfirmor(_ctx.longValue("QueryNotifyResponse.Data.NotifyItemList["+ i +"].Confirmor"));

			notifyItemList.add(notifyItemListItem);
		}
		data.setNotifyItemList(notifyItemList);
		queryNotifyResponse.setData(data);
	 
	 	return queryNotifyResponse;
	}
}