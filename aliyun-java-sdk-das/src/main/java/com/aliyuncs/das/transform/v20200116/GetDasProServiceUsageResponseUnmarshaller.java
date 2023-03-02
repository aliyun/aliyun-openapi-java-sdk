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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetDasProServiceUsageResponse;
import com.aliyuncs.das.model.v20200116.GetDasProServiceUsageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDasProServiceUsageResponseUnmarshaller {

	public static GetDasProServiceUsageResponse unmarshall(GetDasProServiceUsageResponse getDasProServiceUsageResponse, UnmarshallerContext _ctx) {
		
		getDasProServiceUsageResponse.setRequestId(_ctx.stringValue("GetDasProServiceUsageResponse.RequestId"));
		getDasProServiceUsageResponse.setMessage(_ctx.stringValue("GetDasProServiceUsageResponse.Message"));
		getDasProServiceUsageResponse.setCode(_ctx.longValue("GetDasProServiceUsageResponse.Code"));
		getDasProServiceUsageResponse.setSuccess(_ctx.booleanValue("GetDasProServiceUsageResponse.Success"));

		Data data = new Data();
		data.setStorageFreeQuotaInMB(_ctx.doubleValue("GetDasProServiceUsageResponse.Data.storageFreeQuotaInMB"));
		data.setIp(_ctx.stringValue("GetDasProServiceUsageResponse.Data.ip"));
		data.setCustinsId(_ctx.longValue("GetDasProServiceUsageResponse.Data.custinsId"));
		data.setUserId(_ctx.stringValue("GetDasProServiceUsageResponse.Data.userId"));
		data.setUuid(_ctx.stringValue("GetDasProServiceUsageResponse.Data.uuid"));
		data.setExpireTime(_ctx.longValue("GetDasProServiceUsageResponse.Data.expireTime"));
		data.setInstanceId(_ctx.stringValue("GetDasProServiceUsageResponse.Data.instanceId"));
		data.setStorageUsed(_ctx.longValue("GetDasProServiceUsageResponse.Data.storageUsed"));
		data.setEngine(_ctx.stringValue("GetDasProServiceUsageResponse.Data.engine"));
		data.setInstanceAlias(_ctx.stringValue("GetDasProServiceUsageResponse.Data.instanceAlias"));
		data.setPort(_ctx.integerValue("GetDasProServiceUsageResponse.Data.port"));
		data.setVpcId(_ctx.stringValue("GetDasProServiceUsageResponse.Data.vpcId"));
		data.setCommodityInstanceId(_ctx.stringValue("GetDasProServiceUsageResponse.Data.commodityInstanceId"));
		data.setStartTime(_ctx.longValue("GetDasProServiceUsageResponse.Data.startTime"));
		data.setIsSpare(_ctx.booleanValue("GetDasProServiceUsageResponse.Data.isSpare"));
		data.setRegion(_ctx.stringValue("GetDasProServiceUsageResponse.Data.region"));
		data.setServiceUnitId(_ctx.stringValue("GetDasProServiceUsageResponse.Data.serviceUnitId"));
		data.setSqlRetention(_ctx.stringValue("GetDasProServiceUsageResponse.Data.sqlRetention"));
		getDasProServiceUsageResponse.setData(data);
	 
	 	return getDasProServiceUsageResponse;
	}
}