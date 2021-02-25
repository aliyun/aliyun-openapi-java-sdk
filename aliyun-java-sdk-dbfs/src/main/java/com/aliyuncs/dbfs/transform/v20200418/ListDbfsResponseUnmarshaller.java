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

import com.aliyuncs.dbfs.model.v20200418.ListDbfsResponse;
import com.aliyuncs.dbfs.model.v20200418.ListDbfsResponse.Info;
import com.aliyuncs.dbfs.model.v20200418.ListDbfsResponse.Info.EcsListItem;
import com.aliyuncs.dbfs.model.v20200418.ListDbfsResponse.Info.TagList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDbfsResponseUnmarshaller {

	public static ListDbfsResponse unmarshall(ListDbfsResponse listDbfsResponse, UnmarshallerContext _ctx) {
		
		listDbfsResponse.setRequestId(_ctx.stringValue("ListDbfsResponse.RequestId"));
		listDbfsResponse.setTotalCount(_ctx.integerValue("ListDbfsResponse.TotalCount"));
		listDbfsResponse.setPageNumber(_ctx.integerValue("ListDbfsResponse.PageNumber"));
		listDbfsResponse.setPageSize(_ctx.integerValue("ListDbfsResponse.PageSize"));

		List<Info> dBFSInfo = new ArrayList<Info>();
		for (int i = 0; i < _ctx.lengthValue("ListDbfsResponse.DBFSInfo.Length"); i++) {
			Info info = new Info();
			info.setFsName(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].FsName"));
			info.setDBFSClusterId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].DBFSClusterId"));
			info.setCategory(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].Category"));
			info.setStatus(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].Status"));
			info.setRegionId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].RegionId"));
			info.setZoneId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].ZoneId"));
			info.setAttachNodeNumber(_ctx.integerValue("ListDbfsResponse.DBFSInfo["+ i +"].AttachNodeNumber"));
			info.setPayType(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].PayType"));
			info.setFsId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].FsId"));
			info.setSizeG(_ctx.integerValue("ListDbfsResponse.DBFSInfo["+ i +"].SizeG"));
			info.setCreatedTime(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].CreatedTime"));
			info.setKMSKeyId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].KMSKeyId"));
			info.setEncryption(_ctx.booleanValue("ListDbfsResponse.DBFSInfo["+ i +"].Encryption"));

			List<TagList> tags = new ArrayList<TagList>();
			for (int j = 0; j < _ctx.lengthValue("ListDbfsResponse.DBFSInfo["+ i +"].Tags.Length"); j++) {
				TagList tagList = new TagList();
				tagList.setTagKey(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].Tags["+ j +"].TagKey"));
				tagList.setTagValue(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].Tags["+ j +"].TagValue"));
				tagList.setId(_ctx.longValue("ListDbfsResponse.DBFSInfo["+ i +"].Tags["+ j +"].Id"));

				tags.add(tagList);
			}
			info.setTags(tags);

			List<EcsListItem> ecsList = new ArrayList<EcsListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListDbfsResponse.DBFSInfo["+ i +"].EcsList.Length"); j++) {
				EcsListItem ecsListItem = new EcsListItem();
				ecsListItem.setEcsId(_ctx.stringValue("ListDbfsResponse.DBFSInfo["+ i +"].EcsList["+ j +"].EcsId"));

				ecsList.add(ecsListItem);
			}
			info.setEcsList(ecsList);

			dBFSInfo.add(info);
		}
		listDbfsResponse.setDBFSInfo(dBFSInfo);
	 
	 	return listDbfsResponse;
	}
}