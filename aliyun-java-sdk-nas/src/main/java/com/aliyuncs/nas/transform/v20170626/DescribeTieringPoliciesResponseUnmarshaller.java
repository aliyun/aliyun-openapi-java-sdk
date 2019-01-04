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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTieringPoliciesResponseUnmarshaller {

	public static DescribeTieringPoliciesResponse unmarshall(DescribeTieringPoliciesResponse describeTieringPoliciesResponse, UnmarshallerContext context) {
		
		describeTieringPoliciesResponse.setRequestId(context.stringValue("DescribeTieringPoliciesResponse.RequestId"));
		describeTieringPoliciesResponse.setTotalCount(context.integerValue("DescribeTieringPoliciesResponse.TotalCount"));
		describeTieringPoliciesResponse.setPageSize(context.integerValue("DescribeTieringPoliciesResponse.PageSize"));
		describeTieringPoliciesResponse.setPageNumber(context.integerValue("DescribeTieringPoliciesResponse.PageNumber"));

		List<TieringPolicy> tieringPolicies = new ArrayList<TieringPolicy>();
		for (int i = 0; i < context.lengthValue("DescribeTieringPoliciesResponse.TieringPolicies.Length"); i++) {
			TieringPolicy tieringPolicy = new TieringPolicy();
			tieringPolicy.setName(context.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Name"));
			tieringPolicy.setDescription(context.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Description"));
			tieringPolicy.setRefCount(context.integerValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].RefCount"));
			tieringPolicy.setMtime(context.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Mtime"));
			tieringPolicy.setAtime(context.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Atime"));
			tieringPolicy.setCtime(context.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Ctime"));
			tieringPolicy.setSize(context.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].Size"));
			tieringPolicy.setFileName(context.stringValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].FileName"));
			tieringPolicy.setRecallTime(context.longValue("DescribeTieringPoliciesResponse.TieringPolicies["+ i +"].RecallTime"));

			tieringPolicies.add(tieringPolicy);
		}
		describeTieringPoliciesResponse.setTieringPolicies(tieringPolicies);
	 
	 	return describeTieringPoliciesResponse;
	}
}