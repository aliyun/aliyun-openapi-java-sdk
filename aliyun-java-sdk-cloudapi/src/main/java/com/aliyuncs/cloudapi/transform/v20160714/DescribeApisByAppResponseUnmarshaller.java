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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByAppResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByAppResponse.AppApiRelationInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisByAppResponseUnmarshaller {

	public static DescribeApisByAppResponse unmarshall(DescribeApisByAppResponse describeApisByAppResponse, UnmarshallerContext _ctx) {
		
		describeApisByAppResponse.setRequestId(_ctx.stringValue("DescribeApisByAppResponse.RequestId"));
		describeApisByAppResponse.setPageNumber(_ctx.integerValue("DescribeApisByAppResponse.PageNumber"));
		describeApisByAppResponse.setPageSize(_ctx.integerValue("DescribeApisByAppResponse.PageSize"));
		describeApisByAppResponse.setTotalCount(_ctx.integerValue("DescribeApisByAppResponse.TotalCount"));

		List<AppApiRelationInfo> appApiRelationInfos = new ArrayList<AppApiRelationInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisByAppResponse.AppApiRelationInfos.Length"); i++) {
			AppApiRelationInfo appApiRelationInfo = new AppApiRelationInfo();
			appApiRelationInfo.setApiId(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].ApiId"));
			appApiRelationInfo.setAuthorizationSource(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].AuthorizationSource"));
			appApiRelationInfo.setAuthVaildTime(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].AuthVaildTime"));
			appApiRelationInfo.setDescription(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].Description"));
			appApiRelationInfo.setGroupName(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].GroupName"));
			appApiRelationInfo.setGroupId(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].GroupId"));
			appApiRelationInfo.setOperator(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].Operator"));
			appApiRelationInfo.setStageName(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].StageName"));
			appApiRelationInfo.setStageAlias(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].StageAlias"));
			appApiRelationInfo.setCreatedTime(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].CreatedTime"));
			appApiRelationInfo.setApiName(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].ApiName"));
			appApiRelationInfo.setRegionId(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].RegionId"));
			appApiRelationInfo.setPath(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].Path"));
			appApiRelationInfo.setBizMethod(_ctx.stringValue("DescribeApisByAppResponse.AppApiRelationInfos["+ i +"].Method"));

			appApiRelationInfos.add(appApiRelationInfo);
		}
		describeApisByAppResponse.setAppApiRelationInfos(appApiRelationInfos);
	 
	 	return describeApisByAppResponse;
	}
}