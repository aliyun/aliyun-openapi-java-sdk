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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribePolicyBasedRoutingsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribePolicyBasedRoutingsResponse.PolicyBasedRouting;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyBasedRoutingsResponseUnmarshaller {

	public static DescribePolicyBasedRoutingsResponse unmarshall(DescribePolicyBasedRoutingsResponse describePolicyBasedRoutingsResponse, UnmarshallerContext _ctx) {
		
		describePolicyBasedRoutingsResponse.setRequestId(_ctx.stringValue("DescribePolicyBasedRoutingsResponse.RequestId"));
		describePolicyBasedRoutingsResponse.setTotalCount(_ctx.integerValue("DescribePolicyBasedRoutingsResponse.TotalCount"));
		describePolicyBasedRoutingsResponse.setPageNumber(_ctx.integerValue("DescribePolicyBasedRoutingsResponse.PageNumber"));
		describePolicyBasedRoutingsResponse.setPageSize(_ctx.integerValue("DescribePolicyBasedRoutingsResponse.PageSize"));

		List<PolicyBasedRouting> policyBasedRoutings = new ArrayList<PolicyBasedRouting>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyBasedRoutingsResponse.PolicyBasedRoutings.Length"); i++) {
			PolicyBasedRouting policyBasedRouting = new PolicyBasedRouting();
			policyBasedRouting.setPbrInstanceId(_ctx.stringValue("DescribePolicyBasedRoutingsResponse.PolicyBasedRoutings["+ i +"].PbrInstanceId"));
			policyBasedRouting.setPriority(_ctx.integerValue("DescribePolicyBasedRoutingsResponse.PolicyBasedRoutings["+ i +"].Priority"));
			policyBasedRouting.setName(_ctx.stringValue("DescribePolicyBasedRoutingsResponse.PolicyBasedRoutings["+ i +"].Name"));
			policyBasedRouting.setDescription(_ctx.stringValue("DescribePolicyBasedRoutingsResponse.PolicyBasedRoutings["+ i +"].Description"));

			policyBasedRoutings.add(policyBasedRouting);
		}
		describePolicyBasedRoutingsResponse.setPolicyBasedRoutings(policyBasedRoutings);
	 
	 	return describePolicyBasedRoutingsResponse;
	}
}