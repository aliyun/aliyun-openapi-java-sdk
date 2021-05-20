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

package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.UpdatePipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdatePipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdatePipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePipelineResponseUnmarshaller {

	public static UpdatePipelineResponse unmarshall(UpdatePipelineResponse updatePipelineResponse, UnmarshallerContext _ctx) {
		
		updatePipelineResponse.setRequestId(_ctx.stringValue("UpdatePipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setSpeed(_ctx.stringValue("UpdatePipelineResponse.Pipeline.Speed"));
		pipeline.setState(_ctx.stringValue("UpdatePipelineResponse.Pipeline.State"));
		pipeline.setName(_ctx.stringValue("UpdatePipelineResponse.Pipeline.Name"));
		pipeline.setRole(_ctx.stringValue("UpdatePipelineResponse.Pipeline.Role"));
		pipeline.setId(_ctx.stringValue("UpdatePipelineResponse.Pipeline.Id"));
		pipeline.setQuotaAllocate(_ctx.longValue("UpdatePipelineResponse.Pipeline.QuotaAllocate"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setMqTopic(_ctx.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.MqTopic"));
		notifyConfig.setQueueName(_ctx.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.QueueName"));
		notifyConfig.setMqTag(_ctx.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.MqTag"));
		notifyConfig.setTopic(_ctx.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.Topic"));
		pipeline.setNotifyConfig(notifyConfig);
		updatePipelineResponse.setPipeline(pipeline);
	 
	 	return updatePipelineResponse;
	}
}