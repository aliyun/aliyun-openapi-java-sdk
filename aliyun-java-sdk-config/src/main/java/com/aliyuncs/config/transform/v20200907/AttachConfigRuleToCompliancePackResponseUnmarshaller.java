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

import com.aliyuncs.config.model.v20200907.AttachConfigRuleToCompliancePackResponse;
import com.aliyuncs.config.model.v20200907.AttachConfigRuleToCompliancePackResponse.OperateRuleResult;
import com.aliyuncs.config.model.v20200907.AttachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AttachConfigRuleToCompliancePackResponseUnmarshaller {

	public static AttachConfigRuleToCompliancePackResponse unmarshall(AttachConfigRuleToCompliancePackResponse attachConfigRuleToCompliancePackResponse, UnmarshallerContext _ctx) {
		
		attachConfigRuleToCompliancePackResponse.setRequestId(_ctx.stringValue("AttachConfigRuleToCompliancePackResponse.RequestId"));

		OperateRuleResult operateRuleResult = new OperateRuleResult();

		List<OperateRuleItem> operateRuleItemList = new ArrayList<OperateRuleItem>();
		for (int i = 0; i < _ctx.lengthValue("AttachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList.Length"); i++) {
			OperateRuleItem operateRuleItem = new OperateRuleItem();
			operateRuleItem.setErrorCode(_ctx.stringValue("AttachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ErrorCode"));
			operateRuleItem.setSuccess(_ctx.booleanValue("AttachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].Success"));
			operateRuleItem.setConfigRuleId(_ctx.stringValue("AttachConfigRuleToCompliancePackResponse.OperateRuleResult.OperateRuleItemList["+ i +"].ConfigRuleId"));

			operateRuleItemList.add(operateRuleItem);
		}
		operateRuleResult.setOperateRuleItemList(operateRuleItemList);
		attachConfigRuleToCompliancePackResponse.setOperateRuleResult(operateRuleResult);
	 
	 	return attachConfigRuleToCompliancePackResponse;
	}
}