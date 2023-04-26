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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.CreateDefaultAutoSnapshotPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDefaultAutoSnapshotPolicyResponseUnmarshaller {

	public static CreateDefaultAutoSnapshotPolicyResponse unmarshall(CreateDefaultAutoSnapshotPolicyResponse createDefaultAutoSnapshotPolicyResponse, UnmarshallerContext _ctx) {
		
		createDefaultAutoSnapshotPolicyResponse.setRequestId(_ctx.stringValue("CreateDefaultAutoSnapshotPolicyResponse.RequestId"));
		createDefaultAutoSnapshotPolicyResponse.setTimePoints(_ctx.stringValue("CreateDefaultAutoSnapshotPolicyResponse.TimePoints"));
		createDefaultAutoSnapshotPolicyResponse.setAutoSnapshotPolicyName(_ctx.stringValue("CreateDefaultAutoSnapshotPolicyResponse.AutoSnapshotPolicyName"));
		createDefaultAutoSnapshotPolicyResponse.setRepeatWeekdays(_ctx.stringValue("CreateDefaultAutoSnapshotPolicyResponse.RepeatWeekdays"));
		createDefaultAutoSnapshotPolicyResponse.setAutoSnapshotPolicyId(_ctx.stringValue("CreateDefaultAutoSnapshotPolicyResponse.AutoSnapshotPolicyId"));
		createDefaultAutoSnapshotPolicyResponse.setRetentionDays(_ctx.integerValue("CreateDefaultAutoSnapshotPolicyResponse.RetentionDays"));
	 
	 	return createDefaultAutoSnapshotPolicyResponse;
	}
}