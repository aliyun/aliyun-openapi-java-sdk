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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListSoftwareForUserDeviceResponse;
import com.aliyuncs.csas.model.v20230120.ListSoftwareForUserDeviceResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSoftwareForUserDeviceResponseUnmarshaller {

	public static ListSoftwareForUserDeviceResponse unmarshall(ListSoftwareForUserDeviceResponse listSoftwareForUserDeviceResponse, UnmarshallerContext _ctx) {
		
		listSoftwareForUserDeviceResponse.setRequestId(_ctx.stringValue("ListSoftwareForUserDeviceResponse.RequestId"));
		listSoftwareForUserDeviceResponse.setTotalNum(_ctx.longValue("ListSoftwareForUserDeviceResponse.TotalNum"));

		List<DataList> software = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("ListSoftwareForUserDeviceResponse.Software.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setName(_ctx.stringValue("ListSoftwareForUserDeviceResponse.Software["+ i +"].Name"));
			dataList.setInc(_ctx.stringValue("ListSoftwareForUserDeviceResponse.Software["+ i +"].Inc"));
			dataList.setInstallTime(_ctx.stringValue("ListSoftwareForUserDeviceResponse.Software["+ i +"].InstallTime"));

			List<String> versions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListSoftwareForUserDeviceResponse.Software["+ i +"].Versions.Length"); j++) {
				versions.add(_ctx.stringValue("ListSoftwareForUserDeviceResponse.Software["+ i +"].Versions["+ j +"]"));
			}
			dataList.setVersions(versions);

			software.add(dataList);
		}
		listSoftwareForUserDeviceResponse.setSoftware(software);
	 
	 	return listSoftwareForUserDeviceResponse;
	}
}