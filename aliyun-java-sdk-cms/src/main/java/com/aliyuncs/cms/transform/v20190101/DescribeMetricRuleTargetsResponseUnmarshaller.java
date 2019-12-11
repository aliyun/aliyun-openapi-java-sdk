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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTargetsResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricRuleTargetsResponse.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricRuleTargetsResponseUnmarshaller {

	public static DescribeMetricRuleTargetsResponse unmarshall(DescribeMetricRuleTargetsResponse describeMetricRuleTargetsResponse, UnmarshallerContext _ctx) {
		
		describeMetricRuleTargetsResponse.setRequestId(_ctx.stringValue("DescribeMetricRuleTargetsResponse.RequestId"));
		describeMetricRuleTargetsResponse.setCode(_ctx.stringValue("DescribeMetricRuleTargetsResponse.Code"));
		describeMetricRuleTargetsResponse.setMessage(_ctx.stringValue("DescribeMetricRuleTargetsResponse.Message"));

		List<Target> targets = new ArrayList<Target>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricRuleTargetsResponse.Targets.Length"); i++) {
			Target target = new Target();
			target.setId(_ctx.stringValue("DescribeMetricRuleTargetsResponse.Targets["+ i +"].Id"));
			target.setArn(_ctx.stringValue("DescribeMetricRuleTargetsResponse.Targets["+ i +"].Arn"));
			target.setLevel(_ctx.stringValue("DescribeMetricRuleTargetsResponse.Targets["+ i +"].Level"));

			targets.add(target);
		}
		describeMetricRuleTargetsResponse.setTargets(targets);
	 
	 	return describeMetricRuleTargetsResponse;
	}
}