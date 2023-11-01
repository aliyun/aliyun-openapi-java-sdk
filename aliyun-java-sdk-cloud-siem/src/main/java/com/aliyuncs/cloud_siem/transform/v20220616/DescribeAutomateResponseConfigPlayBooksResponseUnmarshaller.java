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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigPlayBooksResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAutomateResponseConfigPlayBooksResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutomateResponseConfigPlayBooksResponseUnmarshaller {

	public static DescribeAutomateResponseConfigPlayBooksResponse unmarshall(DescribeAutomateResponseConfigPlayBooksResponse describeAutomateResponseConfigPlayBooksResponse, UnmarshallerContext _ctx) {
		
		describeAutomateResponseConfigPlayBooksResponse.setRequestId(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.RequestId"));
		describeAutomateResponseConfigPlayBooksResponse.setSuccess(_ctx.booleanValue("DescribeAutomateResponseConfigPlayBooksResponse.Success"));
		describeAutomateResponseConfigPlayBooksResponse.setCode(_ctx.integerValue("DescribeAutomateResponseConfigPlayBooksResponse.Code"));
		describeAutomateResponseConfigPlayBooksResponse.setMessage(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutomateResponseConfigPlayBooksResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUuid(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Data["+ i +"].Uuid"));
			dataItem.setDescription(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Data["+ i +"].Description"));
			dataItem.setDisplayName(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Data["+ i +"].DisplayName"));
			dataItem.setName(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Data["+ i +"].Name"));
			dataItem.setParamType(_ctx.stringValue("DescribeAutomateResponseConfigPlayBooksResponse.Data["+ i +"].ParamType"));

			data.add(dataItem);
		}
		describeAutomateResponseConfigPlayBooksResponse.setData(data);
	 
	 	return describeAutomateResponseConfigPlayBooksResponse;
	}
}