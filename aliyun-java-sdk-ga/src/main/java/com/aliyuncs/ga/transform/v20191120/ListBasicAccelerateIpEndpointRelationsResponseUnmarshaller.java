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

import com.aliyuncs.ga.model.v20191120.ListBasicAccelerateIpEndpointRelationsResponse;
import com.aliyuncs.ga.model.v20191120.ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBasicAccelerateIpEndpointRelationsResponseUnmarshaller {

	public static ListBasicAccelerateIpEndpointRelationsResponse unmarshall(ListBasicAccelerateIpEndpointRelationsResponse listBasicAccelerateIpEndpointRelationsResponse, UnmarshallerContext _ctx) {
		
		listBasicAccelerateIpEndpointRelationsResponse.setRequestId(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.RequestId"));
		listBasicAccelerateIpEndpointRelationsResponse.setTotalCount(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.TotalCount"));
		listBasicAccelerateIpEndpointRelationsResponse.setNextToken(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.NextToken"));
		listBasicAccelerateIpEndpointRelationsResponse.setMaxResults(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.MaxResults"));

		List<AccelerateIpEndpointRelationsItem> accelerateIpEndpointRelations = new ArrayList<AccelerateIpEndpointRelationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations.Length"); i++) {
			AccelerateIpEndpointRelationsItem accelerateIpEndpointRelationsItem = new AccelerateIpEndpointRelationsItem();
			accelerateIpEndpointRelationsItem.setAccelerateIpId(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].AccelerateIpId"));
			accelerateIpEndpointRelationsItem.setIpAddress(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].IpAddress"));
			accelerateIpEndpointRelationsItem.setEndpointId(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointId"));
			accelerateIpEndpointRelationsItem.setEndpointName(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointName"));
			accelerateIpEndpointRelationsItem.setEndpointType(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointType"));
			accelerateIpEndpointRelationsItem.setEndpointAddress(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointAddress"));
			accelerateIpEndpointRelationsItem.setEndpointSubAddress(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointSubAddress"));
			accelerateIpEndpointRelationsItem.setEndpointSubAddressType(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointSubAddressType"));
			accelerateIpEndpointRelationsItem.setEndpointZoneId(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].EndpointZoneId"));
			accelerateIpEndpointRelationsItem.setState(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].State"));
			accelerateIpEndpointRelationsItem.setAcceleratorId(_ctx.stringValue("ListBasicAccelerateIpEndpointRelationsResponse.AccelerateIpEndpointRelations["+ i +"].AcceleratorId"));

			accelerateIpEndpointRelations.add(accelerateIpEndpointRelationsItem);
		}
		listBasicAccelerateIpEndpointRelationsResponse.setAccelerateIpEndpointRelations(accelerateIpEndpointRelations);
	 
	 	return listBasicAccelerateIpEndpointRelationsResponse;
	}
}