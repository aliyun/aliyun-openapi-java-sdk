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

import com.aliyuncs.account_crm.model.v20160606.GetCustomerCategoryDictionaryResponse;
import com.aliyuncs.account_crm.model.v20160606.GetCustomerCategoryDictionaryResponse.EnumConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCustomerCategoryDictionaryResponseUnmarshaller {

	public static GetCustomerCategoryDictionaryResponse unmarshall(GetCustomerCategoryDictionaryResponse getCustomerCategoryDictionaryResponse, UnmarshallerContext _ctx) {
		
		getCustomerCategoryDictionaryResponse.setRequestId(_ctx.stringValue("GetCustomerCategoryDictionaryResponse.RequestId"));
		getCustomerCategoryDictionaryResponse.setCode(_ctx.stringValue("GetCustomerCategoryDictionaryResponse.Code"));
		getCustomerCategoryDictionaryResponse.setMessage(_ctx.stringValue("GetCustomerCategoryDictionaryResponse.Message"));
		getCustomerCategoryDictionaryResponse.setSuccess(_ctx.booleanValue("GetCustomerCategoryDictionaryResponse.Success"));

		List<EnumConfig> data = new ArrayList<EnumConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetCustomerCategoryDictionaryResponse.Data.Length"); i++) {
			EnumConfig enumConfig = new EnumConfig();
			enumConfig.setEnumValue(_ctx.stringValue("GetCustomerCategoryDictionaryResponse.Data["+ i +"].enumValue"));
			enumConfig.setEnumName(_ctx.stringValue("GetCustomerCategoryDictionaryResponse.Data["+ i +"].enumName"));

			data.add(enumConfig);
		}
		getCustomerCategoryDictionaryResponse.setData(data);
	 
	 	return getCustomerCategoryDictionaryResponse;
	}
}