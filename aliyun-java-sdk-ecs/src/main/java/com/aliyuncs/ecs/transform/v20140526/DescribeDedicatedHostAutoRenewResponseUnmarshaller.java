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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDedicatedHostAutoRenewResponseUnmarshaller {

	public static DescribeDedicatedHostAutoRenewResponse unmarshall(DescribeDedicatedHostAutoRenewResponse describeDedicatedHostAutoRenewResponse, UnmarshallerContext context) {
		
		describeDedicatedHostAutoRenewResponse.setRequestId(context.stringValue("DescribeDedicatedHostAutoRenewResponse.RequestId"));

		List<DedicatedHostRenewAttribute> dedicatedHostRenewAttributes = new ArrayList<DedicatedHostRenewAttribute>();
		for (int i = 0; i < context.lengthValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes.Length"); i++) {
			DedicatedHostRenewAttribute dedicatedHostRenewAttribute = new DedicatedHostRenewAttribute();
			dedicatedHostRenewAttribute.setDedicatedHostId(context.stringValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes["+ i +"].DedicatedHostId"));
			dedicatedHostRenewAttribute.setAutoRenewEnabled(context.booleanValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes["+ i +"].AutoRenewEnabled"));
			dedicatedHostRenewAttribute.setDuration(context.integerValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes["+ i +"].Duration"));
			dedicatedHostRenewAttribute.setPeriodUnit(context.stringValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes["+ i +"].PeriodUnit"));
			dedicatedHostRenewAttribute.setRenewalStatus(context.stringValue("DescribeDedicatedHostAutoRenewResponse.DedicatedHostRenewAttributes["+ i +"].RenewalStatus"));

			dedicatedHostRenewAttributes.add(dedicatedHostRenewAttribute);
		}
		describeDedicatedHostAutoRenewResponse.setDedicatedHostRenewAttributes(dedicatedHostRenewAttributes);
	 
	 	return describeDedicatedHostAutoRenewResponse;
	}
}