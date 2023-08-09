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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.ListAggregateRemediationExecutionsResponse;
import com.aliyuncs.config.model.v20200907.ListAggregateRemediationExecutionsResponse.RemediationExecutionData;
import com.aliyuncs.config.model.v20200907.ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAggregateRemediationExecutionsResponseUnmarshaller {

	public static ListAggregateRemediationExecutionsResponse unmarshall(ListAggregateRemediationExecutionsResponse listAggregateRemediationExecutionsResponse, UnmarshallerContext _ctx) {
		
		listAggregateRemediationExecutionsResponse.setRequestId(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RequestId"));

		RemediationExecutionData remediationExecutionData = new RemediationExecutionData();
		remediationExecutionData.setNextToken(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.NextToken"));
		remediationExecutionData.setMaxResults(_ctx.longValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.MaxResults"));

		List<RemediationExecutionsItem> remediationExecutions = new ArrayList<RemediationExecutionsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions.Length"); i++) {
			RemediationExecutionsItem remediationExecutionsItem = new RemediationExecutionsItem();
			remediationExecutionsItem.setExecutionInvocationId(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionInvocationId"));
			remediationExecutionsItem.setExecutionStatus(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionStatus"));
			remediationExecutionsItem.setExecutionResourceType(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionResourceType"));
			remediationExecutionsItem.setExecutionCreateDate(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionCreateDate"));
			remediationExecutionsItem.setExecutionStatusMessage(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionStatusMessage"));
			remediationExecutionsItem.setExecutionResourceIds(_ctx.stringValue("ListAggregateRemediationExecutionsResponse.RemediationExecutionData.RemediationExecutions["+ i +"].ExecutionResourceIds"));

			remediationExecutions.add(remediationExecutionsItem);
		}
		remediationExecutionData.setRemediationExecutions(remediationExecutions);
		listAggregateRemediationExecutionsResponse.setRemediationExecutionData(remediationExecutionData);
	 
	 	return listAggregateRemediationExecutionsResponse;
	}
}