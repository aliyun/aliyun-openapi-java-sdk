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

package com.aliyuncs.zhuque.transform.v20160701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse;
import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse.CloudDetailResp;
import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTreeItem;
import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTreeItem.Details;
import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTreeItem.ZoneListItem;
import com.aliyuncs.zhuque.model.v20160701.GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTreeItem.ZoneListItem.Details1;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudInstanceDetailsResponseUnmarshaller {

	public static GetCloudInstanceDetailsResponse unmarshall(GetCloudInstanceDetailsResponse getCloudInstanceDetailsResponse, UnmarshallerContext context) {
		
		getCloudInstanceDetailsResponse.setRequestId(context.stringValue("GetCloudInstanceDetailsResponse.RequestId"));
		getCloudInstanceDetailsResponse.setResult(context.stringValue("GetCloudInstanceDetailsResponse.Result"));
		getCloudInstanceDetailsResponse.setMessage(context.stringValue("GetCloudInstanceDetailsResponse.Message"));

		CloudDetailResp cloudDetailResp = new CloudDetailResp();
		cloudDetailResp.setCloudInstance(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.CloudInstance"));
		cloudDetailResp.setCloudModel(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.CloudModel"));
		cloudDetailResp.setCloudType(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.CloudType"));
		cloudDetailResp.setPropertyMode(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.PropertyMode"));
		cloudDetailResp.setCustomerId(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.CustomerId"));
		cloudDetailResp.setCustomerName(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.CustomerName"));
		cloudDetailResp.setDescription(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.Description"));
		cloudDetailResp.setDisplayName(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.DisplayName"));

		List<LocationTreeItem> locationTree = new ArrayList<LocationTreeItem>();
		for (int i = 0; i < context.lengthValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree.Length"); i++) {
			LocationTreeItem locationTreeItem = new LocationTreeItem();
			locationTreeItem.setRegion(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Region"));
			locationTreeItem.setDisplayName(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].DisplayName"));
			locationTreeItem.setDeployMode(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].DeployMode"));

			Details details = new Details();
			details.setMachineCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.MachineCount"));
			details.setNetDevCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.NetDevCount"));
			details.setPlatformVersion(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.PlatformVersion"));
			details.setPlatformCommit(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.PlatformCommit"));
			details.setProductCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.ProductCount"));
			details.setRackCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.RackCount"));
			details.setSeatCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.SeatCount"));
			details.setSeatUsage(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.SeatUsage"));
			details.setUnusedSeatCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].Details.UnusedSeatCount"));
			locationTreeItem.setDetails(details);

			List<ZoneListItem> zoneList = new ArrayList<ZoneListItem>();
			for (int j = 0; j < context.lengthValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList.Length"); j++) {
				ZoneListItem zoneListItem = new ZoneListItem();
				zoneListItem.setZoneType(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].ZoneType"));
				zoneListItem.setZone(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Zone"));
				zoneListItem.setDisplayName(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].DisplayName"));

				Details1 details1 = new Details1();
				details1.setMachineCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.MachineCount"));
				details1.setNetDevCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.NetDevCount"));
				details1.setPlatformVersion(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.PlatformVersion"));
				details1.setPlatformCommit(context.stringValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.PlatformCommit"));
				details1.setProductCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.ProductCount"));
				details1.setRackCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.RackCount"));
				details1.setSeatCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.SeatCount"));
				details1.setSeatUsage(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.SeatUsage"));
				details1.setUnusedSeatCount(context.integerValue("GetCloudInstanceDetailsResponse.CloudDetailResp.LocationTree["+ i +"].ZoneList["+ j +"].Details.UnusedSeatCount"));
				zoneListItem.setDetails1(details1);

				zoneList.add(zoneListItem);
			}
			locationTreeItem.setZoneList(zoneList);

			locationTree.add(locationTreeItem);
		}
		cloudDetailResp.setLocationTree(locationTree);
		getCloudInstanceDetailsResponse.setCloudDetailResp(cloudDetailResp);
	 
	 	return getCloudInstanceDetailsResponse;
	}
}