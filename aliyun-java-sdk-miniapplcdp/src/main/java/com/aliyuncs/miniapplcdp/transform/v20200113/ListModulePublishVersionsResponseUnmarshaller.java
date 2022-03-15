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

import com.aliyuncs.miniapplcdp.model.v20200113.ListModulePublishVersionsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulePublishVersionsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListModulePublishVersionsResponse.Data.PublishItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListModulePublishVersionsResponseUnmarshaller {

	public static ListModulePublishVersionsResponse unmarshall(ListModulePublishVersionsResponse listModulePublishVersionsResponse, UnmarshallerContext _ctx) {
		
		listModulePublishVersionsResponse.setRequestId(_ctx.stringValue("ListModulePublishVersionsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListModulePublishVersionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListModulePublishVersionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListModulePublishVersionsResponse.Data.TotalCount"));

		List<PublishItem> items = new ArrayList<PublishItem>();
		for (int i = 0; i < _ctx.lengthValue("ListModulePublishVersionsResponse.Data.Items.Length"); i++) {
			PublishItem publishItem = new PublishItem();
			publishItem.setCommitId(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].CommitId"));
			publishItem.setDescription(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].Description"));
			publishItem.setCreateTime(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].CreateTime"));
			publishItem.setModifiedTime(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].ModifiedTime"));
			publishItem.setModuleId(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].ModuleId"));
			publishItem.setPublishId(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].PublishId"));
			publishItem.setVersion(_ctx.stringValue("ListModulePublishVersionsResponse.Data.Items["+ i +"].Version"));

			items.add(publishItem);
		}
		data.setItems(items);
		listModulePublishVersionsResponse.setData(data);
	 
	 	return listModulePublishVersionsResponse;
	}
}