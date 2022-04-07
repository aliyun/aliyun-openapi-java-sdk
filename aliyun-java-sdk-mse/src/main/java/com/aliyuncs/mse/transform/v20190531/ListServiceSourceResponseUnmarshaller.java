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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListServiceSourceResponse;
import com.aliyuncs.mse.model.v20190531.ListServiceSourceResponse.Sources;
import com.aliyuncs.mse.model.v20190531.ListServiceSourceResponse.Sources.IngressOptions;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceSourceResponseUnmarshaller {

	public static ListServiceSourceResponse unmarshall(ListServiceSourceResponse listServiceSourceResponse, UnmarshallerContext _ctx) {
		
		listServiceSourceResponse.setRequestId(_ctx.stringValue("ListServiceSourceResponse.RequestId"));
		listServiceSourceResponse.setHttpStatusCode(_ctx.integerValue("ListServiceSourceResponse.HttpStatusCode"));
		listServiceSourceResponse.setMessage(_ctx.stringValue("ListServiceSourceResponse.Message"));
		listServiceSourceResponse.setCode(_ctx.integerValue("ListServiceSourceResponse.Code"));
		listServiceSourceResponse.setSuccess(_ctx.booleanValue("ListServiceSourceResponse.Success"));

		List<Sources> data = new ArrayList<Sources>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceSourceResponse.Data.Length"); i++) {
			Sources sources = new Sources();
			sources.setId(_ctx.longValue("ListServiceSourceResponse.Data["+ i +"].Id"));
			sources.setName(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].Name"));
			sources.setAddress(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].Address"));
			sources.setType(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].Type"));
			sources.setSource(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].Source"));
			sources.setBindingWithGateway(_ctx.integerValue("ListServiceSourceResponse.Data["+ i +"].BindingWithGateway"));
			sources.setGatewayId(_ctx.longValue("ListServiceSourceResponse.Data["+ i +"].GatewayId"));
			sources.setGmtCreate(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].GmtCreate"));
			sources.setGmtModified(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].GmtModified"));
			sources.setSourceUniqueId(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].SourceUniqueId"));

			IngressOptions ingressOptions = new IngressOptions();
			ingressOptions.setEnableIngress(_ctx.booleanValue("ListServiceSourceResponse.Data["+ i +"].IngressOptions.EnableIngress"));
			ingressOptions.setIngressClass(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].IngressOptions.IngressClass"));
			ingressOptions.setWatchNamespace(_ctx.stringValue("ListServiceSourceResponse.Data["+ i +"].IngressOptions.WatchNamespace"));
			sources.setIngressOptions(ingressOptions);

			data.add(sources);
		}
		listServiceSourceResponse.setData(data);
	 
	 	return listServiceSourceResponse;
	}
}