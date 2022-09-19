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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDefaultSLARulesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDefaultSLARulesResponse.SLARule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDefaultSLARulesResponseUnmarshaller {

	public static ListDefaultSLARulesResponse unmarshall(ListDefaultSLARulesResponse listDefaultSLARulesResponse, UnmarshallerContext _ctx) {
		
		listDefaultSLARulesResponse.setRequestId(_ctx.stringValue("ListDefaultSLARulesResponse.RequestId"));
		listDefaultSLARulesResponse.setErrorCode(_ctx.stringValue("ListDefaultSLARulesResponse.ErrorCode"));
		listDefaultSLARulesResponse.setErrorMessage(_ctx.stringValue("ListDefaultSLARulesResponse.ErrorMessage"));
		listDefaultSLARulesResponse.setSuccess(_ctx.booleanValue("ListDefaultSLARulesResponse.Success"));

		List<SLARule> sLARuleList = new ArrayList<SLARule>();
		for (int i = 0; i < _ctx.lengthValue("ListDefaultSLARulesResponse.SLARuleList.Length"); i++) {
			SLARule sLARule = new SLARule();
			sLARule.setId(_ctx.longValue("ListDefaultSLARulesResponse.SLARuleList["+ i +"].Id"));
			sLARule.setDagId(_ctx.longValue("ListDefaultSLARulesResponse.SLARuleList["+ i +"].DagId"));
			sLARule.setNodeId(_ctx.longValue("ListDefaultSLARulesResponse.SLARuleList["+ i +"].NodeId"));
			sLARule.setRuleType(_ctx.integerValue("ListDefaultSLARulesResponse.SLARuleList["+ i +"].RuleType"));
			sLARule.setIntervalMinutes(_ctx.integerValue("ListDefaultSLARulesResponse.SLARuleList["+ i +"].IntervalMinutes"));

			sLARuleList.add(sLARule);
		}
		listDefaultSLARulesResponse.setSLARuleList(sLARuleList);
	 
	 	return listDefaultSLARulesResponse;
	}
}