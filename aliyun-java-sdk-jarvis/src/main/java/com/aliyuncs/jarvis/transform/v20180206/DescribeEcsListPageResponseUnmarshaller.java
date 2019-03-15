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

import com.aliyuncs.jarvis.model.v20180206.DescribeEcsListPageResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeEcsListPageResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeEcsListPageResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEcsListPageResponseUnmarshaller {

	public static DescribeEcsListPageResponse unmarshall(DescribeEcsListPageResponse describeEcsListPageResponse, UnmarshallerContext context) {
		
		describeEcsListPageResponse.setRequestId(context.stringValue("DescribeEcsListPageResponse.RequestId"));
		describeEcsListPageResponse.setModule(context.stringValue("DescribeEcsListPageResponse.module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeEcsListPageResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeEcsListPageResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeEcsListPageResponse.PageInfo.currentPage"));
		describeEcsListPageResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeEcsListPageResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setInstanceId(context.stringValue("DescribeEcsListPageResponse.DataList["+ i +"].InstanceId"));
			data.setInstanceName(context.stringValue("DescribeEcsListPageResponse.DataList["+ i +"].InstanceName"));
			data.setIP(context.stringValue("DescribeEcsListPageResponse.DataList["+ i +"].IP"));
			data.setRegion(context.stringValue("DescribeEcsListPageResponse.DataList["+ i +"].Region"));
			data.setItemSign(context.stringValue("DescribeEcsListPageResponse.DataList["+ i +"].ItemSign"));

			dataList.add(data);
		}
		describeEcsListPageResponse.setDataList(dataList);
	 
	 	return describeEcsListPageResponse;
	}
}