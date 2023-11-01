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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSourceWithEventResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAlertSourceWithEventResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAlertSourceWithEventResponseUnmarshaller {

	public static DescribeAlertSourceWithEventResponse unmarshall(DescribeAlertSourceWithEventResponse describeAlertSourceWithEventResponse, UnmarshallerContext _ctx) {
		
		describeAlertSourceWithEventResponse.setRequestId(_ctx.stringValue("DescribeAlertSourceWithEventResponse.RequestId"));
		describeAlertSourceWithEventResponse.setSuccess(_ctx.booleanValue("DescribeAlertSourceWithEventResponse.Success"));
		describeAlertSourceWithEventResponse.setCode(_ctx.integerValue("DescribeAlertSourceWithEventResponse.Code"));
		describeAlertSourceWithEventResponse.setMessage(_ctx.stringValue("DescribeAlertSourceWithEventResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAlertSourceWithEventResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceName(_ctx.stringValue("DescribeAlertSourceWithEventResponse.Data["+ i +"].SourceName"));
			dataItem.setSource(_ctx.stringValue("DescribeAlertSourceWithEventResponse.Data["+ i +"].Source"));

			data.add(dataItem);
		}
		describeAlertSourceWithEventResponse.setData(data);
	 
	 	return describeAlertSourceWithEventResponse;
	}
}