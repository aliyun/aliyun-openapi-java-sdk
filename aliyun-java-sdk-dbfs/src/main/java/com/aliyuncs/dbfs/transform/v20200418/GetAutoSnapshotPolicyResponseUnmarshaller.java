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

package com.aliyuncs.dbfs.transform.v20200418;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dbfs.model.v20200418.GetAutoSnapshotPolicyResponse;
import com.aliyuncs.dbfs.model.v20200418.GetAutoSnapshotPolicyResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoSnapshotPolicyResponseUnmarshaller {

	public static GetAutoSnapshotPolicyResponse unmarshall(GetAutoSnapshotPolicyResponse getAutoSnapshotPolicyResponse, UnmarshallerContext _ctx) {
		
		getAutoSnapshotPolicyResponse.setRequestId(_ctx.stringValue("GetAutoSnapshotPolicyResponse.RequestId"));

		Data data = new Data();
		data.setPolicyId(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.PolicyId"));
		data.setPolicyName(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.PolicyName"));
		data.setAccountId(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.AccountId"));
		data.setRegionId(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.RegionId"));
		data.setStatus(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.Status"));
		data.setStatusDetail(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.StatusDetail"));
		data.setRetentionDays(_ctx.integerValue("GetAutoSnapshotPolicyResponse.Data.RetentionDays"));
		data.setAppliedDbfsNumber(_ctx.integerValue("GetAutoSnapshotPolicyResponse.Data.AppliedDbfsNumber"));
		data.setCreatedTime(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.CreatedTime"));
		data.setLastModified(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.LastModified"));

		List<String> repeatWeekdays = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoSnapshotPolicyResponse.Data.RepeatWeekdays.Length"); i++) {
			repeatWeekdays.add(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.RepeatWeekdays["+ i +"]"));
		}
		data.setRepeatWeekdays(repeatWeekdays);

		List<String> timePoints = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAutoSnapshotPolicyResponse.Data.TimePoints.Length"); i++) {
			timePoints.add(_ctx.stringValue("GetAutoSnapshotPolicyResponse.Data.TimePoints["+ i +"]"));
		}
		data.setTimePoints(timePoints);
		getAutoSnapshotPolicyResponse.setData(data);
	 
	 	return getAutoSnapshotPolicyResponse;
	}
}