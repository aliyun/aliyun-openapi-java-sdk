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

import com.aliyuncs.mts.model.v20140618.AddAsrPipelineResponse;
import com.aliyuncs.mts.model.v20140618.AddAsrPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.AddAsrPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddAsrPipelineResponseUnmarshaller {

	public static AddAsrPipelineResponse unmarshall(AddAsrPipelineResponse addAsrPipelineResponse, UnmarshallerContext _ctx) {
		
		addAsrPipelineResponse.setRequestId(_ctx.stringValue("AddAsrPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(_ctx.stringValue("AddAsrPipelineResponse.Pipeline.Id"));
		pipeline.setName(_ctx.stringValue("AddAsrPipelineResponse.Pipeline.Name"));
		pipeline.setPriority(_ctx.integerValue("AddAsrPipelineResponse.Pipeline.Priority"));
		pipeline.setState(_ctx.stringValue("AddAsrPipelineResponse.Pipeline.State"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(_ctx.stringValue("AddAsrPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(_ctx.stringValue("AddAsrPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		addAsrPipelineResponse.setPipeline(pipeline);
	 
	 	return addAsrPipelineResponse;
	}
}