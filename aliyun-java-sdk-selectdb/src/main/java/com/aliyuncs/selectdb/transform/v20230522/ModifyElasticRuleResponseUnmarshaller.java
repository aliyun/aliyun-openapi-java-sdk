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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.ModifyElasticRuleResponse;
import com.aliyuncs.selectdb.model.v20230522.ModifyElasticRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyElasticRuleResponseUnmarshaller {

	public static ModifyElasticRuleResponse unmarshall(ModifyElasticRuleResponse modifyElasticRuleResponse, UnmarshallerContext _ctx) {
		
		modifyElasticRuleResponse.setRequestId(_ctx.stringValue("ModifyElasticRuleResponse.RequestId"));

		Data data = new Data();
		data.setDbInstanceId(_ctx.stringValue("ModifyElasticRuleResponse.Data.DbInstanceId"));
		data.setClusterId(_ctx.stringValue("ModifyElasticRuleResponse.Data.ClusterId"));
		data.setRuleId(_ctx.longValue("ModifyElasticRuleResponse.Data.RuleId"));
		data.setExecutionPeriod(_ctx.stringValue("ModifyElasticRuleResponse.Data.ExecutionPeriod"));
		data.setElasticRuleStartTime(_ctx.stringValue("ModifyElasticRuleResponse.Data.ElasticRuleStartTime"));
		data.setClusterClass(_ctx.stringValue("ModifyElasticRuleResponse.Data.ClusterClass"));
		modifyElasticRuleResponse.setData(data);
	 
	 	return modifyElasticRuleResponse;
	}
}