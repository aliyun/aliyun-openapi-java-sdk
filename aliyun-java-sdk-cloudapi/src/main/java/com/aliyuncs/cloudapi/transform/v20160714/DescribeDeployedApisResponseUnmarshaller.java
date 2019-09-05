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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDeployedApisResponse.DeployedApiItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeployedApisResponseUnmarshaller {

	public static DescribeDeployedApisResponse unmarshall(DescribeDeployedApisResponse describeDeployedApisResponse, UnmarshallerContext _ctx) {
		
		describeDeployedApisResponse.setRequestId(_ctx.stringValue("DescribeDeployedApisResponse.RequestId"));
		describeDeployedApisResponse.setTotalCount(_ctx.integerValue("DescribeDeployedApisResponse.TotalCount"));
		describeDeployedApisResponse.setPageSize(_ctx.integerValue("DescribeDeployedApisResponse.PageSize"));
		describeDeployedApisResponse.setPageNumber(_ctx.integerValue("DescribeDeployedApisResponse.PageNumber"));

		List<DeployedApiItem> deployedApis = new ArrayList<DeployedApiItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApisResponse.DeployedApis.Length"); i++) {
			DeployedApiItem deployedApiItem = new DeployedApiItem();
			deployedApiItem.setRegionId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].RegionId"));
			deployedApiItem.setApiId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiId"));
			deployedApiItem.setApiName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiName"));
			deployedApiItem.setGroupId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupId"));
			deployedApiItem.setGroupName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupName"));
			deployedApiItem.setStageName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].StageName"));
			deployedApiItem.setVisibility(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Visibility"));
			deployedApiItem.setDescription(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Description"));
			deployedApiItem.setDeployedTime(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].DeployedTime"));

			deployedApis.add(deployedApiItem);
		}
		describeDeployedApisResponse.setDeployedApis(deployedApis);
	 
	 	return describeDeployedApisResponse;
	}
}