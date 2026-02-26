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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListSourceFileResponse;
import com.aliyuncs.xrengine.model.v20221111.ListSourceFileResponse.Data;
import com.aliyuncs.xrengine.model.v20221111.ListSourceFileResponse.Data.PicListItem;
import com.aliyuncs.xrengine.model.v20221111.ListSourceFileResponse.Data.VideoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSourceFileResponseUnmarshaller {

	public static ListSourceFileResponse unmarshall(ListSourceFileResponse listSourceFileResponse, UnmarshallerContext _ctx) {
		
		listSourceFileResponse.setRequestId(_ctx.stringValue("ListSourceFileResponse.RequestId"));
		listSourceFileResponse.setSuccess(_ctx.booleanValue("ListSourceFileResponse.Success"));
		listSourceFileResponse.setCode(_ctx.stringValue("ListSourceFileResponse.Code"));
		listSourceFileResponse.setMessage(_ctx.stringValue("ListSourceFileResponse.Message"));

		Data data = new Data();

		List<PicListItem> picList = new ArrayList<PicListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSourceFileResponse.Data.PicList.Length"); i++) {
			PicListItem picListItem = new PicListItem();
			picListItem.setOssKey(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].OssKey"));
			picListItem.setFileName(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].FileName"));
			picListItem.setType(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].Type"));
			picListItem.setUrl(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].Url"));
			picListItem.setId(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].Id"));
			picListItem.setCreateTime(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].CreateTime"));
			picListItem.setModifiedTime(_ctx.stringValue("ListSourceFileResponse.Data.PicList["+ i +"].ModifiedTime"));

			picList.add(picListItem);
		}
		data.setPicList(picList);

		List<VideoListItem> videoList = new ArrayList<VideoListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSourceFileResponse.Data.VideoList.Length"); i++) {
			VideoListItem videoListItem = new VideoListItem();
			videoListItem.setOssKey(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].OssKey"));
			videoListItem.setFileName(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].FileName"));
			videoListItem.setType(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].Type"));
			videoListItem.setUrl(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].Url"));
			videoListItem.setId(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].Id"));
			videoListItem.setCreateTime(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].CreateTime"));
			videoListItem.setModifiedTime(_ctx.stringValue("ListSourceFileResponse.Data.VideoList["+ i +"].ModifiedTime"));

			videoList.add(videoListItem);
		}
		data.setVideoList(videoList);
		listSourceFileResponse.setData(data);
	 
	 	return listSourceFileResponse;
	}
}