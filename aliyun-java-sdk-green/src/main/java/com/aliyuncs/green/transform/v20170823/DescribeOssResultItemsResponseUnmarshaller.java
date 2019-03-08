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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeOssResultItemsResponse;
import com.aliyuncs.green.model.v20170823.DescribeOssResultItemsResponse.ScanResult;
import com.aliyuncs.green.model.v20170823.DescribeOssResultItemsResponse.ScanResult.FrameResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOssResultItemsResponseUnmarshaller {

	public static DescribeOssResultItemsResponse unmarshall(DescribeOssResultItemsResponse describeOssResultItemsResponse, UnmarshallerContext context) {
		
		describeOssResultItemsResponse.setRequestId(context.stringValue("DescribeOssResultItemsResponse.RequestId"));
		describeOssResultItemsResponse.setPageSize(context.integerValue("DescribeOssResultItemsResponse.PageSize"));
		describeOssResultItemsResponse.setCurrentPage(context.integerValue("DescribeOssResultItemsResponse.CurrentPage"));
		describeOssResultItemsResponse.setTotalCount(context.integerValue("DescribeOssResultItemsResponse.TotalCount"));
		describeOssResultItemsResponse.setQueryId(context.stringValue("DescribeOssResultItemsResponse.QueryId"));

		List<ScanResult> scanResultList = new ArrayList<ScanResult>();
		for (int i = 0; i < context.lengthValue("DescribeOssResultItemsResponse.ScanResultList.Length"); i++) {
			ScanResult scanResult = new ScanResult();
			scanResult.setTaskId(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].TaskId"));
			scanResult.setDataId(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].DataId"));
			scanResult.setNewUrl(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].NewUrl"));
			scanResult.setThumbnail(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Thumbnail"));
			scanResult.setRequestTime(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].RequestTime"));
			scanResult.setScanFinishedTime(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].ScanFinishedTime"));
			scanResult.setCreateTime(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].CreateTime"));
			scanResult.setSuggestion(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Suggestion"));
			scanResult.setId(context.longValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Id"));
			scanResult.setBucket(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Bucket"));
			scanResult.setObject(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Object"));
			scanResult.setScore(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Score"));
			scanResult.setHandleStatus(context.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].HandleStatus"));
			scanResult.setResourceStatus(context.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].ResourceStatus"));

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < context.lengthValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setThumbnail(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Thumbnail"));
				frameResult.setOffset(context.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Offset"));
				frameResult.setUrl(context.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Url"));

				frameResults.add(frameResult);
			}
			scanResult.setFrameResults(frameResults);

			scanResultList.add(scanResult);
		}
		describeOssResultItemsResponse.setScanResultList(scanResultList);
	 
	 	return describeOssResultItemsResponse;
	}
}