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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetServiceConsumersPageResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceConsumersPageResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetServiceConsumersPageResponse.Data.Provider;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceConsumersPageResponseUnmarshaller {

	public static GetServiceConsumersPageResponse unmarshall(GetServiceConsumersPageResponse getServiceConsumersPageResponse, UnmarshallerContext _ctx) {
		
		getServiceConsumersPageResponse.setCode(_ctx.integerValue("GetServiceConsumersPageResponse.Code"));
		getServiceConsumersPageResponse.setMessage(_ctx.stringValue("GetServiceConsumersPageResponse.Message"));
		getServiceConsumersPageResponse.setSuccess(_ctx.booleanValue("GetServiceConsumersPageResponse.Success"));

		Data data = new Data();
		data.setSize(_ctx.integerValue("GetServiceConsumersPageResponse.Data.Size"));
		data.setTotalElements(_ctx.integerValue("GetServiceConsumersPageResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("GetServiceConsumersPageResponse.Data.TotalPages"));

		List<Provider> content = new ArrayList<Provider>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceConsumersPageResponse.Data.Content.Length"); i++) {
			Provider provider = new Provider();
			provider.setIp(_ctx.stringValue("GetServiceConsumersPageResponse.Data.Content["+ i +"].Ip"));
			provider.setEdasAppName(_ctx.stringValue("GetServiceConsumersPageResponse.Data.Content["+ i +"].EdasAppName"));
			provider.setEdassAppId(_ctx.stringValue("GetServiceConsumersPageResponse.Data.Content["+ i +"].EdassAppId"));

			content.add(provider);
		}
		data.setContent(content);
		getServiceConsumersPageResponse.setData(data);
	 
	 	return getServiceConsumersPageResponse;
	}
}