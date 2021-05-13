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
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPornPipelineResponseUnmarshaller {

	public static ListPornPipelineResponse unmarshall(ListPornPipelineResponse listPornPipelineResponse, UnmarshallerContext _ctx) {
		
		listPornPipelineResponse.setRequestId(_ctx.stringValue("ListPornPipelineResponse.RequestId"));
		listPornPipelineResponse.setTotalCount(_ctx.longValue("ListPornPipelineResponse.TotalCount"));
		listPornPipelineResponse.setPageSize(_ctx.longValue("ListPornPipelineResponse.PageSize"));
		listPornPipelineResponse.setPageNumber(_ctx.longValue("ListPornPipelineResponse.PageNumber"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListPornPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setState(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Priority"));
			pipeline.setName(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setId(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].Id"));

			NotifyConfig notifyConfig = new NotifyConfig();
			notifyConfig.setTopic(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].NotifyConfig.Topic"));
			notifyConfig.setQueue(_ctx.stringValue("ListPornPipelineResponse.PipelineList["+ i +"].NotifyConfig.Queue"));
			pipeline.setNotifyConfig(notifyConfig);

			pipelineList.add(pipeline);
		}
		listPornPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listPornPipelineResponse;
	}
}