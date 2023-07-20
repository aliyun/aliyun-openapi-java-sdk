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

import com.aliyuncs.sas.model.v20181203.DescribeImageVulWhiteListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageVulWhiteListResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeImageVulWhiteListResponse.VulList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageVulWhiteListResponseUnmarshaller {

	public static DescribeImageVulWhiteListResponse unmarshall(DescribeImageVulWhiteListResponse describeImageVulWhiteListResponse, UnmarshallerContext _ctx) {
		
		describeImageVulWhiteListResponse.setRequestId(_ctx.stringValue("DescribeImageVulWhiteListResponse.RequestId"));
		describeImageVulWhiteListResponse.setSuccess(_ctx.booleanValue("DescribeImageVulWhiteListResponse.Success"));
		describeImageVulWhiteListResponse.setCode(_ctx.stringValue("DescribeImageVulWhiteListResponse.Code"));
		describeImageVulWhiteListResponse.setMessage(_ctx.stringValue("DescribeImageVulWhiteListResponse.Message"));
		describeImageVulWhiteListResponse.setHttpStatusCode(_ctx.integerValue("DescribeImageVulWhiteListResponse.HttpStatusCode"));
		describeImageVulWhiteListResponse.setTimeCost(_ctx.longValue("DescribeImageVulWhiteListResponse.TimeCost"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageVulWhiteListResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageVulWhiteListResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageVulWhiteListResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageVulWhiteListResponse.PageInfo.Count"));
		describeImageVulWhiteListResponse.setPageInfo(pageInfo);

		List<VulList> imageVulWhitelist = new ArrayList<VulList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist.Length"); i++) {
			VulList vulList = new VulList();
			vulList.setName(_ctx.stringValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].Name"));
			vulList.setAliasName(_ctx.stringValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].AliasName"));
			vulList.setTarget(_ctx.stringValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].Target"));
			vulList.setReason(_ctx.stringValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].Reason"));
			vulList.setType(_ctx.stringValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].Type"));
			vulList.setId(_ctx.longValue("DescribeImageVulWhiteListResponse.ImageVulWhitelist["+ i +"].Id"));

			imageVulWhitelist.add(vulList);
		}
		describeImageVulWhiteListResponse.setImageVulWhitelist(imageVulWhitelist);
	 
	 	return describeImageVulWhiteListResponse;
	}
}