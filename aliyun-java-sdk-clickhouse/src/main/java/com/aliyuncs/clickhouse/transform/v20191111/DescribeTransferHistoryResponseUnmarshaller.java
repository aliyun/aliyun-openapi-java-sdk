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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeTransferHistoryResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeTransferHistoryResponse.HistoryDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTransferHistoryResponseUnmarshaller {

	public static DescribeTransferHistoryResponse unmarshall(DescribeTransferHistoryResponse describeTransferHistoryResponse, UnmarshallerContext _ctx) {
		
		describeTransferHistoryResponse.setRequestId(_ctx.stringValue("DescribeTransferHistoryResponse.RequestId"));

		List<HistoryDetail> historyDetails = new ArrayList<HistoryDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTransferHistoryResponse.HistoryDetails.Length"); i++) {
			HistoryDetail historyDetail = new HistoryDetail();
			historyDetail.setSourceDBCluster(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].SourceDBCluster"));
			historyDetail.setSourceControlVersion(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].SourceControlVersion"));
			historyDetail.setTargetDBCluster(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].TargetDBCluster"));
			historyDetail.setTargetControlVersion(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].TargetControlVersion"));
			historyDetail.setStatus(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].Status"));
			historyDetail.setProgress(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].Progress"));
			historyDetail.setDisableWriteWindows(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].DisableWriteWindows"));
			historyDetail.setUnsyncedBytes(_ctx.longValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].UnsyncedBytes"));
			historyDetail.setUnsyncedParts(_ctx.longValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].UnsyncedParts"));
			historyDetail.setPartsPerMinute(_ctx.doubleValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].PartsPerMinute"));
			historyDetail.setBytesPerMinute(_ctx.longValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].BytesPerMinute"));
			historyDetail.setSubJob(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].SubJob"));
			historyDetail.setSubJobStatus(_ctx.stringValue("DescribeTransferHistoryResponse.HistoryDetails["+ i +"].SubJobStatus"));

			historyDetails.add(historyDetail);
		}
		describeTransferHistoryResponse.setHistoryDetails(historyDetails);
	 
	 	return describeTransferHistoryResponse;
	}
}