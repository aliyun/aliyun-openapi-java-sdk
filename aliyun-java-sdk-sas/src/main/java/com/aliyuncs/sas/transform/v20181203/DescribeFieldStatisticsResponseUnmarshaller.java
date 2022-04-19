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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeFieldStatisticsResponse;
import com.aliyuncs.sas.model.v20181203.DescribeFieldStatisticsResponse.GroupedFields;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFieldStatisticsResponseUnmarshaller {

	public static DescribeFieldStatisticsResponse unmarshall(DescribeFieldStatisticsResponse describeFieldStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeFieldStatisticsResponse.setRequestId(_ctx.stringValue("DescribeFieldStatisticsResponse.RequestId"));

		GroupedFields groupedFields = new GroupedFields();
		groupedFields.setOfflineInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.OfflineInstanceCount"));
		groupedFields.setRegionCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.RegionCount"));
		groupedFields.setNewInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.NewInstanceCount"));
		groupedFields.setExposedInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.ExposedInstanceCount"));
		groupedFields.setGroupCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.GroupCount"));
		groupedFields.setTencentInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.TencentInstanceCount"));
		groupedFields.setGeneralAssetCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.GeneralAssetCount"));
		groupedFields.setInstanceSyncTaskCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.InstanceSyncTaskCount"));
		groupedFields.setUnprotectedInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.UnprotectedInstanceCount"));
		groupedFields.setImportantAssetCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.ImportantAssetCount"));
		groupedFields.setTestAssetCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.TestAssetCount"));
		groupedFields.setVpcCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.VpcCount"));
		groupedFields.setInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.InstanceCount"));
		groupedFields.setPauseInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.PauseInstanceCount"));
		groupedFields.setIdcInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.IdcInstanceCount"));
		groupedFields.setNotRunningStatusCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.NotRunningStatusCount"));
		groupedFields.setAliYunInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.AliYunInstanceCount"));
		groupedFields.setRiskInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.RiskInstanceCount"));
		groupedFields.setHuaweiInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.HuaweiInstanceCount"));
		groupedFields.setAwsInstanceCount(_ctx.integerValue("DescribeFieldStatisticsResponse.GroupedFields.AwsInstanceCount"));
		describeFieldStatisticsResponse.setGroupedFields(groupedFields);
	 
	 	return describeFieldStatisticsResponse;
	}
}