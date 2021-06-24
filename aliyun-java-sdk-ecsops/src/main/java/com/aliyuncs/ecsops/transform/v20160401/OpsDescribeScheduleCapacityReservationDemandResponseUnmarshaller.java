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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeScheduleCapacityReservationDemandResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeScheduleCapacityReservationDemandResponseUnmarshaller {

	public static OpsDescribeScheduleCapacityReservationDemandResponse unmarshall(OpsDescribeScheduleCapacityReservationDemandResponse opsDescribeScheduleCapacityReservationDemandResponse, UnmarshallerContext _ctx) {
		
		opsDescribeScheduleCapacityReservationDemandResponse.setRequestId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.RequestId"));
		opsDescribeScheduleCapacityReservationDemandResponse.setStatus(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.Status"));
		opsDescribeScheduleCapacityReservationDemandResponse.setKeyComponentCounts(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.KeyComponentCounts"));
		opsDescribeScheduleCapacityReservationDemandResponse.setDescription(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.Description"));
		opsDescribeScheduleCapacityReservationDemandResponse.setMatchCriteria(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.MatchCriteria"));
		opsDescribeScheduleCapacityReservationDemandResponse.setCouponId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.CouponId"));
		opsDescribeScheduleCapacityReservationDemandResponse.setInstanceChargeType(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.InstanceChargeType"));
		opsDescribeScheduleCapacityReservationDemandResponse.setCouponType(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.CouponType"));
		opsDescribeScheduleCapacityReservationDemandResponse.setStartTime(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.StartTime"));
		opsDescribeScheduleCapacityReservationDemandResponse.setProductType(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.ProductType"));
		opsDescribeScheduleCapacityReservationDemandResponse.setDemandId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.DemandId"));
		opsDescribeScheduleCapacityReservationDemandResponse.setCouponAuto(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.CouponAuto"));
		opsDescribeScheduleCapacityReservationDemandResponse.setKeyComponentNames(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.KeyComponentNames"));
		opsDescribeScheduleCapacityReservationDemandResponse.setNeedConfirm(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.NeedConfirm"));
		opsDescribeScheduleCapacityReservationDemandResponse.setGmtExpired(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.GmtExpired"));
		opsDescribeScheduleCapacityReservationDemandResponse.setPhoneNumber(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.PhoneNumber"));
		opsDescribeScheduleCapacityReservationDemandResponse.setIzIds(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.IzIds"));
		opsDescribeScheduleCapacityReservationDemandResponse.setRegionId(_ctx.longValue("OpsDescribeScheduleCapacityReservationDemandResponse.RegionId"));
		opsDescribeScheduleCapacityReservationDemandResponse.setInstanceTypes(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.InstanceTypes"));
		opsDescribeScheduleCapacityReservationDemandResponse.setCouponParam(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.CouponParam"));
		opsDescribeScheduleCapacityReservationDemandResponse.setAliUid(_ctx.longValue("OpsDescribeScheduleCapacityReservationDemandResponse.AliUid"));

		List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels = new ArrayList<EcsAcrDemandPlanModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels.Length"); i++) {
			EcsAcrDemandPlanModel ecsAcrDemandPlanModel = new EcsAcrDemandPlanModel();
			ecsAcrDemandPlanModel.setMatchCriteria(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].MatchCriteria"));
			ecsAcrDemandPlanModel.setStatus(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].Status"));
			ecsAcrDemandPlanModel.setOnlineAmount(_ctx.longValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].OnlineAmount"));
			ecsAcrDemandPlanModel.setIzId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].IzId"));
			ecsAcrDemandPlanModel.setDemandId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].DemandId"));
			ecsAcrDemandPlanModel.setApproveCode(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].ApproveCode"));
			ecsAcrDemandPlanModel.setCrId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].CrId"));
			ecsAcrDemandPlanModel.setInstanceType(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].InstanceType"));
			ecsAcrDemandPlanModel.setPlanId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].PlanId"));
			ecsAcrDemandPlanModel.setInstanceAmount(_ctx.longValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].InstanceAmount"));
			ecsAcrDemandPlanModel.setApproveNotes(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].ApproveNotes"));
			ecsAcrDemandPlanModel.setOfflineAmount(_ctx.longValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].OfflineAmount"));
			ecsAcrDemandPlanModel.setPackageId(_ctx.stringValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].PackageId"));
			ecsAcrDemandPlanModel.setPlanType(_ctx.integerValue("OpsDescribeScheduleCapacityReservationDemandResponse.EcsAcrDemandPlanModels["+ i +"].PlanType"));

			ecsAcrDemandPlanModels.add(ecsAcrDemandPlanModel);
		}
		opsDescribeScheduleCapacityReservationDemandResponse.setEcsAcrDemandPlanModels(ecsAcrDemandPlanModels);
	 
	 	return opsDescribeScheduleCapacityReservationDemandResponse;
	}
}