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

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeCapacityReservationPackageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeCapacityReservationPackageResponseUnmarshaller {

	public static OpsDescribeCapacityReservationPackageResponse unmarshall(OpsDescribeCapacityReservationPackageResponse opsDescribeCapacityReservationPackageResponse, UnmarshallerContext _ctx) {
		
		opsDescribeCapacityReservationPackageResponse.setRequestId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RequestId"));
		opsDescribeCapacityReservationPackageResponse.setId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.Id"));
		opsDescribeCapacityReservationPackageResponse.setBid(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Bid"));
		opsDescribeCapacityReservationPackageResponse.setAliUid(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.AliUid"));
		opsDescribeCapacityReservationPackageResponse.setCapacityReservationId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.CapacityReservationId"));
		opsDescribeCapacityReservationPackageResponse.setCapacityReservationName(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.CapacityReservationName"));
		opsDescribeCapacityReservationPackageResponse.setPackageId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageId"));
		opsDescribeCapacityReservationPackageResponse.setPackageName(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageName"));
		opsDescribeCapacityReservationPackageResponse.setPackageStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageStatus"));
		opsDescribeCapacityReservationPackageResponse.setPackageType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageType"));
		opsDescribeCapacityReservationPackageResponse.setPackageMatchCriteria(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageMatchCriteria"));
		opsDescribeCapacityReservationPackageResponse.setPackageChargeType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageChargeType"));
		opsDescribeCapacityReservationPackageResponse.setPackageTotalAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageTotalAmount"));
		opsDescribeCapacityReservationPackageResponse.setPackageUsedAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageUsedAmount"));
		opsDescribeCapacityReservationPackageResponse.setPackageTotalTimes(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageTotalTimes"));
		opsDescribeCapacityReservationPackageResponse.setPackageUsedTimes(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageUsedTimes"));
		opsDescribeCapacityReservationPackageResponse.setPackageStartTime(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageStartTime"));
		opsDescribeCapacityReservationPackageResponse.setPackageEndTime(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageEndTime"));
		opsDescribeCapacityReservationPackageResponse.setRegionNo(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RegionNo"));
		opsDescribeCapacityReservationPackageResponse.setIzNo(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.IzNo"));
		opsDescribeCapacityReservationPackageResponse.setInstanceType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceType"));
		opsDescribeCapacityReservationPackageResponse.setPlatform(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Platform"));
		opsDescribeCapacityReservationPackageResponse.setAvailableAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.AvailableAmount"));
		opsDescribeCapacityReservationPackageResponse.setTotalAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.TotalAmount"));
		opsDescribeCapacityReservationPackageResponse.setNetworkType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.NetworkType"));
		opsDescribeCapacityReservationPackageResponse.setStartDate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.StartDate"));
		opsDescribeCapacityReservationPackageResponse.setEndDate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.EndDate"));
		opsDescribeCapacityReservationPackageResponse.setEndDateType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.EndDateType"));
		opsDescribeCapacityReservationPackageResponse.setInstanceMatchCriteria(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceMatchCriteria"));
		opsDescribeCapacityReservationPackageResponse.setFrequency(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Frequency"));
		opsDescribeCapacityReservationPackageResponse.setFrequencyInterval(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.FrequencyInterval"));
		opsDescribeCapacityReservationPackageResponse.setOccurrenceDays(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.OccurrenceDays"));
		opsDescribeCapacityReservationPackageResponse.setTimeSlot(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.TimeSlot"));
		opsDescribeCapacityReservationPackageResponse.setBusinessStatus(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.BusinessStatus"));
		opsDescribeCapacityReservationPackageResponse.setGmtRelease(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtRelease"));
		opsDescribeCapacityReservationPackageResponse.setDescription(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Description"));
		opsDescribeCapacityReservationPackageResponse.setRiId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RiId"));
		opsDescribeCapacityReservationPackageResponse.setRiStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RiStatus"));
		opsDescribeCapacityReservationPackageResponse.setRegionId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.RegionId"));
		opsDescribeCapacityReservationPackageResponse.setIzId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.IzId"));
		opsDescribeCapacityReservationPackageResponse.setType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Type"));
		opsDescribeCapacityReservationPackageResponse.setInstanceId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceId"));
		opsDescribeCapacityReservationPackageResponse.setStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Status"));
		opsDescribeCapacityReservationPackageResponse.setGmtCreate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtCreate"));
		opsDescribeCapacityReservationPackageResponse.setGmtModified(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtModified"));
	 
	 	return opsDescribeCapacityReservationPackageResponse;
	}
}