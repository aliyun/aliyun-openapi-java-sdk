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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListConsumedServicesResponse;
import com.aliyuncs.sae.model.v20190506.ListConsumedServicesResponse.ListConsumedServices;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConsumedServicesResponseUnmarshaller {

	public static ListConsumedServicesResponse unmarshall(ListConsumedServicesResponse listConsumedServicesResponse, UnmarshallerContext _ctx) {
		
		listConsumedServicesResponse.setRequestId(_ctx.stringValue("ListConsumedServicesResponse.RequestId"));
		listConsumedServicesResponse.setCode(_ctx.stringValue("ListConsumedServicesResponse.Code"));
		listConsumedServicesResponse.setMessage(_ctx.stringValue("ListConsumedServicesResponse.Message"));
		listConsumedServicesResponse.setSuccess(_ctx.booleanValue("ListConsumedServicesResponse.Success"));
		listConsumedServicesResponse.setErrorCode(_ctx.stringValue("ListConsumedServicesResponse.ErrorCode"));
		listConsumedServicesResponse.setTraceId(_ctx.stringValue("ListConsumedServicesResponse.TraceId"));

		List<ListConsumedServices> data = new ArrayList<ListConsumedServices>();
		for (int i = 0; i < _ctx.lengthValue("ListConsumedServicesResponse.Data.Length"); i++) {
			ListConsumedServices listConsumedServices = new ListConsumedServices();
			listConsumedServices.setAppId(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].AppId"));
			listConsumedServices.setGroup2Ip(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Group2Ip"));
			listConsumedServices.setName(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Name"));
			listConsumedServices.setType(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Type"));
			listConsumedServices.setVersion(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Version"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConsumedServicesResponse.Data["+ i +"].Groups.Length"); j++) {
				groups.add(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Groups["+ j +"]"));
			}
			listConsumedServices.setGroups(groups);

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListConsumedServicesResponse.Data["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("ListConsumedServicesResponse.Data["+ i +"].Ips["+ j +"]"));
			}
			listConsumedServices.setIps(ips);

			data.add(listConsumedServices);
		}
		listConsumedServicesResponse.setData(data);
	 
	 	return listConsumedServicesResponse;
	}
}