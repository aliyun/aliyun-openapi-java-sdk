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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorGroupsResponse;
import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroupsItem;
import com.aliyuncs.iotcc.model.v20210513.ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroupsItem.IoTCloudConnectorsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIoTCloudConnectorGroupsResponseUnmarshaller {

	public static ListIoTCloudConnectorGroupsResponse unmarshall(ListIoTCloudConnectorGroupsResponse listIoTCloudConnectorGroupsResponse, UnmarshallerContext _ctx) {
		
		listIoTCloudConnectorGroupsResponse.setRequestId(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.RequestId"));
		listIoTCloudConnectorGroupsResponse.setTotalCount(_ctx.integerValue("ListIoTCloudConnectorGroupsResponse.TotalCount"));
		listIoTCloudConnectorGroupsResponse.setNextToken(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.NextToken"));
		listIoTCloudConnectorGroupsResponse.setMaxResults(_ctx.integerValue("ListIoTCloudConnectorGroupsResponse.MaxResults"));

		List<IoTCloudConnectorGroupsItem> ioTCloudConnectorGroups = new ArrayList<IoTCloudConnectorGroupsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups.Length"); i++) {
			IoTCloudConnectorGroupsItem ioTCloudConnectorGroupsItem = new IoTCloudConnectorGroupsItem();
			ioTCloudConnectorGroupsItem.setIoTCloudConnectorGroupId(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectorGroupId"));
			ioTCloudConnectorGroupsItem.setIoTCloudConnectorGroupStatus(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectorGroupStatus"));
			ioTCloudConnectorGroupsItem.setName(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].Name"));
			ioTCloudConnectorGroupsItem.setDescription(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].Description"));
			ioTCloudConnectorGroupsItem.setCreateTime(_ctx.longValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].CreateTime"));
			ioTCloudConnectorGroupsItem.setType(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].Type"));

			List<IoTCloudConnectorsItem> ioTCloudConnectors = new ArrayList<IoTCloudConnectorsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors.Length"); j++) {
				IoTCloudConnectorsItem ioTCloudConnectorsItem = new IoTCloudConnectorsItem();
				ioTCloudConnectorsItem.setIoTCloudConnectorId(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].IoTCloudConnectorId"));
				ioTCloudConnectorsItem.setIoTCloudConnectorStatus(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].IoTCloudConnectorStatus"));
				ioTCloudConnectorsItem.setIoTCloudConnectorName(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].IoTCloudConnectorName"));
				ioTCloudConnectorsItem.setIoTCloudConnectorDescription(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].IoTCloudConnectorDescription"));
				ioTCloudConnectorsItem.setCreateTime(_ctx.longValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].CreateTime"));
				ioTCloudConnectorsItem.setISP(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].ISP"));
				ioTCloudConnectorsItem.setAPN(_ctx.stringValue("ListIoTCloudConnectorGroupsResponse.IoTCloudConnectorGroups["+ i +"].IoTCloudConnectors["+ j +"].APN"));

				ioTCloudConnectors.add(ioTCloudConnectorsItem);
			}
			ioTCloudConnectorGroupsItem.setIoTCloudConnectors(ioTCloudConnectors);

			ioTCloudConnectorGroups.add(ioTCloudConnectorGroupsItem);
		}
		listIoTCloudConnectorGroupsResponse.setIoTCloudConnectorGroups(ioTCloudConnectorGroups);
	 
	 	return listIoTCloudConnectorGroupsResponse;
	}
}