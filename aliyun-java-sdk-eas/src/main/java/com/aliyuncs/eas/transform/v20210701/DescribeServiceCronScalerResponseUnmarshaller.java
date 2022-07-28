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

package com.aliyuncs.eas.transform.v20210701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eas.model.v20210701.DescribeServiceCronScalerResponse;
import com.aliyuncs.eas.model.v20210701.DescribeServiceCronScalerResponse.ScaleJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceCronScalerResponseUnmarshaller {

	public static DescribeServiceCronScalerResponse unmarshall(DescribeServiceCronScalerResponse describeServiceCronScalerResponse, UnmarshallerContext _ctx) {
		
		describeServiceCronScalerResponse.setRequestId(_ctx.stringValue("DescribeServiceCronScalerResponse.RequestId"));
		describeServiceCronScalerResponse.setServiceName(_ctx.stringValue("DescribeServiceCronScalerResponse.ServiceName"));

		List<String> excludeDates = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceCronScalerResponse.ExcludeDates.Length"); i++) {
			excludeDates.add(_ctx.stringValue("DescribeServiceCronScalerResponse.ExcludeDates["+ i +"]"));
		}
		describeServiceCronScalerResponse.setExcludeDates(excludeDates);

		List<ScaleJob> scaleJobs = new ArrayList<ScaleJob>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceCronScalerResponse.ScaleJobs.Length"); i++) {
			ScaleJob scaleJob = new ScaleJob();
			scaleJob.setSchedule(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].Schedule"));
			scaleJob.setTargetSize(_ctx.integerValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].TargetSize"));
			scaleJob.setName(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].Name"));
			scaleJob.setMessage(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].Message"));
			scaleJob.setState(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].State"));
			scaleJob.setLastProbeTime(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].LastProbeTime"));
			scaleJob.setCreateTime(_ctx.stringValue("DescribeServiceCronScalerResponse.ScaleJobs["+ i +"].CreateTime"));

			scaleJobs.add(scaleJob);
		}
		describeServiceCronScalerResponse.setScaleJobs(scaleJobs);
	 
	 	return describeServiceCronScalerResponse;
	}
}