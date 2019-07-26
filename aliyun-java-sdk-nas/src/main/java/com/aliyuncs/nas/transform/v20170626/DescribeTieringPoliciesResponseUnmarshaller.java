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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeTieringPoliciesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeTieringPoliciesResponse.TieringPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTieringPoliciesResponseUnmarshaller {

	public static DescribeTieringPoliciesResponse unmarshall(DescribeTieringPoliciesResponse describeTieringPoliciesResponse, UnmarshallerContext _ctx) {
		
		describeTieringPoliciesResponse.setRequestId(_ctx.stringValue("DescribeTieringPoliciesResponse.RequestId"));
		describeTieringPoliciesResponse.setTotalCount(_ctx.integerValue("DescribeTieringPoliciesResponse.TotalCount"));
		describeTieringPoliciesResponse.setPageSize(_ctx.integerValue("DescribeTieringPoliciesResponse.PageSize"));
		describeTieringPoliciesResponse.setPageNumber(_ctx.integerValue("DescribeTieringPoliciesResponse.PageNumber"));

		List<TieringPolicy> tieringPolicies = new ArrayList<TieringPolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTieringPoliciesResponse.TieringPolicies.Length"); i++) {
			TieringPolicy tieringPolicy = new TieringPolicy();
			tieringPolicy.setName(_ctx.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Name"));
			tieringPolicy.setDescription(_ctx.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Description"));
			tieringPolicy.setRefCount(_ctx.integerValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].RefCount"));
			tieringPolicy.setMtime(_ctx.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Mtime"));
			tieringPolicy.setAtime(_ctx.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Atime"));
			tieringPolicy.setCtime(_ctx.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Ctime"));
			tieringPolicy.setSize(_ctx.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Size"));
			tieringPolicy.setFileName(_ctx.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].FileName"));
			tieringPolicy.setRecallTime(_ctx.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].RecallTime"));

			tieringPolicies.add(tieringPolicy);
		}
		describeTieringPoliciesResponse.setTieringPolicies(tieringPolicies);
	 
	 	return describeTieringPoliciesResponse;
	}
}