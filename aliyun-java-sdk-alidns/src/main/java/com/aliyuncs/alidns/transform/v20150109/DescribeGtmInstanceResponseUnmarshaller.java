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

package com.aliyuncs.alidns.transform.v20150109;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmInstanceResponseUnmarshaller {

	public static DescribeGtmInstanceResponse unmarshall(DescribeGtmInstanceResponse describeGtmInstanceResponse, UnmarshallerContext _ctx) {
		
		describeGtmInstanceResponse.setRequestId(_ctx.stringValue("DescribeGtmInstanceResponse.RequestId"));
		describeGtmInstanceResponse.setInstanceId(_ctx.stringValue("DescribeGtmInstanceResponse.InstanceId"));
		describeGtmInstanceResponse.setInstanceName(_ctx.stringValue("DescribeGtmInstanceResponse.InstanceName"));
		describeGtmInstanceResponse.setVersionCode(_ctx.stringValue("DescribeGtmInstanceResponse.VersionCode"));
		describeGtmInstanceResponse.setExpireTime(_ctx.stringValue("DescribeGtmInstanceResponse.ExpireTime"));
		describeGtmInstanceResponse.setExpireTimestamp(_ctx.longValue("DescribeGtmInstanceResponse.ExpireTimestamp"));
		describeGtmInstanceResponse.setCname(_ctx.stringValue("DescribeGtmInstanceResponse.Cname"));
		describeGtmInstanceResponse.setUserDomainName(_ctx.stringValue("DescribeGtmInstanceResponse.UserDomainName"));
		describeGtmInstanceResponse.setTtl(_ctx.integerValue("DescribeGtmInstanceResponse.Ttl"));
		describeGtmInstanceResponse.setLbaStrategy(_ctx.stringValue("DescribeGtmInstanceResponse.LbaStrategy"));
		describeGtmInstanceResponse.setCreateTime(_ctx.stringValue("DescribeGtmInstanceResponse.CreateTime"));
		describeGtmInstanceResponse.setCreateTimestamp(_ctx.longValue("DescribeGtmInstanceResponse.CreateTimestamp"));
		describeGtmInstanceResponse.setAlertGroup(_ctx.stringValue("DescribeGtmInstanceResponse.AlertGroup"));
		describeGtmInstanceResponse.setCnameMode(_ctx.stringValue("DescribeGtmInstanceResponse.CnameMode"));
		describeGtmInstanceResponse.setAccessStrategyNum(_ctx.integerValue("DescribeGtmInstanceResponse.AccessStrategyNum"));
		describeGtmInstanceResponse.setAddressPoolNum(_ctx.integerValue("DescribeGtmInstanceResponse.AddressPoolNum"));
	 
	 	return describeGtmInstanceResponse;
	}
}