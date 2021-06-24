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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeaturePriorityResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeFeaturePriorityResponse.FeaturePriority;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeFeaturePriorityResponseUnmarshaller {

	public static OpsDescribeFeaturePriorityResponse unmarshall(OpsDescribeFeaturePriorityResponse opsDescribeFeaturePriorityResponse, UnmarshallerContext _ctx) {
		
		opsDescribeFeaturePriorityResponse.setRequestId(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.RequestId"));
		opsDescribeFeaturePriorityResponse.setTotalCount(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.TotalCount"));
		opsDescribeFeaturePriorityResponse.setPageSize(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.PageSize"));
		opsDescribeFeaturePriorityResponse.setPage(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.Page"));
		opsDescribeFeaturePriorityResponse.setCount(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.Count"));

		List<FeaturePriority> featurePriorities = new ArrayList<FeaturePriority>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities.Length"); i++) {
			FeaturePriority featurePriority = new FeaturePriority();
			featurePriority.setPriorityLevel(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].PriorityLevel"));
			featurePriority.setCreateUserName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].CreateUserName"));
			featurePriority.setFeatureName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].FeatureName"));
			featurePriority.setGmtCreate(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].GmtCreate"));
			featurePriority.setDeleted(_ctx.booleanValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].Deleted"));
			featurePriority.setGmtModified(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].GmtModified"));
			featurePriority.setLastModifiedUserName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].LastModifiedUserName"));
			featurePriority.setProblemClassification(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].ProblemClassification"));

			featurePriorities.add(featurePriority);
		}
		opsDescribeFeaturePriorityResponse.setFeaturePriorities(featurePriorities);
	 
	 	return opsDescribeFeaturePriorityResponse;
	}
}