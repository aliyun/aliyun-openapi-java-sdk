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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterV2Response;
import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterV2Response.DataItem;
import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterV2Response.DataItem.SparkEngineConfig;
import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterV2Response.DataItem.UserNetWorkConfigListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualClusterV2ResponseUnmarshaller {

	public static DescribeVirtualClusterV2Response unmarshall(DescribeVirtualClusterV2Response describeVirtualClusterV2Response, UnmarshallerContext _ctx) {
		
		describeVirtualClusterV2Response.setRequestId(_ctx.stringValue("DescribeVirtualClusterV2Response.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVirtualClusterV2Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].Status"));
			dataItem.setCreatorId(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].CreatorId"));
			dataItem.setCreateTime(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].CreateTime"));
			dataItem.setMaxCpu(_ctx.floatValue("DescribeVirtualClusterV2Response.Data["+ i +"].MaxCpu"));
			dataItem.setMaxMemory(_ctx.floatValue("DescribeVirtualClusterV2Response.Data["+ i +"].MaxMemory"));
			dataItem.setMaxCpuLimit(_ctx.floatValue("DescribeVirtualClusterV2Response.Data["+ i +"].MaxCpuLimit"));
			dataItem.setMaxMemoryLimit(_ctx.floatValue("DescribeVirtualClusterV2Response.Data["+ i +"].MaxMemoryLimit"));
			dataItem.setChargeType(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].ChargeType"));

			SparkEngineConfig sparkEngineConfig = new SparkEngineConfig();
			sparkEngineConfig.setSparkModuleReleaseName(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].SparkEngineConfig.SparkModuleReleaseName"));
			sparkEngineConfig.setDefaultExecutorSpecName(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].SparkEngineConfig.DefaultExecutorSpecName"));
			sparkEngineConfig.setDefaultDriverSpecName(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].SparkEngineConfig.DefaultDriverSpecName"));
			sparkEngineConfig.setDefaultExecutorNumbers(_ctx.longValue("DescribeVirtualClusterV2Response.Data["+ i +"].SparkEngineConfig.DefaultExecutorNumbers"));
			sparkEngineConfig.setSparkVersionDescription(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].SparkEngineConfig.SparkVersionDescription"));
			dataItem.setSparkEngineConfig(sparkEngineConfig);

			List<UserNetWorkConfigListItem> userNetWorkConfigList = new ArrayList<UserNetWorkConfigListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVirtualClusterV2Response.Data["+ i +"].UserNetWorkConfigList.Length"); j++) {
				UserNetWorkConfigListItem userNetWorkConfigListItem = new UserNetWorkConfigListItem();
				userNetWorkConfigListItem.setSwitchId(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].UserNetWorkConfigList["+ j +"].SwitchId"));
				userNetWorkConfigListItem.setSecurityGroupId(_ctx.stringValue("DescribeVirtualClusterV2Response.Data["+ i +"].UserNetWorkConfigList["+ j +"].SecurityGroupId"));
				userNetWorkConfigListItem.setId(_ctx.longValue("DescribeVirtualClusterV2Response.Data["+ i +"].UserNetWorkConfigList["+ j +"].Id"));

				userNetWorkConfigList.add(userNetWorkConfigListItem);
			}
			dataItem.setUserNetWorkConfigList(userNetWorkConfigList);

			data.add(dataItem);
		}
		describeVirtualClusterV2Response.setData(data);
	 
	 	return describeVirtualClusterV2Response;
	}
}