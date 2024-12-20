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

package com.aliyuncs.ecs.transform.v20140526;

import com.aliyuncs.ecs.model.v20140526.DescribeSavingsPlanEstimationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSavingsPlanEstimationResponseUnmarshaller {

	public static DescribeSavingsPlanEstimationResponse unmarshall(DescribeSavingsPlanEstimationResponse describeSavingsPlanEstimationResponse, UnmarshallerContext _ctx) {
		
		describeSavingsPlanEstimationResponse.setRequestId(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.RequestId"));
		describeSavingsPlanEstimationResponse.setResourceId(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.ResourceId"));
		describeSavingsPlanEstimationResponse.setInstanceTypeFamily(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.InstanceTypeFamily"));
		describeSavingsPlanEstimationResponse.setCommittedAmount(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.CommittedAmount"));
		describeSavingsPlanEstimationResponse.setCurrency(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.Currency"));
		describeSavingsPlanEstimationResponse.setOfferingType(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.OfferingType"));
		describeSavingsPlanEstimationResponse.setPeriodUnit(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.PeriodUnit"));
		describeSavingsPlanEstimationResponse.setPeriod(_ctx.integerValue("DescribeSavingsPlanEstimationResponse.Period"));
		describeSavingsPlanEstimationResponse.setPlanType(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.PlanType"));
		describeSavingsPlanEstimationResponse.setInstanceTypeFamilyGroup(_ctx.stringValue("DescribeSavingsPlanEstimationResponse.InstanceTypeFamilyGroup"));
	 
	 	return describeSavingsPlanEstimationResponse;
	}
}