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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodTieringStorageRetrievalDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodTieringStorageRetrievalDataResponse.RetrievalDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodTieringStorageRetrievalDataResponseUnmarshaller {

	public static DescribeVodTieringStorageRetrievalDataResponse unmarshall(DescribeVodTieringStorageRetrievalDataResponse describeVodTieringStorageRetrievalDataResponse, UnmarshallerContext _ctx) {
		
		describeVodTieringStorageRetrievalDataResponse.setRequestId(_ctx.stringValue("DescribeVodTieringStorageRetrievalDataResponse.RequestId"));

		List<RetrievalDataItem> retrievalData = new ArrayList<RetrievalDataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData.Length"); i++) {
			RetrievalDataItem retrievalDataItem = new RetrievalDataItem();
			retrievalDataItem.setTimeStamp(_ctx.stringValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].TimeStamp"));
			retrievalDataItem.setRegion(_ctx.stringValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].Region"));
			retrievalDataItem.setStorageClass(_ctx.stringValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].StorageClass"));
			retrievalDataItem.setRetrievalData(_ctx.longValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].RetrievalData"));
			retrievalDataItem.setCAStdRetrievalData(_ctx.longValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].CAStdRetrievalData"));
			retrievalDataItem.setCABulkRetrievalData(_ctx.longValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].CABulkRetrievalData"));
			retrievalDataItem.setCAHighPriorRetrievalData(_ctx.longValue("DescribeVodTieringStorageRetrievalDataResponse.RetrievalData["+ i +"].CAHighPriorRetrievalData"));

			retrievalData.add(retrievalDataItem);
		}
		describeVodTieringStorageRetrievalDataResponse.setRetrievalData(retrievalData);
	 
	 	return describeVodTieringStorageRetrievalDataResponse;
	}
}