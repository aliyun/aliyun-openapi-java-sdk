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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandsResponse.DemandOrders;
import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandsResponse.DemandOrders.CapacityReservations;
import com.aliyuncs.ecs.model.v20160314.DescribeReservationDemandsResponse.DemandOrders.CapacityReservations1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservationDemandsResponseUnmarshaller {

	public static DescribeReservationDemandsResponse unmarshall(DescribeReservationDemandsResponse describeReservationDemandsResponse, UnmarshallerContext _ctx) {
		
		describeReservationDemandsResponse.setRequestId(_ctx.stringValue("DescribeReservationDemandsResponse.RequestId"));
		describeReservationDemandsResponse.setTotalCount(_ctx.integerValue("DescribeReservationDemandsResponse.TotalCount"));
		describeReservationDemandsResponse.setNextToken(_ctx.stringValue("DescribeReservationDemandsResponse.NextToken"));

		List<DemandOrders> data = new ArrayList<DemandOrders>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservationDemandsResponse.Data.Length"); i++) {
			DemandOrders demandOrders = new DemandOrders();
			demandOrders.setStatus(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].Status"));
			demandOrders.setSavingPlanDescription(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanDescription"));
			demandOrders.setDemandId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].DemandId"));
			demandOrders.setReservedInstanceDescription(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservedInstanceDescription"));
			demandOrders.setSavingPlanId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanId"));
			demandOrders.setSavingPlanSavingType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanSavingType"));
			demandOrders.setSavingPlanPayMode(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanPayMode"));
			demandOrders.setCouponAuto(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].CouponAuto"));
			demandOrders.setZoneIds(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ZoneIds"));
			demandOrders.setName(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].Name"));
			demandOrders.setDescription(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].Description"));
			demandOrders.setPlatform(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].Platform"));
			demandOrders.setReservedInstanceOfferingType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservedInstanceOfferingType"));
			demandOrders.setSavingPlanName(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanName"));
			demandOrders.setInstanceCpuCoreCount(_ctx.integerValue("DescribeReservationDemandsResponse.Data["+ i +"].InstanceCpuCoreCount"));
			demandOrders.setMatchCriteria(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].MatchCriteria"));
			demandOrders.setSavingPlanHourFee(_ctx.floatValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanHourFee"));
			demandOrders.setReservedInstanceName(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservedInstanceName"));
			demandOrders.setSavingPlanInstanceTypeFamilyGroup(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanInstanceTypeFamilyGroup"));
			demandOrders.setSavingPlanSpecType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].SavingPlanSpecType"));
			demandOrders.setReservedInstanceId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservedInstanceId"));
			demandOrders.setConfirmType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ConfirmType"));
			demandOrders.setCouponType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].CouponType"));
			demandOrders.setRegionId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RegionId"));
			demandOrders.setPeriod(_ctx.integerValue("DescribeReservationDemandsResponse.Data["+ i +"].Period"));
			demandOrders.setInstanceChargeType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].InstanceChargeType"));
			demandOrders.setStartTime(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].StartTime"));
			demandOrders.setProductType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ProductType"));
			demandOrders.setResourceSupplyType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ResourceSupplyType"));
			demandOrders.setPeriodUnit(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].PeriodUnit"));
			demandOrders.setInstanceTypes(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].InstanceTypes"));
			demandOrders.setPhoneNumber(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].PhoneNumber"));

			List<CapacityReservations> reservationResource = new ArrayList<CapacityReservations>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource.Length"); j++) {
				CapacityReservations capacityReservations = new CapacityReservations();
				capacityReservations.setMatchCriteria(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].MatchCriteria"));
				capacityReservations.setStatus(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].Status"));
				capacityReservations.setPrivatePoolOptionsId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].PrivatePoolOptionsId"));
				capacityReservations.setApproveCode(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].ApproveCode"));
				capacityReservations.setZoneId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].ZoneId"));
				capacityReservations.setInstanceType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].InstanceType"));
				capacityReservations.setPlanId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].PlanId"));
				capacityReservations.setInstanceAmount(_ctx.integerValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].InstanceAmount"));
				capacityReservations.setApproveNotes(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].ApproveNotes"));
				capacityReservations.setStartTime(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].ReservationResource["+ j +"].StartTime"));

				reservationResource.add(capacityReservations);
			}
			demandOrders.setReservationResource(reservationResource);

			List<CapacityReservations1> recommendResource = new ArrayList<CapacityReservations1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource.Length"); j++) {
				CapacityReservations1 capacityReservations1 = new CapacityReservations1();
				capacityReservations1.setMatchCriteria(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].MatchCriteria"));
				capacityReservations1.setStatus(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].Status"));
				capacityReservations1.setPrivatePoolOptionsId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].PrivatePoolOptionsId"));
				capacityReservations1.setZoneId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].ZoneId"));
				capacityReservations1.setInstanceType(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].InstanceType"));
				capacityReservations1.setPlanId(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].PlanId"));
				capacityReservations1.setInstanceAmount(_ctx.integerValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].InstanceAmount"));
				capacityReservations1.setStartTime(_ctx.stringValue("DescribeReservationDemandsResponse.Data["+ i +"].RecommendResource["+ j +"].StartTime"));

				recommendResource.add(capacityReservations1);
			}
			demandOrders.setRecommendResource(recommendResource);

			data.add(demandOrders);
		}
		describeReservationDemandsResponse.setData(data);
	 
	 	return describeReservationDemandsResponse;
	}
}