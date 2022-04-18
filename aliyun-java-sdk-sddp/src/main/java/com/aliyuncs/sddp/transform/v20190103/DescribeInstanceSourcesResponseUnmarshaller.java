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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeInstanceSourcesResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeInstanceSourcesResponse.InstanceSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSourcesResponseUnmarshaller {

	public static DescribeInstanceSourcesResponse unmarshall(DescribeInstanceSourcesResponse describeInstanceSourcesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSourcesResponse.setRequestId(_ctx.stringValue("DescribeInstanceSourcesResponse.RequestId"));
		describeInstanceSourcesResponse.setCurrentPage(_ctx.integerValue("DescribeInstanceSourcesResponse.CurrentPage"));
		describeInstanceSourcesResponse.setPageSize(_ctx.integerValue("DescribeInstanceSourcesResponse.PageSize"));
		describeInstanceSourcesResponse.setTotalCount(_ctx.integerValue("DescribeInstanceSourcesResponse.TotalCount"));

		List<InstanceSource> items = new ArrayList<InstanceSource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSourcesResponse.Items.Length"); i++) {
			InstanceSource instanceSource = new InstanceSource();
			instanceSource.setLastModifyUserId(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].LastModifyUserId"));
			instanceSource.setPasswordStatus(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].PasswordStatus"));
			instanceSource.setEngineType(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].EngineType"));
			instanceSource.setTenantName(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].TenantName"));
			instanceSource.setInstanceId(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].InstanceId"));
			instanceSource.setInstanceDescription(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].InstanceDescription"));
			instanceSource.setDataLimitId(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].DataLimitId"));
			instanceSource.setRegionId(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].RegionId"));
			instanceSource.setDbName(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].DbName"));
			instanceSource.setLastModifyTime(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].LastModifyTime"));
			instanceSource.setRegionName(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].RegionName"));
			instanceSource.setCanModifyUserName(_ctx.booleanValue("DescribeInstanceSourcesResponse.Items["+ i +"].CanModifyUserName"));
			instanceSource.setLogStoreDay(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].LogStoreDay"));
			instanceSource.setGmtCreate(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].GmtCreate"));
			instanceSource.setAutoScan(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].AutoScan"));
			instanceSource.setProductId(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].ProductId"));
			instanceSource.setInstanceSize(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].InstanceSize"));
			instanceSource.setUserName(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].UserName"));
			instanceSource.setAuditStatus(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].AuditStatus"));
			instanceSource.setId(_ctx.longValue("DescribeInstanceSourcesResponse.Items["+ i +"].Id"));
			instanceSource.setTenantId(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].TenantId"));
			instanceSource.setEnable(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].Enable"));
			instanceSource.setCheckStatus(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].CheckStatus"));
			instanceSource.setDatamaskStatus(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].DatamaskStatus"));
			instanceSource.setErrorMessage(_ctx.stringValue("DescribeInstanceSourcesResponse.Items["+ i +"].ErrorMessage"));
			instanceSource.setSamplingSize(_ctx.integerValue("DescribeInstanceSourcesResponse.Items["+ i +"].SamplingSize"));

			items.add(instanceSource);
		}
		describeInstanceSourcesResponse.setItems(items);
	 
	 	return describeInstanceSourcesResponse;
	}
}