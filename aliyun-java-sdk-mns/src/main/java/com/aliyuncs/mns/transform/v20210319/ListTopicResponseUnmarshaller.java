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

import com.aliyuncs.mns.model.v20210319.ListTopicResponse;
import com.aliyuncs.mns.model.v20210319.ListTopicResponse.Data;
import com.aliyuncs.mns.model.v20210319.ListTopicResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTopicResponseUnmarshaller {

	public static ListTopicResponse unmarshall(ListTopicResponse listTopicResponse, UnmarshallerContext _ctx) {
		
		listTopicResponse.setRequestId(_ctx.stringValue("ListTopicResponse.RequestId"));
		listTopicResponse.setCode(_ctx.longValue("ListTopicResponse.Code"));
		listTopicResponse.setStatus(_ctx.stringValue("ListTopicResponse.Status"));
		listTopicResponse.setMessage(_ctx.stringValue("ListTopicResponse.Message"));
		listTopicResponse.setSuccess(_ctx.booleanValue("ListTopicResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListTopicResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListTopicResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListTopicResponse.Data.Total"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTopicResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setTopicName(_ctx.stringValue("ListTopicResponse.Data.PageData["+ i +"].TopicName"));
			pageDataItem.setMessageCount(_ctx.longValue("ListTopicResponse.Data.PageData["+ i +"].MessageCount"));
			pageDataItem.setMaxMessageSize(_ctx.longValue("ListTopicResponse.Data.PageData["+ i +"].MaxMessageSize"));
			pageDataItem.setMessageRetentionPeriod(_ctx.longValue("ListTopicResponse.Data.PageData["+ i +"].MessageRetentionPeriod"));
			pageDataItem.setCreateTime(_ctx.longValue("ListTopicResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setLastModifyTime(_ctx.longValue("ListTopicResponse.Data.PageData["+ i +"].LastModifyTime"));
			pageDataItem.setTopicURL(_ctx.stringValue("ListTopicResponse.Data.PageData["+ i +"].TopicURL"));
			pageDataItem.setLoggingEnabled(_ctx.booleanValue("ListTopicResponse.Data.PageData["+ i +"].LoggingEnabled"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		listTopicResponse.setData(data);
	 
	 	return listTopicResponse;
	}
}