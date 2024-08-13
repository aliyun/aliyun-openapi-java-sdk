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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.MultiStreamURLItem;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.SeiParams;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.SeiParams.LayoutVolume;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.SeiParams.PassThrough;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.SingleSubParams;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.Background;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.EncodeParams;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.Layout;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.Layout.MaxVideoUser;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.Layout.UserPane;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.Layout.UserPane.UserInfo1;
import com.aliyuncs.live.model.v20161101.ListRtcMPUTaskDetailResponse.MpuTask.TranscodeParams.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRtcMPUTaskDetailResponseUnmarshaller {

	public static ListRtcMPUTaskDetailResponse unmarshall(ListRtcMPUTaskDetailResponse listRtcMPUTaskDetailResponse, UnmarshallerContext _ctx) {
		
		listRtcMPUTaskDetailResponse.setRequestId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.RequestId"));

		List<MpuTask> mPUTasks = new ArrayList<MpuTask>();
		for (int i = 0; i < _ctx.lengthValue("ListRtcMPUTaskDetailResponse.MPUTasks.Length"); i++) {
			MpuTask mpuTask = new MpuTask();
			mpuTask.setAppId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].AppId"));
			mpuTask.setChannelId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].ChannelId"));
			mpuTask.setTaskId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TaskId"));
			mpuTask.setMixMode(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].MixMode"));
			mpuTask.setStreamURL(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].StreamURL"));
			mpuTask.setRegion(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].Region"));

			SingleSubParams singleSubParams = new SingleSubParams();
			singleSubParams.setSourceType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SingleSubParams.SourceType"));
			singleSubParams.setStreamType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SingleSubParams.StreamType"));
			singleSubParams.setUserId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SingleSubParams.UserId"));
			mpuTask.setSingleSubParams(singleSubParams);

			TranscodeParams transcodeParams = new TranscodeParams();

			Background background = new Background();
			background.setRenderMode(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Background.RenderMode"));
			background.setURL(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Background.URL"));
			transcodeParams.setBackground(background);

			EncodeParams encodeParams = new EncodeParams();
			encodeParams.setAudioOnly(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.AudioOnly"));
			encodeParams.setAudioBitrate(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.AudioBitrate"));
			encodeParams.setAudioChannels(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.AudioChannels"));
			encodeParams.setAudioSampleRate(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.AudioSampleRate"));
			encodeParams.setVideoCodec(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoCodec"));
			encodeParams.setVideoBitrate(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoBitrate"));
			encodeParams.setVideoFramerate(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoFramerate"));
			encodeParams.setVideoGop(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoGop"));
			encodeParams.setVideoHeight(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoHeight"));
			encodeParams.setVideoWidth(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.VideoWidth"));
			encodeParams.setEnhancedParam(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.EncodeParams.EnhancedParam"));
			transcodeParams.setEncodeParams(encodeParams);

			Layout layout = new Layout();
			layout.setLayoutMode(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.LayoutMode"));

			MaxVideoUser maxVideoUser = new MaxVideoUser();
			maxVideoUser.setSourceType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.MaxVideoUser.SourceType"));
			maxVideoUser.setStreamType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.MaxVideoUser.StreamType"));
			maxVideoUser.setChannelId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.MaxVideoUser.ChannelId"));
			maxVideoUser.setUserId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.MaxVideoUser.UserId"));
			layout.setMaxVideoUser(maxVideoUser);

			List<UserPane> userPanes = new ArrayList<UserPane>();
			for (int j = 0; j < _ctx.lengthValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes.Length"); j++) {
				UserPane userPane = new UserPane();
				userPane.setHeight(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].Height"));
				userPane.setWidth(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].Width"));
				userPane.setX(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].X"));
				userPane.setY(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].Y"));
				userPane.setZOrder(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].ZOrder"));
				userPane.setBackgroundImageUrl(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].BackgroundImageUrl"));
				userPane.setRenderMode(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].RenderMode"));

				UserInfo1 userInfo1 = new UserInfo1();
				userInfo1.setSourceType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].UserInfo.SourceType"));
				userInfo1.setChannelId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].UserInfo.ChannelId"));
				userInfo1.setUserId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.Layout.UserPanes["+ j +"].UserInfo.UserId"));
				userPane.setUserInfo1(userInfo1);

				userPanes.add(userPane);
			}
			layout.setUserPanes(userPanes);
			transcodeParams.setLayout(layout);

			List<UserInfo> userInfos = new ArrayList<UserInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.UserInfos.Length"); j++) {
				UserInfo userInfo = new UserInfo();
				userInfo.setChannelId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.UserInfos["+ j +"].ChannelId"));
				userInfo.setUserId(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.UserInfos["+ j +"].UserId"));
				userInfo.setSourceType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.UserInfos["+ j +"].SourceType"));
				userInfo.setStreamType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].TranscodeParams.UserInfos["+ j +"].StreamType"));

				userInfos.add(userInfo);
			}
			transcodeParams.setUserInfos(userInfos);
			mpuTask.setTranscodeParams(transcodeParams);

			SeiParams seiParams = new SeiParams();
			seiParams.setPayloadType(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.PayloadType"));

			LayoutVolume layoutVolume = new LayoutVolume();
			layoutVolume.setFollowIdr(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.LayoutVolume.FollowIdr"));
			layoutVolume.setInterval(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.LayoutVolume.Interval"));
			seiParams.setLayoutVolume(layoutVolume);

			PassThrough passThrough = new PassThrough();
			passThrough.setFollowIdr(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.PassThrough.FollowIdr"));
			passThrough.setInterval(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.PassThrough.Interval"));
			passThrough.setPayloadContent(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.PassThrough.PayloadContent"));
			passThrough.setPayloadContentKey(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].SeiParams.PassThrough.PayloadContentKey"));
			seiParams.setPassThrough(passThrough);
			mpuTask.setSeiParams(seiParams);

			List<MultiStreamURLItem> multiStreamURL = new ArrayList<MultiStreamURLItem>();
			for (int j = 0; j < _ctx.lengthValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].MultiStreamURL.Length"); j++) {
				MultiStreamURLItem multiStreamURLItem = new MultiStreamURLItem();
				multiStreamURLItem.setURL(_ctx.stringValue("ListRtcMPUTaskDetailResponse.MPUTasks["+ i +"].MultiStreamURL["+ j +"].URL"));

				multiStreamURL.add(multiStreamURLItem);
			}
			mpuTask.setMultiStreamURL(multiStreamURL);

			mPUTasks.add(mpuTask);
		}
		listRtcMPUTaskDetailResponse.setMPUTasks(mPUTasks);
	 
	 	return listRtcMPUTaskDetailResponse;
	}
}