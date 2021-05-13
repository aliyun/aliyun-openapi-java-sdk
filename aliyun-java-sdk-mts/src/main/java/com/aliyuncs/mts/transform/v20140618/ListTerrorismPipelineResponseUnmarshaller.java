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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.ListTerrorismPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTerrorismPipelineResponseUnmarshaller {

	public static ListTerrorismPipelineResponse unmarshall(ListTerrorismPipelineResponse listTerrorismPipelineResponse, UnmarshallerContext _ctx) {
		
		listTerrorismPipelineResponse.setRequestId(_ctx.stringValue("ListTerrorismPipelineResponse.RequestId"));
		listTerrorismPipelineResponse.setTotalCount(_ctx.longValue("ListTerrorismPipelineResponse.TotalCount"));
		listTerrorismPipelineResponse.setPageSize(_ctx.longValue("ListTerrorismPipelineResponse.PageSize"));
		listTerrorismPipelineResponse.setPageNumber(_ctx.longValue("ListTerrorismPipelineResponse.PageNumber"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListTerrorismPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setState(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Priority"));
			pipeline.setName(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setId(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].Id"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(_ctx.stringValue("ListTerrorismPipelineResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		listTerrorismPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listTerrorismPipelineResponse;
	}
}