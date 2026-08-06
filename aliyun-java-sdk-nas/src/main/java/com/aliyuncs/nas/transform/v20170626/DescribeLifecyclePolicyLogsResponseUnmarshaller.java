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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePolicyLogsResponse;
import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLog;
import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLog.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecyclePolicyLogsResponseUnmarshaller {

	public static DescribeLifecyclePolicyLogsResponse unmarshall(DescribeLifecyclePolicyLogsResponse describeLifecyclePolicyLogsResponse, UnmarshallerContext _ctx) {
		
		describeLifecyclePolicyLogsResponse.setRequestId(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.RequestId"));
		describeLifecyclePolicyLogsResponse.setTotalCount(_ctx.integerValue("DescribeLifecyclePolicyLogsResponse.TotalCount"));
		describeLifecyclePolicyLogsResponse.setPageSize(_ctx.integerValue("DescribeLifecyclePolicyLogsResponse.PageSize"));
		describeLifecyclePolicyLogsResponse.setPageNumber(_ctx.integerValue("DescribeLifecyclePolicyLogsResponse.PageNumber"));
		describeLifecyclePolicyLogsResponse.setSuccess(_ctx.booleanValue("DescribeLifecyclePolicyLogsResponse.Success"));

		List<LifecyclePolicyLog> lifecyclePolicyLogs = new ArrayList<LifecyclePolicyLog>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs.Length"); i++) {
			LifecyclePolicyLog lifecyclePolicyLog = new LifecyclePolicyLog();
			lifecyclePolicyLog.setStatus(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].Status"));
			lifecyclePolicyLog.setStorageType(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].StorageType"));
			lifecyclePolicyLog.setCreateTime(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].CreateTime"));
			lifecyclePolicyLog.setSummary(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].Summary"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].Paths["+ j +"]"));
			}
			lifecyclePolicyLog.setPaths(paths);

			List<Rule> retrieveRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].RetrieveRules.Length"); j++) {
				Rule rule = new Rule();
				rule.setAttribute(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].RetrieveRules["+ j +"].Attribute"));
				rule.setThreshold(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].RetrieveRules["+ j +"].Threshold"));

				retrieveRules.add(rule);
			}
			lifecyclePolicyLog.setRetrieveRules(retrieveRules);

			List<Rule> deleteRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].DeleteRules.Length"); j++) {
				Rule rule1 = new Rule();
				rule1.setAttribute(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].DeleteRules["+ j +"].Attribute"));
				rule1.setThreshold(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].DeleteRules["+ j +"].Threshold"));

				deleteRules.add(rule1);
			}
			lifecyclePolicyLog.setDeleteRules(deleteRules);

			List<Rule> transitRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].TransitRules.Length"); j++) {
				Rule rule2 = new Rule();
				rule2.setAttribute(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].TransitRules["+ j +"].Attribute"));
				rule2.setThreshold(_ctx.stringValue("DescribeLifecyclePolicyLogsResponse.LifecyclePolicyLogs["+ i +"].TransitRules["+ j +"].Threshold"));

				transitRules.add(rule2);
			}
			lifecyclePolicyLog.setTransitRules(transitRules);

			lifecyclePolicyLogs.add(lifecyclePolicyLog);
		}
		describeLifecyclePolicyLogsResponse.setLifecyclePolicyLogs(lifecyclePolicyLogs);
	 
	 	return describeLifecyclePolicyLogsResponse;
	}
}