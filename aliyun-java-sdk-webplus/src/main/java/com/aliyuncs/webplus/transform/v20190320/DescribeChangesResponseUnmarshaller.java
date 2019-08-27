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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeChangesResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeChangesResponse.Change;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeChangesResponseUnmarshaller {

	public static DescribeChangesResponse unmarshall(DescribeChangesResponse describeChangesResponse, UnmarshallerContext _ctx) {
		
		describeChangesResponse.setRequestId(_ctx.stringValue("DescribeChangesResponse.RequestId"));
		describeChangesResponse.setCode(_ctx.stringValue("DescribeChangesResponse.Code"));
		describeChangesResponse.setMessage(_ctx.stringValue("DescribeChangesResponse.Message"));
		describeChangesResponse.setPageNumber(_ctx.integerValue("DescribeChangesResponse.PageNumber"));
		describeChangesResponse.setPageSize(_ctx.integerValue("DescribeChangesResponse.PageSize"));
		describeChangesResponse.setTotalCount(_ctx.integerValue("DescribeChangesResponse.TotalCount"));

		List<Change> changes = new ArrayList<Change>();
		for (int i = 0; i < _ctx.lengthValue("DescribeChangesResponse.Changes.Length"); i++) {
			Change change = new Change();
			change.setChangeId(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].ChangeId"));
			change.setEnvId(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].EnvId"));
			change.setChangeName(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].ChangeName"));
			change.setChangeDescription(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].ChangeDescription"));
			change.setChangeFinished(_ctx.booleanValue("DescribeChangesResponse.Changes["+ i +"].ChangeFinished"));
			change.setChangeSucceed(_ctx.booleanValue("DescribeChangesResponse.Changes["+ i +"].ChangeSucceed"));
			change.setChangeAborted(_ctx.booleanValue("DescribeChangesResponse.Changes["+ i +"].ChangeAborted"));
			change.setChangePaused(_ctx.booleanValue("DescribeChangesResponse.Changes["+ i +"].ChangePaused"));
			change.setChangeTimedout(_ctx.booleanValue("DescribeChangesResponse.Changes["+ i +"].ChangeTimedout"));
			change.setCreateTime(_ctx.longValue("DescribeChangesResponse.Changes["+ i +"].CreateTime"));
			change.setUpdateTime(_ctx.longValue("DescribeChangesResponse.Changes["+ i +"].UpdateTime"));
			change.setFinishTime(_ctx.longValue("DescribeChangesResponse.Changes["+ i +"].FinishTime"));
			change.setActionName(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].ActionName"));
			change.setCreateUsername(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].CreateUsername"));
			change.setChangeMessage(_ctx.stringValue("DescribeChangesResponse.Changes["+ i +"].ChangeMessage"));

			changes.add(change);
		}
		describeChangesResponse.setChanges(changes);
	 
	 	return describeChangesResponse;
	}
}