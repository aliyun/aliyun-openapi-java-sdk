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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.DescribeGWSInstancesResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeGWSInstancesResponse.InstanceInfo;
import com.aliyuncs.ehpc.model.v20180412.DescribeGWSInstancesResponse.InstanceInfo.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGWSInstancesResponseUnmarshaller {

	public static DescribeGWSInstancesResponse unmarshall(DescribeGWSInstancesResponse describeGWSInstancesResponse, UnmarshallerContext _ctx) {
		
		describeGWSInstancesResponse.setRequestId(_ctx.stringValue("DescribeGWSInstancesResponse.RequestId"));
		describeGWSInstancesResponse.setPageSize(_ctx.integerValue("DescribeGWSInstancesResponse.PageSize"));
		describeGWSInstancesResponse.setPageNumber(_ctx.integerValue("DescribeGWSInstancesResponse.PageNumber"));
		describeGWSInstancesResponse.setTotalCount(_ctx.integerValue("DescribeGWSInstancesResponse.TotalCount"));

		List<InstanceInfo> instances = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGWSInstancesResponse.Instances.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setStatus(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].Status"));
			instanceInfo.setWorkMode(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].WorkMode"));
			instanceInfo.setExpireTime(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].ExpireTime"));
			instanceInfo.setCreateTime(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].CreateTime"));
			instanceInfo.setInstanceId(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].InstanceId"));
			instanceInfo.setName(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].Name"));
			instanceInfo.setInstanceType(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].InstanceType"));
			instanceInfo.setUserName(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].UserName"));
			instanceInfo.setClusterId(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].ClusterId"));

			List<AppInfo> appList = new ArrayList<AppInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGWSInstancesResponse.Instances["+ i +"].AppList.Length"); j++) {
				AppInfo appInfo = new AppInfo();
				appInfo.setAppName(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].AppList["+ j +"].AppName"));
				appInfo.setAppArgs(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].AppList["+ j +"].AppArgs"));
				appInfo.setAppPath(_ctx.stringValue("DescribeGWSInstancesResponse.Instances["+ i +"].AppList["+ j +"].AppPath"));

				appList.add(appInfo);
			}
			instanceInfo.setAppList(appList);

			instances.add(instanceInfo);
		}
		describeGWSInstancesResponse.setInstances(instances);
	 
	 	return describeGWSInstancesResponse;
	}
}