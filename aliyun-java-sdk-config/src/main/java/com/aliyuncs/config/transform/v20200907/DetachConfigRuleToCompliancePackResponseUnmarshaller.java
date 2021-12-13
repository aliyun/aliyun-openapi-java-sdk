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

import com.aliyuncs.config.model.v20200907.DetachConfigRuleToCompliancePackResponse;
import com.aliyuncs.config.model.v20200907.DetachConfigRuleToCompliancePackResponse.OperateRuleResult;
import com.aliyuncs.config.model.v20200907.DetachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetachConfigRuleToCompliancePackResponseUnmarshaller {

	public static DetachConfigRuleToCompliancePackResponse unmarshall(DetachConfigRuleToCompliancePackResponse detachConfigRuleToCompliancePackResponse, UnmarshallerContext _ctx) {
		
		detachConfigRuleToCompliancePackResponse.setRequestId(_ctx.stringValue("DetachConfigRuleToCompliancePackResponse.RequestId"));

		OperateRuleResult operateRuleResult = new OperateRuleResult();

		List<OperateRuleItem> operateRuleItemList = new ArrayList<OperateRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("DetachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList.Length"); i++) {
			OperateRuleItem operateRuleItem = new OperateRuleItem();
			operateRuleItem.setErrorCode(_ctx.stringValue("DetachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ErrorCode"));
			operateRuleItem.setSuccess(_ctx.booleanValue("DetachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].Success"));
			operateRuleItem.setConfigRuleId(_ctx.stringValue("DetachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ConfigRuleId"));

			operateRuleItemList.add(operateRuleItem);
		}
		operateRuleResult.setOperateRuleItemList(operateRuleItemList);
		detachConfigRuleToCompliancePackResponse.setOperateRuleResult(operateRuleResult);
	 
	 	return detachConfigRuleToCompliancePackResponse;
	}
}