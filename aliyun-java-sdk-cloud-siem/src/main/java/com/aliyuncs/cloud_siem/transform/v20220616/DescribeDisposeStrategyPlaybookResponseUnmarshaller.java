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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeStrategyPlaybookResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDisposeStrategyPlaybookResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDisposeStrategyPlaybookResponseUnmarshaller {

	public static DescribeDisposeStrategyPlaybookResponse unmarshall(DescribeDisposeStrategyPlaybookResponse describeDisposeStrategyPlaybookResponse, UnmarshallerContext _ctx) {
		
		describeDisposeStrategyPlaybookResponse.setRequestId(_ctx.stringValue("DescribeDisposeStrategyPlaybookResponse.RequestId"));
		describeDisposeStrategyPlaybookResponse.setSuccess(_ctx.booleanValue("DescribeDisposeStrategyPlaybookResponse.Success"));
		describeDisposeStrategyPlaybookResponse.setCode(_ctx.integerValue("DescribeDisposeStrategyPlaybookResponse.Code"));
		describeDisposeStrategyPlaybookResponse.setMessage(_ctx.stringValue("DescribeDisposeStrategyPlaybookResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDisposeStrategyPlaybookResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPlaybookName(_ctx.stringValue("DescribeDisposeStrategyPlaybookResponse.Data["+ i +"].PlaybookName"));
			dataItem.setPlaybookUuid(_ctx.stringValue("DescribeDisposeStrategyPlaybookResponse.Data["+ i +"].PlaybookUuid"));

			data.add(dataItem);
		}
		describeDisposeStrategyPlaybookResponse.setData(data);
	 
	 	return describeDisposeStrategyPlaybookResponse;
	}
}