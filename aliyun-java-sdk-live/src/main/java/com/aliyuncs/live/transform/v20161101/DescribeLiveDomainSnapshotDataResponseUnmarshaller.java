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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainSnapshotDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainSnapshotDataResponse.SnapshotDataInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainSnapshotDataResponseUnmarshaller {

	public static DescribeLiveDomainSnapshotDataResponse unmarshall(DescribeLiveDomainSnapshotDataResponse describeLiveDomainSnapshotDataResponse, UnmarshallerContext context) {
		
		describeLiveDomainSnapshotDataResponse.setRequestId(context.stringValue("DescribeLiveDomainSnapshotDataResponse.RequestId"));

		List<SnapshotDataInfo> snapshotDataInfos = new ArrayList<SnapshotDataInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveDomainSnapshotDataResponse.SnapshotDataInfos.Length"); i++) {
			SnapshotDataInfo snapshotDataInfo = new SnapshotDataInfo();
			snapshotDataInfo.setDate(context.stringValue("DescribeLiveDomainSnapshotDataResponse.SnapshotDataInfos["+ i +"].Date"));
			snapshotDataInfo.setTotal(context.integerValue("DescribeLiveDomainSnapshotDataResponse.SnapshotDataInfos["+ i +"].Total"));

			snapshotDataInfos.add(snapshotDataInfo);
		}
		describeLiveDomainSnapshotDataResponse.setSnapshotDataInfos(snapshotDataInfos);
	 
	 	return describeLiveDomainSnapshotDataResponse;
	}
}