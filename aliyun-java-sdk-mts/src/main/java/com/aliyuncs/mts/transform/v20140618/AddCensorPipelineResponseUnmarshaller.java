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

import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddCensorPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCensorPipelineResponseUnmarshaller {

	public static AddCensorPipelineResponse unmarshall(AddCensorPipelineResponse addCensorPipelineResponse, UnmarshallerContext context) {
		
		addCensorPipelineResponse.setRequestId(context.stringValue("AddCensorPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(context.stringValue("AddCensorPipelineResponse.Pipeline.Id"));
		pipeline.setName(context.stringValue("AddCensorPipelineResponse.Pipeline.Name"));
		pipeline.setPriority(context.integerValue("AddCensorPipelineResponse.Pipeline.Priority"));
		pipeline.setState(context.stringValue("AddCensorPipelineResponse.Pipeline.State"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(context.stringValue("AddCensorPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(context.stringValue("AddCensorPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addCensorPipelineResponse.setPipeline(pipeline);
	 
	 	return addCensorPipelineResponse;
	}
}