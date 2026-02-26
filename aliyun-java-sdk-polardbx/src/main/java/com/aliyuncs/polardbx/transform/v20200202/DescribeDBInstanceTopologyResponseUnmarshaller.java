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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItemsItem;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.ItemsItem;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.ItemsItem.AoneRoleMap;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.ItemsItem.ConnectionIpItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceTopologyResponseUnmarshaller {

	public static DescribeDBInstanceTopologyResponse unmarshall(DescribeDBInstanceTopologyResponse describeDBInstanceTopologyResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceTopologyResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceTopologyResponse.RequestId"));

		Data data = new Data();

		LogicInstanceTopology logicInstanceTopology = new LogicInstanceTopology();
		logicInstanceTopology.setDBInstanceName(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceName"));
		logicInstanceTopology.setDBInstanceCreateTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceCreateTime"));
		logicInstanceTopology.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.MaintainStartTime"));
		logicInstanceTopology.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.MaintainEndTime"));
		logicInstanceTopology.setLockReason(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.LockReason"));
		logicInstanceTopology.setDBInstanceStatus(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceStatus"));
		logicInstanceTopology.setLockMode(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.LockMode"));
		logicInstanceTopology.setEngineVersion(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.EngineVersion"));
		logicInstanceTopology.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceStorage"));
		logicInstanceTopology.setDBInstanceConnType(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceConnType"));
		logicInstanceTopology.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceId"));
		logicInstanceTopology.setEngine(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Engine"));
		logicInstanceTopology.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceDescription"));
		logicInstanceTopology.setDBInstanceStatusDescription(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.DBInstanceStatusDescription"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDBInstanceCreateTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceCreateTime"));
			itemsItem.setDBInstanceName(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceName"));
			itemsItem.setCharacterType(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].CharacterType"));
			itemsItem.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].MaintainStartTime"));
			itemsItem.setDiskSize(_ctx.longValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DiskSize"));
			itemsItem.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].MaintainEndTime"));
			itemsItem.setLockReason(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].LockReason"));
			itemsItem.setDBInstanceStatus(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceStatus"));
			itemsItem.setLockMode(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].LockMode"));
			itemsItem.setEngineVersion(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].EngineVersion"));
			itemsItem.setDBInstanceConnType(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceConnType"));
			itemsItem.setMaxConnections(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].MaxConnections"));
			itemsItem.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceId"));
			itemsItem.setEngine(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Engine"));
			itemsItem.setMaxIops(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].MaxIops"));
			itemsItem.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceDescription"));
			itemsItem.setDBInstanceStatusDescription(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].DBInstanceStatusDescription"));
			itemsItem.setRegion(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Region"));
			itemsItem.setAzone(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Azone"));
			itemsItem.setRole(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Role"));
			itemsItem.setActivated(_ctx.booleanValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Activated"));
			itemsItem.setStatus(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Status"));
			itemsItem.setNodeClass(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].NodeClass"));
			itemsItem.setVersion(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].Version"));
			itemsItem.setPhyInstanceName(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].PhyInstanceName"));
			itemsItem.setStorageUsed(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].StorageUsed"));

			List<ConnectionIpItem> connectionIp = new ArrayList<ConnectionIpItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].ConnectionIp.Length"); j++) {
				ConnectionIpItem connectionIpItem = new ConnectionIpItem();
				connectionIpItem.setPort(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].ConnectionIp["+ j +"].Port"));
				connectionIpItem.setDBInstanceNetType(_ctx.integerValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].ConnectionIp["+ j +"].DBInstanceNetType"));
				connectionIpItem.setConnectionString(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].ConnectionIp["+ j +"].ConnectionString"));

				connectionIp.add(connectionIpItem);
			}
			itemsItem.setConnectionIp(connectionIp);

			List<AoneRoleMap> azoneRoleList = new ArrayList<AoneRoleMap>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].AzoneRoleList.Length"); j++) {
				AoneRoleMap aoneRoleMap = new AoneRoleMap();
				aoneRoleMap.setAzone(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].AzoneRoleList["+ j +"].Azone"));
				aoneRoleMap.setRole(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.Items["+ i +"].AzoneRoleList["+ j +"].Role"));

				azoneRoleList.add(aoneRoleMap);
			}
			itemsItem.setAzoneRoleList(azoneRoleList);

			items.add(itemsItem);
		}
		logicInstanceTopology.setItems(items);

		List<HistoryItemsItem> historyItems = new ArrayList<HistoryItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems.Length"); i++) {
			HistoryItemsItem historyItemsItem = new HistoryItemsItem();
			historyItemsItem.setCharacterType(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].CharacterType"));
			historyItemsItem.setRole(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].Role"));
			historyItemsItem.setDBInstanceName(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].DBInstanceName"));
			historyItemsItem.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].DBInstanceId"));
			historyItemsItem.setRegion(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].Region"));
			historyItemsItem.setAzone(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].Azone"));
			historyItemsItem.setActivated(_ctx.booleanValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].Activated"));
			historyItemsItem.setPhyInstanceName(_ctx.stringValue("DescribeDBInstanceTopologyResponse.Data.LogicInstanceTopology.HistoryItems["+ i +"].PhyInstanceName"));

			historyItems.add(historyItemsItem);
		}
		logicInstanceTopology.setHistoryItems(historyItems);
		data.setLogicInstanceTopology(logicInstanceTopology);
		describeDBInstanceTopologyResponse.setData(data);
	 
	 	return describeDBInstanceTopologyResponse;
	}
}