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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplateApplyResultsResponse;
import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplateApplyResultsResponse.ApplyFirewallTemplateResult;
import com.aliyuncs.swas_open.model.v20200601.DescribeFirewallTemplateApplyResultsResponse.ApplyFirewallTemplateResult.ApplyInstanceResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFirewallTemplateApplyResultsResponseUnmarshaller {

	public static DescribeFirewallTemplateApplyResultsResponse unmarshall(DescribeFirewallTemplateApplyResultsResponse describeFirewallTemplateApplyResultsResponse, UnmarshallerContext _ctx) {
		
		describeFirewallTemplateApplyResultsResponse.setRequestId(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.RequestId"));
		describeFirewallTemplateApplyResultsResponse.setPageNumber(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.PageNumber"));
		describeFirewallTemplateApplyResultsResponse.setPageSize(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.PageSize"));
		describeFirewallTemplateApplyResultsResponse.setTotalCount(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.TotalCount"));

		List<ApplyFirewallTemplateResult> data = new ArrayList<ApplyFirewallTemplateResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFirewallTemplateApplyResultsResponse.data.Length"); i++) {
			ApplyFirewallTemplateResult applyFirewallTemplateResult = new ApplyFirewallTemplateResult();
			applyFirewallTemplateResult.setTaskId(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].TaskId"));
			applyFirewallTemplateResult.setFirewallTemplateId(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].FirewallTemplateId"));
			applyFirewallTemplateResult.setStatus(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].Status"));
			applyFirewallTemplateResult.setTotalCount(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].TotalCount"));
			applyFirewallTemplateResult.setFailedCount(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].FailedCount"));
			applyFirewallTemplateResult.setCreateTime(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].CreateTime"));

			List<ApplyInstanceResult> instanceApplyResults = new ArrayList<ApplyInstanceResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].InstanceApplyResults.Length"); j++) {
				ApplyInstanceResult applyInstanceResult = new ApplyInstanceResult();
				applyInstanceResult.setInstanceId(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].InstanceApplyResults["+ j +"].InstanceId"));
				applyInstanceResult.setStatus(_ctx.stringValue("DescribeFirewallTemplateApplyResultsResponse.data["+ i +"].InstanceApplyResults["+ j +"].Status"));

				instanceApplyResults.add(applyInstanceResult);
			}
			applyFirewallTemplateResult.setInstanceApplyResults(instanceApplyResults);

			data.add(applyFirewallTemplateResult);
		}
		describeFirewallTemplateApplyResultsResponse.setData(data);
	 
	 	return describeFirewallTemplateApplyResultsResponse;
	}
}