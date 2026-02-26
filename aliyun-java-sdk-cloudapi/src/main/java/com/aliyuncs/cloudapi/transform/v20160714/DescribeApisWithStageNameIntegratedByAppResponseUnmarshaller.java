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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisWithStageNameIntegratedByAppResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisWithStageNameIntegratedByAppResponseUnmarshaller {

	public static DescribeApisWithStageNameIntegratedByAppResponse unmarshall(DescribeApisWithStageNameIntegratedByAppResponse describeApisWithStageNameIntegratedByAppResponse, UnmarshallerContext _ctx) {
		
		describeApisWithStageNameIntegratedByAppResponse.setRequestId(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.RequestId"));
		describeApisWithStageNameIntegratedByAppResponse.setPageNumber(_ctx.integerValue("DescribeApisWithStageNameIntegratedByAppResponse.PageNumber"));
		describeApisWithStageNameIntegratedByAppResponse.setPageSize(_ctx.integerValue("DescribeApisWithStageNameIntegratedByAppResponse.PageSize"));
		describeApisWithStageNameIntegratedByAppResponse.setTotalCount(_ctx.integerValue("DescribeApisWithStageNameIntegratedByAppResponse.TotalCount"));

		List<AppApiRelationInfo> appApiRelationInfos = new ArrayList<AppApiRelationInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos.Length"); i++) {
			AppApiRelationInfo appApiRelationInfo = new AppApiRelationInfo();
			appApiRelationInfo.setApiId(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].ApiId"));
			appApiRelationInfo.setAuthorizationSource(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].AuthorizationSource"));
			appApiRelationInfo.setDescription(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].Description"));
			appApiRelationInfo.setGroupName(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].GroupName"));
			appApiRelationInfo.setGroupId(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].GroupId"));
			appApiRelationInfo.setOperator(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].Operator"));
			appApiRelationInfo.setCreatedTime(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].CreatedTime"));
			appApiRelationInfo.setApiName(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].ApiName"));
			appApiRelationInfo.setRegionId(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].RegionId"));
			appApiRelationInfo.setPath(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].Path"));
			appApiRelationInfo.setBizMethod(_ctx.stringValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].Method"));
			appApiRelationInfo.setStageNameAndAuth(_ctx.mapValue("DescribeApisWithStageNameIntegratedByAppResponse.AppApiRelationInfos["+ i +"].StageNameAndAuth"));

			appApiRelationInfos.add(appApiRelationInfo);
		}
		describeApisWithStageNameIntegratedByAppResponse.setAppApiRelationInfos(appApiRelationInfos);
	 
	 	return describeApisWithStageNameIntegratedByAppResponse;
	}
}