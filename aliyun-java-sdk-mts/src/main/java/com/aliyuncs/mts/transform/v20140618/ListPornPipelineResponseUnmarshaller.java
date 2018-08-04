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

import com.aliyuncs.mts.model.v20140618.ListPornPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListPornPipelineResponse.Pipeline;
import com.aliyuncs.mts.model.v20140618.ListPornPipelineResponse.Pipeline.NotifyConfig;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPornPipelineResponseUnmarshaller {

	public static ListPornPipelineResponse unmarshall(ListPornPipelineResponse listPornPipelineResponse, UnmarshallerContext context) {
		
		listPornPipelineResponse.setRequestId(context.stringValue("ListPornPipelineResponse.RequestId"));
		listPornPipelineResponse.setTotalCount(context.longValue("ListPornPipelineResponse.TotalCount"));
		listPornPipelineResponse.setPageNumber(context.longValue("ListPornPipelineResponse.PageNumber"));
		listPornPipelineResponse.setPageSize(context.longValue("ListPornPipelineResponse.PageSize"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("ListPornPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setId(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Id"));
			pipeline.setName(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Priority"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(context.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		listPornPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listPornPipelineResponse;
	}
}