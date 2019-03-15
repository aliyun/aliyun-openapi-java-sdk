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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeConsoleAccessWhiteListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeConsoleAccessWhiteListResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeConsoleAccessWhiteListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsoleAccessWhiteListResponseUnmarshaller {

	public static DescribeConsoleAccessWhiteListResponse unmarshall(DescribeConsoleAccessWhiteListResponse describeConsoleAccessWhiteListResponse, UnmarshallerContext context) {
		
		describeConsoleAccessWhiteListResponse.setRequestId(context.stringValue("DescribeConsoleAccessWhiteListResponse.RequestId"));
		describeConsoleAccessWhiteListResponse.setModule(context.stringValue("DescribeConsoleAccessWhiteListResponse.module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeConsoleAccessWhiteListResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeConsoleAccessWhiteListResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeConsoleAccessWhiteListResponse.PageInfo.currentPage"));
		describeConsoleAccessWhiteListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeConsoleAccessWhiteListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setId(context.integerValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].Id"));
			data.setSrcIp(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].SrcIp"));
			data.setDstIp(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].DstIp"));
			data.setInsProduct(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].InsProduct"));
			data.setRegionId(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].RegionId"));
			data.setStatus(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].Status"));
			data.setGmtCreate(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].GmtCreate"));
			data.setGmtRealExpire(context.stringValue("DescribeConsoleAccessWhiteListResponse.DataList["+ i +"].GmtRealExpire"));

			dataList.add(data);
		}
		describeConsoleAccessWhiteListResponse.setDataList(dataList);
	 
	 	return describeConsoleAccessWhiteListResponse;
	}
}