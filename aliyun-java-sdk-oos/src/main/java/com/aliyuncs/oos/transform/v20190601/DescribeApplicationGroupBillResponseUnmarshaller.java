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

package com.aliyuncs.oos.transform.v20190601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.DescribeApplicationGroupBillResponse;
import com.aliyuncs.oos.model.v20190601.DescribeApplicationGroupBillResponse.ApplicationGroupConsumeItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApplicationGroupBillResponseUnmarshaller {

	public static DescribeApplicationGroupBillResponse unmarshall(DescribeApplicationGroupBillResponse describeApplicationGroupBillResponse, UnmarshallerContext _ctx) {
		
		describeApplicationGroupBillResponse.setRequestId(_ctx.stringValue("DescribeApplicationGroupBillResponse.RequestId"));
		describeApplicationGroupBillResponse.setNextToken(_ctx.stringValue("DescribeApplicationGroupBillResponse.NextToken"));
		describeApplicationGroupBillResponse.setMaxResults(_ctx.integerValue("DescribeApplicationGroupBillResponse.MaxResults"));

		List<ApplicationGroupConsumeItem> applicationGroupConsume = new ArrayList<ApplicationGroupConsumeItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume.Length"); i++) {
			ApplicationGroupConsumeItem applicationGroupConsumeItem = new ApplicationGroupConsumeItem();
			applicationGroupConsumeItem.setInstanceId(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].InstanceId"));
			applicationGroupConsumeItem.setInstanceName(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].InstanceName"));
			applicationGroupConsumeItem.setInstanceType(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].InstanceType"));
			applicationGroupConsumeItem.setCreationTime(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].CreationTime"));
			applicationGroupConsumeItem.setStatus(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].Status"));
			applicationGroupConsumeItem.setAmount(_ctx.floatValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].Amount"));
			applicationGroupConsumeItem.setCurrency(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].Currency"));
			applicationGroupConsumeItem.setPerformance(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].Performance"));
			applicationGroupConsumeItem.setOptimization(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].Optimization"));
			applicationGroupConsumeItem.setPeakType(_ctx.stringValue("DescribeApplicationGroupBillResponse.ApplicationGroupConsume["+ i +"].PeakType"));

			applicationGroupConsume.add(applicationGroupConsumeItem);
		}
		describeApplicationGroupBillResponse.setApplicationGroupConsume(applicationGroupConsume);
	 
	 	return describeApplicationGroupBillResponse;
	}
}