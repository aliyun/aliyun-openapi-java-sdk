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
import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes;
import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.Ipv6CidrBlock;
import com.aliyuncs.cbn.model.v20170912.DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRouteTable;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCenAttachedChildInstanceAttributeResponseUnmarshaller {

	public static DescribeCenAttachedChildInstanceAttributeResponse unmarshall(DescribeCenAttachedChildInstanceAttributeResponse describeCenAttachedChildInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeCenAttachedChildInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.RequestId"));
		describeCenAttachedChildInstanceAttributeResponse.setStatus(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.Status"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceType(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceType"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceRegionId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceRegionId"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceOwnerId(_ctx.longValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceOwnerId"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceId"));
		describeCenAttachedChildInstanceAttributeResponse.setCenId(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.CenId"));
		describeCenAttachedChildInstanceAttributeResponse.setManagedService(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ManagedService"));
		describeCenAttachedChildInstanceAttributeResponse.setIpv6StatusInCen(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.Ipv6StatusInCen"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceAttachTime(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttachTime"));
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceName(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceName"));

		ChildInstanceAttributes childInstanceAttributes = new ChildInstanceAttributes();
		childInstanceAttributes.setCidrBlock(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.CidrBlock"));
		childInstanceAttributes.setIpv6CidrBlock(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.Ipv6CidrBlock"));

		List<String> secondaryCidrBlocks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.SecondaryCidrBlocks.Length"); i++) {
			secondaryCidrBlocks.add(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.SecondaryCidrBlocks["+ i +"]"));
		}
		childInstanceAttributes.setSecondaryCidrBlocks(secondaryCidrBlocks);

		List<Ipv6CidrBlock> ipv6CidrBlocks = new ArrayList<Ipv6CidrBlock>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.Ipv6CidrBlocks.Length"); i++) {
			Ipv6CidrBlock ipv6CidrBlock = new Ipv6CidrBlock();
			ipv6CidrBlock.setIpv6Isp(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.Ipv6CidrBlocks["+ i +"].Ipv6Isp"));
			ipv6CidrBlock.setIpv6CidrBlock(_ctx.stringValue("DescribeCenAttachedChildInstanceAttributeResponse.ChildInstanceAttributes.Ipv6CidrBlocks["+ i +"].Ipv6CidrBlock"));

			ipv6CidrBlocks.add(ipv6CidrBlock);
		}
		childInstanceAttributes.setIpv6CidrBlocks(ipv6CidrBlocks);
		describeCenAttachedChildInstanceAttributeResponse.setChildInstanceAttributes(childInstanceAttributes);

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