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

import com.aliyuncs.mts.model.v20140618.AddPornPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddPornPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddPornPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddPornPipelineResponseUnmarshaller {

	public static AddPornPipelineResponse unmarshall(AddPornPipelineResponse addPornPipelineResponse, UnmarshallerContext context) {
		
		addPornPipelineResponse.setRequestId(context.stringValue("AddPornPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("AddPornPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("AddPornPipelineResponse.Pipeline.Name"));
		pipeline.setPriority(context.integerValue("AddPornPipelineResponse.Pipeline.Priority"));
		pipeline.setState(context.stringValue("AddPornPipelineResponse.Pipeline.State"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("AddPornPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("AddPornPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addPornPipelineResponse.setPipeline(pipeline);
	 
	 	return addPornPipelineResponse;
	}
}