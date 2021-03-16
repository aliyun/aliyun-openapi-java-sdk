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

import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcOperationResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryNcOperationResponse.NcOpsDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryNcOperationResponseUnmarshaller {

	public static OpsQueryNcOperationResponse unmarshall(OpsQueryNcOperationResponse opsQueryNcOperationResponse, UnmarshallerContext _ctx) {
		
		opsQueryNcOperationResponse.setRequestId(_ctx.stringValue("OpsQueryNcOperationResponse.RequestId"));
		opsQueryNcOperationResponse.setTotalCnt(_ctx.integerValue("OpsQueryNcOperationResponse.TotalCnt"));
		opsQueryNcOperationResponse.setPageNumber(_ctx.integerValue("OpsQueryNcOperationResponse.PageNumber"));
		opsQueryNcOperationResponse.setPageSize(_ctx.integerValue("OpsQueryNcOperationResponse.PageSize"));

		List<NcOpsDetail> ncOpsDetailList = new ArrayList<NcOpsDetail>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryNcOperationResponse.NcOpsDetailList.Length"); i++) {
			NcOpsDetail ncOpsDetail = new NcOpsDetail();
			ncOpsDetail.setNcIp(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].NcIp"));
			ncOpsDetail.setCnSn(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].CnSn"));
			ncOpsDetail.setRegion(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].Region"));
			ncOpsDetail.setClusterName(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].ClusterName"));
			ncOpsDetail.setMachineType(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].MachineType"));
			ncOpsDetail.setOpsRuleName(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].OpsRuleName"));
			ncOpsDetail.setDescription(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].Description"));
			ncOpsDetail.setFirstMatchTime(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].FirstMatchTime"));
			ncOpsDetail.setHitCnt(_ctx.integerValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].HitCnt"));
			ncOpsDetail.setAction(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].Action"));
			ncOpsDetail.setReason(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].Reason"));
			ncOpsDetail.setTargetFeatures(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].TargetFeatures"));
			ncOpsDetail.setIsRateLimited(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].IsRateLimited"));
			ncOpsDetail.setRateLimitedTime(_ctx.integerValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].RateLimitedTime"));
			ncOpsDetail.setFirstOpsTime(_ctx.stringValue("OpsQueryNcOperationResponse.NcOpsDetailList["+ i +"].FirstOpsTime"));

			ncOpsDetailList.add(ncOpsDetail);
		}
		opsQueryNcOperationResponse.setNcOpsDetailList(ncOpsDetailList);
	 
	 	return opsQueryNcOperationResponse;
	}
}