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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.DeleteConfigRulesResponse;
import com.aliyuncs.config.model.v20200907.DeleteConfigRulesResponse.OperateRuleResult;
import com.aliyuncs.config.model.v20200907.DeleteConfigRulesResponse.OperateRuleResult.OperateRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteConfigRulesResponseUnmarshaller {

	public static DeleteConfigRulesResponse unmarshall(DeleteConfigRulesResponse deleteConfigRulesResponse, UnmarshallerContext _ctx) {
		
		deleteConfigRulesResponse.setRequestId(_ctx.stringValue("DeleteConfigRulesResponse.RequestId"));

		OperateRuleResult operateRuleResult = new OperateRuleResult();

		List<OperateRuleItem> operateRuleItemList = new ArrayList<OperateRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteConfigRulesResponse.OperateRuleResult.OperateRuleItemList.Length"); i++) {
			OperateRuleItem operateRuleItem = new OperateRuleItem();
			operateRuleItem.setErrorCode(_ctx.stringValue("DeleteConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ErrorCode"));
			operateRuleItem.setSuccess(_ctx.booleanValue("DeleteConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].Success"));
			operateRuleItem.setConfigRuleId(_ctx.stringValue("DeleteConfigRulesResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ConfigRuleId"));

			operateRuleItemList.add(operateRuleItem);
		}
		operateRuleResult.setOperateRuleItemList(operateRuleItemList);
		deleteConfigRulesResponse.setOperateRuleResult(operateRuleResult);
	 
	 	return deleteConfigRulesResponse;
	}
}