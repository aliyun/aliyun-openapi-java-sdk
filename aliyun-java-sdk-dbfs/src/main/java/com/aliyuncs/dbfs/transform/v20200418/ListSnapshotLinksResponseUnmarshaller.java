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

import com.aliyuncs.dbfs.model.v20200418.ListSnapshotLinksResponse;
import com.aliyuncs.dbfs.model.v20200418.ListSnapshotLinksResponse.Info;
import com.aliyuncs.dbfs.model.v20200418.ListSnapshotLinksResponse.Info.EcsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSnapshotLinksResponseUnmarshaller {

	public static ListSnapshotLinksResponse unmarshall(ListSnapshotLinksResponse listSnapshotLinksResponse, UnmarshallerContext _ctx) {
		
		listSnapshotLinksResponse.setRequestId(_ctx.stringValue("ListSnapshotLinksResponse.RequestId"));
		listSnapshotLinksResponse.setTotalCount(_ctx.integerValue("ListSnapshotLinksResponse.TotalCount"));
		listSnapshotLinksResponse.setPageSize(_ctx.integerValue("ListSnapshotLinksResponse.PageSize"));
		listSnapshotLinksResponse.setPageNumber(_ctx.integerValue("ListSnapshotLinksResponse.PageNumber"));

		List<Info> snapshotLinks = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("ListSnapshotLinksResponse.SnapshotLinks.Length"); i++) {
			Info info = new Info();
			info.setStatus(_ctx.stringValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].Status"));
			info.setTotalSize(_ctx.longValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].TotalSize"));
			info.setSourceSize(_ctx.integerValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].SourceSize"));
			info.setFsId(_ctx.stringValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].FsId"));
			info.setSnapshotCount(_ctx.integerValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].SnapshotCount"));
			info.setFsName(_ctx.stringValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].FsName"));
			info.setLinkId(_ctx.stringValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].LinkId"));

			List<EcsListItem> ecsList = new ArrayList<EcsListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].EcsList.Length"); j++) {
				EcsListItem ecsListItem = new EcsListItem();
				ecsListItem.setEcsId(_ctx.stringValue("ListSnapshotLinksResponse.SnapshotLinks["+ i +"].EcsList["+ j +"].EcsId"));

				ecsList.add(ecsListItem);
			}
			info.setEcsList(ecsList);

			snapshotLinks.add(info);
		}
		listSnapshotLinksResponse.setSnapshotLinks(snapshotLinks);
	 
	 	return listSnapshotLinksResponse;
	}
}