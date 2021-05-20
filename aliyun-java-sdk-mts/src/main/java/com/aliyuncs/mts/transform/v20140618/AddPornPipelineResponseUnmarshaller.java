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

	public static AddPornPipelineResponse unmarshall(AddPornPipelineResponse addPornPipelineResponse, UnmarshallerContext _ctx) {
		
		addPornPipelineResponse.setRequestId(_ctx.stringValue("AddPornPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setState(_ctx.stringValue("AddPornPipelineResponse.Pipeline.State"));
		pipeline.setPriority(_ctx.integerValue("AddPornPipelineResponse.Pipeline.Priority"));
		pipeline.setName(_ctx.stringValue("AddPornPipelineResponse.Pipeline.Name"));
		pipeline.setId(_ctx.stringValue("AddPornPipelineResponse.Pipeline.Id"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(_ctx.stringValue("AddPornPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(_ctx.stringValue("AddPornPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addPornPipelineResponse.setPipeline(pipeline);
	 
	 	return addPornPipelineResponse;
	}
}