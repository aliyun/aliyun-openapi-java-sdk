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

import com.aliyuncs.config.model.v20200907.AttachAggregateConfigRuleToCompliancePackResponse;
import com.aliyuncs.config.model.v20200907.AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult;
import com.aliyuncs.config.model.v20200907.AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachAggregateConfigRuleToCompliancePackResponseUnmarshaller {

	public static AttachAggregateConfigRuleToCompliancePackResponse unmarshall(AttachAggregateConfigRuleToCompliancePackResponse attachAggregateConfigRuleToCompliancePackResponse, UnmarshallerContext _ctx) {
		
		attachAggregateConfigRuleToCompliancePackResponse.setRequestId(_ctx.stringValue("AttachAggregateConfigRuleToCompliancePackResponse.RequestId"));

		OperateRuleResult operateRuleResult = new OperateRuleResult();

		List<OperateRuleItem> operateRuleItemList = new ArrayList<OperateRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList.Length"); i++) {
			OperateRuleItem operateRuleItem = new OperateRuleItem();
			operateRuleItem.setErrorCode(_ctx.stringValue("AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ErrorCode"));
			operateRuleItem.setSuccess(_ctx.booleanValue("AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].Success"));
			operateRuleItem.setConfigRuleId(_ctx.stringValue("AttachAggregateConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ConfigRuleId"));

			operateRuleItemList.add(operateRuleItem);
		}
		operateRuleResult.setOperateRuleItemList(operateRuleItemList);
		attachAggregateConfigRuleToCompliancePackResponse.setOperateRuleResult(operateRuleResult);
	 
	 	return attachAggregateConfigRuleToCompliancePackResponse;
	}
}