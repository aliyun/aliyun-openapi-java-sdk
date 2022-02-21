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

import com.aliyuncs.cms.model.v20190101.DeleteMetricRuleTargetsResponse;
import com.aliyuncs.cms.model.v20190101.DeleteMetricRuleTargetsResponse.FailIds;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMetricRuleTargetsResponseUnmarshaller {

	public static DeleteMetricRuleTargetsResponse unmarshall(DeleteMetricRuleTargetsResponse deleteMetricRuleTargetsResponse, UnmarshallerContext _ctx) {
		
		deleteMetricRuleTargetsResponse.setRequestId(_ctx.stringValue("DeleteMetricRuleTargetsResponse.RequestId"));
		deleteMetricRuleTargetsResponse.setCode(_ctx.stringValue("DeleteMetricRuleTargetsResponse.Code"));
		deleteMetricRuleTargetsResponse.setMessage(_ctx.stringValue("DeleteMetricRuleTargetsResponse.Message"));
		deleteMetricRuleTargetsResponse.setSuccess(_ctx.booleanValue("DeleteMetricRuleTargetsResponse.Success"));

		FailIds failIds = new FailIds();

		List<String> targetIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteMetricRuleTargetsResponse.FailIds.TargetIds.Length"); i++) {
			targetIds.add(_ctx.stringValue("DeleteMetricRuleTargetsResponse.FailIds.TargetIds["+ i +"]"));
		}
		failIds.setTargetIds(targetIds);
		deleteMetricRuleTargetsResponse.setFailIds(failIds);
	 
	 	return deleteMetricRuleTargetsResponse;
	}
}