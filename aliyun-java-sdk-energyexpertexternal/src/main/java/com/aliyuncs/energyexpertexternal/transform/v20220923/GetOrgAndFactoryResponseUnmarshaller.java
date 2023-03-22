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

package com.aliyuncs.energyexpertexternal.transform.v20220923;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.energyexpertexternal.model.v20220923.GetOrgAndFactoryResponse;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetOrgAndFactoryResponse.DataItem;
import com.aliyuncs.energyexpertexternal.model.v20220923.GetOrgAndFactoryResponse.DataItem.Factory;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOrgAndFactoryResponseUnmarshaller {

	public static GetOrgAndFactoryResponse unmarshall(GetOrgAndFactoryResponse getOrgAndFactoryResponse, UnmarshallerContext _ctx) {
		
		getOrgAndFactoryResponse.setRequestId(_ctx.stringValue("GetOrgAndFactoryResponse.requestId"));
		getOrgAndFactoryResponse.setHttpCode(_ctx.integerValue("GetOrgAndFactoryResponse.httpCode"));
		getOrgAndFactoryResponse.setCode(_ctx.stringValue("GetOrgAndFactoryResponse.code"));
		getOrgAndFactoryResponse.setErrorMessage(_ctx.stringValue("GetOrgAndFactoryResponse.errorMessage"));
		getOrgAndFactoryResponse.setSuccess(_ctx.booleanValue("GetOrgAndFactoryResponse.success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOrgAndFactoryResponse.data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAliyunPk(_ctx.stringValue("GetOrgAndFactoryResponse.data["+ i +"].aliyunPk"));
			dataItem.setOrganizationName(_ctx.stringValue("GetOrgAndFactoryResponse.data["+ i +"].organizationName"));

			List<Factory> factoryList = new ArrayList<Factory>();
			for (int j = 0; j < _ctx.lengthValue("GetOrgAndFactoryResponse.data["+ i +"].factoryList.Length"); j++) {
				Factory factory = new Factory();
				factory.setFactoryId(_ctx.stringValue("GetOrgAndFactoryResponse.data["+ i +"].factoryList["+ j +"].factoryId"));
				factory.setFactoryName(_ctx.stringValue("GetOrgAndFactoryResponse.data["+ i +"].factoryList["+ j +"].factoryName"));

				factoryList.add(factory);
			}
			dataItem.setFactoryList(factoryList);

			data.add(dataItem);
		}
		getOrgAndFactoryResponse.setData(data);
	 
	 	return getOrgAndFactoryResponse;
	}
}