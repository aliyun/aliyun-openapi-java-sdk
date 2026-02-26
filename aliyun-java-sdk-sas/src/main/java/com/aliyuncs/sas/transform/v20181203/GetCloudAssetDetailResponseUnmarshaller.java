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

import com.aliyuncs.sas.model.v20181203.GetCloudAssetDetailResponse;
import com.aliyuncs.sas.model.v20181203.GetCloudAssetDetailResponse.InstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCloudAssetDetailResponseUnmarshaller {

	public static GetCloudAssetDetailResponse unmarshall(GetCloudAssetDetailResponse getCloudAssetDetailResponse, UnmarshallerContext _ctx) {
		
		getCloudAssetDetailResponse.setRequestId(_ctx.stringValue("GetCloudAssetDetailResponse.RequestId"));
		getCloudAssetDetailResponse.setCount(_ctx.integerValue("GetCloudAssetDetailResponse.Count"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCloudAssetDetailResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setRegionId(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].RegionId"));
			instancesItem.setVendor(_ctx.integerValue("GetCloudAssetDetailResponse.Instances["+ i +"].Vendor"));
			instancesItem.setAssetType(_ctx.integerValue("GetCloudAssetDetailResponse.Instances["+ i +"].AssetType"));
			instancesItem.setAssetSubType(_ctx.integerValue("GetCloudAssetDetailResponse.Instances["+ i +"].AssetSubType"));
			instancesItem.setInstanceId(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].InstanceId"));
			instancesItem.setInstanceName(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].InstanceName"));
			instancesItem.setCreatedTime(_ctx.longValue("GetCloudAssetDetailResponse.Instances["+ i +"].CreatedTime"));
			instancesItem.setInternetIp(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].InternetIp"));
			instancesItem.setAlarmStatus(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].AlarmStatus"));
			instancesItem.setRiskStatus(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].RiskStatus"));
			instancesItem.setAssetTypeName(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].AssetTypeName"));
			instancesItem.setAssetSubTypeName(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].AssetSubTypeName"));
			instancesItem.setSecurityInfo(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].SecurityInfo"));
			instancesItem.setDetailLink(_ctx.stringValue("GetCloudAssetDetailResponse.Instances["+ i +"].DetailLink"));

			instances.add(instancesItem);
		}
		getCloudAssetDetailResponse.setInstances(instances);
	 
	 	return getCloudAssetDetailResponse;
	}
}