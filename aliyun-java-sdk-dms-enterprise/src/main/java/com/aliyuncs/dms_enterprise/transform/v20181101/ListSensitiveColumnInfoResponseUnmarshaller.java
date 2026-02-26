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

import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnInfoResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnInfoResponse.SensitiveColumn;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnInfoResponse.SensitiveColumn.DefaultDesensitizationRule;
import com.aliyuncs.dms_enterprise.model.v20181101.ListSensitiveColumnInfoResponse.SensitiveColumn.SemiDesensitizationRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSensitiveColumnInfoResponseUnmarshaller {

	public static ListSensitiveColumnInfoResponse unmarshall(ListSensitiveColumnInfoResponse listSensitiveColumnInfoResponse, UnmarshallerContext _ctx) {
		
		listSensitiveColumnInfoResponse.setRequestId(_ctx.stringValue("ListSensitiveColumnInfoResponse.RequestId"));
		listSensitiveColumnInfoResponse.setErrorCode(_ctx.stringValue("ListSensitiveColumnInfoResponse.ErrorCode"));
		listSensitiveColumnInfoResponse.setErrorMessage(_ctx.stringValue("ListSensitiveColumnInfoResponse.ErrorMessage"));
		listSensitiveColumnInfoResponse.setSuccess(_ctx.booleanValue("ListSensitiveColumnInfoResponse.Success"));
		listSensitiveColumnInfoResponse.setTotalCount(_ctx.longValue("ListSensitiveColumnInfoResponse.TotalCount"));

		List<SensitiveColumn> sensitiveColumnList = new ArrayList<SensitiveColumn>();
		for (int i = 0; i < _ctx.lengthValue("ListSensitiveColumnInfoResponse.SensitiveColumnList.Length"); i++) {
			SensitiveColumn sensitiveColumn = new SensitiveColumn();
			sensitiveColumn.setInstanceId(_ctx.integerValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].InstanceId"));
			sensitiveColumn.setSchemaName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SchemaName"));
			sensitiveColumn.setTableName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].TableName"));
			sensitiveColumn.setColumnName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].ColumnName"));
			sensitiveColumn.setCategoryName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].CategoryName"));
			sensitiveColumn.setIsPlain(_ctx.booleanValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].IsPlain"));
			sensitiveColumn.setSecurityLevel(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SecurityLevel"));
			sensitiveColumn.setUserSensitivityLevel(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].UserSensitivityLevel"));
			sensitiveColumn.setSampleData(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SampleData"));

			DefaultDesensitizationRule defaultDesensitizationRule = new DefaultDesensitizationRule();
			defaultDesensitizationRule.setRuleId(_ctx.longValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].DefaultDesensitizationRule.RuleId"));
			defaultDesensitizationRule.setRuleName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].DefaultDesensitizationRule.RuleName"));
			sensitiveColumn.setDefaultDesensitizationRule(defaultDesensitizationRule);

			List<SemiDesensitizationRule> semiDesensitizationRuleList = new ArrayList<SemiDesensitizationRule>();
			for (int j = 0; j < _ctx.lengthValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SemiDesensitizationRuleList.Length"); j++) {
				SemiDesensitizationRule semiDesensitizationRule = new SemiDesensitizationRule();
				semiDesensitizationRule.setRuleId(_ctx.longValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SemiDesensitizationRuleList["+ j +"].RuleId"));
				semiDesensitizationRule.setRuleName(_ctx.stringValue("ListSensitiveColumnInfoResponse.SensitiveColumnList["+ i +"].SemiDesensitizationRuleList["+ j +"].RuleName"));

				semiDesensitizationRuleList.add(semiDesensitizationRule);
			}
			sensitiveColumn.setSemiDesensitizationRuleList(semiDesensitizationRuleList);

			sensitiveColumnList.add(sensitiveColumn);
		}
		listSensitiveColumnInfoResponse.setSensitiveColumnList(sensitiveColumnList);
	 
	 	return listSensitiveColumnInfoResponse;
	}
}