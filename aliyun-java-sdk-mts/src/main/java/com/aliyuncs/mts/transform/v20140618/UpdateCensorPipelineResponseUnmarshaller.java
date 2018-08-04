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

import com.aliyuncs.mts.model.v20140618.UpdateCensorPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdateCensorPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdateCensorPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCensorPipelineResponseUnmarshaller {

	public static UpdateCensorPipelineResponse unmarshall(UpdateCensorPipelineResponse updateCensorPipelineResponse, UnmarshallerContext context) {
		
		updateCensorPipelineResponse.setRequestId(context.stringValue("UpdateCensorPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("UpdateCensorPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("UpdateCensorPipelineResponse.Pipeline.Name"));
		pipeline.setState(context.stringValue("UpdateCensorPipelineResponse.Pipeline.State"));
		pipeline.setPriority(context.integerValue("UpdateCensorPipelineResponse.Pipeline.Priority"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("UpdateCensorPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("UpdateCensorPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		updateCensorPipelineResponse.setPipeline(pipeline);
	 
	 	return updateCensorPipelineResponse;
	}
}