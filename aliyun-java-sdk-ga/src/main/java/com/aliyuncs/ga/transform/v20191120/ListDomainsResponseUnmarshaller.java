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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListDomainsResponse;
import com.aliyuncs.ga.model.v20191120.ListDomainsResponse.DomainsItem;
import com.aliyuncs.ga.model.v20191120.ListDomainsResponse.DomainsItem.AcceleratorsItem;
import com.aliyuncs.ga.model.v20191120.ListDomainsResponse.DomainsItem.AcceleratorsItem.ServiceManagedInfosItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDomainsResponseUnmarshaller {

	public static ListDomainsResponse unmarshall(ListDomainsResponse listDomainsResponse, UnmarshallerContext _ctx) {
		
		listDomainsResponse.setRequestId(_ctx.stringValue("ListDomainsResponse.RequestId"));
		listDomainsResponse.setTotalCount(_ctx.integerValue("ListDomainsResponse.TotalCount"));
		listDomainsResponse.setPageSize(_ctx.integerValue("ListDomainsResponse.PageSize"));
		listDomainsResponse.setPageNumber(_ctx.integerValue("ListDomainsResponse.PageNumber"));

		List<DomainsItem> domains = new ArrayList<DomainsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDomainsResponse.Domains.Length"); i++) {
			DomainsItem domainsItem = new DomainsItem();
			domainsItem.setDomain(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Domain"));
			domainsItem.setState(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].State"));

			List<AcceleratorsItem> accelerators = new ArrayList<AcceleratorsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDomainsResponse.Domains["+ i +"].Accelerators.Length"); j++) {
				AcceleratorsItem acceleratorsItem = new AcceleratorsItem();
				acceleratorsItem.setAcceleratorId(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].AcceleratorId"));
				acceleratorsItem.setName(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].Name"));
				acceleratorsItem.setServiceId(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceId"));
				acceleratorsItem.setServiceManaged(_ctx.booleanValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceManaged"));

				List<ServiceManagedInfosItem> serviceManagedInfos = new ArrayList<ServiceManagedInfosItem>();
				for (int k = 0; k < _ctx.lengthValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceManagedInfos.Length"); k++) {
					ServiceManagedInfosItem serviceManagedInfosItem = new ServiceManagedInfosItem();
					serviceManagedInfosItem.setAction(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceManagedInfos["+ k +"].Action"));
					serviceManagedInfosItem.setChildType(_ctx.stringValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceManagedInfos["+ k +"].ChildType"));
					serviceManagedInfosItem.setIsManaged(_ctx.booleanValue("ListDomainsResponse.Domains["+ i +"].Accelerators["+ j +"].ServiceManagedInfos["+ k +"].IsManaged"));

					serviceManagedInfos.add(serviceManagedInfosItem);
				}
				acceleratorsItem.setServiceManagedInfos(serviceManagedInfos);

				accelerators.add(acceleratorsItem);
			}
			domainsItem.setAccelerators(accelerators);

			domains.add(domainsItem);
		}
		listDomainsResponse.setDomains(domains);
	 
	 	return listDomainsResponse;
	}
}