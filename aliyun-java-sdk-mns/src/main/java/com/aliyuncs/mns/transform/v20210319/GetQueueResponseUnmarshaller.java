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

import com.aliyuncs.mns.model.v20210319.GetQueueResponse;
import com.aliyuncs.mns.model.v20210319.GetQueueResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueResponseUnmarshaller {

	public static GetQueueResponse unmarshall(GetQueueResponse getQueueResponse, UnmarshallerContext _ctx) {
		
		getQueueResponse.setRequestId(_ctx.stringValue("GetQueueResponse.RequestId"));
		getQueueResponse.setCode(_ctx.longValue("GetQueueResponse.Code"));
		getQueueResponse.setStatus(_ctx.stringValue("GetQueueResponse.Status"));
		getQueueResponse.setMessage(_ctx.stringValue("GetQueueResponse.Message"));
		getQueueResponse.setSuccess(_ctx.booleanValue("GetQueueResponse.Success"));

		Data data = new Data();
		data.setQueueUrl(_ctx.stringValue("GetQueueResponse.Data.QueueUrl"));
		data.setQueueInternalUrl(_ctx.stringValue("GetQueueResponse.Data.QueueInternalUrl"));
		data.setQueueName(_ctx.stringValue("GetQueueResponse.Data.QueueName"));
		data.setCreateTime(_ctx.longValue("GetQueueResponse.Data.CreateTime"));
		data.setLastModifyTime(_ctx.longValue("GetQueueResponse.Data.LastModifyTime"));
		data.setDelaySeconds(_ctx.longValue("GetQueueResponse.Data.DelaySeconds"));
		data.setMaximumMessageSize(_ctx.longValue("GetQueueResponse.Data.MaximumMessageSize"));
		data.setMessageRetentionPeriod(_ctx.longValue("GetQueueResponse.Data.MessageRetentionPeriod"));
		data.setVisibilityTimeout(_ctx.longValue("GetQueueResponse.Data.VisibilityTimeout"));
		data.setPollingWaitSeconds(_ctx.longValue("GetQueueResponse.Data.PollingWaitSeconds"));
		data.setActiveMessages(_ctx.longValue("GetQueueResponse.Data.ActiveMessages"));
		data.setInactiveMessages(_ctx.longValue("GetQueueResponse.Data.InactiveMessages"));
		data.setDelayMessages(_ctx.longValue("GetQueueResponse.Data.DelayMessages"));
		data.setLoggingEnabled(_ctx.booleanValue("GetQueueResponse.Data.LoggingEnabled"));
		getQueueResponse.setData(data);
	 
	 	return getQueueResponse;
	}
}