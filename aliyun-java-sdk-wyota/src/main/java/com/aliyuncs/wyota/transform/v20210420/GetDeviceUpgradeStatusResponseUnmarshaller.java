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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.GetDeviceUpgradeStatusResponse;
import com.aliyuncs.wyota.model.v20210420.GetDeviceUpgradeStatusResponse.Data;
import com.aliyuncs.wyota.model.v20210420.GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeviceUpgradeStatusResponseUnmarshaller {

	public static GetDeviceUpgradeStatusResponse unmarshall(GetDeviceUpgradeStatusResponse getDeviceUpgradeStatusResponse, UnmarshallerContext _ctx) {
		
		getDeviceUpgradeStatusResponse.setRequestId(_ctx.stringValue("GetDeviceUpgradeStatusResponse.RequestId"));
		getDeviceUpgradeStatusResponse.setCode(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Code"));
		getDeviceUpgradeStatusResponse.setMessage(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Message"));

		Data data = new Data();

		List<AppOtaStatusDTOListItem> appOtaStatusDTOList = new ArrayList<AppOtaStatusDTOListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList.Length"); i++) {
			AppOtaStatusDTOListItem appOtaStatusDTOListItem = new AppOtaStatusDTOListItem();
			appOtaStatusDTOListItem.setClientUid(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].ClientUid"));
			appOtaStatusDTOListItem.setBaseVersion(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].BaseVersion"));
			appOtaStatusDTOListItem.setTargetVersion(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].TargetVersion"));
			appOtaStatusDTOListItem.setStatus(_ctx.integerValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].Status"));
			appOtaStatusDTOListItem.setNote(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].Note"));
			appOtaStatusDTOListItem.setOsType(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].OsType"));
			appOtaStatusDTOListItem.setClientType(_ctx.integerValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].ClientType"));
			appOtaStatusDTOListItem.setTaskUid(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].TaskUid"));
			appOtaStatusDTOListItem.setProject(_ctx.stringValue("GetDeviceUpgradeStatusResponse.Data.AppOtaStatusDTOList["+ i +"].Project"));

			appOtaStatusDTOList.add(appOtaStatusDTOListItem);
		}
		data.setAppOtaStatusDTOList(appOtaStatusDTOList);
		getDeviceUpgradeStatusResponse.setData(data);
	 
	 	return getDeviceUpgradeStatusResponse;
	}
}