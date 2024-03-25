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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantsResponseUnmarshaller {

	public static DescribeTenantsResponse unmarshall(DescribeTenantsResponse describeTenantsResponse, UnmarshallerContext _ctx) {
		
		describeTenantsResponse.setRequestId(_ctx.stringValue("DescribeTenantsResponse.RequestId"));
		describeTenantsResponse.setTotalCount(_ctx.integerValue("DescribeTenantsResponse.TotalCount"));

		List<Data> tenants = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantsResponse.Tenants.Length"); i++) {
			Data data = new Data();
			data.setVpcId(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].VpcId"));
			data.setStatus(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].Status"));
			data.setPrimaryZone(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].PrimaryZone"));
			data.setDeployType(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].DeployType"));
			data.setDeployMode(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].DeployMode"));
			data.setCreateTime(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].CreateTime"));
			data.setTenantName(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].TenantName"));
			data.setMem(_ctx.integerValue("DescribeTenantsResponse.Tenants["+ i +"].Mem"));
			data.setCpu(_ctx.integerValue("DescribeTenantsResponse.Tenants["+ i +"].Cpu"));
			data.setDescription(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].Description"));
			data.setTenantMode(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].TenantMode"));
			data.setTenantId(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].TenantId"));
			data.setUnitCpu(_ctx.integerValue("DescribeTenantsResponse.Tenants["+ i +"].UnitCpu"));
			data.setUnitMem(_ctx.integerValue("DescribeTenantsResponse.Tenants["+ i +"].UnitMem"));
			data.setUnitNum(_ctx.integerValue("DescribeTenantsResponse.Tenants["+ i +"].UnitNum"));
			data.setUsedDiskSize(_ctx.doubleValue("DescribeTenantsResponse.Tenants["+ i +"].UsedDiskSize"));
			data.setCharset(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].Charset"));
			data.setCollation(_ctx.stringValue("DescribeTenantsResponse.Tenants["+ i +"].Collation"));
			data.setEnableReadOnlyReplica(_ctx.booleanValue("DescribeTenantsResponse.Tenants["+ i +"].EnableReadOnlyReplica"));

			tenants.add(data);
		}
		describeTenantsResponse.setTenants(tenants);
	 
	 	return describeTenantsResponse;
	}
}