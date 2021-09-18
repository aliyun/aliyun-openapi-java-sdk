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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.GetServiceResponse.ServiceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceResponseUnmarshaller {

	public static GetServiceResponse unmarshall(GetServiceResponse getServiceResponse, UnmarshallerContext _ctx) {
		
		getServiceResponse.setRequestId(_ctx.stringValue("GetServiceResponse.RequestId"));
		getServiceResponse.setStatus(_ctx.stringValue("GetServiceResponse.Status"));
		getServiceResponse.setDeployMetadata(_ctx.stringValue("GetServiceResponse.DeployMetadata"));
		getServiceResponse.setPublishTime(_ctx.stringValue("GetServiceResponse.PublishTime"));
		getServiceResponse.setVersion(_ctx.stringValue("GetServiceResponse.Version"));
		getServiceResponse.setDeployType(_ctx.stringValue("GetServiceResponse.DeployType"));
		getServiceResponse.setServiceId(_ctx.stringValue("GetServiceResponse.ServiceId"));
		getServiceResponse.setSupplierUrl(_ctx.stringValue("GetServiceResponse.SupplierUrl"));
		getServiceResponse.setServiceType(_ctx.stringValue("GetServiceResponse.ServiceType"));
		getServiceResponse.setSupplierName(_ctx.stringValue("GetServiceResponse.SupplierName"));
		getServiceResponse.setCommodityCode(_ctx.stringValue("GetServiceResponse.CommodityCode"));
		getServiceResponse.setIsSupportOperated(_ctx.booleanValue("GetServiceResponse.IsSupportOperated"));
		getServiceResponse.setPolicyNames(_ctx.stringValue("GetServiceResponse.PolicyNames"));
		getServiceResponse.setDuration(_ctx.longValue("GetServiceResponse.Duration"));

		List<ServiceInfo> serviceInfos = new ArrayList<ServiceInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceResponse.ServiceInfos.Length"); i++) {
			ServiceInfo serviceInfo = new ServiceInfo();
			serviceInfo.setLocale(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Locale"));
			serviceInfo.setImage(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Image"));
			serviceInfo.setName(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].Name"));
			serviceInfo.setShortDescription(_ctx.stringValue("GetServiceResponse.ServiceInfos["+ i +"].ShortDescription"));

			serviceInfos.add(serviceInfo);
		}
		getServiceResponse.setServiceInfos(serviceInfos);
	 
	 	return getServiceResponse;
	}
}