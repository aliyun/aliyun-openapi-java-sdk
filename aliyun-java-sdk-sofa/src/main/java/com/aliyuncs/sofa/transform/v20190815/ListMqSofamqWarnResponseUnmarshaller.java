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

import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnResponse;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnResponse.Data;
import com.aliyuncs.sofa.model.v20190815.ListMqSofamqWarnResponse.Data.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMqSofamqWarnResponseUnmarshaller {

	public static ListMqSofamqWarnResponse unmarshall(ListMqSofamqWarnResponse listMqSofamqWarnResponse, UnmarshallerContext _ctx) {
		
		listMqSofamqWarnResponse.setRequestId(_ctx.stringValue("ListMqSofamqWarnResponse.RequestId"));
		listMqSofamqWarnResponse.setResultCode(_ctx.stringValue("ListMqSofamqWarnResponse.ResultCode"));
		listMqSofamqWarnResponse.setResultMessage(_ctx.stringValue("ListMqSofamqWarnResponse.ResultMessage"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListMqSofamqWarnResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListMqSofamqWarnResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListMqSofamqWarnResponse.Data.Total"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMqSofamqWarnResponse.Data.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setAlertTime(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].AlertTime"));
			contentItem.setAttribute(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Attribute"));
			contentItem.setBlockTime(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].BlockTime"));
			contentItem.setContacts(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Contacts"));
			contentItem.setDelayTime(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].DelayTime"));
			contentItem.setFrequency(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Frequency"));
			contentItem.setGmtCreate(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].GmtCreate"));
			contentItem.setGmtModified(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].GmtModified"));
			contentItem.setGroupId(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].GroupId"));
			contentItem.setId(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Id"));
			contentItem.setInstanceId(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].InstanceId"));
			contentItem.setOperator(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Operator"));
			contentItem.setThreshold(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Threshold"));
			contentItem.setTopic(_ctx.stringValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].Topic"));
			contentItem.setWarnLevel(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].WarnLevel"));
			contentItem.setWarnStatus(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].WarnStatus"));
			contentItem.setWarnType(_ctx.longValue("ListMqSofamqWarnResponse.Data.Content["+ i +"].WarnType"));

			content.add(contentItem);
		}
		data.setContent(content);
		listMqSofamqWarnResponse.setData(data);
	 
	 	return listMqSofamqWarnResponse;
	}
}