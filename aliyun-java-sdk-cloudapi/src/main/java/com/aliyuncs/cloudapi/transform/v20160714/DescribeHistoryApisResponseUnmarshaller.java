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

import com.aliyuncs.cloudapi.model.v20160714.DescribeHistoryApisResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeHistoryApisResponse.ApiHisItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHistoryApisResponseUnmarshaller {

	public static DescribeHistoryApisResponse unmarshall(DescribeHistoryApisResponse describeHistoryApisResponse, UnmarshallerContext _ctx) {
		
		describeHistoryApisResponse.setRequestId(_ctx.stringValue("DescribeHistoryApisResponse.RequestId"));
		describeHistoryApisResponse.setTotalCount(_ctx.integerValue("DescribeHistoryApisResponse.TotalCount"));
		describeHistoryApisResponse.setPageSize(_ctx.integerValue("DescribeHistoryApisResponse.PageSize"));
		describeHistoryApisResponse.setPageNumber(_ctx.integerValue("DescribeHistoryApisResponse.PageNumber"));

		List<ApiHisItem> apiHisItems = new ArrayList<ApiHisItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHistoryApisResponse.ApiHisItems.Length"); i++) {
			ApiHisItem apiHisItem = new ApiHisItem();
			apiHisItem.setRegionId(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].RegionId"));
			apiHisItem.setApiId(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].ApiId"));
			apiHisItem.setApiName(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].ApiName"));
			apiHisItem.setGroupId(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].GroupId"));
			apiHisItem.setGroupName(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].GroupName"));
			apiHisItem.setStageName(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].StageName"));
			apiHisItem.setHistoryVersion(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].HistoryVersion"));
			apiHisItem.setStatus(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].Status"));
			apiHisItem.setDescription(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].Description"));
			apiHisItem.setDeployedTime(_ctx.stringValue("DescribeHistoryApisResponse.ApiHisItems["+ i +"].DeployedTime"));

			apiHisItems.add(apiHisItem);
		}
		describeHistoryApisResponse.setApiHisItems(apiHisItems);
	 
	 	return describeHistoryApisResponse;
	}
}