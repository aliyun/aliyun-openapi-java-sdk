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

import com.aliyuncs.polardbx.model.v20200202.GetPolarxCommodityResponse;
import com.aliyuncs.polardbx.model.v20200202.GetPolarxCommodityResponse.Component;
import com.aliyuncs.polardbx.model.v20200202.GetPolarxCommodityResponse.DBInstance;
import com.aliyuncs.polardbx.model.v20200202.GetPolarxCommodityResponse.DBInstance.ConnAddr;
import com.aliyuncs.polardbx.model.v20200202.GetPolarxCommodityResponse.DBInstance.DBNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolarxCommodityResponseUnmarshaller {

	public static GetPolarxCommodityResponse unmarshall(GetPolarxCommodityResponse getPolarxCommodityResponse, UnmarshallerContext _ctx) {
		
		getPolarxCommodityResponse.setRequestId(_ctx.stringValue("GetPolarxCommodityResponse.RequestId"));

		DBInstance dBInstance = new DBInstance();
		dBInstance.setStatus(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Status"));
		dBInstance.setDescription(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Description"));
		dBInstance.setZoneId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ZoneId"));
		dBInstance.setVPCId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.VPCId"));
		dBInstance.setCreateTime(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.CreateTime"));
		dBInstance.setExpired(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Expired"));
		dBInstance.setPayType(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.PayType"));
		dBInstance.setDBType(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBType"));
		dBInstance.setLockMode(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.LockMode"));
		dBInstance.setStorageUsed(_ctx.longValue("GetPolarxCommodityResponse.DBInstance.StorageUsed"));
		dBInstance.setDBVersion(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBVersion"));
		dBInstance.setNetwork(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Network"));
		dBInstance.setRegionId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.RegionId"));
		dBInstance.setEngine(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Engine"));
		dBInstance.setId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Id"));
		dBInstance.setConnectionString(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnectionString"));
		dBInstance.setPort(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Port"));
		dBInstance.setMinorVersion(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.MinorVersion"));
		dBInstance.setLatestMinorVersion(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.LatestMinorVersion"));
		dBInstance.setDBNodeCount(_ctx.integerValue("GetPolarxCommodityResponse.DBInstance.DBNodeCount"));
		dBInstance.setDBInstanceType(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBInstanceType"));
		dBInstance.setMaintainStartTime(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.MaintainStartTime"));
		dBInstance.setMaintainEndTime(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.MaintainEndTime"));
		dBInstance.setVSwitchId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.VSwitchId"));
		dBInstance.setCommodityCode(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.CommodityCode"));
		dBInstance.setExpireDate(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ExpireDate"));
		dBInstance.setType(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.Type"));
		dBInstance.setDBNodeClass(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBNodeClass"));

		List<String> readDBInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarxCommodityResponse.DBInstance.ReadDBInstances.Length"); i++) {
			readDBInstances.add(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ReadDBInstances["+ i +"]"));
		}
		dBInstance.setReadDBInstances(readDBInstances);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarxCommodityResponse.DBInstance.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBNodes["+ i +"].Id"));
			dBNode.setNodeClass(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBNodes["+ i +"].NodeClass"));
			dBNode.setRegionId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBNodes["+ i +"].RegionId"));
			dBNode.setZoneId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.DBNodes["+ i +"].ZoneId"));

			dBNodes.add(dBNode);
		}
		dBInstance.setDBNodes(dBNodes);

		List<ConnAddr> connAddrs = new ArrayList<ConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs.Length"); i++) {
			ConnAddr connAddr = new ConnAddr();
			connAddr.setConnectionString(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs["+ i +"].ConnectionString"));
			connAddr.setPort(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs["+ i +"].Port"));
			connAddr.setType(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs["+ i +"].Type"));
			connAddr.setVPCId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs["+ i +"].VPCId"));
			connAddr.setVSwitchId(_ctx.stringValue("GetPolarxCommodityResponse.DBInstance.ConnAddrs["+ i +"].VSwitchId"));

			connAddrs.add(connAddr);
		}
		dBInstance.setConnAddrs(connAddrs);
		getPolarxCommodityResponse.setDBInstance(dBInstance);

		List<Component> componentList = new ArrayList<Component>();
		for (int i = 0; i < _ctx.lengthValue("GetPolarxCommodityResponse.ComponentList.Length"); i++) {
			Component component = new Component();
			component.setName(_ctx.stringValue("GetPolarxCommodityResponse.ComponentList["+ i +"].Name"));
			component.setType(_ctx.stringValue("GetPolarxCommodityResponse.ComponentList["+ i +"].Type"));

			List<String> values = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetPolarxCommodityResponse.ComponentList["+ i +"].Values.Length"); j++) {
				values.add(_ctx.stringValue("GetPolarxCommodityResponse.ComponentList["+ i +"].Values["+ j +"]"));
			}
			component.setValues(values);

			componentList.add(component);
		}
		getPolarxCommodityResponse.setComponentList(componentList);
	 
	 	return getPolarxCommodityResponse;
	}
}