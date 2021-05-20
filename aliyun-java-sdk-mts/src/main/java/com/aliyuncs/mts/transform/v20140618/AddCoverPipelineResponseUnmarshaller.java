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

import com.aliyuncs.mts.model.v20140618.AddCoverPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddCoverPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddCoverPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCoverPipelineResponseUnmarshaller {

	public static AddCoverPipelineResponse unmarshall(AddCoverPipelineResponse addCoverPipelineResponse, UnmarshallerContext _ctx) {
		
		addCoverPipelineResponse.setRequestId(_ctx.stringValue("AddCoverPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setState(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.State"));
		pipeline.setPriority(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.Priority"));
		pipeline.setRole(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.Role"));
		pipeline.setName(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.Name"));
		pipeline.setId(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.Id"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(_ctx.stringValue("AddCoverPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addCoverPipelineResponse.setPipeline(pipeline);
	 
	 	return addCoverPipelineResponse;
	}
}