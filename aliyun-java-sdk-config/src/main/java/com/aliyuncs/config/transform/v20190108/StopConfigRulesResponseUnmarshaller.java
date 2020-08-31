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

package com.aliyuncs.config.transform.v20190108;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20190108.StopConfigRulesResponse;
import com.aliyuncs.config.model.v20190108.StopConfigRulesResponse.OperateRuleResult;
import com.aliyuncs.config.model.v20190108.StopConfigRulesResponse.OperateRuleResult.OperateRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class StopConfigRulesResponseUnmarshaller {

	public static StopConfigRulesResponse unmarshall(StopConfigRulesResponse stopConfigRulesResponse, UnmarshallerContext _ctx) {
		
		stopConfigRulesResponse.setRequestId(_ctx.stringValue("StopConfigRulesResponse.RequestId"));

		OperateRuleResult operateRuleResult = new OperateRuleResult();

		List<OperateRuleItem> operateRuleItemList = new ArrayList<OperateRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("StopConfigRulesResponse.OperateRuleResult.OperateRuleItemList.Length"); i++) {
			OperateRuleItem operateRuleItem = new OperateRuleItem();
			operateRuleItem.setConfigRuleId(_ctx.stringValue("StopConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ConfigRuleId"));
			operateRuleItem.setErrorCode(_ctx.stringValue("StopConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ErrorCode"));
			operateRuleItem.setSuccess(_ctx.booleanValue("StopConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].Success"));

			operateRuleItemList.add(operateRuleItem);
		}
		operateRuleResult.setOperateRuleItemList(operateRuleItemList);
		stopConfigRulesResponse.setOperateRuleResult(operateRuleResult);
	 
	 	return stopConfigRulesResponse;
	}
}