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

import com.aliyuncs.ecs.model.v20160314.DescribeAccountLimitsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeAccountLimitsResponse.AccountLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountLimitsResponseUnmarshaller {

	public static DescribeAccountLimitsResponse unmarshall(DescribeAccountLimitsResponse describeAccountLimitsResponse, UnmarshallerContext _ctx) {
		
		describeAccountLimitsResponse.setRequestId(_ctx.stringValue("DescribeAccountLimitsResponse.RequestId"));

		List<AccountLimit> accountLimitTypeSet = new ArrayList<AccountLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAccountLimitsResponse.AccountLimitTypeSet.Length"); i++) {
			AccountLimit accountLimit = new AccountLimit();
			accountLimit.setLimitName(_ctx.stringValue("DescribeAccountLimitsResponse.AccountLimitTypeSet["+ i +"].LimitName"));

			List<String> limitValueSet = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAccountLimitsResponse.AccountLimitTypeSet["+ i +"].LimitValueSet.Length"); j++) {
				limitValueSet.add(_ctx.stringValue("DescribeAccountLimitsResponse.AccountLimitTypeSet["+ i +"].LimitValueSet["+ j +"]"));
			}
			accountLimit.setLimitValueSet(limitValueSet);

			accountLimitTypeSet.add(accountLimit);
		}
		describeAccountLimitsResponse.setAccountLimitTypeSet(accountLimitTypeSet);
	 
	 	return describeAccountLimitsResponse;
	}
}