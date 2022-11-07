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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.ListResourceServicesResponse;
import com.aliyuncs.eas.model.v20210701.ListResourceServicesResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceServicesResponseUnmarshaller {

	public static ListResourceServicesResponse unmarshall(ListResourceServicesResponse listResourceServicesResponse, UnmarshallerContext _ctx) {
		
		listResourceServicesResponse.setRequestId(_ctx.stringValue("ListResourceServicesResponse.RequestId"));
		listResourceServicesResponse.setPageNumber(_ctx.integerValue("ListResourceServicesResponse.PageNumber"));
		listResourceServicesResponse.setPageSize(_ctx.integerValue("ListResourceServicesResponse.PageSize"));
		listResourceServicesResponse.setTotalCount(_ctx.integerValue("ListResourceServicesResponse.TotalCount"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceServicesResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setRequestId(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].RequestId"));
			servicesItem.setRegion(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Region"));
			servicesItem.setCallerUid(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].CallerUid"));
			servicesItem.setParentUid(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ParentUid"));
			servicesItem.setCurrentVersion(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].CurrentVersion"));
			servicesItem.setCpu(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].Cpu"));
			servicesItem.setGpu(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].Gpu"));
			servicesItem.setImage(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Image"));
			servicesItem.setPendingInstance(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].PendingInstance"));
			servicesItem.setRunningInstance(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].RunningInstance"));
			servicesItem.setTotalInstance(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].TotalInstance"));
			servicesItem.setInternetEndpoint(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].InternetEndpoint"));
			servicesItem.setIntranetEndpoint(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].IntranetEndpoint"));
			servicesItem.setLatestVersion(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].LatestVersion"));
			servicesItem.setMemory(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].Memory"));
			servicesItem.setMessage(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Message"));
			servicesItem.setNamespace(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Namespace"));
			servicesItem.setReason(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Reason"));
			servicesItem.setResource(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Resource"));
			servicesItem.setResourceAlias(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ResourceAlias"));
			servicesItem.setServiceConfig(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ServiceConfig"));
			servicesItem.setServiceName(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ServiceName"));
			servicesItem.setServiceGroup(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ServiceGroup"));
			servicesItem.setStatus(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Status"));
			servicesItem.setCreateTime(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].CreateTime"));
			servicesItem.setUpdateTime(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].UpdateTime"));
			servicesItem.setWeight(_ctx.integerValue("ListResourceServicesResponse.Services["+ i +"].Weight"));
			servicesItem.setServiceId(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ServiceId"));
			servicesItem.setServiceUid(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ServiceUid"));
			servicesItem.setAccessToken(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].AccessToken"));
			servicesItem.setSource(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Source"));
			servicesItem.setExtraData(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].ExtraData"));
			servicesItem.setRole(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].Role"));
			servicesItem.setRoleAttrs(_ctx.stringValue("ListResourceServicesResponse.Services["+ i +"].RoleAttrs"));

			services.add(servicesItem);
		}
		listResourceServicesResponse.setServices(services);
	 
	 	return listResourceServicesResponse;
	}
}