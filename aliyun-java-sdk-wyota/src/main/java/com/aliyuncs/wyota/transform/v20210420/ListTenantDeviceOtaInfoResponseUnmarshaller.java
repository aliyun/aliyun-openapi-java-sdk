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

import com.aliyuncs.wyota.model.v20210420.ListTenantDeviceOtaInfoResponse;
import com.aliyuncs.wyota.model.v20210420.ListTenantDeviceOtaInfoResponse.Data;
import com.aliyuncs.wyota.model.v20210420.ListTenantDeviceOtaInfoResponse.Data.TenantDeviceOtaInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTenantDeviceOtaInfoResponseUnmarshaller {

	public static ListTenantDeviceOtaInfoResponse unmarshall(ListTenantDeviceOtaInfoResponse listTenantDeviceOtaInfoResponse, UnmarshallerContext _ctx) {
		
		listTenantDeviceOtaInfoResponse.setRequestId(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.RequestId"));
		listTenantDeviceOtaInfoResponse.setCode(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.Code"));
		listTenantDeviceOtaInfoResponse.setMessage(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.Message"));
		listTenantDeviceOtaInfoResponse.setPageNumber(_ctx.integerValue("ListTenantDeviceOtaInfoResponse.PageNumber"));
		listTenantDeviceOtaInfoResponse.setPageSize(_ctx.integerValue("ListTenantDeviceOtaInfoResponse.PageSize"));
		listTenantDeviceOtaInfoResponse.setTotalCount(_ctx.longValue("ListTenantDeviceOtaInfoResponse.TotalCount"));

		Data data = new Data();

		List<TenantDeviceOtaInfo> tenantDeviceOtaInfos = new ArrayList<TenantDeviceOtaInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListTenantDeviceOtaInfoResponse.Data.TenantDeviceOtaInfos.Length"); i++) {
			TenantDeviceOtaInfo tenantDeviceOtaInfo = new TenantDeviceOtaInfo();
			tenantDeviceOtaInfo.setDeviceId(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.Data.TenantDeviceOtaInfos["+ i +"].DeviceId"));
			tenantDeviceOtaInfo.setModel(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.Data.TenantDeviceOtaInfos["+ i +"].Model"));
			tenantDeviceOtaInfo.setCurrentVersion(_ctx.stringValue("ListTenantDeviceOtaInfoResponse.Data.TenantDeviceOtaInfos["+ i +"].CurrentVersion"));

			tenantDeviceOtaInfos.add(tenantDeviceOtaInfo);
		}
		data.setTenantDeviceOtaInfos(tenantDeviceOtaInfos);
		listTenantDeviceOtaInfoResponse.setData(data);
	 
	 	return listTenantDeviceOtaInfoResponse;
	}
}