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

package com.aliyuncs.cd.transform.v2021127;

import com.aliyuncs.cd.model.v2021127.QueryOperationIndexResponse;
import com.aliyuncs.cd.model.v2021127.QueryOperationIndexResponse.Data;
import com.aliyuncs.cd.model.v2021127.QueryOperationIndexResponse.Data.DeviceIndex;
import com.aliyuncs.cd.model.v2021127.QueryOperationIndexResponse.Data.ShopIndex;
import com.aliyuncs.cd.model.v2021127.QueryOperationIndexResponse.Data.TicketIndex;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOperationIndexResponseUnmarshaller {

	public static QueryOperationIndexResponse unmarshall(QueryOperationIndexResponse queryOperationIndexResponse, UnmarshallerContext _ctx) {
		
		queryOperationIndexResponse.setRequestId(_ctx.stringValue("QueryOperationIndexResponse.RequestId"));
		queryOperationIndexResponse.setSuccess(_ctx.booleanValue("QueryOperationIndexResponse.Success"));
		queryOperationIndexResponse.setMessage(_ctx.stringValue("QueryOperationIndexResponse.Message"));
		queryOperationIndexResponse.setCode(_ctx.stringValue("QueryOperationIndexResponse.Code"));
		queryOperationIndexResponse.setHttpStatusCode(_ctx.integerValue("QueryOperationIndexResponse.HttpStatusCode"));

		Data data = new Data();

		ShopIndex shopIndex = new ShopIndex();
		shopIndex.setShopTotal(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.ShopTotal"));
		shopIndex.setNetWorkShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.NetWorkShopNum"));
		shopIndex.setInstalledShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.InstalledShopNum"));
		shopIndex.setNotWorkShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.NotWorkShopNum"));
		shopIndex.setUpholdShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.UpholdShopNum"));
		shopIndex.setNormalShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.NormalShopNum"));
		shopIndex.setFaultShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.FaultShopNum"));
		shopIndex.setHighFreqFaultShopNum(_ctx.integerValue("QueryOperationIndexResponse.Data.ShopIndex.HighFreqFaultShopNum"));
		data.setShopIndex(shopIndex);

		DeviceIndex deviceIndex = new DeviceIndex();
		deviceIndex.setOnlineNum(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.OnlineNum"));
		deviceIndex.setCpuAverage(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.CpuAverage"));
		deviceIndex.setStorageAverage(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.StorageAverage"));
		deviceIndex.setNetworkTraffic(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.NetworkTraffic"));
		deviceIndex.setTotalWorkingDeviceNum(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.TotalWorkingDeviceNum"));
		deviceIndex.setNormalDeviceNum(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.NormalDeviceNum"));
		deviceIndex.setFaultDeviceNum(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.FaultDeviceNum"));
		deviceIndex.setHighFreqFaultDeviceNum(_ctx.integerValue("QueryOperationIndexResponse.Data.DeviceIndex.HighFreqFaultDeviceNum"));
		data.setDeviceIndex(deviceIndex);

		TicketIndex ticketIndex = new TicketIndex();
		ticketIndex.setTotalTicketNum(_ctx.integerValue("QueryOperationIndexResponse.Data.TicketIndex.TotalTicketNum"));
		ticketIndex.setAutoRecoverTicketNum(_ctx.integerValue("QueryOperationIndexResponse.Data.TicketIndex.AutoRecoverTicketNum"));
		ticketIndex.setOpenTicketNum(_ctx.integerValue("QueryOperationIndexResponse.Data.TicketIndex.OpenTicketNum"));
		ticketIndex.setRecoverRate(_ctx.doubleValue("QueryOperationIndexResponse.Data.TicketIndex.RecoverRate"));
		ticketIndex.setAutoRecoverRate(_ctx.doubleValue("QueryOperationIndexResponse.Data.TicketIndex.AutoRecoverRate"));
		data.setTicketIndex(ticketIndex);
		queryOperationIndexResponse.setData(data);
	 
	 	return queryOperationIndexResponse;
	}
}