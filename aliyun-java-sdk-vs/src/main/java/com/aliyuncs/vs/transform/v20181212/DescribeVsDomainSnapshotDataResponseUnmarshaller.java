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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainSnapshotDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainSnapshotDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainSnapshotDataResponseUnmarshaller {

	public static DescribeVsDomainSnapshotDataResponse unmarshall(DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainSnapshotDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.RequestId"));
		describeVsDomainSnapshotDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.DomainName"));
		describeVsDomainSnapshotDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.StartTime"));
		describeVsDomainSnapshotDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.EndTime"));

		List<DataModule> snapshotDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainSnapshotDataResponse.SnapshotDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.SnapshotDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setSnapshotValue(_ctx.stringValue("DescribeVsDomainSnapshotDataResponse.SnapshotDataPerInterval["+ i +"].SnapshotValue"));

			snapshotDataPerInterval.add(dataModule);
		}
		describeVsDomainSnapshotDataResponse.setSnapshotDataPerInterval(snapshotDataPerInterval);
	 
	 	return describeVsDomainSnapshotDataResponse;
	}
}