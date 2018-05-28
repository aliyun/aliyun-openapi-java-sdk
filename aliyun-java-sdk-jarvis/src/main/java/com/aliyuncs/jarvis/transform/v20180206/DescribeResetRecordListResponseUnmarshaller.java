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

import com.aliyuncs.jarvis.model.v20180206.DescribeResetRecordListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeResetRecordListResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeResetRecordListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResetRecordListResponseUnmarshaller {

	public static DescribeResetRecordListResponse unmarshall(DescribeResetRecordListResponse describeResetRecordListResponse, UnmarshallerContext context) {
		
		describeResetRecordListResponse.setRequestId(context.stringValue("DescribeResetRecordListResponse.RequestId"));
		describeResetRecordListResponse.setModule(context.stringValue("DescribeResetRecordListResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeResetRecordListResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeResetRecordListResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeResetRecordListResponse.PageInfo.currentPage"));
		describeResetRecordListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeResetRecordListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setPunishType(context.stringValue("DescribeResetRecordListResponse.DataList["+ i +"].PunishType"));
			data.setDstIP(context.stringValue("DescribeResetRecordListResponse.DataList["+ i +"].DstIP"));
			data.setPunishResult(context.stringValue("DescribeResetRecordListResponse.DataList["+ i +"].PunishResult"));
			data.setDstPort(context.integerValue("DescribeResetRecordListResponse.DataList["+ i +"].DstPort"));
			data.setSrcIP(context.stringValue("DescribeResetRecordListResponse.DataList["+ i +"].SrcIP"));
			data.setPunishCount(context.integerValue("DescribeResetRecordListResponse.DataList["+ i +"].PunishCount"));

			dataList.add(data);
		}
		describeResetRecordListResponse.setDataList(dataList);
	 
	 	return describeResetRecordListResponse;
	}
}