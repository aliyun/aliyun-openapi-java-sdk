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

import com.aliyuncs.edas.model.v20170801.GetServiceProvidersPageResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceProvidersPageResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetServiceProvidersPageResponse.Data.Provider;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceProvidersPageResponseUnmarshaller {

	public static GetServiceProvidersPageResponse unmarshall(GetServiceProvidersPageResponse getServiceProvidersPageResponse, UnmarshallerContext _ctx) {
		
		getServiceProvidersPageResponse.setCode(_ctx.integerValue("GetServiceProvidersPageResponse.Code"));
		getServiceProvidersPageResponse.setMessage(_ctx.stringValue("GetServiceProvidersPageResponse.Message"));
		getServiceProvidersPageResponse.setSuccess(_ctx.booleanValue("GetServiceProvidersPageResponse.Success"));

		Data data = new Data();
		data.setSize(_ctx.integerValue("GetServiceProvidersPageResponse.Data.Size"));
		data.setTotalElements(_ctx.integerValue("GetServiceProvidersPageResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("GetServiceProvidersPageResponse.Data.TotalPages"));

		List<Provider> content = new ArrayList<Provider>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceProvidersPageResponse.Data.Content.Length"); i++) {
			Provider provider = new Provider();
			provider.setIp(_ctx.stringValue("GetServiceProvidersPageResponse.Data.Content["+ i +"].Ip"));
			provider.setPort(_ctx.stringValue("GetServiceProvidersPageResponse.Data.Content["+ i +"].Port"));
			provider.setSerializeType(_ctx.stringValue("GetServiceProvidersPageResponse.Data.Content["+ i +"].SerializeType"));
			provider.setTimeout(_ctx.stringValue("GetServiceProvidersPageResponse.Data.Content["+ i +"].Timeout"));

			content.add(provider);
		}
		data.setContent(content);
		getServiceProvidersPageResponse.setData(data);
	 
	 	return getServiceProvidersPageResponse;
	}
}