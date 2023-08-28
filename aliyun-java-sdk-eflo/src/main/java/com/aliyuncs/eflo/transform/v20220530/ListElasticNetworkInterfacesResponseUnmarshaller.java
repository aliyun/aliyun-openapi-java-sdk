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

import com.aliyuncs.eflo.model.v20220530.ListElasticNetworkInterfacesResponse;
import com.aliyuncs.eflo.model.v20220530.ListElasticNetworkInterfacesResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListElasticNetworkInterfacesResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListElasticNetworkInterfacesResponseUnmarshaller {

	public static ListElasticNetworkInterfacesResponse unmarshall(ListElasticNetworkInterfacesResponse listElasticNetworkInterfacesResponse, UnmarshallerContext _ctx) {
		
		listElasticNetworkInterfacesResponse.setRequestId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.RequestId"));
		listElasticNetworkInterfacesResponse.setCode(_ctx.integerValue("ListElasticNetworkInterfacesResponse.Code"));
		listElasticNetworkInterfacesResponse.setMessage(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListElasticNetworkInterfacesResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListElasticNetworkInterfacesResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setZoneId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].ZoneId"));
			dataItem.setElasticNetworkInterfaceId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].ElasticNetworkInterfaceId"));
			dataItem.setNodeId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].NodeId"));
			dataItem.setStatus(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Status"));
			dataItem.setIp(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Ip"));
			dataItem.setVpcId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].VpcId"));
			dataItem.setVSwitchId(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].VSwitchId"));
			dataItem.setMessage(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Message"));
			dataItem.setMac(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Mac"));
			dataItem.setType(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Type"));
			dataItem.setGateway(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Gateway"));
			dataItem.setMask(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Mask"));
			dataItem.setCreateTime(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setDescription(_ctx.stringValue("ListElasticNetworkInterfacesResponse.Content.Data["+ i +"].Description"));

			data.add(dataItem);
		}
		content.setData(data);
		listElasticNetworkInterfacesResponse.setContent(content);
	 
	 	return listElasticNetworkInterfacesResponse;
	}
}