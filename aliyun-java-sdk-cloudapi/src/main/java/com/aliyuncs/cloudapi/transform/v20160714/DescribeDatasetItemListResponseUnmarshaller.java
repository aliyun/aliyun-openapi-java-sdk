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

import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetItemListResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetItemListResponse.DatasetItemInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatasetItemListResponseUnmarshaller {

	public static DescribeDatasetItemListResponse unmarshall(DescribeDatasetItemListResponse describeDatasetItemListResponse, UnmarshallerContext _ctx) {
		
		describeDatasetItemListResponse.setRequestId(_ctx.stringValue("DescribeDatasetItemListResponse.RequestId"));
		describeDatasetItemListResponse.setPageNumber(_ctx.integerValue("DescribeDatasetItemListResponse.PageNumber"));
		describeDatasetItemListResponse.setPageSize(_ctx.integerValue("DescribeDatasetItemListResponse.PageSize"));
		describeDatasetItemListResponse.setTotalCount(_ctx.integerValue("DescribeDatasetItemListResponse.TotalCount"));

		List<DatasetItemInfo> datasetItemInfoList = new ArrayList<DatasetItemInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDatasetItemListResponse.DatasetItemInfoList.Length"); i++) {
			DatasetItemInfo datasetItemInfo = new DatasetItemInfo();
			datasetItemInfo.setDatasetId(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].DatasetId"));
			datasetItemInfo.setDatasetItemId(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].DatasetItemId"));
			datasetItemInfo.setValue(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].Value"));
			datasetItemInfo.setExpiredTime(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].ExpiredTime"));
			datasetItemInfo.setModifiedTime(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].ModifiedTime"));
			datasetItemInfo.setCreatedTime(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].CreatedTime"));
			datasetItemInfo.setDescription(_ctx.stringValue("DescribeDatasetItemListResponse.DatasetItemInfoList["+ i +"].Description"));

			datasetItemInfoList.add(datasetItemInfo);
		}
		describeDatasetItemListResponse.setDatasetItemInfoList(datasetItemInfoList);
	 
	 	return describeDatasetItemListResponse;
	}
}