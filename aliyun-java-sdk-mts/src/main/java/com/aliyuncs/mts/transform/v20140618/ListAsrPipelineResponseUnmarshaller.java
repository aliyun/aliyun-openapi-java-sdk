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

import com.aliyuncs.mts.model.v20140618.ListAsrPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListAsrPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.ListAsrPipelineResponse.Pipeline.NotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAsrPipelineResponseUnmarshaller {

	public static ListAsrPipelineResponse unmarshall(ListAsrPipelineResponse listAsrPipelineResponse, UnmarshallerContext _ctx) {
		
		listAsrPipelineResponse.setRequestId(_ctx.stringValue("ListAsrPipelineResponse.RequestId"));
		listAsrPipelineResponse.setTotalCount(_ctx.longValue("ListAsrPipelineResponse.TotalCount"));
		listAsrPipelineResponse.setPageNumber(_ctx.longValue("ListAsrPipelineResponse.PageNumber"));
		listAsrPipelineResponse.setPageSize(_ctx.longValue("ListAsrPipelineResponse.PageSize"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListAsrPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueueName(_ctx.stringValue("ListAsrPipelineResponse.PipelineList["+ i +"].NotifyConfig.QueueName"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		listAsrPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listAsrPipelineResponse;
	}
}