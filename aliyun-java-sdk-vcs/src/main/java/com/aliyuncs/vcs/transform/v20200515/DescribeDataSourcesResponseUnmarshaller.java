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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.DescribeDataSourcesResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeDataSourcesResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeDataSourcesResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourcesResponseUnmarshaller {

	public static DescribeDataSourcesResponse unmarshall(DescribeDataSourcesResponse describeDataSourcesResponse, UnmarshallerContext _ctx) {
		
		describeDataSourcesResponse.setRequestId(_ctx.stringValue("DescribeDataSourcesResponse.RequestId"));
		describeDataSourcesResponse.setCode(_ctx.stringValue("DescribeDataSourcesResponse.Code"));
		describeDataSourcesResponse.setMessage(_ctx.stringValue("DescribeDataSourcesResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("DescribeDataSourcesResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("DescribeDataSourcesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("DescribeDataSourcesResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.longValue("DescribeDataSourcesResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourcesResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setDataSourceId(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setCorpId(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setDataSourceName(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].DataSourceName"));
			recordsItem.setDataSourceType(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].DataSourceType"));
			recordsItem.setUrl(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].Url"));
			recordsItem.setCreateTime(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].CreateTime"));
			recordsItem.setKafkaTopic(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].KafkaTopic"));
			recordsItem.setOssPath(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].OssPath"));
			recordsItem.setDescription(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].Description"));
			recordsItem.setStreamStatus(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].StreamStatus"));
			recordsItem.setAction(_ctx.stringValue("DescribeDataSourcesResponse.Data.Records["+ i +"].Action"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		describeDataSourcesResponse.setData(data);
	 
	 	return describeDataSourcesResponse;
	}
}