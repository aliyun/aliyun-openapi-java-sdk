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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSSLResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeInstanceSSLResponse.InstanceSSL;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSSLResponseUnmarshaller {

	public static DescribeInstanceSSLResponse unmarshall(DescribeInstanceSSLResponse describeInstanceSSLResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSSLResponse.setRequestId(_ctx.stringValue("DescribeInstanceSSLResponse.RequestId"));

		InstanceSSL instanceSSL = new InstanceSSL();
		instanceSSL.setInstanceId(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.InstanceId"));
		instanceSSL.setEnableSSL(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.EnableSSL"));
		instanceSSL.setValidPeriod(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.ValidPeriod"));
		instanceSSL.setCaUrl(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.CaUrl"));
		instanceSSL.setStatus(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.Status"));
		instanceSSL.setForceSSLSupport(_ctx.booleanValue("DescribeInstanceSSLResponse.InstanceSSL.ForceSSLSupport"));
		instanceSSL.setForceSSL(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.ForceSSL"));
		instanceSSL.setAutoUpdate(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.AutoUpdate"));
		instanceSSL.setTenantId(_ctx.stringValue("DescribeInstanceSSLResponse.InstanceSSL.TenantId"));
		describeInstanceSSLResponse.setInstanceSSL(instanceSSL);
	 
	 	return describeInstanceSSLResponse;
	}
}