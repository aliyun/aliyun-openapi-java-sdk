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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsSyncDemandResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSyncDemandResponse.DemandInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsSyncDemandResponse.DemandInfo.DemandModel;
import com.aliyuncs.ecsops.model.v20160401.OpsSyncDemandResponse.DemandInfo.DemandModel.DemandSupply;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSyncDemandResponseUnmarshaller {

	public static OpsSyncDemandResponse unmarshall(OpsSyncDemandResponse opsSyncDemandResponse, UnmarshallerContext _ctx) {
		
		opsSyncDemandResponse.setRequestId(_ctx.stringValue("OpsSyncDemandResponse.RequestId"));

		DemandInfo demandInfo = new DemandInfo();
		demandInfo.setRegionNo(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.RegionNo"));
		demandInfo.setTotalCount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.TotalCount"));
		demandInfo.setPageNo(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.PageNo"));
		demandInfo.setPageSize(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.PageSize"));

		List<DemandModel> demandModels = new ArrayList<DemandModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsSyncDemandResponse.DemandInfo.DemandModels.Length"); i++) {
			DemandModel demandModel = new DemandModel();
			demandModel.setDemandId(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandId"));
			demandModel.setSubDemandId(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].SubDemandId"));
			demandModel.setDemandTime(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandTime"));
			demandModel.setCustomerUid(_ctx.longValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].CustomerUid"));
			demandModel.setCustomerName(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].CustomerName"));
			demandModel.setCbmUid(_ctx.longValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].CbmUid"));
			demandModel.setCbmName(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].CbmName"));
			demandModel.setAvailableZoneId(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].AvailableZoneId"));
			demandModel.setInstanceType(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].InstanceType"));
			demandModel.setInstanceTypeFamily(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].InstanceTypeFamily"));
			demandModel.setNetworkType(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].NetworkType"));
			demandModel.setIoOptimized(_ctx.booleanValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].IoOptimized"));
			demandModel.setPayType(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].PayType"));
			demandModel.setPayDuration(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].PayDuration"));
			demandModel.setDurationUnit(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DurationUnit"));
			demandModel.setStartTime(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].StartTime"));
			demandModel.setEndTime(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].EndTime"));
			demandModel.setDemandStatus(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandStatus"));
			demandModel.setTotalCount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].TotalCount"));
			demandModel.setAvailableAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].AvailableAmount"));
			demandModel.setUsedAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].UsedAmount"));
			demandModel.setDeliveringAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DeliveringAmount"));
			demandModel.setComment(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].Comment"));

			List<DemandSupply> demandSupplyList = new ArrayList<DemandSupply>();
			for (int j = 0; j < _ctx.lengthValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList.Length"); j++) {
				DemandSupply demandSupply = new DemandSupply();
				demandSupply.setTotalAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].TotalAmount"));
				demandSupply.setUsedAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].UsedAmount"));
				demandSupply.setAvailableAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].AvailableAmount"));
				demandSupply.setDeliveringAmount(_ctx.integerValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].DeliveringAmount"));
				demandSupply.setSupplyStatus(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].SupplyStatus"));
				demandSupply.setStartTime(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].StartTime"));
				demandSupply.setEndTime(_ctx.stringValue("OpsSyncDemandResponse.DemandInfo.DemandModels["+ i +"].DemandSupplyList["+ j +"].EndTime"));

				demandSupplyList.add(demandSupply);
			}
			demandModel.setDemandSupplyList(demandSupplyList);

			demandModels.add(demandModel);
		}
		demandInfo.setDemandModels(demandModels);
		opsSyncDemandResponse.setDemandInfo(demandInfo);
	 
	 	return opsSyncDemandResponse;
	}
}