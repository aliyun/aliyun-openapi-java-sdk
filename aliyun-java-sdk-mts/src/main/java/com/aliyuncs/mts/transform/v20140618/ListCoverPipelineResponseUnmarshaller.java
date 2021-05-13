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

import com.aliyuncs.mts.model.v20140618.ListCoverPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListCoverPipelineResponse.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCoverPipelineResponseUnmarshaller {

	public static ListCoverPipelineResponse unmarshall(ListCoverPipelineResponse listCoverPipelineResponse, UnmarshallerContext _ctx) {
		
		listCoverPipelineResponse.setRequestId(_ctx.stringValue("ListCoverPipelineResponse.RequestId"));
		listCoverPipelineResponse.setTotalCount(_ctx.longValue("ListCoverPipelineResponse.TotalCount"));
		listCoverPipelineResponse.setPageSize(_ctx.longValue("ListCoverPipelineResponse.PageSize"));
		listCoverPipelineResponse.setPageNumber(_ctx.longValue("ListCoverPipelineResponse.PageNumber"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < _ctx.lengthValue("ListCoverPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setState(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setQuotaNum(_ctx.integerValue("ListCoverPipelineResponse.PipelineList["+ i +"].quotaNum"));
			pipeline.setUserId(_ctx.longValue("ListCoverPipelineResponse.PipelineList["+ i +"].UserId"));
			pipeline.setNotifyConfig(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].NotifyConfig"));
			pipeline.setExtendConfig(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].ExtendConfig"));
			pipeline.setPriority(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Priority"));
			pipeline.setRole(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Role"));
			pipeline.setName(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setPipelineId(_ctx.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].PipelineId"));
			pipeline.setQuotaUsed(_ctx.integerValue("ListCoverPipelineResponse.PipelineList["+ i +"].quotaUsed"));

			pipelineList.add(pipeline);
		}
		listCoverPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listCoverPipelineResponse;
	}
}