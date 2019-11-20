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

import com.aliyuncs.mts.model.v20140618.UpdateTerrorismPipelineResponse;
import com.aliyuncs.mts.model.v20140618.UpdateTerrorismPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.UpdateTerrorismPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTerrorismPipelineResponseUnmarshaller {

	public static UpdateTerrorismPipelineResponse unmarshall(UpdateTerrorismPipelineResponse updateTerrorismPipelineResponse, UnmarshallerContext _ctx) {
		
		updateTerrorismPipelineResponse.setRequestId(_ctx.stringValue("UpdateTerrorismPipelineResponse.RequestId"));

		Pipeline pipeline = new Pipeline();
		pipeline.setId(_ctx.stringValue("UpdateTerrorismPipelineResponse.Pipeline.Id"));
		pipeline.setName(_ctx.stringValue("UpdateTerrorismPipelineResponse.Pipeline.Name"));
		pipeline.setState(_ctx.stringValue("UpdateTerrorismPipelineResponse.Pipeline.State"));
		pipeline.setPriority(_ctx.integerValue("UpdateTerrorismPipelineResponse.Pipeline.Priority"));

		NotifyConfig notifyConfig = new NotifyConfig();
		notifyConfig.setTopic(_ctx.stringValue("UpdateTerrorismPipelineResponse.Pipeline.NotifyConfig.Topic"));
		notifyConfig.setQueue(_ctx.stringValue("UpdateTerrorismPipelineResponse.Pipeline.NotifyConfig.Queue"));
		pipeline.setNotifyConfig(notifyConfig);
		updateTerrorismPipelineResponse.setPipeline(pipeline);
	 
	 	return updateTerrorismPipelineResponse;
	}
}