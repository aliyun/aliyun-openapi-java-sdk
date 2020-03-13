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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqGroupResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqGroupResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqGroupResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqGroupResponseUnmarshaller {

	public static ListMqSofamqGroupResponse unmarshall(ListMqSofamqGroupResponse listMqSofamqGroupResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqGroupResponse.setRequestId(_ctx.stringValue("ListMqSofamqGroupResponse.RequestId"));
		listMqSofamqGroupResponse.setResultCode(_ctx.stringValue("ListMqSofamqGroupResponse.ResultCode"));
		listMqSofamqGroupResponse.setResultMessage(_ctx.stringValue("ListMqSofamqGroupResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqGroupResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqGroupResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqGroupResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqGroupResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setGmtCreate(_ctx.longValue("ListMqSofamqGroupResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.longValue("ListMqSofamqGroupResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setGroupId(_ctx.stringValue("ListMqSofamqGroupResponse.Data.Content["+ i +"].GroupId"));
			contentItem.setInstanceId(_ctx.stringValue("ListMqSofamqGroupResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setRemark(_ctx.stringValue("ListMqSofamqGroupResponse.Data.Content["+ i +"].Remark"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqGroupResponse.setData(data);
	 
	 	return listMqSofamqGroupResponse;
	}
}