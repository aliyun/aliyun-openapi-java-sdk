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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.DescribeResourceDistributionResponse;
import com.aliyuncs.advisor_share.model.v20180608.DescribeResourceDistributionResponse.ResourceDistribution;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceDistributionResponseUnmarshaller {

	public static DescribeResourceDistributionResponse unmarshall(DescribeResourceDistributionResponse describeResourceDistributionResponse, UnmarshallerContext _ctx) {
		
		describeResourceDistributionResponse.setRequestId(_ctx.stringValue("DescribeResourceDistributionResponse.RequestId"));

		List<ResourceDistribution> data = new ArrayList<ResourceDistribution>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDistributionResponse.Data.Length"); i++) {
			ResourceDistribution resourceDistribution = new ResourceDistribution();
			resourceDistribution.setChecksNumOn(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].ChecksNumOn"));
			resourceDistribution.setProduct(_ctx.stringValue("DescribeResourceDistributionResponse.Data["+ i +"].Product"));
			resourceDistribution.setFailCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].FailCount"));
			resourceDistribution.setNormalCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].NormalCount"));
			resourceDistribution.setChecksNumOff(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].ChecksNumOff"));
			resourceDistribution.setWarningCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].WarningCount"));
			resourceDistribution.setRiskRate(_ctx.stringValue("DescribeResourceDistributionResponse.Data["+ i +"].RiskRate"));
			resourceDistribution.setCheckItemCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].CheckItemCount"));
			resourceDistribution.setTotalCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].TotalCount"));
			resourceDistribution.setCriticalCount(_ctx.integerValue("DescribeResourceDistributionResponse.Data["+ i +"].CriticalCount"));
			resourceDistribution.setDetails(_ctx.stringValue("DescribeResourceDistributionResponse.Data["+ i +"].Details"));

			data.add(resourceDistribution);
		}
		describeResourceDistributionResponse.setData(data);
	 
	 	return describeResourceDistributionResponse;
	}
}