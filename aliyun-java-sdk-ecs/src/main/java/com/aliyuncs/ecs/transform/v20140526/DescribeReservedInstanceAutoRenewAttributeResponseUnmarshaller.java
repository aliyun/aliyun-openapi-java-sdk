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

import com.aliyuncs.ecs.model.v20140526.DescribeReservedInstanceAutoRenewAttributeResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReservedInstanceAutoRenewAttributeResponseUnmarshaller {

	public static DescribeReservedInstanceAutoRenewAttributeResponse unmarshall(DescribeReservedInstanceAutoRenewAttributeResponse describeReservedInstanceAutoRenewAttributeResponse, UnmarshallerContext _ctx) {
		
		describeReservedInstanceAutoRenewAttributeResponse.setRequestId(_ctx.stringValue("DescribeReservedInstanceAutoRenewAttributeResponse.RequestId"));

		List<ReservedInstanceRenewAttribute> reservedInstanceRenewAttributes = new ArrayList<ReservedInstanceRenewAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttributes.Length"); i++) {
			ReservedInstanceRenewAttribute reservedInstanceRenewAttribute = new ReservedInstanceRenewAttribute();
			reservedInstanceRenewAttribute.setPeriodUnit(_ctx.stringValue("DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttributes["+ i +"].PeriodUnit"));
			reservedInstanceRenewAttribute.setDuration(_ctx.integerValue("DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttributes["+ i +"].Duration"));
			reservedInstanceRenewAttribute.setReservedInstanceId(_ctx.stringValue("DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttributes["+ i +"].ReservedInstanceId"));
			reservedInstanceRenewAttribute.setRenewalStatus(_ctx.stringValue("DescribeReservedInstanceAutoRenewAttributeResponse.ReservedInstanceRenewAttributes["+ i +"].RenewalStatus"));

			reservedInstanceRenewAttributes.add(reservedInstanceRenewAttribute);
		}
		describeReservedInstanceAutoRenewAttributeResponse.setReservedInstanceRenewAttributes(reservedInstanceRenewAttributes);
	 
	 	return describeReservedInstanceAutoRenewAttributeResponse;
	}
}