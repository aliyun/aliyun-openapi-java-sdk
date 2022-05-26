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

package com.aliyuncs.account_crm.transform.v20160606;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.account_crm.model.v20160606.QueryEnumConfigByTypeResponse;
import com.aliyuncs.account_crm.model.v20160606.QueryEnumConfigByTypeResponse.EnumConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEnumConfigByTypeResponseUnmarshaller {

	public static QueryEnumConfigByTypeResponse unmarshall(QueryEnumConfigByTypeResponse queryEnumConfigByTypeResponse, UnmarshallerContext _ctx) {
		
		queryEnumConfigByTypeResponse.setRequestId(_ctx.stringValue("QueryEnumConfigByTypeResponse.RequestId"));
		queryEnumConfigByTypeResponse.setCode(_ctx.stringValue("QueryEnumConfigByTypeResponse.Code"));
		queryEnumConfigByTypeResponse.setMessage(_ctx.stringValue("QueryEnumConfigByTypeResponse.Message"));
		queryEnumConfigByTypeResponse.setSuccess(_ctx.booleanValue("QueryEnumConfigByTypeResponse.Success"));

		List<EnumConfig> data = new ArrayList<EnumConfig>();
		for (int i = 0; i < _ctx.lengthValue("QueryEnumConfigByTypeResponse.Data.Length"); i++) {
			EnumConfig enumConfig = new EnumConfig();
			enumConfig.setEnumValue(_ctx.stringValue("QueryEnumConfigByTypeResponse.Data["+ i +"].enumValue"));
			enumConfig.setEnumName(_ctx.stringValue("QueryEnumConfigByTypeResponse.Data["+ i +"].enumName"));

			data.add(enumConfig);
		}
		queryEnumConfigByTypeResponse.setData(data);
	 
	 	return queryEnumConfigByTypeResponse;
	}
}