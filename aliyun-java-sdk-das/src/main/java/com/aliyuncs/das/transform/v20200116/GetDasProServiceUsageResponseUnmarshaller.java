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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetDasProServiceUsageResponse;
import com.aliyuncs.das.model.v20200116.GetDasProServiceUsageResponse.Unit;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDasProServiceUsageResponseUnmarshaller {

	public static GetDasProServiceUsageResponse unmarshall(GetDasProServiceUsageResponse getDasProServiceUsageResponse, UnmarshallerContext _ctx) {
		
		getDasProServiceUsageResponse.setRequestId(_ctx.stringValue("GetDasProServiceUsageResponse.RequestId"));
		getDasProServiceUsageResponse.setMessage(_ctx.stringValue("GetDasProServiceUsageResponse.Message"));
		getDasProServiceUsageResponse.setCode(_ctx.longValue("GetDasProServiceUsageResponse.Code"));
		getDasProServiceUsageResponse.setSuccess(_ctx.booleanValue("GetDasProServiceUsageResponse.Success"));

		List<Unit> data = new ArrayList<Unit>();
		for (int i = 0; i < _ctx.lengthValue("GetDasProServiceUsageResponse.Data.Length"); i++) {
			Unit unit = new Unit();
			unit.setStorageFreeQuotaInMB(_ctx.doubleValue("GetDasProServiceUsageResponse.Data["+ i +"].storageFreeQuotaInMB"));
			unit.setIp(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].ip"));
			unit.setCustinsId(_ctx.longValue("GetDasProServiceUsageResponse.Data["+ i +"].custinsId"));
			unit.setUserId(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].userId"));
			unit.setUuid(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].uuid"));
			unit.setExpireTime(_ctx.longValue("GetDasProServiceUsageResponse.Data["+ i +"].expireTime"));
			unit.setInstanceId(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].instanceId"));
			unit.setStorageUsed(_ctx.longValue("GetDasProServiceUsageResponse.Data["+ i +"].storageUsed"));
			unit.setEngine(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].engine"));
			unit.setInstanceAlias(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].instanceAlias"));
			unit.setPort(_ctx.integerValue("GetDasProServiceUsageResponse.Data["+ i +"].port"));
			unit.setVpcId(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].vpcId"));
			unit.setCommodityInstanceId(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].commodityInstanceId"));
			unit.setStartTime(_ctx.longValue("GetDasProServiceUsageResponse.Data["+ i +"].startTime"));
			unit.setIsSpare(_ctx.booleanValue("GetDasProServiceUsageResponse.Data["+ i +"].isSpare"));
			unit.setRegion(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].region"));
			unit.setServiceUnitId(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].serviceUnitId"));
			unit.setSqlRetention(_ctx.stringValue("GetDasProServiceUsageResponse.Data["+ i +"].sqlRetention"));

			data.add(unit);
		}
		getDasProServiceUsageResponse.setData(data);
	 
	 	return getDasProServiceUsageResponse;
	}
}