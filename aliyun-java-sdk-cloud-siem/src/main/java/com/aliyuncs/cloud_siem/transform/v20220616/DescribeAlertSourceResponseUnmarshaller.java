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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSourceResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSourceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertSourceResponseUnmarshaller {

	public static DescribeAlertSourceResponse unmarshall(DescribeAlertSourceResponse describeAlertSourceResponse, UnmarshallerContext _ctx) {
		
		describeAlertSourceResponse.setRequestId(_ctx.stringValue("DescribeAlertSourceResponse.RequestId"));
		describeAlertSourceResponse.setSuccess(_ctx.booleanValue("DescribeAlertSourceResponse.Success"));
		describeAlertSourceResponse.setCode(_ctx.integerValue("DescribeAlertSourceResponse.Code"));
		describeAlertSourceResponse.setMessage(_ctx.stringValue("DescribeAlertSourceResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertSourceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceName(_ctx.stringValue("DescribeAlertSourceResponse.Data["+ i +"].SourceName"));
			dataItem.setSource(_ctx.stringValue("DescribeAlertSourceResponse.Data["+ i +"].Source"));

			data.add(dataItem);
		}
		describeAlertSourceResponse.setData(data);
	 
	 	return describeAlertSourceResponse;
	}
}