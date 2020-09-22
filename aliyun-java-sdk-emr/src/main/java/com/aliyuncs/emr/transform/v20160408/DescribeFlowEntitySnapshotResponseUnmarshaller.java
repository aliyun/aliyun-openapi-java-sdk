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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeFlowEntitySnapshotResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowEntitySnapshotResponseUnmarshaller {

	public static DescribeFlowEntitySnapshotResponse unmarshall(DescribeFlowEntitySnapshotResponse describeFlowEntitySnapshotResponse, UnmarshallerContext _ctx) {
		
		describeFlowEntitySnapshotResponse.setRequestId(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.RequestId"));
		describeFlowEntitySnapshotResponse.setGmtCreate(_ctx.longValue("DescribeFlowEntitySnapshotResponse.GmtCreate"));
		describeFlowEntitySnapshotResponse.setRevision(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.Revision"));
		describeFlowEntitySnapshotResponse.setUserId(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.UserId"));
		describeFlowEntitySnapshotResponse.setCommitterId(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.CommitterId"));
		describeFlowEntitySnapshotResponse.setMessage(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.Message"));
		describeFlowEntitySnapshotResponse.setEntityId(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.EntityId"));
		describeFlowEntitySnapshotResponse.setEntityGroupId(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.EntityGroupId"));
		describeFlowEntitySnapshotResponse.setEntityType(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.EntityType"));
		describeFlowEntitySnapshotResponse.setData(_ctx.stringValue("DescribeFlowEntitySnapshotResponse.Data"));
		describeFlowEntitySnapshotResponse.setActive(_ctx.booleanValue("DescribeFlowEntitySnapshotResponse.Active"));
	 
	 	return describeFlowEntitySnapshotResponse;
	}
}