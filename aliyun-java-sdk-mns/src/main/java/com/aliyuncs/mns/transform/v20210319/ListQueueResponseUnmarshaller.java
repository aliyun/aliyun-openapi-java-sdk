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

package com.aliyuncs.mns.transform.v20210319;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns.model.v20210319.ListQueueResponse;
import com.aliyuncs.mns.model.v20210319.ListQueueResponse.Data;
import com.aliyuncs.mns.model.v20210319.ListQueueResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueueResponseUnmarshaller {

	public static ListQueueResponse unmarshall(ListQueueResponse listQueueResponse, UnmarshallerContext _ctx) {
		
		listQueueResponse.setRequestId(_ctx.stringValue("ListQueueResponse.RequestId"));
		listQueueResponse.setCode(_ctx.longValue("ListQueueResponse.Code"));
		listQueueResponse.setStatus(_ctx.stringValue("ListQueueResponse.Status"));
		listQueueResponse.setMessage(_ctx.stringValue("ListQueueResponse.Message"));
		listQueueResponse.setSuccess(_ctx.booleanValue("ListQueueResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListQueueResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListQueueResponse.Data.PageSize"));
		data.setSize(_ctx.longValue("ListQueueResponse.Data.Size"));
		data.setPages(_ctx.longValue("ListQueueResponse.Data.Pages"));
		data.setTotal(_ctx.longValue("ListQueueResponse.Data.Total"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQueueResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setQueueUrl(_ctx.stringValue("ListQueueResponse.Data.PageData["+ i +"].QueueUrl"));
			pageDataItem.setQueueInternalUrl(_ctx.stringValue("ListQueueResponse.Data.PageData["+ i +"].QueueInternalUrl"));
			pageDataItem.setQueueName(_ctx.stringValue("ListQueueResponse.Data.PageData["+ i +"].QueueName"));
			pageDataItem.setCreateTime(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setLastModifyTime(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].LastModifyTime"));
			pageDataItem.setDelaySeconds(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].DelaySeconds"));
			pageDataItem.setMaximumMessageSize(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].MaximumMessageSize"));
			pageDataItem.setMessageRetentionPeriod(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].MessageRetentionPeriod"));
			pageDataItem.setVisibilityTimeout(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].VisibilityTimeout"));
			pageDataItem.setPollingWaitSeconds(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].PollingWaitSeconds"));
			pageDataItem.setActiveMessages(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].ActiveMessages"));
			pageDataItem.setInactiveMessages(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].InactiveMessages"));
			pageDataItem.setDelayMessages(_ctx.longValue("ListQueueResponse.Data.PageData["+ i +"].DelayMessages"));
			pageDataItem.setLoggingEnabled(_ctx.booleanValue("ListQueueResponse.Data.PageData["+ i +"].LoggingEnabled"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		listQueueResponse.setData(data);
	 
	 	return listQueueResponse;
	}
}