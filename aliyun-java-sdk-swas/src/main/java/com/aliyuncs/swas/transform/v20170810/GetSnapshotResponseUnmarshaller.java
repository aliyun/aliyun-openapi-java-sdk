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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetSnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSnapshotResponseUnmarshaller {

	public static GetSnapshotResponse unmarshall(GetSnapshotResponse getSnapshotResponse, UnmarshallerContext _ctx) {
		
		getSnapshotResponse.setRequestId(_ctx.stringValue("GetSnapshotResponse.RequestId"));
		getSnapshotResponse.setStatus(_ctx.stringValue("GetSnapshotResponse.Status"));
		getSnapshotResponse.setRollBackTime(_ctx.longValue("GetSnapshotResponse.RollBackTime"));
		getSnapshotResponse.setIsSuccess(_ctx.booleanValue("GetSnapshotResponse.IsSuccess"));
		getSnapshotResponse.setProgress(_ctx.stringValue("GetSnapshotResponse.Progress"));
		getSnapshotResponse.setSnapshotsUid(_ctx.stringValue("GetSnapshotResponse.SnapshotsUid"));
		getSnapshotResponse.setCreateTime(_ctx.longValue("GetSnapshotResponse.CreateTime"));
		getSnapshotResponse.setCode(_ctx.stringValue("GetSnapshotResponse.Code"));
		getSnapshotResponse.setRemark(_ctx.stringValue("GetSnapshotResponse.Remark"));
		getSnapshotResponse.setName(_ctx.stringValue("GetSnapshotResponse.Name"));
	 
	 	return getSnapshotResponse;
	}
}