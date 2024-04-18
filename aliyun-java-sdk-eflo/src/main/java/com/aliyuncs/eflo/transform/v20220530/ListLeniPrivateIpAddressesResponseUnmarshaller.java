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

import com.aliyuncs.eflo.model.v20220530.ListLeniPrivateIpAddressesResponse;
import com.aliyuncs.eflo.model.v20220530.ListLeniPrivateIpAddressesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListLeniPrivateIpAddressesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLeniPrivateIpAddressesResponseUnmarshaller {

	public static ListLeniPrivateIpAddressesResponse unmarshall(ListLeniPrivateIpAddressesResponse listLeniPrivateIpAddressesResponse, UnmarshallerContext _ctx) {
		
		listLeniPrivateIpAddressesResponse.setRequestId(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.RequestId"));
		listLeniPrivateIpAddressesResponse.setCode(_ctx.integerValue("ListLeniPrivateIpAddressesResponse.Code"));
		listLeniPrivateIpAddressesResponse.setMessage(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListLeniPrivateIpAddressesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLeniPrivateIpAddressesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setElasticNetworkInterfaceId(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].ElasticNetworkInterfaceId"));
			dataItem.setRegionId(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setGmtCreate(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setIpName(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].IpName"));
			dataItem.setPrivateIpAddress(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].PrivateIpAddress"));
			dataItem.setStatus(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].Status"));
			dataItem.setDescription(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].Description"));
			dataItem.setMessage(_ctx.stringValue("ListLeniPrivateIpAddressesResponse.Content.Data["+ i +"].Message"));

			data.add(dataItem);
		}
		content.setData(data);
		listLeniPrivateIpAddressesResponse.setContent(content);
	 
	 	return listLeniPrivateIpAddressesResponse;
	}
}