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

import com.aliyuncs.ecsops.model.v20160401.OpsBatchCreateScheduleCapacityReservationPlanResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsBatchCreateScheduleCapacityReservationPlanResponseUnmarshaller {

	public static OpsBatchCreateScheduleCapacityReservationPlanResponse unmarshall(OpsBatchCreateScheduleCapacityReservationPlanResponse opsBatchCreateScheduleCapacityReservationPlanResponse, UnmarshallerContext _ctx) {
		
		opsBatchCreateScheduleCapacityReservationPlanResponse.setRequestId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.RequestId"));

		List<EcsAcrDemandPlanModel> ecsAcrDemandPlanModels = new ArrayList<EcsAcrDemandPlanModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels.Length"); i++) {
			EcsAcrDemandPlanModel ecsAcrDemandPlanModel = new EcsAcrDemandPlanModel();
			ecsAcrDemandPlanModel.setMatchCriteria(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].MatchCriteria"));
			ecsAcrDemandPlanModel.setStatus(_ctx.integerValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].Status"));
			ecsAcrDemandPlanModel.setOnlineAmount(_ctx.longValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].OnlineAmount"));
			ecsAcrDemandPlanModel.setIzId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].IzId"));
			ecsAcrDemandPlanModel.setDemandId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].DemandId"));
			ecsAcrDemandPlanModel.setApproveCode(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].ApproveCode"));
			ecsAcrDemandPlanModel.setCrId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].CrId"));
			ecsAcrDemandPlanModel.setInstanceType(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].InstanceType"));
			ecsAcrDemandPlanModel.setPlanId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].PlanId"));
			ecsAcrDemandPlanModel.setInstanceAmount(_ctx.longValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].InstanceAmount"));
			ecsAcrDemandPlanModel.setOfflineAmount(_ctx.longValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].OfflineAmount"));
			ecsAcrDemandPlanModel.setApproveNotes(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].ApproveNotes"));
			ecsAcrDemandPlanModel.setPackageId(_ctx.stringValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].PackageId"));
			ecsAcrDemandPlanModel.setPlanType(_ctx.integerValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].PlanType"));
			ecsAcrDemandPlanModel.setVersion(_ctx.longValue("OpsBatchCreateScheduleCapacityReservationPlanResponse.EcsAcrDemandPlanModels["+ i +"].Version"));

			ecsAcrDemandPlanModels.add(ecsAcrDemandPlanModel);
		}
		opsBatchCreateScheduleCapacityReservationPlanResponse.setEcsAcrDemandPlanModels(ecsAcrDemandPlanModels);
	 
	 	return opsBatchCreateScheduleCapacityReservationPlanResponse;
	}
}