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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishesResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishesResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishesResponse.Data.PublishItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishesResponseUnmarshaller {

	public static ListPublishesResponse unmarshall(ListPublishesResponse listPublishesResponse, UnmarshallerContext _ctx) {
		
		listPublishesResponse.setRequestId(_ctx.stringValue("ListPublishesResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListPublishesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListPublishesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListPublishesResponse.Data.TotalCount"));

		List<PublishItem> items = new ArrayList<PublishItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPublishesResponse.Data.Items.Length"); i++) {
			PublishItem publishItem = new PublishItem();
			publishItem.setCommitId(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].CommitId"));
			publishItem.setCreateTime(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].CreateTime"));
			publishItem.setPublishStatus(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].PublishStatus"));
			publishItem.setCompletionTime(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].CompletionTime"));
			publishItem.setVersionNumber(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].VersionNumber"));
			publishItem.setStartTime(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].StartTime"));
			publishItem.setModifiedTime(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].ModifiedTime"));
			publishItem.setPublishId(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].PublishId"));
			publishItem.setPublishType(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].PublishType"));
			publishItem.setDescription(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].Description"));
			publishItem.setAppId(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].AppId"));
			publishItem.setEnvId(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].EnvId"));
			publishItem.setReason(_ctx.stringValue("ListPublishesResponse.Data.Items["+ i +"].Reason"));

			items.add(publishItem);
		}
		data.setItems(items);
		listPublishesResponse.setData(data);
	 
	 	return listPublishesResponse;
	}
}