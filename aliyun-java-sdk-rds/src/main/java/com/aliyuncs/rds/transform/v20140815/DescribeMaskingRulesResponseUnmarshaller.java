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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeMaskingRulesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMaskingRulesResponse.Data;
import com.aliyuncs.rds.model.v20140815.DescribeMaskingRulesResponse.Data.EncDBInfo;
import com.aliyuncs.rds.model.v20140815.DescribeMaskingRulesResponse.Data.EncDBInfo.RuleConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMaskingRulesResponseUnmarshaller {

	public static DescribeMaskingRulesResponse unmarshall(DescribeMaskingRulesResponse describeMaskingRulesResponse, UnmarshallerContext _ctx) {
		
		describeMaskingRulesResponse.setRequestId(_ctx.stringValue("DescribeMaskingRulesResponse.RequestId"));

		Data data = new Data();

		List<EncDBInfo> rules = new ArrayList<EncDBInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMaskingRulesResponse.Data.Rules.Length"); i++) {
			EncDBInfo encDBInfo = new EncDBInfo();
			encDBInfo.setDefaultAlgo(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].DefaultAlgo"));
			encDBInfo.setEnabled(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].Enabled"));
			encDBInfo.setMaskingAlgo(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].MaskingAlgo"));
			encDBInfo.setRuleName(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleName"));

			RuleConfig ruleConfig = new RuleConfig();

			List<String> columns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Columns.Length"); j++) {
				columns.add(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Columns["+ j +"]"));
			}
			ruleConfig.setColumns(columns);

			List<String> databases = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Databases.Length"); j++) {
				databases.add(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Databases["+ j +"]"));
			}
			ruleConfig.setDatabases(databases);

			List<String> tables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Tables.Length"); j++) {
				tables.add(_ctx.stringValue("DescribeMaskingRulesResponse.Data.Rules["+ i +"].RuleConfig.Tables["+ j +"]"));
			}
			ruleConfig.setTables(tables);
			encDBInfo.setRuleConfig(ruleConfig);

			rules.add(encDBInfo);
		}
		data.setRules(rules);
		describeMaskingRulesResponse.setData(data);
	 
	 	return describeMaskingRulesResponse;
	}
}