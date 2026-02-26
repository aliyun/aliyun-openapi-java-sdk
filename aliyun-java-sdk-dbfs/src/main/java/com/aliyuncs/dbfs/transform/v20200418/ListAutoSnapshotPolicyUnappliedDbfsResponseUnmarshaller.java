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

import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPolicyUnappliedDbfsResponse;
import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoSnapshotPolicyUnappliedDbfsResponseUnmarshaller {

	public static ListAutoSnapshotPolicyUnappliedDbfsResponse unmarshall(ListAutoSnapshotPolicyUnappliedDbfsResponse listAutoSnapshotPolicyUnappliedDbfsResponse, UnmarshallerContext _ctx) {
		
		listAutoSnapshotPolicyUnappliedDbfsResponse.setRequestId(_ctx.stringValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.RequestId"));
		listAutoSnapshotPolicyUnappliedDbfsResponse.setPageNumber(_ctx.integerValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.PageNumber"));
		listAutoSnapshotPolicyUnappliedDbfsResponse.setPageSize(_ctx.integerValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.PageSize"));
		listAutoSnapshotPolicyUnappliedDbfsResponse.setTotalCount(_ctx.integerValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.TotalCount"));

		List<DbfsListItem> dbfsList = new ArrayList<DbfsListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList.Length"); i++) {
			DbfsListItem dbfsListItem = new DbfsListItem();
			dbfsListItem.setFsId(_ctx.stringValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].FsId"));
			dbfsListItem.setFsName(_ctx.stringValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].FsName"));
			dbfsListItem.setStatus(_ctx.stringValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].Status"));
			dbfsListItem.setSizeG(_ctx.longValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].SizeG"));
			dbfsListItem.setRegionId(_ctx.stringValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].RegionId"));
			dbfsListItem.setSnapshotCount(_ctx.integerValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].SnapshotCount"));
			dbfsListItem.setTotalSize(_ctx.longValue("ListAutoSnapshotPolicyUnappliedDbfsResponse.DbfsList["+ i +"].TotalSize"));

			dbfsList.add(dbfsListItem);
		}
		listAutoSnapshotPolicyUnappliedDbfsResponse.setDbfsList(dbfsList);
	 
	 	return listAutoSnapshotPolicyUnappliedDbfsResponse;
	}
}