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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleTestHistogramResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeCustomizeRuleTestHistogramResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomizeRuleTestHistogramResponseUnmarshaller {

	public static DescribeCustomizeRuleTestHistogramResponse unmarshall(DescribeCustomizeRuleTestHistogramResponse describeCustomizeRuleTestHistogramResponse, UnmarshallerContext _ctx) {
		
		describeCustomizeRuleTestHistogramResponse.setRequestId(_ctx.stringValue("DescribeCustomizeRuleTestHistogramResponse.RequestId"));
		describeCustomizeRuleTestHistogramResponse.setSuccess(_ctx.booleanValue("DescribeCustomizeRuleTestHistogramResponse.Success"));
		describeCustomizeRuleTestHistogramResponse.setCode(_ctx.integerValue("DescribeCustomizeRuleTestHistogramResponse.Code"));
		describeCustomizeRuleTestHistogramResponse.setMessage(_ctx.stringValue("DescribeCustomizeRuleTestHistogramResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomizeRuleTestHistogramResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFrom(_ctx.longValue("DescribeCustomizeRuleTestHistogramResponse.Data["+ i +"].From"));
			dataItem.setTo(_ctx.longValue("DescribeCustomizeRuleTestHistogramResponse.Data["+ i +"].To"));
			dataItem.setCount(_ctx.longValue("DescribeCustomizeRuleTestHistogramResponse.Data["+ i +"].Count"));

			data.add(dataItem);
		}
		describeCustomizeRuleTestHistogramResponse.setData(data);
	 
	 	return describeCustomizeRuleTestHistogramResponse;
	}
}