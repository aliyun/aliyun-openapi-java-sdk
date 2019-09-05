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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoriesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiHistoriesResponse.ApiHisItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiHistoriesResponseUnmarshaller {

	public static DescribeApiHistoriesResponse unmarshall(DescribeApiHistoriesResponse describeApiHistoriesResponse, UnmarshallerContext _ctx) {
		
		describeApiHistoriesResponse.setRequestId(_ctx.stringValue("DescribeApiHistoriesResponse.RequestId"));
		describeApiHistoriesResponse.setTotalCount(_ctx.integerValue("DescribeApiHistoriesResponse.TotalCount"));
		describeApiHistoriesResponse.setPageSize(_ctx.integerValue("DescribeApiHistoriesResponse.PageSize"));
		describeApiHistoriesResponse.setPageNumber(_ctx.integerValue("DescribeApiHistoriesResponse.PageNumber"));

		List<ApiHisItem> apiHisItems = new ArrayList<ApiHisItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiHistoriesResponse.ApiHisItems.Length"); i++) {
			ApiHisItem apiHisItem = new ApiHisItem();
			apiHisItem.setRegionId(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].RegionId"));
			apiHisItem.setApiId(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].ApiId"));
			apiHisItem.setApiName(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].ApiName"));
			apiHisItem.setGroupId(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].GroupId"));
			apiHisItem.setGroupName(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].GroupName"));
			apiHisItem.setStageName(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].StageName"));
			apiHisItem.setHistoryVersion(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].HistoryVersion"));
			apiHisItem.setStatus(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].Status"));
			apiHisItem.setDescription(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].Description"));
			apiHisItem.setDeployedTime(_ctx.stringValue("DescribeApiHistoriesResponse.ApiHisItems["+ i +"].DeployedTime"));

			apiHisItems.add(apiHisItem);
		}
		describeApiHistoriesResponse.setApiHisItems(apiHisItems);
	 
	 	return describeApiHistoriesResponse;
	}
}