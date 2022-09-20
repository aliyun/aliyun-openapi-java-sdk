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

package com.aliyuncs.mns_open.transform.v20220119;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mns_open.model.v20220119.ListSubscriptionByTopicResponse;
import com.aliyuncs.mns_open.model.v20220119.ListSubscriptionByTopicResponse.Data;
import com.aliyuncs.mns_open.model.v20220119.ListSubscriptionByTopicResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionByTopicResponseUnmarshaller {

	public static ListSubscriptionByTopicResponse unmarshall(ListSubscriptionByTopicResponse listSubscriptionByTopicResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionByTopicResponse.setRequestId(_ctx.stringValue("ListSubscriptionByTopicResponse.RequestId"));
		listSubscriptionByTopicResponse.setCode(_ctx.longValue("ListSubscriptionByTopicResponse.Code"));
		listSubscriptionByTopicResponse.setStatus(_ctx.stringValue("ListSubscriptionByTopicResponse.Status"));
		listSubscriptionByTopicResponse.setMessage(_ctx.stringValue("ListSubscriptionByTopicResponse.Message"));
		listSubscriptionByTopicResponse.setSuccess(_ctx.booleanValue("ListSubscriptionByTopicResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("ListSubscriptionByTopicResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("ListSubscriptionByTopicResponse.Data.PageSize"));
		data.setSize(_ctx.longValue("ListSubscriptionByTopicResponse.Data.Size"));
		data.setPages(_ctx.longValue("ListSubscriptionByTopicResponse.Data.Pages"));
		data.setTotal(_ctx.longValue("ListSubscriptionByTopicResponse.Data.Total"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscriptionByTopicResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setSubscriptionName(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].SubscriptionName"));
			pageDataItem.setTopicOwner(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].TopicOwner"));
			pageDataItem.setTopicName(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].TopicName"));
			pageDataItem.setEndpoint(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].Endpoint"));
			pageDataItem.setFilterTag(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].FilterTag"));
			pageDataItem.setCreateTime(_ctx.longValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].CreateTime"));
			pageDataItem.setLastModifyTime(_ctx.longValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].LastModifyTime"));
			pageDataItem.setNotifyStrategy(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].NotifyStrategy"));
			pageDataItem.setNotifyContentFormat(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].NotifyContentFormat"));
			pageDataItem.setSubscriptionURL(_ctx.stringValue("ListSubscriptionByTopicResponse.Data.PageData["+ i +"].SubscriptionURL"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		listSubscriptionByTopicResponse.setData(data);
	 
	 	return listSubscriptionByTopicResponse;
	}
}