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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceExtResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceExtResponse.InstanceExtSpecsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceExtResponseUnmarshaller {

	public static DescribeInstanceExtResponse unmarshall(DescribeInstanceExtResponse describeInstanceExtResponse, UnmarshallerContext _ctx) {
		
		describeInstanceExtResponse.setRequestId(_ctx.stringValue("DescribeInstanceExtResponse.RequestId"));
		describeInstanceExtResponse.setTotalCount(_ctx.longValue("DescribeInstanceExtResponse.TotalCount"));

		List<InstanceExtSpecsItem> instanceExtSpecs = new ArrayList<InstanceExtSpecsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceExtResponse.InstanceExtSpecs.Length"); i++) {
			InstanceExtSpecsItem instanceExtSpecsItem = new InstanceExtSpecsItem();
			instanceExtSpecsItem.setInstanceId(_ctx.stringValue("DescribeInstanceExtResponse.InstanceExtSpecs["+ i +"].InstanceId"));
			instanceExtSpecsItem.setNormalBandwidth(_ctx.longValue("DescribeInstanceExtResponse.InstanceExtSpecs["+ i +"].NormalBandwidth"));
			instanceExtSpecsItem.setFunctionVersion(_ctx.longValue("DescribeInstanceExtResponse.InstanceExtSpecs["+ i +"].FunctionVersion"));
			instanceExtSpecsItem.setServicePartner(_ctx.stringValue("DescribeInstanceExtResponse.InstanceExtSpecs["+ i +"].ServicePartner"));
			instanceExtSpecsItem.setProductPlan(_ctx.longValue("DescribeInstanceExtResponse.InstanceExtSpecs["+ i +"].ProductPlan"));

			instanceExtSpecs.add(instanceExtSpecsItem);
		}
		describeInstanceExtResponse.setInstanceExtSpecs(instanceExtSpecs);
	 
	 	return describeInstanceExtResponse;
	}
}