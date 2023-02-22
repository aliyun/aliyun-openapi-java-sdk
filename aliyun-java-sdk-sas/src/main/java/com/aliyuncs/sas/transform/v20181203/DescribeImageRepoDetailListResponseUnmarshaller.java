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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageRepoDetailListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageRepoDetailListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeImageRepoDetailListResponse.Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageRepoDetailListResponseUnmarshaller {

	public static DescribeImageRepoDetailListResponse unmarshall(DescribeImageRepoDetailListResponse describeImageRepoDetailListResponse, UnmarshallerContext _ctx) {
		
		describeImageRepoDetailListResponse.setRequestId(_ctx.stringValue("DescribeImageRepoDetailListResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageRepoDetailListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageRepoDetailListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.PageInfo.Count"));
		describeImageRepoDetailListResponse.setPageInfo(pageInfo);

		List<Response> imageRepoResponses = new ArrayList<Response>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageRepoDetailListResponse.ImageRepoResponses.Length"); i++) {
			Response response = new Response();
			response.setEndpoints(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].Endpoints"));
			response.setRiskStatus(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RiskStatus"));
			response.setVulStatus(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].VulStatus"));
			response.setAlarmStatus(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].AlarmStatus"));
			response.setRegistryType(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RegistryType"));
			response.setInstanceId(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].InstanceId"));
			response.setRepoType(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RepoType"));
			response.setRegionId(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RegionId"));
			response.setRepoId(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RepoId"));
			response.setHcCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].HcCount"));
			response.setVulCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].VulCount"));
			response.setHcStatus(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].HcStatus"));
			response.setAlarmCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].AlarmCount"));
			response.setRepoName(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RepoName"));
			response.setRepoNamespace(_ctx.stringValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].RepoNamespace"));
			response.setImageCount(_ctx.integerValue("DescribeImageRepoDetailListResponse.ImageRepoResponses["+ i +"].ImageCount"));

			imageRepoResponses.add(response);
		}
		describeImageRepoDetailListResponse.setImageRepoResponses(imageRepoResponses);
	 
	 	return describeImageRepoDetailListResponse;
	}
}