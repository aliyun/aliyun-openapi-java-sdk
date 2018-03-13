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

	public static UpdatePipelineResponse unmarshall(UpdatePipelineResponse updatePipelineResponse, UnmarshallerContext context) {
		
		updatePipelineResponse.setRequestId(context.stringValue("UpdatePipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdatePipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdatePipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdatePipelineResponse.Pipeline.State"));
		pipeline.setSpeed(context.stringValue("UpdatePipelineResponse.Pipeline.Speed"));
		pipeline.setRole(context.stringValue("UpdatePipelineResponse.Pipeline.Role"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueueName(context.stringValue("UpdatePipelineResponse.Pipeline.NotifyConfig.QueueName"));
		pipeline.setNotifyConfig(notifyConfig);
		updatePipelineResponse.setPipeline(pipeline);
	 
	 	return updatePipelineResponse;
	}
}