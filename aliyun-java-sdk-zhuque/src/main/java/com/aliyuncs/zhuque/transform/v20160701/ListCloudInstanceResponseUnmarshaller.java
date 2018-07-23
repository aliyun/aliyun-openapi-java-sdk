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

import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.CloudInstanceItem;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.CloudInstanceItem.LocationTreeItem;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.CloudInstanceItem.LocationTreeItem.Details;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.CloudInstanceItem.LocationTreeItem.ZoneListItem;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.CloudInstanceItem.LocationTreeItem.ZoneListItem.Details1;
import com.aliyuncs.zhuque.model.v20160701.ListCloudInstanceResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudInstanceResponseUnmarshaller {

	public static ListCloudInstanceResponse unmarshall(ListCloudInstanceResponse listCloudInstanceResponse, UnmarshallerContext context) {
		
		listCloudInstanceResponse.setRequestId(context.stringValue("ListCloudInstanceResponse.RequestId"));
		listCloudInstanceResponse.setResult(context.stringValue("ListCloudInstanceResponse.Result"));
		listCloudInstanceResponse.setMessage(context.stringValue("ListCloudInstanceResponse.Message"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPage(context.integerValue("ListCloudInstanceResponse.PageInfo.Page"));
		pageInfo.setPageSize(context.integerValue("ListCloudInstanceResponse.PageInfo.PageSize"));
		pageInfo.setTotal(context.integerValue("ListCloudInstanceResponse.PageInfo.Total"));
		listCloudInstanceResponse.setPageInfo(pageInfo);

		List<CloudInstanceItem> cloudInstance = new ArrayList<CloudInstanceItem>();
		for (int i = 0; i < context.lengthValue("ListCloudInstanceResponse.CloudInstance.Length"); i++) {
			CloudInstanceItem cloudInstanceItem = new CloudInstanceItem();
			cloudInstanceItem.setId(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].Id"));
			cloudInstanceItem.setCloudInstance(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].CloudInstance"));
			cloudInstanceItem.setCloudType(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].CloudType"));
			cloudInstanceItem.setDisplayName(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].DisplayName"));
			cloudInstanceItem.setPropertyMode(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].PropertyMode"));
			cloudInstanceItem.setCustomerId(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].CustomerId"));
			cloudInstanceItem.setCloudModel(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].CloudModel"));
			cloudInstanceItem.setDescription(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].Description"));
			cloudInstanceItem.setUpdateTime(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].UpdateTime"));
			cloudInstanceItem.setCreateTime(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].CreateTime"));
			cloudInstanceItem.setCreator(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].Creator"));
			cloudInstanceItem.setModifier(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].Modifier"));

			List<LocationTreeItem> locationTree = new ArrayList<LocationTreeItem>();
			for (int j = 0; j < context.lengthValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree.Length"); j++) {
				LocationTreeItem locationTreeItem = new LocationTreeItem();
				locationTreeItem.setRegion(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Region"));
				locationTreeItem.setDisplayName(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].DisplayName"));
				locationTreeItem.setDeployMode(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].DeployMode"));

				Details details = new Details();
				details.setMachineCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Details.MachineCount"));
				details.setRackCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Details.RackCount"));
				details.setSeatCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Details.SeatCount"));
				details.setUsedSeatCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Details.UsedSeatCount"));
				details.setAppCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].Details.AppCount"));
				locationTreeItem.setDetails(details);

				List<ZoneListItem> zoneList = new ArrayList<ZoneListItem>();
				for (int k = 0; k < context.lengthValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList.Length"); k++) {
					ZoneListItem zoneListItem = new ZoneListItem();
					zoneListItem.setZone(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Zone"));
					zoneListItem.setDisplayName(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].DisplayName"));
					zoneListItem.setZoneType(context.stringValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].ZoneType"));

					Details1 details1 = new Details1();
					details1.setMachineCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Details.MachineCount"));
					details1.setRackCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Details.RackCount"));
					details1.setSeatCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Details.SeatCount"));
					details1.setUsedSeatCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Details.UsedSeatCount"));
					details1.setAppCount(context.integerValue("ListCloudInstanceResponse.CloudInstance["+ i +"].LocationTree["+ j +"].ZoneList["+ k +"].Details.AppCount"));
					zoneListItem.setDetails1(details1);

					zoneList.add(zoneListItem);
				}
				locationTreeItem.setZoneList(zoneList);

				locationTree.add(locationTreeItem);
			}
			cloudInstanceItem.setLocationTree(locationTree);

			cloudInstance.add(cloudInstanceItem);
		}
		listCloudInstanceResponse.setCloudInstance(cloudInstance);
	 
	 	return listCloudInstanceResponse;
	}
}