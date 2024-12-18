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

import com.aliyuncs.selectdb.model.v20230522.CreateElasticRuleResponse;
import com.aliyuncs.selectdb.model.v20230522.CreateElasticRuleResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateElasticRuleResponseUnmarshaller {

	public static CreateElasticRuleResponse unmarshall(CreateElasticRuleResponse createElasticRuleResponse, UnmarshallerContext _ctx) {
		
		createElasticRuleResponse.setRequestId(_ctx.stringValue("CreateElasticRuleResponse.RequestId"));

		Data data = new Data();
		data.setDbInstanceId(_ctx.stringValue("CreateElasticRuleResponse.Data.DbInstanceId"));
		data.setClusterId(_ctx.stringValue("CreateElasticRuleResponse.Data.ClusterId"));
		data.setRuleId(_ctx.longValue("CreateElasticRuleResponse.Data.RuleId"));
		data.setExecutionPeriod(_ctx.stringValue("CreateElasticRuleResponse.Data.ExecutionPeriod"));
		data.setElasticRuleStartTime(_ctx.stringValue("CreateElasticRuleResponse.Data.ElasticRuleStartTime"));
		data.setClusterClass(_ctx.stringValue("CreateElasticRuleResponse.Data.ClusterClass"));
		createElasticRuleResponse.setData(data);
	 
	 	return createElasticRuleResponse;
	}
}