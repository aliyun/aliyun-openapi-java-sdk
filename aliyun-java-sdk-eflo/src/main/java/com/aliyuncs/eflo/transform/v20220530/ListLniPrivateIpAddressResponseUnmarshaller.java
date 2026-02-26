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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListLniPrivateIpAddressResponse;
import com.aliyuncs.eflo.model.v20220530.ListLniPrivateIpAddressResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListLniPrivateIpAddressResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLniPrivateIpAddressResponseUnmarshaller {

	public static ListLniPrivateIpAddressResponse unmarshall(ListLniPrivateIpAddressResponse listLniPrivateIpAddressResponse, UnmarshallerContext _ctx) {
		
		listLniPrivateIpAddressResponse.setRequestId(_ctx.stringValue("ListLniPrivateIpAddressResponse.RequestId"));
		listLniPrivateIpAddressResponse.setCode(_ctx.integerValue("ListLniPrivateIpAddressResponse.Code"));
		listLniPrivateIpAddressResponse.setMessage(_ctx.stringValue("ListLniPrivateIpAddressResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListLniPrivateIpAddressResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLniPrivateIpAddressResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setGmtCreate(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].GmtCreate"));
			dataItem.setNetworkInterfaceId(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].NetworkInterfaceId"));
			dataItem.setIpName(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].IpName"));
			dataItem.setPrivateIpAddress(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].PrivateIpAddress"));
			dataItem.setIpAddressMac(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].IpAddressMac"));
			dataItem.setStatus(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].Status"));
			dataItem.setDescription(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].Description"));
			dataItem.setMessage(_ctx.stringValue("ListLniPrivateIpAddressResponse.Content.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		content.setData(data);
		listLniPrivateIpAddressResponse.setContent(content);
	 
	 	return listLniPrivateIpAddressResponse;
	}
}