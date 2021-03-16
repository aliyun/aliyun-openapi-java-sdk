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
		opsDescribeFeaturePriorityResponse.setPage(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.Page"));
		opsDescribeFeaturePriorityResponse.setPageSize(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.PageSize"));
		opsDescribeFeaturePriorityResponse.setTotalCount(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.TotalCount"));
		opsDescribeFeaturePriorityResponse.setCount(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.Count"));

		List<FeaturePriority> featurePriorities = new ArrayList<FeaturePriority>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities.Length"); i++) {
			FeaturePriority featurePriority = new FeaturePriority();
			featurePriority.setGmtCreate(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].GmtCreate"));
			featurePriority.setGmtModified(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].GmtModified"));
			featurePriority.setDeleted(_ctx.booleanValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].Deleted"));
			featurePriority.setProblemClassification(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].ProblemClassification"));
			featurePriority.setFeatureName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].FeatureName"));
			featurePriority.setPriorityLevel(_ctx.integerValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].PriorityLevel"));
			featurePriority.setCreateUserName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].CreateUserName"));
			featurePriority.setLastModifiedUserName(_ctx.stringValue("OpsDescribeFeaturePriorityResponse.FeaturePriorities["+ i +"].LastModifiedUserName"));

			featurePriorities.add(featurePriority);
		}
		opsDescribeFeaturePriorityResponse.setFeaturePriorities(featurePriorities);
	 
	 	return opsDescribeFeaturePriorityResponse;
	}
}