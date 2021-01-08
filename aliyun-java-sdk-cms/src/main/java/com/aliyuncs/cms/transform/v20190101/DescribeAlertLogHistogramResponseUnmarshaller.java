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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeAlertLogHistogramResponse;
import com.aliyuncs.cms.model.v20190101.DescribeAlertLogHistogramResponse.AlertLogHistogramListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertLogHistogramResponseUnmarshaller {

	public static DescribeAlertLogHistogramResponse unmarshall(DescribeAlertLogHistogramResponse describeAlertLogHistogramResponse, UnmarshallerContext _ctx) {
		
		describeAlertLogHistogramResponse.setRequestId(_ctx.stringValue("DescribeAlertLogHistogramResponse.RequestId"));
		describeAlertLogHistogramResponse.setCode(_ctx.stringValue("DescribeAlertLogHistogramResponse.Code"));
		describeAlertLogHistogramResponse.setMessage(_ctx.stringValue("DescribeAlertLogHistogramResponse.Message"));
		describeAlertLogHistogramResponse.setSuccess(_ctx.booleanValue("DescribeAlertLogHistogramResponse.Success"));

		List<AlertLogHistogramListItem> alertLogHistogramList = new ArrayList<AlertLogHistogramListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertLogHistogramResponse.AlertLogHistogramList.Length"); i++) {
			AlertLogHistogramListItem alertLogHistogramListItem = new AlertLogHistogramListItem();
			alertLogHistogramListItem.setCount(_ctx.integerValue("DescribeAlertLogHistogramResponse.AlertLogHistogramList["+ i +"].Count"));
			alertLogHistogramListItem.setFrom(_ctx.longValue("DescribeAlertLogHistogramResponse.AlertLogHistogramList["+ i +"].From"));
			alertLogHistogramListItem.setTo(_ctx.longValue("DescribeAlertLogHistogramResponse.AlertLogHistogramList["+ i +"].To"));

			alertLogHistogramList.add(alertLogHistogramListItem);
		}
		describeAlertLogHistogramResponse.setAlertLogHistogramList(alertLogHistogramList);
	 
	 	return describeAlertLogHistogramResponse;
	}
}