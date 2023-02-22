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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetHoneypotPresetResponse;
import com.aliyuncs.sas.model.v20181203.GetHoneypotPresetResponse.Data;
import com.aliyuncs.sas.model.v20181203.GetHoneypotPresetResponse.Data.FileInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHoneypotPresetResponseUnmarshaller {

	public static GetHoneypotPresetResponse unmarshall(GetHoneypotPresetResponse getHoneypotPresetResponse, UnmarshallerContext _ctx) {
		
		getHoneypotPresetResponse.setRequestId(_ctx.stringValue("GetHoneypotPresetResponse.RequestId"));
		getHoneypotPresetResponse.setSuccess(_ctx.booleanValue("GetHoneypotPresetResponse.Success"));
		getHoneypotPresetResponse.setCode(_ctx.stringValue("GetHoneypotPresetResponse.Code"));
		getHoneypotPresetResponse.setMessage(_ctx.stringValue("GetHoneypotPresetResponse.Message"));
		getHoneypotPresetResponse.setHttpStatusCode(_ctx.integerValue("GetHoneypotPresetResponse.HttpStatusCode"));

		Data data = new Data();
		data.setHoneypotImageName(_ctx.stringValue("GetHoneypotPresetResponse.Data.HoneypotImageName"));
		data.setPresetName(_ctx.stringValue("GetHoneypotPresetResponse.Data.PresetName"));
		data.setHoneypotPresetId(_ctx.stringValue("GetHoneypotPresetResponse.Data.HoneypotPresetId"));
		data.setMeta(_ctx.stringValue("GetHoneypotPresetResponse.Data.Meta"));
		data.setNodeId(_ctx.stringValue("GetHoneypotPresetResponse.Data.NodeId"));
		data.setControlNodeName(_ctx.stringValue("GetHoneypotPresetResponse.Data.ControlNodeName"));
		data.setHoneypotImageDisplayName(_ctx.stringValue("GetHoneypotPresetResponse.Data.HoneypotImageDisplayName"));
		data.setPresetType(_ctx.stringValue("GetHoneypotPresetResponse.Data.PresetType"));

		List<FileInfoListItem> fileInfoList = new ArrayList<FileInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetHoneypotPresetResponse.Data.FileInfoList.Length"); i++) {
			FileInfoListItem fileInfoListItem = new FileInfoListItem();
			fileInfoListItem.setFileId(_ctx.stringValue("GetHoneypotPresetResponse.Data.FileInfoList["+ i +"].FileId"));
			fileInfoListItem.setFileName(_ctx.stringValue("GetHoneypotPresetResponse.Data.FileInfoList["+ i +"].FileName"));
			fileInfoListItem.setOssUrl(_ctx.stringValue("GetHoneypotPresetResponse.Data.FileInfoList["+ i +"].OssUrl"));

			fileInfoList.add(fileInfoListItem);
		}
		data.setFileInfoList(fileInfoList);
		getHoneypotPresetResponse.setData(data);
	 
	 	return getHoneypotPresetResponse;
	}
}