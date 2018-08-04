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

import com.aliyuncs.mts.model.v20140618.UpdateAsrPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdateAsrPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdateAsrPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAsrPipelineResponseUnmarshaller {

	public static UpdateAsrPipelineResponse unmarshall(UpdateAsrPipelineResponse updateAsrPipelineResponse, UnmarshallerContext context) {
		
		updateAsrPipelineResponse.setRequestId(context.stringValue("UpdateAsrPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdateAsrPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdateAsrPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdateAsrPipelineResponse.Pipeline.State"));
		pipeline.setPriority(context.integerValue("UpdateAsrPipelineResponse.Pipeline.Priority"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdateAsrPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueueName(context.stringValue("UpdateAsrPipelineResponse.Pipeline.NotifyConfig.QueueName"));
		pipeline.setNotifyConfig(notifyConfig);
		updateAsrPipelineResponse.setPipeline(pipeline);
	 
	 	return updateAsrPipelineResponse;
	}
}