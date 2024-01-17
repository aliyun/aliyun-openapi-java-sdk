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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebReportTopIpResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebReportTopIpResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebReportTopIpResponseUnmarshaller {

	public static DescribeWebReportTopIpResponse unmarshall(DescribeWebReportTopIpResponse describeWebReportTopIpResponse, UnmarshallerContext _ctx) {
		
		describeWebReportTopIpResponse.setRequestId(_ctx.stringValue("DescribeWebReportTopIpResponse.RequestId"));

		List<DataItem> dataList = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebReportTopIpResponse.DataList.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSourceIp(_ctx.stringValue("DescribeWebReportTopIpResponse.DataList["+ i +"].SourceIp"));
			dataItem.setAreaId(_ctx.stringValue("DescribeWebReportTopIpResponse.DataList["+ i +"].AreaId"));
			dataItem.setIsp(_ctx.stringValue("DescribeWebReportTopIpResponse.DataList["+ i +"].Isp"));
			dataItem.setCount(_ctx.longValue("DescribeWebReportTopIpResponse.DataList["+ i +"].Count"));

			dataList.add(dataItem);
		}
		describeWebReportTopIpResponse.setDataList(dataList);
	 
	 	return describeWebReportTopIpResponse;
	}
}