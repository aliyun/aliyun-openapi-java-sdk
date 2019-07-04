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

	public static DescribeOssResultItemsResponse unmarshall(DescribeOssResultItemsResponse describeOssResultItemsResponse, UnmarshallerContext _ctx) {
		
		describeOssResultItemsResponse.setRequestId(_ctx.stringValue("DescribeOssResultItemsResponse.RequestId"));
		describeOssResultItemsResponse.setPageSize(_ctx.integerValue("DescribeOssResultItemsResponse.PageSize"));
		describeOssResultItemsResponse.setCurrentPage(_ctx.integerValue("DescribeOssResultItemsResponse.CurrentPage"));
		describeOssResultItemsResponse.setTotalCount(_ctx.integerValue("DescribeOssResultItemsResponse.TotalCount"));
		describeOssResultItemsResponse.setQueryId(_ctx.stringValue("DescribeOssResultItemsResponse.QueryId"));

		List<ScanResult> scanResultList = new ArrayList<ScanResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOssResultItemsResponse.ScanResultList.Length"); i++) {
			ScanResult scanResult = new ScanResult();
			scanResult.setTaskId(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].TaskId"));
			scanResult.setDataId(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].DataId"));
			scanResult.setNewUrl(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].NewUrl"));
			scanResult.setThumbnail(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Thumbnail"));
			scanResult.setRequestTime(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].RequestTime"));
			scanResult.setScanFinishedTime(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].ScanFinishedTime"));
			scanResult.setCreateTime(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].CreateTime"));
			scanResult.setSuggestion(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Suggestion"));
			scanResult.setId(_ctx.longValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Id"));
			scanResult.setBucket(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Bucket"));
			scanResult.setObject(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Object"));
			scanResult.setScore(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].Score"));
			scanResult.setHandleStatus(_ctx.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].HandleStatus"));
			scanResult.setResourceStatus(_ctx.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].ResourceStatus"));

			List<FrameResult> frameResults = new ArrayList<FrameResult>();
			for (int j = 0; j < _ctx.lengthValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults.Length"); j++) {
				FrameResult frameResult = new FrameResult();
				frameResult.setThumbnail(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Thumbnail"));
				frameResult.setOffset(_ctx.integerValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Offset"));
				frameResult.setUrl(_ctx.stringValue("DescribeOssResultItemsResponse.ScanResultList["+ i +"].FrameResults["+ j +"].Url"));

				frameResults.add(frameResult);
			}
			scanResult.setFrameResults(frameResults);

			scanResultList.add(scanResult);
		}
		describeOssResultItemsResponse.setScanResultList(scanResultList);
	 
	 	return describeOssResultItemsResponse;
	}
}