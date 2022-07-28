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

import com.aliyuncs.eas.model.v20210701.ListServicesResponse;
import com.aliyuncs.eas.model.v20210701.ListServicesResponse.ServicesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServicesResponseUnmarshaller {

	public static ListServicesResponse unmarshall(ListServicesResponse listServicesResponse, UnmarshallerContext _ctx) {
		
		listServicesResponse.setRequestId(_ctx.stringValue("ListServicesResponse.RequestId"));
		listServicesResponse.setPageNumber(_ctx.integerValue("ListServicesResponse.PageNumber"));
		listServicesResponse.setPageSize(_ctx.integerValue("ListServicesResponse.PageSize"));
		listServicesResponse.setTotalCount(_ctx.integerValue("ListServicesResponse.TotalCount"));

		List<ServicesItem> services = new ArrayList<ServicesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListServicesResponse.Services.Length"); i++) {
			ServicesItem servicesItem = new ServicesItem();
			servicesItem.setRequestId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].RequestId"));
			servicesItem.setRegion(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Region"));
			servicesItem.setCallerUid(_ctx.stringValue("ListServicesResponse.Services["+ i +"].CallerUid"));
			servicesItem.setParentUid(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ParentUid"));
			servicesItem.setCurrentVersion(_ctx.integerValue("ListServicesResponse.Services["+ i +"].CurrentVersion"));
			servicesItem.setCpu(_ctx.integerValue("ListServicesResponse.Services["+ i +"].Cpu"));
			servicesItem.setGpu(_ctx.integerValue("ListServicesResponse.Services["+ i +"].Gpu"));
			servicesItem.setImage(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Image"));
			servicesItem.setPendingInstance(_ctx.integerValue("ListServicesResponse.Services["+ i +"].PendingInstance"));
			servicesItem.setRunningInstance(_ctx.integerValue("ListServicesResponse.Services["+ i +"].RunningInstance"));
			servicesItem.setTotalInstance(_ctx.integerValue("ListServicesResponse.Services["+ i +"].TotalInstance"));
			servicesItem.setInternetEndpoint(_ctx.stringValue("ListServicesResponse.Services["+ i +"].InternetEndpoint"));
			servicesItem.setIntranetEndpoint(_ctx.stringValue("ListServicesResponse.Services["+ i +"].IntranetEndpoint"));
			servicesItem.setLatestVersion(_ctx.integerValue("ListServicesResponse.Services["+ i +"].LatestVersion"));
			servicesItem.setMemory(_ctx.integerValue("ListServicesResponse.Services["+ i +"].Memory"));
			servicesItem.setMessage(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Message"));
			servicesItem.setNamespace(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Namespace"));
			servicesItem.setReason(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Reason"));
			servicesItem.setResource(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Resource"));
			servicesItem.setServiceConfig(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceConfig"));
			servicesItem.setServiceName(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceName"));
			servicesItem.setStatus(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Status"));
			servicesItem.setCreateTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].CreateTime"));
			servicesItem.setUpdateTime(_ctx.stringValue("ListServicesResponse.Services["+ i +"].UpdateTime"));
			servicesItem.setWeight(_ctx.integerValue("ListServicesResponse.Services["+ i +"].Weight"));
			servicesItem.setServiceId(_ctx.stringValue("ListServicesResponse.Services["+ i +"].ServiceId"));
			servicesItem.setAccessToken(_ctx.stringValue("ListServicesResponse.Services["+ i +"].AccessToken"));
			servicesItem.setSource(_ctx.stringValue("ListServicesResponse.Services["+ i +"].Source"));

			services.add(servicesItem);
		}
		listServicesResponse.setServices(services);
	 
	 	return listServicesResponse;
	}
}