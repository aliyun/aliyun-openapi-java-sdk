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

import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPolicyAppliedDbfsResponse;
import com.aliyuncs.dbfs.model.v20200418.ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAutoSnapshotPolicyAppliedDbfsResponseUnmarshaller {

	public static ListAutoSnapshotPolicyAppliedDbfsResponse unmarshall(ListAutoSnapshotPolicyAppliedDbfsResponse listAutoSnapshotPolicyAppliedDbfsResponse, UnmarshallerContext _ctx) {
		
		listAutoSnapshotPolicyAppliedDbfsResponse.setRequestId(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.RequestId"));
		listAutoSnapshotPolicyAppliedDbfsResponse.setPageNumber(_ctx.integerValue("ListAutoSnapshotPolicyAppliedDbfsResponse.PageNumber"));
		listAutoSnapshotPolicyAppliedDbfsResponse.setPageSize(_ctx.integerValue("ListAutoSnapshotPolicyAppliedDbfsResponse.PageSize"));
		listAutoSnapshotPolicyAppliedDbfsResponse.setTotalCount(_ctx.integerValue("ListAutoSnapshotPolicyAppliedDbfsResponse.TotalCount"));

		List<DbfsListItem> dbfsList = new ArrayList<DbfsListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList.Length"); i++) {
			DbfsListItem dbfsListItem = new DbfsListItem();
			dbfsListItem.setFsId(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].FsId"));
			dbfsListItem.setFsName(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].FsName"));
			dbfsListItem.setStatus(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].Status"));
			dbfsListItem.setSizeG(_ctx.longValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].SizeG"));
			dbfsListItem.setRegionId(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].RegionId"));
			dbfsListItem.setSnapshotCount(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].SnapshotCount"));
			dbfsListItem.setTotalSize(_ctx.stringValue("ListAutoSnapshotPolicyAppliedDbfsResponse.DbfsList["+ i +"].TotalSize"));

			dbfsList.add(dbfsListItem);
		}
		listAutoSnapshotPolicyAppliedDbfsResponse.setDbfsList(dbfsList);
	 
	 	return listAutoSnapshotPolicyAppliedDbfsResponse;
	}
}