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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.GetVideoListResponse;
import com.aliyuncs.vod.model.v20170321.GetVideoListResponse.Video;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVideoListResponseUnmarshaller {

	public static GetVideoListResponse unmarshall(GetVideoListResponse getVideoListResponse, UnmarshallerContext _ctx) {
		
		getVideoListResponse.setRequestId(_ctx.stringValue("GetVideoListResponse.RequestId"));
		getVideoListResponse.setTotal(_ctx.integerValue("GetVideoListResponse.Total"));

		List<Video> videoList = new ArrayList<Video>();
		for (int i = 0; i < _ctx.lengthValue("GetVideoListResponse.VideoList.Length"); i++) {
			Video video = new Video();
			video.setStorageLocation(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].StorageLocation"));
			video.setStatus(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].Status"));
			video.setCreationTime(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].CreationTime"));
			video.setCateId(_ctx.longValue("GetVideoListResponse.VideoList["+ i +"].CateId"));
			video.setVideoId(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].VideoId"));
			video.setCreateTime(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].CreateTime"));
			video.setTags(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].Tags"));
			video.setModificationTime(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].ModificationTime"));
			video.setCateName(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].CateName"));
			video.setDescription(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].Description"));
			video.setAppId(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].AppId"));
			video.setSize(_ctx.longValue("GetVideoListResponse.VideoList["+ i +"].Size"));
			video.setCoverURL(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].CoverURL"));
			video.setDuration(_ctx.floatValue("GetVideoListResponse.VideoList["+ i +"].Duration"));
			video.setTitle(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].Title"));
			video.setModifyTime(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].ModifyTime"));
			video.setStorageClass(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].StorageClass"));
			video.setRestoreStatus(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].RestoreStatus"));
			video.setRestoreExpiration(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].RestoreExpiration"));
			video.setUserData(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].UserData"));

			List<String> snapshots = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetVideoListResponse.VideoList["+ i +"].Snapshots.Length"); j++) {
				snapshots.add(_ctx.stringValue("GetVideoListResponse.VideoList["+ i +"].Snapshots["+ j +"]"));
			}
			video.setSnapshots(snapshots);

			videoList.add(video);
		}
		getVideoListResponse.setVideoList(videoList);
	 
	 	return getVideoListResponse;
	}
}