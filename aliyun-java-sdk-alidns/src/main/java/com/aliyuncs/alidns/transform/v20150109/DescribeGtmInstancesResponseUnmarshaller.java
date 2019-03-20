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

	public static DescribeGtmInstancesResponse unmarshall(DescribeGtmInstancesResponse describeGtmInstancesResponse, UnmarshallerContext context) {
		
		describeGtmInstancesResponse.setRequestId(context.stringValue("DescribeGtmInstancesResponse.RequestId"));
		describeGtmInstancesResponse.setPageNumber(context.integerValue("DescribeGtmInstancesResponse.PageNumber"));
		describeGtmInstancesResponse.setPageSize(context.integerValue("DescribeGtmInstancesResponse.PageSize"));
		describeGtmInstancesResponse.setTotalItems(context.integerValue("DescribeGtmInstancesResponse.TotalItems"));
		describeGtmInstancesResponse.setTotalPages(context.integerValue("DescribeGtmInstancesResponse.TotalPages"));

		List<GtmInstance> gtmInstances = new ArrayList<GtmInstance>();
		for (int i = 0; i < context.lengthValue("DescribeGtmInstancesResponse.GtmInstances.Length"); i++) {
			GtmInstance gtmInstance = new GtmInstance();
			gtmInstance.setInstanceId(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceId"));
			gtmInstance.setInstanceName(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].InstanceName"));
			gtmInstance.setCname(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Cname"));
			gtmInstance.setUserDomainName(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].UserDomainName"));
			gtmInstance.setVersionCode(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].VersionCode"));
			gtmInstance.setTtl(context.integerValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].Ttl"));
			gtmInstance.setLbaStrategy(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].LbaStrategy"));
			gtmInstance.setCreateTime(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTime"));
			gtmInstance.setCreateTimestamp(context.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].CreateTimestamp"));
			gtmInstance.setExpireTime(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTime"));
			gtmInstance.setExpireTimestamp(context.longValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].ExpireTimestamp"));
			gtmInstance.setAlertGroup(context.stringValue("DescribeGtmInstancesResponse.GtmInstances["+ i +"].AlertGroup"));

			gtmInstances.add(gtmInstance);
		}
		describeGtmInstancesResponse.setGtmInstances(gtmInstances);
	 
	 	return describeGtmInstancesResponse;
	}
}