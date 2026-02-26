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

import com.aliyuncs.sas.model.v20181203.DescribeImageInstancesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageInstancesResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeImageInstancesResponse.Responses;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageInstancesResponseUnmarshaller {

	public static DescribeImageInstancesResponse unmarshall(DescribeImageInstancesResponse describeImageInstancesResponse, UnmarshallerContext _ctx) {
		
		describeImageInstancesResponse.setRequestId(_ctx.stringValue("DescribeImageInstancesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageInstancesResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageInstancesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageInstancesResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageInstancesResponse.PageInfo.Count"));
		describeImageInstancesResponse.setPageInfo(pageInfo);

		List<Responses> imageInstanceList = new ArrayList<Responses>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageInstancesResponse.ImageInstanceList.Length"); i++) {
			Responses responses = new Responses();
			responses.setStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Status"));
			responses.setDigest(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Digest"));
			responses.setRegistryType(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RegistryType"));
			responses.setTag(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Tag"));
			responses.setImageUpdate(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ImageUpdate"));
			responses.setRepoType(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RepoType"));
			responses.setImageSize(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ImageSize"));
			responses.setHcStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].HcStatus"));
			responses.setVulCount(_ctx.integerValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].VulCount"));
			responses.setImageId(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ImageId"));
			responses.setEndpoints(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Endpoints"));
			responses.setRiskStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RiskStatus"));
			responses.setImageCreate(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ImageCreate"));
			responses.setVulStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].VulStatus"));
			responses.setAlarmStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].AlarmStatus"));
			responses.setScaProgress(_ctx.integerValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ScaProgress"));
			responses.setInstanceId(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].InstanceId"));
			responses.setRegionId(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RegionId"));
			responses.setScaStatus(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ScaStatus"));
			responses.setUuid(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Uuid"));
			responses.setRepoId(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RepoId"));
			responses.setHcCount(_ctx.integerValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].HcCount"));
			responses.setScaResult(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].ScaResult"));
			responses.setRepoName(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RepoName"));
			responses.setAlarmCount(_ctx.integerValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].AlarmCount"));
			responses.setRepoNamespace(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].RepoNamespace"));
			responses.setDeployed(_ctx.integerValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].Deployed"));
			responses.setSysProduct(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].SysProduct"));
			responses.setSysVendor(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].SysVendor"));
			responses.setSysVersion(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].SysVersion"));
			responses.setOsRelease(_ctx.stringValue("DescribeImageInstancesResponse.ImageInstanceList["+ i +"].OsRelease"));

			imageInstanceList.add(responses);
		}
		describeImageInstancesResponse.setImageInstanceList(imageInstanceList);
	 
	 	return describeImageInstancesResponse;
	}
}