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

package com.aliyuncs.fnf.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.fnf.model.v20190315.ListExecutionsResponse;
import com.aliyuncs.fnf.model.v20190315.ListExecutionsResponse.ExecutionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExecutionsResponseUnmarshaller {

	public static ListExecutionsResponse unmarshall(ListExecutionsResponse listExecutionsResponse, UnmarshallerContext _ctx) {
		
		listExecutionsResponse.setRequestId(_ctx.stringValue("ListExecutionsResponse.RequestId"));
		listExecutionsResponse.setNextToken(_ctx.stringValue("ListExecutionsResponse.NextToken"));

		List<ExecutionsItem> executions = new ArrayList<ExecutionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExecutionsResponse.Executions.Length"); i++) {
			ExecutionsItem executionsItem = new ExecutionsItem();
			executionsItem.setName(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Name"));
			executionsItem.setFlowName(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].FlowName"));
			executionsItem.setFlowDefinition(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].FlowDefinition"));
			executionsItem.setInput(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Input"));
			executionsItem.setOutput(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Output"));
			executionsItem.setStatus(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].Status"));
			executionsItem.setStartedTime(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StartedTime"));
			executionsItem.setStoppedTime(_ctx.stringValue("ListExecutionsResponse.Executions["+ i +"].StoppedTime"));

			executions.add(executionsItem);
		}
		listExecutionsResponse.setExecutions(executions);
	 
	 	return listExecutionsResponse;
	}
}