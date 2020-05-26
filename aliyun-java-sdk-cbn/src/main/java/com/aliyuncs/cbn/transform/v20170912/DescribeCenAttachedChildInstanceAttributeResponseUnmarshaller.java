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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstanceAttributeResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRouteTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenAttachedChildInstanceAttributeResponseUnmarshaller {

	public static DescribeCenAttachedChildInstanceAttributeResponse unmarshall(DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeCenAttachedChildInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.RequestId"));
		describeCenAttachedChildInstanceAttributeResponse.setCenId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.CenId"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceId"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceType(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceType"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceRegionId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRegionId"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceOwnerId(_ctx.longValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceOwnerId"));
		describeCenAttachedChildInstanceAttributeResponse.setStatus(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.Status"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceName(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceName"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceAttachTime(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttachTime"));
		describeCenAttachedChildInstanceAttributeResponse.setIpv6StatusInCen(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.Ipv6StatusInCen"));

		List<ChildInstanceRouteTable> childInstanceRouteTables = new ArrayList<ChildInstanceRouteTable>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRouteTables.Length"); i++) {
			ChildInstanceRouteTable childInstanceRouteTable = new ChildInstanceRouteTable();
			childInstanceRouteTable.setRouteTableId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRouteTables["+ i +"].RouteTableId"));
			childInstanceRouteTable.setRouteTableType(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRouteTables["+ i +"].RouteTableType"));

			childInstanceRouteTables.add(childInstanceRouteTable);
		}
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceRouteTables(childInstanceRouteTables);
	 
	 	return describeCenAttachedChildInstanceAttributeResponse;
	}
}