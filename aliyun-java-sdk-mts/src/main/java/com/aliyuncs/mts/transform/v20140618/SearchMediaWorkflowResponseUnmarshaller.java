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

import com.aliyuncs.mts.model.v20140618.SearchMediaWorkflowResponse;
import com.aliyuncs.mts.model.v20140618.SearchMediaWorkflowResponse.MediaWorkflow;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMediaWorkflowResponseUnmarshaller {

	public static SearchMediaWorkflowResponse unmarshall(SearchMediaWorkflowResponse searchMediaWorkflowResponse, UnmarshallerContext _ctx) {
		
		searchMediaWorkflowResponse.setRequestId(_ctx.stringValue("SearchMediaWorkflowResponse.RequestId"));
		searchMediaWorkflowResponse.setTotalCount(_ctx.longValue("SearchMediaWorkflowResponse.TotalCount"));
		searchMediaWorkflowResponse.setPageSize(_ctx.longValue("SearchMediaWorkflowResponse.PageSize"));
		searchMediaWorkflowResponse.setPageNumber(_ctx.longValue("SearchMediaWorkflowResponse.PageNumber"));

		List<MediaWorkflow> mediaWorkflowList = new ArrayList<MediaWorkflow>();
		for (int i = 0; i < _ctx.lengthValue("SearchMediaWorkflowResponse.MediaWorkflowList.Length"); i++) {
			MediaWorkflow mediaWorkflow = new MediaWorkflow();
			mediaWorkflow.setCreationTime(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].CreationTime"));
			mediaWorkflow.setMediaWorkflowId(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].MediaWorkflowId"));
			mediaWorkflow.setState(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].State"));
			mediaWorkflow.setTriggerMode(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].TriggerMode"));
			mediaWorkflow.setName(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].Name"));
			mediaWorkflow.setTopology(_ctx.stringValue("SearchMediaWorkflowResponse.MediaWorkflowList["+ i +"].Topology"));

			mediaWorkflowList.add(mediaWorkflow);
		}
		searchMediaWorkflowResponse.setMediaWorkflowList(mediaWorkflowList);
	 
	 	return searchMediaWorkflowResponse;
	}
}