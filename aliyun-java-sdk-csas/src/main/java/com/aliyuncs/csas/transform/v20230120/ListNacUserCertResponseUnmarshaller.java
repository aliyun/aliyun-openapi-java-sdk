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

import com.aliyuncs.csas.model.v20230120.ListNacUserCertResponse;
import com.aliyuncs.csas.model.v20230120.ListNacUserCertResponse.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNacUserCertResponseUnmarshaller {

	public static ListNacUserCertResponse unmarshall(ListNacUserCertResponse listNacUserCertResponse, UnmarshallerContext _ctx) {
		
		listNacUserCertResponse.setRequestId(_ctx.stringValue("ListNacUserCertResponse.RequestId"));
		listNacUserCertResponse.setCode(_ctx.longValue("ListNacUserCertResponse.Code"));
		listNacUserCertResponse.setMessage(_ctx.stringValue("ListNacUserCertResponse.Message"));
		listNacUserCertResponse.setTotalNum(_ctx.longValue("ListNacUserCertResponse.TotalNum"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListNacUserCertResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setUsername(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Username"));
			dataListItem.setAliuid(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Aliuid"));
			dataListItem.setExpiredTime(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].ExpiredTime"));
			dataListItem.setDepartment(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Department"));
			dataListItem.setDeviceType(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].DeviceType"));
			dataListItem.setStatus(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Status"));
			dataListItem.setUserId(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].UserId"));
			dataListItem.setDevTag(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].DevTag"));
			dataListItem.setHostname(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Hostname"));
			dataListItem.setMac(_ctx.stringValue("ListNacUserCertResponse.DataList["+ i +"].Mac"));

			dataList.add(dataListItem);
		}
		listNacUserCertResponse.setDataList(dataList);
	 
	 	return listNacUserCertResponse;
	}
}