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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveServiceResponse;
import com.aliyuncs.ecd.model.v20200930.DescribeCloudDriveServiceResponse.CloudDriveService;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCloudDriveServiceResponseUnmarshaller {

	public static DescribeCloudDriveServiceResponse unmarshall(DescribeCloudDriveServiceResponse describeCloudDriveServiceResponse, UnmarshallerContext _ctx) {
		
		describeCloudDriveServiceResponse.setRequestId(_ctx.stringValue("DescribeCloudDriveServiceResponse.RequestId"));
		describeCloudDriveServiceResponse.setNextToken(_ctx.stringValue("DescribeCloudDriveServiceResponse.NextToken"));

		List<CloudDriveService> cloudDriveServices = new ArrayList<CloudDriveService>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCloudDriveServiceResponse.CloudDriveServices.Length"); i++) {
			CloudDriveService cloudDriveService = new CloudDriveService();
			cloudDriveService.setCdsId(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsId"));
			cloudDriveService.setCreateTime(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CreateTime"));
			cloudDriveService.setPdsProductName(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsProductName"));
			cloudDriveService.setCdsChargeType(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsChargeType"));
			cloudDriveService.setAliUid(_ctx.longValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].AliUid"));
			cloudDriveService.setRegionId(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].RegionId"));
			cloudDriveService.setPdsAdministrator(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsAdministrator"));
			cloudDriveService.setMeteredSize(_ctx.longValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].MeteredSize"));
			cloudDriveService.setMaxSize(_ctx.longValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].MaxSize"));
			cloudDriveService.setPdsSubdomainId(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsSubdomainId"));
			cloudDriveService.setCdsReleaseDeadline(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsReleaseDeadline"));
			cloudDriveService.setCdsStatus(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsStatus"));
			cloudDriveService.setCdsChargeStatus(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsChargeStatus"));
			cloudDriveService.setCdsName(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].CdsName"));
			cloudDriveService.setPdsEndpoint(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsEndpoint"));
			cloudDriveService.setPdsUrl(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsUrl"));
			cloudDriveService.setPdsDomainId(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsDomainId"));
			cloudDriveService.setPdsInitToken(_ctx.stringValue("DescribeCloudDriveServiceResponse.CloudDriveServices["+ i +"].PdsInitToken"));

			cloudDriveServices.add(cloudDriveService);
		}
		describeCloudDriveServiceResponse.setCloudDriveServices(cloudDriveServices);
	 
	 	return describeCloudDriveServiceResponse;
	}
}