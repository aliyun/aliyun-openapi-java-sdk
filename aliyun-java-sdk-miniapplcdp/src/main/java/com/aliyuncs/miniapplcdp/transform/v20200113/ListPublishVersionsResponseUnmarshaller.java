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

import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishVersionsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishVersionsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListPublishVersionsResponse.Data.PublishItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishVersionsResponseUnmarshaller {

	public static ListPublishVersionsResponse unmarshall(ListPublishVersionsResponse listPublishVersionsResponse, UnmarshallerContext _ctx) {
		
		listPublishVersionsResponse.setRequestId(_ctx.stringValue("ListPublishVersionsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListPublishVersionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListPublishVersionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListPublishVersionsResponse.Data.TotalCount"));

		List<PublishItem> items = new ArrayList<PublishItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPublishVersionsResponse.Data.Items.Length"); i++) {
			PublishItem publishItem = new PublishItem();
			publishItem.setCommitId(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].CommitId"));
			publishItem.setCreateTime(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].CreateTime"));
			publishItem.setPublishStatus(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].PublishStatus"));
			publishItem.setCompletionTime(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].CompletionTime"));
			publishItem.setVersionNumber(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].VersionNumber"));
			publishItem.setStartTime(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].StartTime"));
			publishItem.setModifiedTime(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].ModifiedTime"));
			publishItem.setPublishId(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].PublishId"));
			publishItem.setPublishType(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].PublishType"));
			publishItem.setDescription(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].Description"));
			publishItem.setAppId(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].AppId"));
			publishItem.setEnvId(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].EnvId"));
			publishItem.setReason(_ctx.stringValue("ListPublishVersionsResponse.Data.Items["+ i +"].Reason"));

			List<Map<Object, Object>> subTasks = _ctx.listMapValue("ListPublishVersionsResponse.Data.Items["+ i +"].SubTasks");
			publishItem.setSubTasks(subTasks);

			items.add(publishItem);
		}
		data.setItems(items);
		listPublishVersionsResponse.setData(data);
	 
	 	return listPublishVersionsResponse;
	}
}