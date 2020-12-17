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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.GenerateTemplatePolicyResponse;
import com.aliyuncs.ros.model.v20190910.GenerateTemplatePolicyResponse.Policy;
import com.aliyuncs.ros.model.v20190910.GenerateTemplatePolicyResponse.Policy.StatementItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateTemplatePolicyResponseUnmarshaller {

	public static GenerateTemplatePolicyResponse unmarshall(GenerateTemplatePolicyResponse generateTemplatePolicyResponse, UnmarshallerContext _ctx) {
		
		generateTemplatePolicyResponse.setRequestId(_ctx.stringValue("GenerateTemplatePolicyResponse.RequestId"));

		Policy policy = new Policy();
		policy.setVersion(_ctx.stringValue("GenerateTemplatePolicyResponse.Policy.Version"));

		List<StatementItem> statement = new ArrayList<StatementItem>();
		for (int i = 0; i < _ctx.lengthValue("GenerateTemplatePolicyResponse.Policy.Statement.Length"); i++) {
			StatementItem statementItem = new StatementItem();
			statementItem.setResource(_ctx.stringValue("GenerateTemplatePolicyResponse.Policy.Statement["+ i +"].Resource"));
			statementItem.setEffect(_ctx.stringValue("GenerateTemplatePolicyResponse.Policy.Statement["+ i +"].Effect"));

			List<String> action = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GenerateTemplatePolicyResponse.Policy.Statement["+ i +"].Action.Length"); j++) {
				action.add(_ctx.stringValue("GenerateTemplatePolicyResponse.Policy.Statement["+ i +"].Action["+ j +"]"));
			}
			statementItem.setAction(action);

			statement.add(statementItem);
		}
		policy.setStatement(statement);
		generateTemplatePolicyResponse.setPolicy(policy);
	 
	 	return generateTemplatePolicyResponse;
	}
}