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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeCronJobPolicyServerlessResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeCronJobPolicyServerlessResponse.DriverCronJobAttrbute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCronJobPolicyServerlessResponseUnmarshaller {

	public static DescribeCronJobPolicyServerlessResponse unmarshall(DescribeCronJobPolicyServerlessResponse describeCronJobPolicyServerlessResponse, UnmarshallerContext _ctx) {
		
		describeCronJobPolicyServerlessResponse.setRequestId(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.RequestId"));
		describeCronJobPolicyServerlessResponse.setTotalRecordCount(_ctx.integerValue("DescribeCronJobPolicyServerlessResponse.TotalRecordCount"));
		describeCronJobPolicyServerlessResponse.setPageNumber(_ctx.integerValue("DescribeCronJobPolicyServerlessResponse.PageNumber"));
		describeCronJobPolicyServerlessResponse.setPageSize(_ctx.integerValue("DescribeCronJobPolicyServerlessResponse.PageSize"));

		List<DriverCronJobAttrbute> items = new ArrayList<DriverCronJobAttrbute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCronJobPolicyServerlessResponse.Items.Length"); i++) {
			DriverCronJobAttrbute driverCronJobAttrbute = new DriverCronJobAttrbute();
			driverCronJobAttrbute.setJobId(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].JobId"));
			driverCronJobAttrbute.setDBClusterId(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].DBClusterId"));
			driverCronJobAttrbute.setRegionId(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].RegionId"));
			driverCronJobAttrbute.setStartTime(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].StartTime"));
			driverCronJobAttrbute.setEndTime(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].EndTime"));
			driverCronJobAttrbute.setStatus(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].Status"));
			driverCronJobAttrbute.setOrderId(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].OrderId"));
			driverCronJobAttrbute.setCronExpression(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].CronExpression"));
			driverCronJobAttrbute.setAction(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].Action"));
			driverCronJobAttrbute.setScaleMin(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleMin"));
			driverCronJobAttrbute.setScaleMax(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleMax"));
			driverCronJobAttrbute.setScaleRoNumMin(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleRoNumMin"));
			driverCronJobAttrbute.setScaleRoNumMax(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleRoNumMax"));
			driverCronJobAttrbute.setAllowShutDown(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].AllowShutDown"));
			driverCronJobAttrbute.setSecondsUntilAutoPause(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].SecondsUntilAutoPause"));
			driverCronJobAttrbute.setScaleApRoNumMin(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleApRoNumMin"));
			driverCronJobAttrbute.setScaleApRoNumMax(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ScaleApRoNumMax"));
			driverCronJobAttrbute.setServerlessRuleMode(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ServerlessRuleMode"));
			driverCronJobAttrbute.setServerlessRuleCpuEnlargeThreshold(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ServerlessRuleCpuEnlargeThreshold"));
			driverCronJobAttrbute.setServerlessRuleCpuShrinkThreshold(_ctx.stringValue("DescribeCronJobPolicyServerlessResponse.Items["+ i +"].ServerlessRuleCpuShrinkThreshold"));

			items.add(driverCronJobAttrbute);
		}
		describeCronJobPolicyServerlessResponse.setItems(items);
	 
	 	return describeCronJobPolicyServerlessResponse;
	}
}