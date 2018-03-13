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

import com.aliyuncs.mts.model.v20140618.UpdateVideoSummaryPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdateVideoSummaryPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdateVideoSummaryPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateVideoSummaryPipelineResponseUnmarshaller {

	public static UpdateVideoSummaryPipelineResponse unmarshall(UpdateVideoSummaryPipelineResponse updateVideoSummaryPipelineResponse, UnmarshallerContext context) {
		
		updateVideoSummaryPipelineResponse.setRequestId(context.stringValue("UpdateVideoSummaryPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdateVideoSummaryPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdateVideoSummaryPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdateVideoSummaryPipelineResponse.Pipeline.State"));
		pipeline.setPriority(context.integerValue("UpdateVideoSummaryPipelineResponse.Pipeline.Priority"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdateVideoSummaryPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueueName(context.stringValue("UpdateVideoSummaryPipelineResponse.Pipeline.NotifyConfig.QueueName"));
		pipeline.setNotifyConfig(notifyConfig);
		updateVideoSummaryPipelineResponse.setPipeline(pipeline);
	 
	 	return updateVideoSummaryPipelineResponse;
	}
}