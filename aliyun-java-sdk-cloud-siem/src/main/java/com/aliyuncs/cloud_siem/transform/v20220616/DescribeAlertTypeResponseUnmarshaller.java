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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertTypeResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertTypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertTypeResponseUnmarshaller {

	public static DescribeAlertTypeResponse unmarshall(DescribeAlertTypeResponse describeAlertTypeResponse, UnmarshallerContext _ctx) {
		
		describeAlertTypeResponse.setRequestId(_ctx.stringValue("DescribeAlertTypeResponse.RequestId"));
		describeAlertTypeResponse.setSuccess(_ctx.booleanValue("DescribeAlertTypeResponse.Success"));
		describeAlertTypeResponse.setCode(_ctx.integerValue("DescribeAlertTypeResponse.Code"));
		describeAlertTypeResponse.setMessage(_ctx.stringValue("DescribeAlertTypeResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertTypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAlertType(_ctx.stringValue("DescribeAlertTypeResponse.Data["+ i +"].AlertType"));
			dataItem.setAlertTypeMds(_ctx.stringValue("DescribeAlertTypeResponse.Data["+ i +"].AlertTypeMds"));

			data.add(dataItem);
		}
		describeAlertTypeResponse.setData(data);
	 
	 	return describeAlertTypeResponse;
	}
}