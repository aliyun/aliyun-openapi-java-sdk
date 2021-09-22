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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstancesResponse;
import com.aliyuncs.alidns.model.v20150109.DescribeGtmInstancesResponse.GtmInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGtmInstancesResponseUnmarshaller {

	public static DescribeGtmInstancesResponse unmarshall(DescribeGtmInstancesResponse describeGtmInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGtmInstancesResponse.setRequestId(_ctx.stringValue("DescribeGtmInstancesResponse.RequestId"));
		describeGtmInstancesResponse.setPageSize(_ctx.integerValue("DescribeGtmInstancesResponse.PageSize"));
		describeGtmInstancesResponse.setPageNumber(_ctx.integerValue("DescribeGtmInstancesResponse.PageNumber"));
		describeGtmInstancesResponse.setTotalPages(_ctx.integerValue("DescribeGtmInstancesResponse.TotalPages"));
		describeGtmInstancesResponse.setTotalItems(_ctx.integerValue("DescribeGtmInstancesResponse.TotalItems"));

		List<GtmInstance> gtmInstances = new ArrayList<GtmInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGtmInstancesResponse.GtmInstances.Length"); i++) {
			GtmInstance gtmInstance = new GtmInstance();
			gtmInstance.setExpireTime(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTime"));
			gtmInstance.setAccessStrategyNum(_ctx.integerValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].AccessStrategyNum"));
			gtmInstance.setCreateTime(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTime"));
			gtmInstance.setCnameMode(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CnameMode"));
			gtmInstance.setInstanceId(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceId"));
			gtmInstance.setExpireTimestamp(_ctx.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTimestamp"));
			gtmInstance.setTtl(_ctx.integerValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Ttl"));
			gtmInstance.setAlertGroup(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].AlertGroup"));
			gtmInstance.setAddressPoolNum(_ctx.integerValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].AddressPoolNum"));
			gtmInstance.setInstanceName(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceName"));
			gtmInstance.setLbaStrategy(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].LbaStrategy"));
			gtmInstance.setCname(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Cname"));
			gtmInstance.setVersionCode(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].VersionCode"));
			gtmInstance.setUserDomainName(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].UserDomainName"));
			gtmInstance.setCreateTimestamp(_ctx.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTimestamp"));
			gtmInstance.setResourceGroupId(_ctx.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ResourceGroupId"));

			gtmInstances.add(gtmInstance);
		}
		describeGtmInstancesResponse.setGtmInstances(gtmInstances);
	 
	 	return describeGtmInstancesResponse;
	}
}