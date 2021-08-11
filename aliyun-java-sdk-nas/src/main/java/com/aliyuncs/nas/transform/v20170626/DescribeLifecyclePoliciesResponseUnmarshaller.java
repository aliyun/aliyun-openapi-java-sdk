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

import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePoliciesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePoliciesResponse.LifecyclePolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecyclePoliciesResponseUnmarshaller {

	public static DescribeLifecyclePoliciesResponse unmarshall(DescribeLifecyclePoliciesResponse describeLifecyclePoliciesResponse, UnmarshallerContext _ctx) {
		
		describeLifecyclePoliciesResponse.setRequestId(_ctx.stringValue("DescribeLifecyclePoliciesResponse.RequestId"));
		describeLifecyclePoliciesResponse.setTotalCount(_ctx.integerValue("DescribeLifecyclePoliciesResponse.TotalCount"));
		describeLifecyclePoliciesResponse.setPageSize(_ctx.integerValue("DescribeLifecyclePoliciesResponse.PageSize"));
		describeLifecyclePoliciesResponse.setPageNumber(_ctx.integerValue("DescribeLifecyclePoliciesResponse.PageNumber"));

		List<LifecyclePolicy> lifecyclePolicies = new ArrayList<LifecyclePolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies.Length"); i++) {
			LifecyclePolicy lifecyclePolicy = new LifecyclePolicy();
			lifecyclePolicy.setPath(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Path"));
			lifecyclePolicy.setLifecyclePolicyName(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecyclePolicyName"));
			lifecyclePolicy.setStorageType(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].StorageType"));
			lifecyclePolicy.setLifecycleRuleName(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecycleRuleName"));
			lifecyclePolicy.setCreateTime(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].CreateTime"));
			lifecyclePolicy.setFileSystemId(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].FileSystemId"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Paths["+ j +"]"));
			}
			lifecyclePolicy.setPaths(paths);

			lifecyclePolicies.add(lifecyclePolicy);
		}
		describeLifecyclePoliciesResponse.setLifecyclePolicies(lifecyclePolicies);
	 
	 	return describeLifecyclePoliciesResponse;
	}
}