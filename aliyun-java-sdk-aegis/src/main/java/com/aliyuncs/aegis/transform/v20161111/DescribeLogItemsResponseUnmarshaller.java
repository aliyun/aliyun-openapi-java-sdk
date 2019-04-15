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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeLogItemsResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeLogItemsResponse.LogsListItem;
import com.aliyuncs.aegis.model.v20161111.DescribeLogItemsResponse.LogsListItem.MContentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogItemsResponseUnmarshaller {

	public static DescribeLogItemsResponse unmarshall(DescribeLogItemsResponse describeLogItemsResponse, UnmarshallerContext context) {
		
		describeLogItemsResponse.setRequestId(context.stringValue("DescribeLogItemsResponse.RequestId"));
		describeLogItemsResponse.setTotalCount(context.integerValue("DescribeLogItemsResponse.TotalCount"));
		describeLogItemsResponse.setCrackTotalCount(context.integerValue("DescribeLogItemsResponse.CrackTotalCount"));
		describeLogItemsResponse.setSetPageSize(context.integerValue("DescribeLogItemsResponse.SetPageSize"));
		describeLogItemsResponse.setProcessOffset(context.integerValue("DescribeLogItemsResponse.ProcessOffset"));
		describeLogItemsResponse.setNetworkOffset(context.integerValue("DescribeLogItemsResponse.NetworkOffset"));
		describeLogItemsResponse.setPortSnapshotOffset(context.integerValue("DescribeLogItemsResponse.PortSnapshotOffset"));
		describeLogItemsResponse.setProcessSnapshotTotalCount(context.integerValue("DescribeLogItemsResponse.ProcessSnapshotTotalCount"));
		describeLogItemsResponse.setCrackOffset(context.integerValue("DescribeLogItemsResponse.CrackOffset"));
		describeLogItemsResponse.setNetworkTotalCount(context.integerValue("DescribeLogItemsResponse.NetworkTotalCount"));
		describeLogItemsResponse.setPortSnapshotTotalCount(context.integerValue("DescribeLogItemsResponse.PortSnapshotTotalCount"));
		describeLogItemsResponse.setProcessSnapshotOffset(context.integerValue("DescribeLogItemsResponse.ProcessSnapshotOffset"));
		describeLogItemsResponse.setProcessTotalCount(context.integerValue("DescribeLogItemsResponse.ProcessTotalCount"));
		describeLogItemsResponse.setLoginTotalCount(context.integerValue("DescribeLogItemsResponse.LoginTotalCount"));
		describeLogItemsResponse.setCurrentPage(context.integerValue("DescribeLogItemsResponse.CurrentPage"));
		describeLogItemsResponse.setAccountSnapshotOffset(context.integerValue("DescribeLogItemsResponse.AccountSnapshotOffset"));
		describeLogItemsResponse.setAccountSnapshotTotalCount(context.integerValue("DescribeLogItemsResponse.AccountSnapshotTotalCount"));

		List<LogsListItem> logsList = new ArrayList<LogsListItem>();
		for (int i = 0; i < context.lengthValue("DescribeLogItemsResponse.LogsList.Length"); i++) {
			LogsListItem logsListItem = new LogsListItem();
			logsListItem.setMLogTime(context.stringValue("DescribeLogItemsResponse.LogsList["+ i +"].MLogTime"));
			logsListItem.setLogSourceId(context.stringValue("DescribeLogItemsResponse.LogsList["+ i +"].LogSourceId"));
			logsListItem.setLogSource(context.stringValue("DescribeLogItemsResponse.LogsList["+ i +"].LogSource"));

			List<MContentsItem> mContents = new ArrayList<MContentsItem>();
			for (int j = 0; j < context.lengthValue("DescribeLogItemsResponse.LogsList["+ i +"].MContents.Length"); j++) {
				MContentsItem mContentsItem = new MContentsItem();
				mContentsItem.setMKey(context.stringValue("DescribeLogItemsResponse.LogsList["+ i +"].MContents["+ j +"].MKey"));
				mContentsItem.setMValue(context.stringValue("DescribeLogItemsResponse.LogsList["+ i +"].MContents["+ j +"].MValue"));

				mContents.add(mContentsItem);
			}
			logsListItem.setMContents(mContents);

			logsList.add(logsListItem);
		}
		describeLogItemsResponse.setLogsList(logsList);
	 
	 	return describeLogItemsResponse;
	}
}