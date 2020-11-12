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

import com.aliyuncs.dbfs.model.v20200418.GetDbfsResponse;
import com.aliyuncs.dbfs.model.v20200418.GetDbfsResponse.DBFSInfo;
import com.aliyuncs.dbfs.model.v20200418.GetDbfsResponse.DBFSInfo.EcsListItem;
import com.aliyuncs.dbfs.model.v20200418.GetDbfsResponse.DBFSInfo.TagList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDbfsResponseUnmarshaller {

	public static GetDbfsResponse unmarshall(GetDbfsResponse getDbfsResponse, UnmarshallerContext _ctx) {
		
		getDbfsResponse.setRequestId(_ctx.stringValue("GetDbfsResponse.RequestId"));

		DBFSInfo dBFSInfo = new DBFSInfo();
		dBFSInfo.setFsName(_ctx.stringValue("GetDbfsResponse.DBFSInfo.FsName"));
		dBFSInfo.setDBFSClusterId(_ctx.stringValue("GetDbfsResponse.DBFSInfo.DBFSClusterId"));
		dBFSInfo.setCategory(_ctx.stringValue("GetDbfsResponse.DBFSInfo.Category"));
		dBFSInfo.setStatus(_ctx.stringValue("GetDbfsResponse.DBFSInfo.Status"));
		dBFSInfo.setRegionId(_ctx.stringValue("GetDbfsResponse.DBFSInfo.RegionId"));
		dBFSInfo.setZoneId(_ctx.stringValue("GetDbfsResponse.DBFSInfo.ZoneId"));
		dBFSInfo.setAttachNodeNumber(_ctx.integerValue("GetDbfsResponse.DBFSInfo.AttachNodeNumber"));
		dBFSInfo.setPayType(_ctx.stringValue("GetDbfsResponse.DBFSInfo.PayType"));
		dBFSInfo.setFsId(_ctx.stringValue("GetDbfsResponse.DBFSInfo.FsId"));
		dBFSInfo.setSizeG(_ctx.integerValue("GetDbfsResponse.DBFSInfo.SizeG"));
		dBFSInfo.setDescription(_ctx.stringValue("GetDbfsResponse.DBFSInfo.Description"));
		dBFSInfo.setCreatedTime(_ctx.stringValue("GetDbfsResponse.DBFSInfo.CreatedTime"));

		List<TagList> tags = new ArrayList<TagList>();
		for (int i = 0; i < _ctx.lengthValue("GetDbfsResponse.DBFSInfo.Tags.Length"); i++) {
			TagList tagList = new TagList();
			tagList.setTagKey(_ctx.stringValue("GetDbfsResponse.DBFSInfo.Tags["+ i +"].TagKey"));
			tagList.setTagValue(_ctx.stringValue("GetDbfsResponse.DBFSInfo.Tags["+ i +"].TagValue"));
			tagList.setId(_ctx.integerValue("GetDbfsResponse.DBFSInfo.Tags["+ i +"].Id"));

			tags.add(tagList);
		}
		dBFSInfo.setTags(tags);

		List<EcsListItem> ecsList = new ArrayList<EcsListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDbfsResponse.DBFSInfo.EcsList.Length"); i++) {
			EcsListItem ecsListItem = new EcsListItem();
			ecsListItem.setEcsId(_ctx.stringValue("GetDbfsResponse.DBFSInfo.EcsList["+ i +"].EcsId"));

			ecsList.add(ecsListItem);
		}
		dBFSInfo.setEcsList(ecsList);
		getDbfsResponse.setDBFSInfo(dBFSInfo);
	 
	 	return getDbfsResponse;
	}
}