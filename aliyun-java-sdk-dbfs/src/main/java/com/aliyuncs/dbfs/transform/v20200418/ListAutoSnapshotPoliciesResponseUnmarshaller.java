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

import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPoliciesResponse;
import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPoliciesResponse.SnapshotPoliciesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoSnapshotPoliciesResponseUnmarshaller {

	public static ListAutoSnapshotPoliciesResponse unmarshall(ListAutoSnapshotPoliciesResponse listAutoSnapshotPoliciesResponse, UnmarshallerContext _ctx) {
		
		listAutoSnapshotPoliciesResponse.setRequestId(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.RequestId"));
		listAutoSnapshotPoliciesResponse.setPageNumber(_ctx.integerValue("ListAutoSnapshotPoliciesResponse.PageNumber"));
		listAutoSnapshotPoliciesResponse.setPageSize(_ctx.integerValue("ListAutoSnapshotPoliciesResponse.PageSize"));
		listAutoSnapshotPoliciesResponse.setTotalCount(_ctx.integerValue("ListAutoSnapshotPoliciesResponse.TotalCount"));

		List<SnapshotPoliciesItem> snapshotPolicies = new ArrayList<SnapshotPoliciesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies.Length"); i++) {
			SnapshotPoliciesItem snapshotPoliciesItem = new SnapshotPoliciesItem();
			snapshotPoliciesItem.setPolicyId(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].PolicyId"));
			snapshotPoliciesItem.setPolicyName(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].PolicyName"));
			snapshotPoliciesItem.setAccountId(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].AccountId"));
			snapshotPoliciesItem.setRegionId(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].RegionId"));
			snapshotPoliciesItem.setStatus(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].Status"));
			snapshotPoliciesItem.setStatusDetail(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].StatusDetail"));
			snapshotPoliciesItem.setRetentionDays(_ctx.integerValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].RetentionDays"));
			snapshotPoliciesItem.setAppliedDbfsNumber(_ctx.integerValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].AppliedDbfsNumber"));
			snapshotPoliciesItem.setCreatedTime(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].CreatedTime"));
			snapshotPoliciesItem.setLastModified(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].LastModified"));

			List<String> repeatWeekdays = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].RepeatWeekdays.Length"); j++) {
				repeatWeekdays.add(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].RepeatWeekdays["+ j +"]"));
			}
			snapshotPoliciesItem.setRepeatWeekdays(repeatWeekdays);

			List<String> timePoints = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].TimePoints.Length"); j++) {
				timePoints.add(_ctx.stringValue("ListAutoSnapshotPoliciesResponse.SnapshotPolicies["+ i +"].TimePoints["+ j +"]"));
			}
			snapshotPoliciesItem.setTimePoints(timePoints);

			snapshotPolicies.add(snapshotPoliciesItem);
		}
		listAutoSnapshotPoliciesResponse.setSnapshotPolicies(snapshotPolicies);
	 
	 	return listAutoSnapshotPoliciesResponse;
	}
}