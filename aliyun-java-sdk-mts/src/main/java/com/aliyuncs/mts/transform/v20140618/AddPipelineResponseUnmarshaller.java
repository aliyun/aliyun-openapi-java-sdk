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

import com.aliyuncs.mts.model.v20140618.AddPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPipelineResponseUnmarshaller {

	public static AddPipelineResponse unmarshall(AddPipelineResponse addPipelineResponse, UnmarshallerContext _ctx) {
		
		addPipelineResponse.setRequestId(_ctx.stringValue("AddPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setSpeed(_ctx.stringValue("AddPipelineResponse.Pipeline.Speed"));
		pipeline.setState(_ctx.stringValue("AddPipelineResponse.Pipeline.State"));
		pipeline.setSpeedLevel(_ctx.longValue("AddPipelineResponse.Pipeline.SpeedLevel"));
		pipeline.setRole(_ctx.stringValue("AddPipelineResponse.Pipeline.Role"));
		pipeline.setName(_ctx.stringValue("AddPipelineResponse.Pipeline.Name"));
		pipeline.setId(_ctx.stringValue("AddPipelineResponse.Pipeline.Id"));
		pipeline.setQuotaAllocate(_ctx.longValue("AddPipelineResponse.Pipeline.QuotaAllocate"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setMqTopic(_ctx.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.MqTopic"));
		notifyConfig.setQueueName(_ctx.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.QueueName"));
		notifyConfig.setMqTag(_ctx.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.MqTag"));
		notifyConfig.setTopic(_ctx.stringValue("AddPipelineResponse.Pipeline.NotifyConfig.Topic"));
		pipeline.setNotifyConfig(notifyConfig);
		addPipelineResponse.setPipeline(pipeline);
	 
	 	return addPipelineResponse;
	}
}