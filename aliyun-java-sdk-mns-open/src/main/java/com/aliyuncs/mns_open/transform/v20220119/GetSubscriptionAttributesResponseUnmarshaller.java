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

import com.aliyuncs.mns_open.model.v20220119.GetSubscriptionAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.GetSubscriptionAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSubscriptionAttributesResponseUnmarshaller {

	public static GetSubscriptionAttributesResponse unmarshall(GetSubscriptionAttributesResponse getSubscriptionAttributesResponse, UnmarshallerContext _ctx) {
		
		getSubscriptionAttributesResponse.setRequestId(_ctx.stringValue("GetSubscriptionAttributesResponse.RequestId"));
		getSubscriptionAttributesResponse.setCode(_ctx.longValue("GetSubscriptionAttributesResponse.Code"));
		getSubscriptionAttributesResponse.setStatus(_ctx.stringValue("GetSubscriptionAttributesResponse.Status"));
		getSubscriptionAttributesResponse.setMessage(_ctx.stringValue("GetSubscriptionAttributesResponse.Message"));
		getSubscriptionAttributesResponse.setSuccess(_ctx.booleanValue("GetSubscriptionAttributesResponse.Success"));

		Data data = new Data();
		data.setSubscriptionName(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.SubscriptionName"));
		data.setTopicOwner(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.TopicOwner"));
		data.setTopicName(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.TopicName"));
		data.setEndpoint(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.Endpoint"));
		data.setFilterTag(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.FilterTag"));
		data.setCreateTime(_ctx.longValue("GetSubscriptionAttributesResponse.Data.CreateTime"));
		data.setLastModifyTime(_ctx.longValue("GetSubscriptionAttributesResponse.Data.LastModifyTime"));
		data.setNotifyStrategy(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.NotifyStrategy"));
		data.setNotifyContentFormat(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.NotifyContentFormat"));
		data.setSubscriptionURL(_ctx.stringValue("GetSubscriptionAttributesResponse.Data.SubscriptionURL"));
		getSubscriptionAttributesResponse.setData(data);
	 
	 	return getSubscriptionAttributesResponse;
	}
}