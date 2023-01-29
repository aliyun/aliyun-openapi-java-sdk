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

import com.aliyuncs.dbfs.model.v20200418.GetSnapshotLinkResponse;
import com.aliyuncs.dbfs.model.v20200418.GetSnapshotLinkResponse.Data;
import com.aliyuncs.dbfs.model.v20200418.GetSnapshotLinkResponse.Data.EcsListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSnapshotLinkResponseUnmarshaller {

	public static GetSnapshotLinkResponse unmarshall(GetSnapshotLinkResponse getSnapshotLinkResponse, UnmarshallerContext _ctx) {
		
		getSnapshotLinkResponse.setRequestId(_ctx.stringValue("GetSnapshotLinkResponse.RequestId"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetSnapshotLinkResponse.Data.Status"));
		data.setTotalSize(_ctx.longValue("GetSnapshotLinkResponse.Data.TotalSize"));
		data.setSourceSize(_ctx.integerValue("GetSnapshotLinkResponse.Data.SourceSize"));
		data.setFsId(_ctx.stringValue("GetSnapshotLinkResponse.Data.FsId"));
		data.setSnapshotCount(_ctx.integerValue("GetSnapshotLinkResponse.Data.SnapshotCount"));
		data.setFsName(_ctx.stringValue("GetSnapshotLinkResponse.Data.FsName"));
		data.setLinkId(_ctx.stringValue("GetSnapshotLinkResponse.Data.LinkId"));
		data.setCategory(_ctx.stringValue("GetSnapshotLinkResponse.Data.Category"));

		List<EcsListItem> ecsList = new ArrayList<EcsListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSnapshotLinkResponse.Data.EcsList.Length"); i++) {
			EcsListItem ecsListItem = new EcsListItem();
			ecsListItem.setEcsId(_ctx.stringValue("GetSnapshotLinkResponse.Data.EcsList["+ i +"].EcsId"));

			ecsList.add(ecsListItem);
		}
		data.setEcsList(ecsList);
		getSnapshotLinkResponse.setData(data);
	 
	 	return getSnapshotLinkResponse;
	}
}