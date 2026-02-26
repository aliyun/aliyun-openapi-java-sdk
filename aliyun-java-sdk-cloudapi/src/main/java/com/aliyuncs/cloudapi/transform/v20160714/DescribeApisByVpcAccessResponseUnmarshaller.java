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

import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByVpcAccessResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApisByVpcAccessResponse.ApiVpcAccessInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApisByVpcAccessResponseUnmarshaller {

	public static DescribeApisByVpcAccessResponse unmarshall(DescribeApisByVpcAccessResponse describeApisByVpcAccessResponse, UnmarshallerContext _ctx) {
		
		describeApisByVpcAccessResponse.setRequestId(_ctx.stringValue("DescribeApisByVpcAccessResponse.RequestId"));
		describeApisByVpcAccessResponse.setPageNumber(_ctx.integerValue("DescribeApisByVpcAccessResponse.PageNumber"));
		describeApisByVpcAccessResponse.setPageSize(_ctx.integerValue("DescribeApisByVpcAccessResponse.PageSize"));
		describeApisByVpcAccessResponse.setTotalCount(_ctx.integerValue("DescribeApisByVpcAccessResponse.TotalCount"));

		List<ApiVpcAccessInfo> apiVpcAccessInfos = new ArrayList<ApiVpcAccessInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos.Length"); i++) {
			ApiVpcAccessInfo apiVpcAccessInfo = new ApiVpcAccessInfo();
			apiVpcAccessInfo.setApiId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].ApiId"));
			apiVpcAccessInfo.setVpcId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].VpcId"));
			apiVpcAccessInfo.setInstanceId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].InstanceId"));
			apiVpcAccessInfo.setPort(_ctx.integerValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].Port"));
			apiVpcAccessInfo.setRegionId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].RegionId"));
			apiVpcAccessInfo.setStageId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].StageId"));
			apiVpcAccessInfo.setVpcName(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].VpcName"));
			apiVpcAccessInfo.setGroupId(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].GroupId"));
			apiVpcAccessInfo.setGroupName(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].GroupName"));
			apiVpcAccessInfo.setDescription(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].Description"));
			apiVpcAccessInfo.setStageName(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].StageName"));
			apiVpcAccessInfo.setApiName(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].ApiName"));
			apiVpcAccessInfo.setPath(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].Path"));
			apiVpcAccessInfo.setBizMethod(_ctx.stringValue("DescribeApisByVpcAccessResponse.ApiVpcAccessInfos["+ i +"].Method"));

			apiVpcAccessInfos.add(apiVpcAccessInfo);
		}
		describeApisByVpcAccessResponse.setApiVpcAccessInfos(apiVpcAccessInfos);
	 
	 	return describeApisByVpcAccessResponse;
	}
}