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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetListResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetListResponse.DatasetInfo;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetListResponse.DatasetInfo.TagInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatasetListResponseUnmarshaller {

	public static DescribeDatasetListResponse unmarshall(DescribeDatasetListResponse describeDatasetListResponse, UnmarshallerContext _ctx) {
		
		describeDatasetListResponse.setRequestId(_ctx.stringValue("DescribeDatasetListResponse.RequestId"));
		describeDatasetListResponse.setPageNumber(_ctx.integerValue("DescribeDatasetListResponse.PageNumber"));
		describeDatasetListResponse.setPageSize(_ctx.integerValue("DescribeDatasetListResponse.PageSize"));
		describeDatasetListResponse.setTotalCount(_ctx.integerValue("DescribeDatasetListResponse.TotalCount"));

		List<DatasetInfo> datasetInfoList = new ArrayList<DatasetInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatasetListResponse.DatasetInfoList.Length"); i++) {
			DatasetInfo datasetInfo = new DatasetInfo();
			datasetInfo.setDatasetId(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].DatasetId"));
			datasetInfo.setDatasetName(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].DatasetName"));
			datasetInfo.setDatasetType(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].DatasetType"));
			datasetInfo.setModifiedTime(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].ModifiedTime"));
			datasetInfo.setCreatedTime(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].CreatedTime"));

			List<TagInfo> tags = new ArrayList<TagInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].Tags.Length"); j++) {
				TagInfo tagInfo = new TagInfo();
				tagInfo.setKey(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].Tags["+ j +"].Key"));
				tagInfo.setValue(_ctx.stringValue("DescribeDatasetListResponse.DatasetInfoList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagInfo);
			}
			datasetInfo.setTags(tags);

			datasetInfoList.add(datasetInfo);
		}
		describeDatasetListResponse.setDatasetInfoList(datasetInfoList);
	 
	 	return describeDatasetListResponse;
	}
}