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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsSGFormConfigResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSGFormConfigResponse.AuthRuleConfig;
import com.aliyuncs.sofa.model.v20190815.QueryMsSGFormConfigResponse.AuthRuleConfig.FieldsItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsSGFormConfigResponse.AuthRuleConfig.OperationsItem;
import com.aliyuncs.sofa.model.v20190815.QueryMsSGFormConfigResponse.AuthRuleConfig.TypesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSGFormConfigResponseUnmarshaller {

	public static QueryMsSGFormConfigResponse unmarshall(QueryMsSGFormConfigResponse queryMsSGFormConfigResponse, UnmarshallerContext _ctx) {
		
		queryMsSGFormConfigResponse.setRequestId(_ctx.stringValue("QueryMsSGFormConfigResponse.RequestId"));
		queryMsSGFormConfigResponse.setResultCode(_ctx.stringValue("QueryMsSGFormConfigResponse.ResultCode"));
		queryMsSGFormConfigResponse.setResultMessage(_ctx.stringValue("QueryMsSGFormConfigResponse.ResultMessage"));

		AuthRuleConfig authRuleConfig = new AuthRuleConfig();

		List<FieldsItem> fields = new ArrayList<FieldsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Fields.Length"); i++) {
			FieldsItem fieldsItem = new FieldsItem();
			fieldsItem.setDescCn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Fields["+ i +"].DescCn"));
			fieldsItem.setDescEn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Fields["+ i +"].DescEn"));
			fieldsItem.setValue(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Fields["+ i +"].Value"));

			fields.add(fieldsItem);
		}
		authRuleConfig.setFields(fields);

		List<OperationsItem> operations = new ArrayList<OperationsItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Operations.Length"); i++) {
			OperationsItem operationsItem = new OperationsItem();
			operationsItem.setDescCn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Operations["+ i +"].DescCn"));
			operationsItem.setDescEn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Operations["+ i +"].DescEn"));
			operationsItem.setValue(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Operations["+ i +"].Value"));

			operations.add(operationsItem);
		}
		authRuleConfig.setOperations(operations);

		List<TypesItem> types = new ArrayList<TypesItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Types.Length"); i++) {
			TypesItem typesItem = new TypesItem();
			typesItem.setDescCn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Types["+ i +"].DescCn"));
			typesItem.setDescEn(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Types["+ i +"].DescEn"));
			typesItem.setValue(_ctx.stringValue("QueryMsSGFormConfigResponse.AuthRuleConfig.Types["+ i +"].Value"));

			types.add(typesItem);
		}
		authRuleConfig.setTypes(types);
		queryMsSGFormConfigResponse.setAuthRuleConfig(authRuleConfig);
	 
	 	return queryMsSGFormConfigResponse;
	}
}