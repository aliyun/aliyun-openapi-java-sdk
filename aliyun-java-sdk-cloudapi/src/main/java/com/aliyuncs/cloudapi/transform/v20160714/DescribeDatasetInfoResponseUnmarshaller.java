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

import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetInfoResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeDatasetInfoResponse.DatasetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDatasetInfoResponseUnmarshaller {

	public static DescribeDatasetInfoResponse unmarshall(DescribeDatasetInfoResponse describeDatasetInfoResponse, UnmarshallerContext _ctx) {
		
		describeDatasetInfoResponse.setRequestId(_ctx.stringValue("DescribeDatasetInfoResponse.RequestId"));

		DatasetInfo datasetInfo = new DatasetInfo();
		datasetInfo.setDatasetId(_ctx.stringValue("DescribeDatasetInfoResponse.DatasetInfo.DatasetId"));
		datasetInfo.setDatasetName(_ctx.stringValue("DescribeDatasetInfoResponse.DatasetInfo.DatasetName"));
		datasetInfo.setDatasetType(_ctx.stringValue("DescribeDatasetInfoResponse.DatasetInfo.DatasetType"));
		datasetInfo.setModifiedTime(_ctx.stringValue("DescribeDatasetInfoResponse.DatasetInfo.ModifiedTime"));
		datasetInfo.setCreatedTime(_ctx.stringValue("DescribeDatasetInfoResponse.DatasetInfo.CreatedTime"));
		describeDatasetInfoResponse.setDatasetInfo(datasetInfo);
	 
	 	return describeDatasetInfoResponse;
	}
}