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
		opsDescribeCapacityReservationPackageResponse.setEndDateType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.EndDateType"));
		opsDescribeCapacityReservationPackageResponse.setRegionNo(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RegionNo"));
		opsDescribeCapacityReservationPackageResponse.setDescription(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Description"));
		opsDescribeCapacityReservationPackageResponse.setPlatform(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Platform"));
		opsDescribeCapacityReservationPackageResponse.setPackageName(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageName"));
		opsDescribeCapacityReservationPackageResponse.setGmtModified(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtModified"));
		opsDescribeCapacityReservationPackageResponse.setAvailableAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.AvailableAmount"));
		opsDescribeCapacityReservationPackageResponse.setCapacityReservationName(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.CapacityReservationName"));
		opsDescribeCapacityReservationPackageResponse.setTimeSlot(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.TimeSlot"));
		opsDescribeCapacityReservationPackageResponse.setPackageStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageStatus"));
		opsDescribeCapacityReservationPackageResponse.setPackageChargeType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageChargeType"));
		opsDescribeCapacityReservationPackageResponse.setBusinessStatus(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.BusinessStatus"));
		opsDescribeCapacityReservationPackageResponse.setOccurrenceDays(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.OccurrenceDays"));
		opsDescribeCapacityReservationPackageResponse.setPackageTotalTimes(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageTotalTimes"));
		opsDescribeCapacityReservationPackageResponse.setStartDate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.StartDate"));
		opsDescribeCapacityReservationPackageResponse.setIzNo(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.IzNo"));
		opsDescribeCapacityReservationPackageResponse.setFrequencyInterval(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.FrequencyInterval"));
		opsDescribeCapacityReservationPackageResponse.setNetworkType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.NetworkType"));
		opsDescribeCapacityReservationPackageResponse.setPackageTotalAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageTotalAmount"));
		opsDescribeCapacityReservationPackageResponse.setPackageType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageType"));
		opsDescribeCapacityReservationPackageResponse.setBid(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Bid"));
		opsDescribeCapacityReservationPackageResponse.setInstanceType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceType"));
		opsDescribeCapacityReservationPackageResponse.setPackageStartTime(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageStartTime"));
		opsDescribeCapacityReservationPackageResponse.setPackageEndTime(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageEndTime"));
		opsDescribeCapacityReservationPackageResponse.setStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Status"));
		opsDescribeCapacityReservationPackageResponse.setPackageMatchCriteria(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageMatchCriteria"));
		opsDescribeCapacityReservationPackageResponse.setInstanceId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceId"));
		opsDescribeCapacityReservationPackageResponse.setRiStatus(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RiStatus"));
		opsDescribeCapacityReservationPackageResponse.setTotalAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.TotalAmount"));
		opsDescribeCapacityReservationPackageResponse.setEndDate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.EndDate"));
		opsDescribeCapacityReservationPackageResponse.setCapacityReservationId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.CapacityReservationId"));
		opsDescribeCapacityReservationPackageResponse.setIzId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.IzId"));
		opsDescribeCapacityReservationPackageResponse.setType(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Type"));
		opsDescribeCapacityReservationPackageResponse.setGmtCreate(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtCreate"));
		opsDescribeCapacityReservationPackageResponse.setRiId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.RiId"));
		opsDescribeCapacityReservationPackageResponse.setFrequency(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.Frequency"));
		opsDescribeCapacityReservationPackageResponse.setPackageUsedTimes(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageUsedTimes"));
		opsDescribeCapacityReservationPackageResponse.setGmtRelease(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.GmtRelease"));
		opsDescribeCapacityReservationPackageResponse.setPackageId(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.PackageId"));
		opsDescribeCapacityReservationPackageResponse.setRegionId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.RegionId"));
		opsDescribeCapacityReservationPackageResponse.setId(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.Id"));
		opsDescribeCapacityReservationPackageResponse.setInstanceMatchCriteria(_ctx.stringValue("OpsDescribeCapacityReservationPackageResponse.InstanceMatchCriteria"));
		opsDescribeCapacityReservationPackageResponse.setPackageUsedAmount(_ctx.integerValue("OpsDescribeCapacityReservationPackageResponse.PackageUsedAmount"));
		opsDescribeCapacityReservationPackageResponse.setAliUid(_ctx.longValue("OpsDescribeCapacityReservationPackageResponse.AliUid"));
	 
	 	return opsDescribeCapacityReservationPackageResponse;
	}
}