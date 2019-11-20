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

import com.aliyuncs.mts.model.v20140618.SearchPipelineResponse;
import com.aliyuncs.mts.model.v20140618.SearchPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.SearchPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchPipelineResponseUnmarshaller {

	public static SearchPipelineResponse unmarshall(SearchPipelineResponse searchPipelineResponse, UnmarshallerContext _ctx) {
		
		searchPipelineResponse.setRequestId(_ctx.stringValue("SearchPipelineResponse.RequestId"));
		searchPipelineResponse.setTotalCount(_ctx.longValue("SearchPipelineResponse.TotalCount"));
		searchPipelineResponse.setPageNumber(_ctx.longValue("SearchPipelineResponse.PageNumber"));
		searchPipelineResponse.setPageSize(_ctx.longValue("SearchPipelineResponse.PageSize"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("SearchPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setSpeed(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].Speed"));
			pipeline.setSpeedLevel(_ctx.longValue("SearchPipelineResponse.PipelineList["+ i +"].SpeedLevel"));
			pipeline.setQuotaAllocate(_ctx.longValue("SearchPipelineResponse.PipelineList["+ i +"].QuotaAllocate"));
			pipeline.setRole(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].Role"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueueName(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].NotifyConfig.QueueName"));
			notifyConfig.setMqTopic(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].NotifyConfig.MqTopic"));
			notifyConfig.setMqTag(_ctx.stringValue("SearchPipelineResponse.PipelineList["+ i +"].NotifyConfig.MqTag"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		searchPipelineResponse.setPipelineList(pipelineList);
	 
	 	return searchPipelineResponse;
	}
}