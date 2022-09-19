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

import com.aliyuncs.dms_enterprise.model.v20181101.ListSLARulesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSLARulesResponse.SLARule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSLARulesResponseUnmarshaller {

	public static ListSLARulesResponse unmarshall(ListSLARulesResponse listSLARulesResponse, UnmarshallerContext _ctx) {
		
		listSLARulesResponse.setRequestId(_ctx.stringValue("ListSLARulesResponse.RequestId"));
		listSLARulesResponse.setErrorCode(_ctx.stringValue("ListSLARulesResponse.ErrorCode"));
		listSLARulesResponse.setErrorMessage(_ctx.stringValue("ListSLARulesResponse.ErrorMessage"));
		listSLARulesResponse.setSuccess(_ctx.booleanValue("ListSLARulesResponse.Success"));

		List<SLARule> sLARuleList = new ArrayList<SLARule>();
		for (int i = 0; i < _ctx.lengthValue("ListSLARulesResponse.SLARuleList.Length"); i++) {
			SLARule sLARule = new SLARule();
			sLARule.setId(_ctx.longValue("ListSLARulesResponse.SLARuleList["+ i +"].Id"));
			sLARule.setDagId(_ctx.longValue("ListSLARulesResponse.SLARuleList["+ i +"].DagId"));
			sLARule.setNodeId(_ctx.longValue("ListSLARulesResponse.SLARuleList["+ i +"].NodeId"));
			sLARule.setRuleType(_ctx.integerValue("ListSLARulesResponse.SLARuleList["+ i +"].RuleType"));
			sLARule.setIntervalMinutes(_ctx.integerValue("ListSLARulesResponse.SLARuleList["+ i +"].IntervalMinutes"));

			sLARuleList.add(sLARule);
		}
		listSLARulesResponse.setSLARuleList(sLARuleList);
	 
	 	return listSLARulesResponse;
	}
}