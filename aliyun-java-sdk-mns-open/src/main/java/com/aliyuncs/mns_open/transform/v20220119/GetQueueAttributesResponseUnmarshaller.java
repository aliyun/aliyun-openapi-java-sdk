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

import com.aliyuncs.mns_open.model.v20220119.GetQueueAttributesResponse;
import com.aliyuncs.mns_open.model.v20220119.GetQueueAttributesResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueAttributesResponseUnmarshaller {

	public static GetQueueAttributesResponse unmarshall(GetQueueAttributesResponse getQueueAttributesResponse, UnmarshallerContext _ctx) {
		
		getQueueAttributesResponse.setRequestId(_ctx.stringValue("GetQueueAttributesResponse.RequestId"));
		getQueueAttributesResponse.setCode(_ctx.longValue("GetQueueAttributesResponse.Code"));
		getQueueAttributesResponse.setStatus(_ctx.stringValue("GetQueueAttributesResponse.Status"));
		getQueueAttributesResponse.setMessage(_ctx.stringValue("GetQueueAttributesResponse.Message"));
		getQueueAttributesResponse.setSuccess(_ctx.booleanValue("GetQueueAttributesResponse.Success"));

		Data data = new Data();
		data.setQueueUrl(_ctx.stringValue("GetQueueAttributesResponse.Data.QueueUrl"));
		data.setQueueInternalUrl(_ctx.stringValue("GetQueueAttributesResponse.Data.QueueInternalUrl"));
		data.setQueueName(_ctx.stringValue("GetQueueAttributesResponse.Data.QueueName"));
		data.setCreateTime(_ctx.longValue("GetQueueAttributesResponse.Data.CreateTime"));
		data.setLastModifyTime(_ctx.longValue("GetQueueAttributesResponse.Data.LastModifyTime"));
		data.setDelaySeconds(_ctx.longValue("GetQueueAttributesResponse.Data.DelaySeconds"));
		data.setMaximumMessageSize(_ctx.longValue("GetQueueAttributesResponse.Data.MaximumMessageSize"));
		data.setMessageRetentionPeriod(_ctx.longValue("GetQueueAttributesResponse.Data.MessageRetentionPeriod"));
		data.setVisibilityTimeout(_ctx.longValue("GetQueueAttributesResponse.Data.VisibilityTimeout"));
		data.setPollingWaitSeconds(_ctx.longValue("GetQueueAttributesResponse.Data.PollingWaitSeconds"));
		data.setActiveMessages(_ctx.longValue("GetQueueAttributesResponse.Data.ActiveMessages"));
		data.setInactiveMessages(_ctx.longValue("GetQueueAttributesResponse.Data.InactiveMessages"));
		data.setDelayMessages(_ctx.longValue("GetQueueAttributesResponse.Data.DelayMessages"));
		data.setLoggingEnabled(_ctx.booleanValue("GetQueueAttributesResponse.Data.LoggingEnabled"));
		getQueueAttributesResponse.setData(data);
	 
	 	return getQueueAttributesResponse;
	}
}