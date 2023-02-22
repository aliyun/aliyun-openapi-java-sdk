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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListCloudAssetInstancesResponse;
import com.aliyuncs.sas.model.v20181203.ListCloudAssetInstancesResponse.InstancesItem;
import com.aliyuncs.sas.model.v20181203.ListCloudAssetInstancesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCloudAssetInstancesResponseUnmarshaller {

	public static ListCloudAssetInstancesResponse unmarshall(ListCloudAssetInstancesResponse listCloudAssetInstancesResponse, UnmarshallerContext _ctx) {
		
		listCloudAssetInstancesResponse.setRequestId(_ctx.stringValue("ListCloudAssetInstancesResponse.RequestId"));
		listCloudAssetInstancesResponse.setSuccess(_ctx.booleanValue("ListCloudAssetInstancesResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListCloudAssetInstancesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListCloudAssetInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListCloudAssetInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListCloudAssetInstancesResponse.PageInfo.Count"));
		listCloudAssetInstancesResponse.setPageInfo(pageInfo);

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCloudAssetInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setRegionId(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].RegionId"));
			instancesItem.setVendor(_ctx.integerValue("ListCloudAssetInstancesResponse.Instances["+ i +"].Vendor"));
			instancesItem.setAssetType(_ctx.integerValue("ListCloudAssetInstancesResponse.Instances["+ i +"].AssetType"));
			instancesItem.setAssetSubType(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].AssetSubType"));
			instancesItem.setInstanceId(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setCreatedTime(_ctx.longValue("ListCloudAssetInstancesResponse.Instances["+ i +"].CreatedTime"));
			instancesItem.setInternetIp(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].InternetIp"));
			instancesItem.setAlarmStatus(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].AlarmStatus"));
			instancesItem.setRiskStatus(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].RiskStatus"));
			instancesItem.setAssetTypeName(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].AssetTypeName"));
			instancesItem.setAssetSubTypeName(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].AssetSubTypeName"));
			instancesItem.setSecurityInfo(_ctx.stringValue("ListCloudAssetInstancesResponse.Instances["+ i +"].SecurityInfo"));

			instances.add(instancesItem);
		}
		listCloudAssetInstancesResponse.setInstances(instances);
	 
	 	return listCloudAssetInstancesResponse;
	}
}