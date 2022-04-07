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

import com.aliyuncs.mse.model.v20190531.PullServicesResponse;
import com.aliyuncs.mse.model.v20190531.PullServicesResponse.PullServices;
import com.aliyuncs.mse.model.v20190531.PullServicesResponse.PullServices.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PullServicesResponseUnmarshaller {

	public static PullServicesResponse unmarshall(PullServicesResponse pullServicesResponse, UnmarshallerContext _ctx) {
		
		pullServicesResponse.setRequestId(_ctx.stringValue("PullServicesResponse.RequestId"));
		pullServicesResponse.setHttpStatusCode(_ctx.integerValue("PullServicesResponse.HttpStatusCode"));
		pullServicesResponse.setMessage(_ctx.stringValue("PullServicesResponse.Message"));
		pullServicesResponse.setCode(_ctx.integerValue("PullServicesResponse.Code"));
		pullServicesResponse.setSuccess(_ctx.booleanValue("PullServicesResponse.Success"));

		List<PullServices> data = new ArrayList<PullServices>();
		for (int i = 0; i < _ctx.lengthValue("PullServicesResponse.Data.Length"); i++) {
			PullServices pullServices = new PullServices();
			pullServices.setNamespace(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Namespace"));
			pullServices.setGroupName(_ctx.stringValue("PullServicesResponse.Data["+ i +"].GroupName"));
			pullServices.setNamespaceShowName(_ctx.stringValue("PullServicesResponse.Data["+ i +"].NamespaceShowName"));

			List<ServicesItem> services = new ArrayList<ServicesItem>();
			for (int j = 0; j < _ctx.lengthValue("PullServicesResponse.Data["+ i +"].Services.Length"); j++) {
				ServicesItem servicesItem = new ServicesItem();
				servicesItem.setName(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Services["+ j +"].Name"));
				servicesItem.setNamespace(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Services["+ j +"].Namespace"));
				servicesItem.setGroupName(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Services["+ j +"].GroupName"));
				servicesItem.setSourceId(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Services["+ j +"].SourceId"));
				servicesItem.setSourceType(_ctx.stringValue("PullServicesResponse.Data["+ i +"].Services["+ j +"].SourceType"));

				services.add(servicesItem);
			}
			pullServices.setServices(services);

			data.add(pullServices);
		}
		pullServicesResponse.setData(data);
	 
	 	return pullServicesResponse;
	}
}