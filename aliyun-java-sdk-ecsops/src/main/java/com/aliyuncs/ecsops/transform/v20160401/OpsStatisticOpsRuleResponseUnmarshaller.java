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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsStatisticOpsRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsStatisticOpsRuleResponseUnmarshaller {

	public static OpsStatisticOpsRuleResponse unmarshall(OpsStatisticOpsRuleResponse opsStatisticOpsRuleResponse, UnmarshallerContext _ctx) {
		
		opsStatisticOpsRuleResponse.setRequestId(_ctx.stringValue("OpsStatisticOpsRuleResponse.RequestId"));
		opsStatisticOpsRuleResponse.setStartTimeStamp(_ctx.integerValue("OpsStatisticOpsRuleResponse.StartTimeStamp"));
		opsStatisticOpsRuleResponse.setEndTimeStamp(_ctx.integerValue("OpsStatisticOpsRuleResponse.EndTimeStamp"));
		opsStatisticOpsRuleResponse.setTimeCnt(_ctx.integerValue("OpsStatisticOpsRuleResponse.TimeCnt"));
		opsStatisticOpsRuleResponse.setIntervalTime(_ctx.integerValue("OpsStatisticOpsRuleResponse.IntervalTime"));

		List<String> ncCnts = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsStatisticOpsRuleResponse.NcCnts.Length"); i++) {
			ncCnts.add(_ctx.stringValue("OpsStatisticOpsRuleResponse.NcCnts["+ i +"]"));
		}
		opsStatisticOpsRuleResponse.setNcCnts(ncCnts);
	 
	 	return opsStatisticOpsRuleResponse;
	}
}