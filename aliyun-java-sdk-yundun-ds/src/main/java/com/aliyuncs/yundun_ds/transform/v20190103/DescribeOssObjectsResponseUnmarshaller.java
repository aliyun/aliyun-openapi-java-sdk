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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeOssObjectsResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeOssObjectsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectsResponseUnmarshaller {

	public static DescribeOssObjectsResponse unmarshall(DescribeOssObjectsResponse describeOssObjectsResponse, UnmarshallerContext context) {
		
		describeOssObjectsResponse.setRequestId(context.stringValue("DescribeOssObjectsResponse.RequestId"));
		describeOssObjectsResponse.setPageSize(context.integerValue("DescribeOssObjectsResponse.PageSize"));
		describeOssObjectsResponse.setCurrentPage(context.integerValue("DescribeOssObjectsResponse.CurrentPage"));
		describeOssObjectsResponse.setTotalCount(context.integerValue("DescribeOssObjectsResponse.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < context.lengthValue("DescribeOssObjectsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setId(context.longValue("DescribeOssObjectsResponse.Items["+ i +"].Id"));
			column.setName(context.stringValue("DescribeOssObjectsResponse.Items["+ i +"].Name"));
			column.setRegionId(context.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RegionId"));
			column.setRiskLevelId(context.longValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelId"));
			column.setCategory(context.longValue("DescribeOssObjectsResponse.Items["+ i +"].Category"));
			column.setInstanceId(context.longValue("DescribeOssObjectsResponse.Items["+ i +"].InstanceId"));
			column.setFileId(context.stringValue("DescribeOssObjectsResponse.Items["+ i +"].FileId"));
			column.setRiskLevelName(context.longValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelName"));

			items.add(column);
		}
		describeOssObjectsResponse.setItems(items);
	 
	 	return describeOssObjectsResponse;
	}
}