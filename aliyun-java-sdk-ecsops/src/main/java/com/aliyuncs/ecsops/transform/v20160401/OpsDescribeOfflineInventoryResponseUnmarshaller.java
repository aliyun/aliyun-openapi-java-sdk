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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOfflineInventoryResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeOfflineInventoryResponse.OfflineInventoryModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeOfflineInventoryResponseUnmarshaller {

	public static OpsDescribeOfflineInventoryResponse unmarshall(OpsDescribeOfflineInventoryResponse opsDescribeOfflineInventoryResponse, UnmarshallerContext _ctx) {
		
		opsDescribeOfflineInventoryResponse.setRequestId(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.RequestId"));
		opsDescribeOfflineInventoryResponse.setTotalCount(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.TotalCount"));
		opsDescribeOfflineInventoryResponse.setNextToken(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.NextToken"));
		opsDescribeOfflineInventoryResponse.setPageNumber(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.PageNumber"));
		opsDescribeOfflineInventoryResponse.setPageSize(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.PageSize"));

		List<OfflineInventoryModel> offlineInventoryModels = new ArrayList<OfflineInventoryModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels.Length"); i++) {
			OfflineInventoryModel offlineInventoryModel = new OfflineInventoryModel();
			offlineInventoryModel.setRegionNo(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].RegionNo"));
			offlineInventoryModel.setIzNo(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].IzNo"));
			offlineInventoryModel.setInstanceType(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].InstanceType"));
			offlineInventoryModel.setPeriodDay(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].PeriodDay"));
			offlineInventoryModel.setNcType(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].NcType"));
			offlineInventoryModel.setCapacity(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].Capacity"));
			offlineInventoryModel.setIdc(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].Idc"));
			offlineInventoryModel.setNetworkArch(_ctx.stringValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].NetworkArch"));
			offlineInventoryModel.setVmCnt(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].VmCnt"));
			offlineInventoryModel.setRackCnt(_ctx.integerValue("OpsDescribeOfflineInventoryResponse.OfflineInventoryModels["+ i +"].RackCnt"));

			offlineInventoryModels.add(offlineInventoryModel);
		}
		opsDescribeOfflineInventoryResponse.setOfflineInventoryModels(offlineInventoryModels);
	 
	 	return opsDescribeOfflineInventoryResponse;
	}
}