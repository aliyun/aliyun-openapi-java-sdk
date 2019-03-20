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

	public static DescribeGtmInstanceResponse unmarshall(DescribeGtmInstanceResponse describeGtmInstanceResponse, UnmarshallerContext context) {
		
		describeGtmInstanceResponse.setRequestId(context.stringValue("DescribeGtmInstanceResponse.RequestId"));
		describeGtmInstanceResponse.setInstanceId(context.stringValue("DescribeGtmInstanceResponse.InstanceId"));
		describeGtmInstanceResponse.setInstanceName(context.stringValue("DescribeGtmInstanceResponse.InstanceName"));
		describeGtmInstanceResponse.setVersionCode(context.stringValue("DescribeGtmInstanceResponse.VersionCode"));
		describeGtmInstanceResponse.setExpireTime(context.stringValue("DescribeGtmInstanceResponse.ExpireTime"));
		describeGtmInstanceResponse.setExpireTimestamp(context.longValue("DescribeGtmInstanceResponse.ExpireTimestamp"));
		describeGtmInstanceResponse.setCname(context.stringValue("DescribeGtmInstanceResponse.Cname"));
		describeGtmInstanceResponse.setUserDomainName(context.stringValue("DescribeGtmInstanceResponse.UserDomainName"));
		describeGtmInstanceResponse.setTtl(context.integerValue("DescribeGtmInstanceResponse.Ttl"));
		describeGtmInstanceResponse.setLbaStrategy(context.stringValue("DescribeGtmInstanceResponse.LbaStrategy"));
		describeGtmInstanceResponse.setCreateTime(context.stringValue("DescribeGtmInstanceResponse.CreateTime"));
		describeGtmInstanceResponse.setCreateTimestamp(context.longValue("DescribeGtmInstanceResponse.CreateTimestamp"));
		describeGtmInstanceResponse.setAlertGroup(context.stringValue("DescribeGtmInstanceResponse.AlertGroup"));
	 
	 	return describeGtmInstanceResponse;
	}
}