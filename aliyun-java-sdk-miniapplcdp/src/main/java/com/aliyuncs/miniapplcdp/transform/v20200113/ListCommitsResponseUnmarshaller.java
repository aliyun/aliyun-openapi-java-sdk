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

package com.aliyuncs.miniapplcdp.transform.v20200113;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.miniapplcdp.model.v20200113.ListCommitsResponse;
import com.aliyuncs.miniapplcdp.model.v20200113.ListCommitsResponse.Data;
import com.aliyuncs.miniapplcdp.model.v20200113.ListCommitsResponse.Data.CommitItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCommitsResponseUnmarshaller {

	public static ListCommitsResponse unmarshall(ListCommitsResponse listCommitsResponse, UnmarshallerContext _ctx) {
		
		listCommitsResponse.setRequestId(_ctx.stringValue("ListCommitsResponse.RequestId"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCommitsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCommitsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCommitsResponse.Data.TotalCount"));

		List<CommitItem> items = new ArrayList<CommitItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCommitsResponse.Data.Items.Length"); i++) {
			CommitItem commitItem = new CommitItem();
			commitItem.setAppId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].AppId"));
			commitItem.setCommitId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].CommitId"));
			commitItem.setCreateTime(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].CreateTime"));
			commitItem.setCommitLog(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].CommitLog"));
			commitItem.setMainModuleCommitId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].MainModuleCommitId"));
			commitItem.setMainModuleId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].MainModuleId"));
			commitItem.setModelDataPath(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].ModelDataPath"));
			commitItem.setModifiedTime(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].ModifiedTime"));
			commitItem.setModuleId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].ModuleId"));
			commitItem.setResourceDataPath(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].ResourceDataPath"));
			commitItem.setResourceDigest(_ctx.mapValue("ListCommitsResponse.Data.Items["+ i +"].ResourceDigest"));
			commitItem.setRollbackToCommitId(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].RollbackToCommitId"));
			commitItem.setRollbackType(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].RollbackType"));
			commitItem.setSchemaVersion(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].SchemaVersion"));
			commitItem.setCommitType(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].CommitType"));
			commitItem.setModelDigest(_ctx.mapValue("ListCommitsResponse.Data.Items["+ i +"].ModelDigest"));
			commitItem.setCommitDigest(_ctx.stringValue("ListCommitsResponse.Data.Items["+ i +"].CommitDigest"));

			items.add(commitItem);
		}
		data.setItems(items);
		listCommitsResponse.setData(data);
	 
	 	return listCommitsResponse;
	}
}