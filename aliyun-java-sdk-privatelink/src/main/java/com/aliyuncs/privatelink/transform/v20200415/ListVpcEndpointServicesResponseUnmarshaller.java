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

package com.aliyuncs.privatelink.transform.v20200415;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServicesResponse;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServicesResponse.Service;
import com.aliyuncs.privatelink.model.v20200415.ListVpcEndpointServicesResponse.Service.TagModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVpcEndpointServicesResponseUnmarshaller {

	public static ListVpcEndpointServicesResponse unmarshall(ListVpcEndpointServicesResponse listVpcEndpointServicesResponse, UnmarshallerContext _ctx) {
		
		listVpcEndpointServicesResponse.setRequestId(_ctx.stringValue("ListVpcEndpointServicesResponse.RequestId"));
		listVpcEndpointServicesResponse.setNextToken(_ctx.stringValue("ListVpcEndpointServicesResponse.NextToken"));
		listVpcEndpointServicesResponse.setMaxResults(_ctx.integerValue("ListVpcEndpointServicesResponse.MaxResults"));
		listVpcEndpointServicesResponse.setTotalCount(_ctx.integerValue("ListVpcEndpointServicesResponse.TotalCount"));

		List<Service> services = new ArrayList<Service>();
		for (int i = 0; i < _ctx.lengthValue("ListVpcEndpointServicesResponse.Services.Length"); i++) {
			Service service = new Service();
			service.setAutoAcceptEnabled(_ctx.booleanValue("ListVpcEndpointServicesResponse.Services["+ i +"].AutoAcceptEnabled"));
			service.setServiceId(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceId"));
			service.setCreateTime(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].CreateTime"));
			service.setMinBandwidth(_ctx.integerValue("ListVpcEndpointServicesResponse.Services["+ i +"].MinBandwidth"));
			service.setMaxBandwidth(_ctx.integerValue("ListVpcEndpointServicesResponse.Services["+ i +"].MaxBandwidth"));
			service.setServiceStatus(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceStatus"));
			service.setZoneAffinityEnabled(_ctx.booleanValue("ListVpcEndpointServicesResponse.Services["+ i +"].ZoneAffinityEnabled"));
			service.setRegionId(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].RegionId"));
			service.setServiceDomain(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceDomain"));
			service.setPayer(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].Payer"));
			service.setServiceBusinessStatus(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceBusinessStatus"));
			service.setConnectBandwidth(_ctx.integerValue("ListVpcEndpointServicesResponse.Services["+ i +"].ConnectBandwidth"));
			service.setServiceName(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceName"));
			service.setServiceDescription(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceDescription"));
			service.setServiceResourceType(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceResourceType"));
			service.setServiceType(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceType"));
			service.setServiceSupportIPv6(_ctx.booleanValue("ListVpcEndpointServicesResponse.Services["+ i +"].ServiceSupportIPv6"));
			service.setResourceGroupId(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].ResourceGroupId"));

			List<TagModel> tags = new ArrayList<TagModel>();
			for (int j = 0; j < _ctx.lengthValue("ListVpcEndpointServicesResponse.Services["+ i +"].Tags.Length"); j++) {
				TagModel tagModel = new TagModel();
				tagModel.setKey(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].Tags["+ j +"].Key"));
				tagModel.setValue(_ctx.stringValue("ListVpcEndpointServicesResponse.Services["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagModel);
			}
			service.setTags(tags);

			services.add(service);
		}
		listVpcEndpointServicesResponse.setServices(services);
	 
	 	return listVpcEndpointServicesResponse;
	}
}