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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeOssObjectsResponse.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssObjectsResponseUnmarshaller {

	public static DescribeOssObjectsResponse unmarshall(DescribeOssObjectsResponse describeOssObjectsResponse, UnmarshallerContext _ctx) {
		
		describeOssObjectsResponse.setRequestId(_ctx.stringValue("DescribeOssObjectsResponse.RequestId"));
		describeOssObjectsResponse.setPageSize(_ctx.integerValue("DescribeOssObjectsResponse.PageSize"));
		describeOssObjectsResponse.setCurrentPage(_ctx.integerValue("DescribeOssObjectsResponse.CurrentPage"));
		describeOssObjectsResponse.setTotalCount(_ctx.integerValue("DescribeOssObjectsResponse.TotalCount"));

		List<Column> items = new ArrayList<Column>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssObjectsResponse.Items.Length"); i++) {
			Column column = new Column();
			column.setId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].Id"));
			column.setName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].Name"));
			column.setRegionId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RegionId"));
			column.setRiskLevelId(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelId"));
			column.setCategory(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].Category"));
			column.setInstanceId(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].InstanceId"));
			column.setFileId(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].FileId"));
			column.setRiskLevelName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].RiskLevelName"));
			column.setSize(_ctx.longValue("DescribeOssObjectsResponse.Items["+ i +"].Size"));
			column.setSensitiveCount(_ctx.integerValue("DescribeOssObjectsResponse.Items["+ i +"].SensitiveCount"));
			column.setRuleCount(_ctx.integerValue("DescribeOssObjectsResponse.Items["+ i +"].RuleCount"));
			column.setCategoryName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].CategoryName"));
			column.setBucketName(_ctx.stringValue("DescribeOssObjectsResponse.Items["+ i +"].BucketName"));

			items.add(column);
		}
		describeOssObjectsResponse.setItems(items);
	 
	 	return describeOssObjectsResponse;
	}
}