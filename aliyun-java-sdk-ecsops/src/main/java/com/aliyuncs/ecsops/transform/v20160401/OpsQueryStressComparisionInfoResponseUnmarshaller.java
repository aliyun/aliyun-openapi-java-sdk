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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryStressComparisionInfoResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryStressComparisionInfoResponse.DimensionInfo;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryStressComparisionInfoResponse.SnNodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryStressComparisionInfoResponseUnmarshaller {

	public static OpsQueryStressComparisionInfoResponse unmarshall(OpsQueryStressComparisionInfoResponse opsQueryStressComparisionInfoResponse, UnmarshallerContext _ctx) {
		
		opsQueryStressComparisionInfoResponse.setRequestId(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.RequestId"));
		opsQueryStressComparisionInfoResponse.setMachineId(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.MachineId"));

		List<SnNodeInfo> snNodeInfoList = new ArrayList<SnNodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList.Length"); i++) {
			SnNodeInfo snNodeInfo = new SnNodeInfo();
			snNodeInfo.setNcId(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].NcId"));
			snNodeInfo.setStressComparisionResult(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].StressComparisionResult"));
			snNodeInfo.setStressComparisionStartTime(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].StressComparisionStartTime"));
			snNodeInfo.setStressComparisionState(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].StressComparisionState"));
			snNodeInfo.setRiskTag(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].RiskTag"));
			snNodeInfo.setStressComparisionTime(_ctx.integerValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].StressComparisionTime"));
			snNodeInfo.setCnSn(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.SnNodeInfoList["+ i +"].CnSn"));

			snNodeInfoList.add(snNodeInfo);
		}
		opsQueryStressComparisionInfoResponse.setSnNodeInfoList(snNodeInfoList);

		List<DimensionInfo> dimensionInfoList = new ArrayList<DimensionInfo>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryStressComparisionInfoResponse.DimensionInfoList.Length"); i++) {
			DimensionInfo dimensionInfo = new DimensionInfo();
			dimensionInfo.setDimensionValue(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.DimensionInfoList["+ i +"].DimensionValue"));
			dimensionInfo.setUserInputTargetId(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.DimensionInfoList["+ i +"].UserInputTargetId"));

			List<String> relatedTargetIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryStressComparisionInfoResponse.DimensionInfoList["+ i +"].RelatedTargetIds.Length"); j++) {
				relatedTargetIds.add(_ctx.stringValue("OpsQueryStressComparisionInfoResponse.DimensionInfoList["+ i +"].RelatedTargetIds["+ j +"]"));
			}
			dimensionInfo.setRelatedTargetIds(relatedTargetIds);

			dimensionInfoList.add(dimensionInfo);
		}
		opsQueryStressComparisionInfoResponse.setDimensionInfoList(dimensionInfoList);
	 
	 	return opsQueryStressComparisionInfoResponse;
	}
}