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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsListZonesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsListZonesResponse.HouyiZoneInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsListZonesResponseUnmarshaller {

	public static OpsListZonesResponse unmarshall(OpsListZonesResponse opsListZonesResponse, UnmarshallerContext _ctx) {
		
		opsListZonesResponse.setRequestId(_ctx.stringValue("OpsListZonesResponse.RequestId"));
		opsListZonesResponse.setMessage(_ctx.stringValue("OpsListZonesResponse.Message"));
		opsListZonesResponse.setTotal(_ctx.stringValue("OpsListZonesResponse.Total"));
		opsListZonesResponse.setCode(_ctx.stringValue("OpsListZonesResponse.Code"));
		opsListZonesResponse.setSuccess(_ctx.stringValue("OpsListZonesResponse.Success"));

		List<HouyiZoneInfo> houyiZoneInfos = new ArrayList<HouyiZoneInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos.Length"); i++) {
			HouyiZoneInfo houyiZoneInfo = new HouyiZoneInfo();
			houyiZoneInfo.setVisibility(_ctx.booleanValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].Visibility"));
			houyiZoneInfo.setHouyiZoneNo(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].HouyiZoneNo"));
			houyiZoneInfo.setHouyiAvailableZoneNo(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].HouyiAvailableZoneNo"));
			houyiZoneInfo.setHouyiClusterNumericId(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].HouyiClusterNumericId"));
			houyiZoneInfo.setHouyiClusterNo(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].HouyiClusterNo"));
			houyiZoneInfo.setHouyiClusterName(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].HouyiClusterName"));

			List<String> networkTechnologys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].NetworkTechnologys.Length"); j++) {
				networkTechnologys.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].NetworkTechnologys["+ j +"]"));
			}
			houyiZoneInfo.setNetworkTechnologys(networkTechnologys);

			List<String> virtTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].VirtTypes.Length"); j++) {
				virtTypes.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].VirtTypes["+ j +"]"));
			}
			houyiZoneInfo.setVirtTypes(virtTypes);

			List<String> storageNetworkTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].StorageNetworkTypes.Length"); j++) {
				storageNetworkTypes.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].StorageNetworkTypes["+ j +"]"));
			}
			houyiZoneInfo.setStorageNetworkTypes(storageNetworkTypes);

			List<String> instanceTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].InstanceTypes.Length"); j++) {
				instanceTypes.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].InstanceTypes["+ j +"]"));
			}
			houyiZoneInfo.setInstanceTypes(instanceTypes);

			List<String> networkTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].NetworkTypes.Length"); j++) {
				networkTypes.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].NetworkTypes["+ j +"]"));
			}
			houyiZoneInfo.setNetworkTypes(networkTypes);

			List<String> diskTypes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].DiskTypes.Length"); j++) {
				diskTypes.add(_ctx.stringValue("OpsListZonesResponse.HouyiZoneInfos["+ i +"].DiskTypes["+ j +"]"));
			}
			houyiZoneInfo.setDiskTypes(diskTypes);

			houyiZoneInfos.add(houyiZoneInfo);
		}
		opsListZonesResponse.setHouyiZoneInfos(houyiZoneInfos);
	 
	 	return opsListZonesResponse;
	}
}