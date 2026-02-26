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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.CreateSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSnapshotResponseUnmarshaller {

	public static CreateSnapshotResponse unmarshall(CreateSnapshotResponse createSnapshotResponse, UnmarshallerContext _ctx) {
		
		createSnapshotResponse.setRequestId(_ctx.stringValue("CreateSnapshotResponse.RequestId"));
		createSnapshotResponse.setOrderId(_ctx.stringValue("CreateSnapshotResponse.OrderId"));

		List<String> snapShotId = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateSnapshotResponse.SnapShotId.Length"); i++) {
			snapShotId.add(_ctx.stringValue("CreateSnapshotResponse.SnapShotId["+ i +"]"));
		}
		createSnapshotResponse.setSnapShotId(snapShotId);
	 
	 	return createSnapshotResponse;
	}
}