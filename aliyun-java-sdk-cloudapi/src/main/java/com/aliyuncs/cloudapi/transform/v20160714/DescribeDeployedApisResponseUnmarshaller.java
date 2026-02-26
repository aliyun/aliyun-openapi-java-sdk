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
		describeDeployedApisResponse.setPageNumber(_ctx.integerValue("DescribeDeployedApisResponse.PageNumber"));
		describeDeployedApisResponse.setPageSize(_ctx.integerValue("DescribeDeployedApisResponse.PageSize"));
		describeDeployedApisResponse.setTotalCount(_ctx.integerValue("DescribeDeployedApisResponse.TotalCount"));

		List<DeployedApiItem> deployedApis = new ArrayList<DeployedApiItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeployedApisResponse.DeployedApis.Length"); i++) {
			DeployedApiItem deployedApiItem = new DeployedApiItem();
			deployedApiItem.setVisibility(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Visibility"));
			deployedApiItem.setApiId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiId"));
			deployedApiItem.setDescription(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].Description"));
			deployedApiItem.setGroupName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupName"));
			deployedApiItem.setGroupId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].GroupId"));
			deployedApiItem.setDeployedTime(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].DeployedTime"));
			deployedApiItem.setStageName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].StageName"));
			deployedApiItem.setApiName(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiName"));
			deployedApiItem.setRegionId(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].RegionId"));
			deployedApiItem.setApiPath(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiPath"));
			deployedApiItem.setApiMethod(_ctx.stringValue("DescribeDeployedApisResponse.DeployedApis["+ i +"].ApiMethod"));

			deployedApis.add(deployedApiItem);
		}
		describeDeployedApisResponse.setDeployedApis(deployedApis);
	 
	 	return describeDeployedApisResponse;
	}
}