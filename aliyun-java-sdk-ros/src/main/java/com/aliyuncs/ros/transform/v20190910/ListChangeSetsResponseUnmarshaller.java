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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListChangeSetsResponse;
import com.aliyuncs.ros.model.v20190910.ListChangeSetsResponse.ChangeSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListChangeSetsResponseUnmarshaller {

	public static ListChangeSetsResponse unmarshall(ListChangeSetsResponse listChangeSetsResponse, UnmarshallerContext _ctx) {
		
		listChangeSetsResponse.setRequestId(_ctx.stringValue("ListChangeSetsResponse.RequestId"));
		listChangeSetsResponse.setPageNumber(_ctx.integerValue("ListChangeSetsResponse.PageNumber"));
		listChangeSetsResponse.setPageSize(_ctx.integerValue("ListChangeSetsResponse.PageSize"));
		listChangeSetsResponse.setTotalCount(_ctx.integerValue("ListChangeSetsResponse.TotalCount"));

		List<ChangeSet> changeSets = new ArrayList<ChangeSet>();
		for (int i = 0; i < _ctx.lengthValue("ListChangeSetsResponse.ChangeSets.Length"); i++) {
			ChangeSet changeSet = new ChangeSet();
			changeSet.setChangeSetId(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].ChangeSetId"));
			changeSet.setChangeSetName(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].ChangeSetName"));
			changeSet.setChangeSetType(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].ChangeSetType"));
			changeSet.setCreateTime(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].CreateTime"));
			changeSet.setDescription(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].Description"));
			changeSet.setExecutionStatus(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].ExecutionStatus"));
			changeSet.setRegionId(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].RegionId"));
			changeSet.setStackId(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].StackId"));
			changeSet.setStackName(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].StackName"));
			changeSet.setStatus(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].Status"));
			changeSet.setStatusReason(_ctx.stringValue("ListChangeSetsResponse.ChangeSets["+ i +"].StatusReason"));

			changeSets.add(changeSet);
		}
		listChangeSetsResponse.setChangeSets(changeSets);
	 
	 	return listChangeSetsResponse;
	}
}