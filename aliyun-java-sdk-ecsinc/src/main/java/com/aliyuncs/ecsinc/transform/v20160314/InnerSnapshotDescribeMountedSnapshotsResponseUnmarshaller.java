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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerSnapshotDescribeMountedSnapshotsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerSnapshotDescribeMountedSnapshotsResponseUnmarshaller {

	public static InnerSnapshotDescribeMountedSnapshotsResponse unmarshall(InnerSnapshotDescribeMountedSnapshotsResponse innerSnapshotDescribeMountedSnapshotsResponse, UnmarshallerContext context) {
		
		innerSnapshotDescribeMountedSnapshotsResponse.setRequestId(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.RequestId"));
		innerSnapshotDescribeMountedSnapshotsResponse.setCount(context.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.count"));
		innerSnapshotDescribeMountedSnapshotsResponse.setPageNo(context.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.pageNo"));
		innerSnapshotDescribeMountedSnapshotsResponse.setPageSize(context.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.pageSize"));
		innerSnapshotDescribeMountedSnapshotsResponse.setTotalCount(context.integerValue("InnerSnapshotDescribeMountedSnapshotsResponse.totalCount"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerSnapshotDescribeMountedSnapshotsResponse.errorCode.isSuccess"));
		innerSnapshotDescribeMountedSnapshotsResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerSnapshotDescribeMountedSnapshotsResponse.data.Length"); i++) {
			Item item = new Item();
			item.setDevice(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].device"));
			item.setEcsOwnerAliUid(context.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsOwnerAliUid"));
			item.setEcsInstanceId(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsInstanceId"));
			item.setSnapshotId(context.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].snapshotId"));
			item.setEcsRegionNo(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].ecsRegionNo"));
			item.setSnapshotOwnerAliUid(context.longValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].snapshotOwnerAliUid"));
			item.setStatus(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].status"));
			item.setMountedTime(context.stringValue("InnerSnapshotDescribeMountedSnapshotsResponse.data["+ i +"].mountedTime"));

			data.add(item);
		}
		innerSnapshotDescribeMountedSnapshotsResponse.setData(data);
	 
	 	return innerSnapshotDescribeMountedSnapshotsResponse;
	}
}