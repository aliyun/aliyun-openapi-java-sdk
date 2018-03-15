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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainMonthBillingBpsDataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainMonthBillingBpsDataResponseUnmarshaller {

	public static DescribeDomainMonthBillingBpsDataResponse unmarshall(DescribeDomainMonthBillingBpsDataResponse describeDomainMonthBillingBpsDataResponse, UnmarshallerContext context) {
		
		describeDomainMonthBillingBpsDataResponse.setRequestId(context.stringValue("DescribeDomainMonthBillingBpsDataResponse.RequestId"));
		describeDomainMonthBillingBpsDataResponse.setDomainName(context.stringValue("DescribeDomainMonthBillingBpsDataResponse.DomainName"));
		describeDomainMonthBillingBpsDataResponse.setStartTime(context.stringValue("DescribeDomainMonthBillingBpsDataResponse.StartTime"));
		describeDomainMonthBillingBpsDataResponse.setEndTime(context.stringValue("DescribeDomainMonthBillingBpsDataResponse.EndTime"));
		describeDomainMonthBillingBpsDataResponse.setBandwidth95Bps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.Bandwidth95Bps"));
		describeDomainMonthBillingBpsDataResponse.setDomesticBandwidth95Bps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.DomesticBandwidth95Bps"));
		describeDomainMonthBillingBpsDataResponse.setOverseasBandwidth95Bps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.OverseasBandwidth95Bps"));
		describeDomainMonthBillingBpsDataResponse.setMonthavgBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.MonthavgBps"));
		describeDomainMonthBillingBpsDataResponse.setDomesticMonthavgBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.DomesticMonthavgBps"));
		describeDomainMonthBillingBpsDataResponse.setOverseasMonthavgBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.OverseasMonthavgBps"));
		describeDomainMonthBillingBpsDataResponse.setMonth4thBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.Month4thBps"));
		describeDomainMonthBillingBpsDataResponse.setDomesticMonth4thBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.DomesticMonth4thBps"));
		describeDomainMonthBillingBpsDataResponse.setOverseasMonth4thBps(context.floatValue("DescribeDomainMonthBillingBpsDataResponse.OverseasMonth4thBps"));
	 
	 	return describeDomainMonthBillingBpsDataResponse;
	}
}