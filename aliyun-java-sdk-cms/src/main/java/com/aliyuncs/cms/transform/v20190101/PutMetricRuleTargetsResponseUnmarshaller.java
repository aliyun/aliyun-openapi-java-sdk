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

import com.aliyuncs.cms.model.v20190101.PutMetricRuleTargetsResponse;
import com.aliyuncs.cms.model.v20190101.PutMetricRuleTargetsResponse.FailData;
import com.aliyuncs.cms.model.v20190101.PutMetricRuleTargetsResponse.FailData.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class PutMetricRuleTargetsResponseUnmarshaller {

	public static PutMetricRuleTargetsResponse unmarshall(PutMetricRuleTargetsResponse putMetricRuleTargetsResponse, UnmarshallerContext _ctx) {
		
		putMetricRuleTargetsResponse.setRequestId(_ctx.stringValue("PutMetricRuleTargetsResponse.RequestId"));
		putMetricRuleTargetsResponse.setSuccess(_ctx.booleanValue("PutMetricRuleTargetsResponse.Success"));
		putMetricRuleTargetsResponse.setCode(_ctx.stringValue("PutMetricRuleTargetsResponse.Code"));
		putMetricRuleTargetsResponse.setMessage(_ctx.stringValue("PutMetricRuleTargetsResponse.Message"));

		FailData failData = new FailData();

		List<Target> targets = new ArrayList<Target>();
		for (int i = 0; i < _ctx.lengthValue("PutMetricRuleTargetsResponse.FailData.Targets.Length"); i++) {
			Target target = new Target();
			target.setId(_ctx.stringValue("PutMetricRuleTargetsResponse.FailData.Targets["+ i +"].Id"));
			target.setArn(_ctx.stringValue("PutMetricRuleTargetsResponse.FailData.Targets["+ i +"].Arn"));
			target.setLevel(_ctx.stringValue("PutMetricRuleTargetsResponse.FailData.Targets["+ i +"].Level"));

			targets.add(target);
		}
		failData.setTargets(targets);
		putMetricRuleTargetsResponse.setFailData(failData);
	 
	 	return putMetricRuleTargetsResponse;
	}
}