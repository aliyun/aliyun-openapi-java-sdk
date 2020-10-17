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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.ListPipelineResponse;
import com.aliyuncs.elasticsearch.model.v20170613.ListPipelineResponse.Headers;
import com.aliyuncs.elasticsearch.model.v20170613.ListPipelineResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineResponseUnmarshaller {

	public static ListPipelineResponse unmarshall(ListPipelineResponse listPipelineResponse, UnmarshallerContext _ctx) {
		
		listPipelineResponse.setRequestId(_ctx.stringValue("ListPipelineResponse.RequestId"));

		Headers headers = new Headers();
		headers.setXTotalCount(_ctx.integerValue("ListPipelineResponse.Headers.X-Total-Count"));
		listPipelineResponse.setHeaders(headers);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setPipelineId(_ctx.stringValue("ListPipelineResponse.Result["+ i +"].pipelineId"));
			resultItem.setPipelineStatus(_ctx.stringValue("ListPipelineResponse.Result["+ i +"].pipelineStatus"));
			resultItem.setGmtCreatedTime(_ctx.stringValue("ListPipelineResponse.Result["+ i +"].gmtCreatedTime"));
			resultItem.setGmtUpdateTime(_ctx.stringValue("ListPipelineResponse.Result["+ i +"].gmtUpdateTime"));

			result.add(resultItem);
		}
		listPipelineResponse.setResult(result);
	 
	 	return listPipelineResponse;
	}
}