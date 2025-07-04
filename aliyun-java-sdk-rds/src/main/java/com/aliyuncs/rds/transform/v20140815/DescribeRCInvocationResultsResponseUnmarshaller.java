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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCInvocationResultsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCInvocationResultsResponse.InvocationResultsItem;
import com.aliyuncs.rds.model.v20140815.DescribeRCInvocationResultsResponse.InvocationResultsItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCInvocationResultsResponseUnmarshaller {

	public static DescribeRCInvocationResultsResponse unmarshall(DescribeRCInvocationResultsResponse describeRCInvocationResultsResponse, UnmarshallerContext _ctx) {
		
		describeRCInvocationResultsResponse.setRequestId(_ctx.stringValue("DescribeRCInvocationResultsResponse.RequestId"));
		describeRCInvocationResultsResponse.setTotalCount(_ctx.integerValue("DescribeRCInvocationResultsResponse.TotalCount"));
		describeRCInvocationResultsResponse.setNextToken(_ctx.stringValue("DescribeRCInvocationResultsResponse.NextToken"));
		describeRCInvocationResultsResponse.setPageNumber(_ctx.stringValue("DescribeRCInvocationResultsResponse.PageNumber"));
		describeRCInvocationResultsResponse.setPageSize(_ctx.stringValue("DescribeRCInvocationResultsResponse.PageSize"));

		List<InvocationResultsItem> invocationResults = new ArrayList<InvocationResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCInvocationResultsResponse.InvocationResults.Length"); i++) {
			InvocationResultsItem invocationResultsItem = new InvocationResultsItem();
			invocationResultsItem.setDropped(_ctx.integerValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Dropped"));
			invocationResultsItem.setInvocationStatus(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].InvocationStatus"));
			invocationResultsItem.setInstanceId(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].InstanceId"));
			invocationResultsItem.setErrorInfo(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].ErrorInfo"));
			invocationResultsItem.setExitCode(_ctx.integerValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].ExitCode"));
			invocationResultsItem.setStartTime(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].StartTime"));
			invocationResultsItem.setRepeats(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Repeats"));
			invocationResultsItem.setInvokeRecordStatus(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].InvokeRecordStatus"));
			invocationResultsItem.setFinishedTime(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].FinishedTime"));
			invocationResultsItem.setContainerId(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].ContainerId"));
			invocationResultsItem.setContainerName(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].ContainerName"));
			invocationResultsItem.setUsername(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Username"));
			invocationResultsItem.setOutput(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Output"));
			invocationResultsItem.setCommandId(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].CommandId"));
			invocationResultsItem.setErrorCode(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].ErrorCode"));
			invocationResultsItem.setInvokeId(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].InvokeId"));
			invocationResultsItem.setStopTime(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].StopTime"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("DescribeRCInvocationResultsResponse.InvocationResults["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			invocationResultsItem.setTags(tags);

			invocationResults.add(invocationResultsItem);
		}
		describeRCInvocationResultsResponse.setInvocationResults(invocationResults);
	 
	 	return describeRCInvocationResultsResponse;
	}
}