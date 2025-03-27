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

import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.RecordConfig;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.RecordConfig.RecordFormatItem;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.SyncGroup;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.TranscodeConfig;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.TranscodeConfig.CustomParams;
import com.aliyuncs.live.model.v20161101.DescribeCasterConfigResponse.TranscodeConfig.CustomParams.Video;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterConfigResponseUnmarshaller {

	public static DescribeCasterConfigResponse unmarshall(DescribeCasterConfigResponse describeCasterConfigResponse, UnmarshallerContext _ctx) {
		
		describeCasterConfigResponse.setRequestId(_ctx.stringValue("DescribeCasterConfigResponse.RequestId"));
		describeCasterConfigResponse.setAutoSwitchUrgentConfig(_ctx.stringValue("DescribeCasterConfigResponse.AutoSwitchUrgentConfig"));
		describeCasterConfigResponse.setAutoSwitchUrgentOn(_ctx.stringValue("DescribeCasterConfigResponse.AutoSwitchUrgentOn"));
		describeCasterConfigResponse.setCallbackUrl(_ctx.stringValue("DescribeCasterConfigResponse.CallbackUrl"));
		describeCasterConfigResponse.setCasterId(_ctx.stringValue("DescribeCasterConfigResponse.CasterId"));
		describeCasterConfigResponse.setCasterName(_ctx.stringValue("DescribeCasterConfigResponse.CasterName"));
		describeCasterConfigResponse.setChannelEnable(_ctx.integerValue("DescribeCasterConfigResponse.ChannelEnable"));
		describeCasterConfigResponse.setDelay(_ctx.floatValue("DescribeCasterConfigResponse.Delay"));
		describeCasterConfigResponse.setDomainName(_ctx.stringValue("DescribeCasterConfigResponse.DomainName"));
		describeCasterConfigResponse.setProgramEffect(_ctx.integerValue("DescribeCasterConfigResponse.ProgramEffect"));
		describeCasterConfigResponse.setProgramName(_ctx.stringValue("DescribeCasterConfigResponse.ProgramName"));
		describeCasterConfigResponse.setSideOutputUrl(_ctx.stringValue("DescribeCasterConfigResponse.SideOutputUrl"));
		describeCasterConfigResponse.setSideOutputUrlList(_ctx.stringValue("DescribeCasterConfigResponse.SideOutputUrlList"));
		describeCasterConfigResponse.setUrgentImageId(_ctx.stringValue("DescribeCasterConfigResponse.UrgentImageId"));
		describeCasterConfigResponse.setUrgentImageUrl(_ctx.stringValue("DescribeCasterConfigResponse.UrgentImageUrl"));
		describeCasterConfigResponse.setUrgentLiveStreamUrl(_ctx.stringValue("DescribeCasterConfigResponse.UrgentLiveStreamUrl"));
		describeCasterConfigResponse.setUrgentMaterialId(_ctx.stringValue("DescribeCasterConfigResponse.UrgentMaterialId"));

		RecordConfig recordConfig = new RecordConfig();
		recordConfig.setOnDemand(_ctx.integerValue("DescribeCasterConfigResponse.RecordConfig.OnDemand"));
		recordConfig.setOssBucket(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.OssBucket"));
		recordConfig.setOssEndpoint(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.OssEndpoint"));

		List<RecordFormatItem> recordFormat = new ArrayList<RecordFormatItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat.Length"); i++) {
			RecordFormatItem recordFormatItem = new RecordFormatItem();
			recordFormatItem.setCycleDuration(_ctx.integerValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].CycleDuration"));
			recordFormatItem.setFormat(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].Format"));
			recordFormatItem.setOssObjectPrefix(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].OssObjectPrefix"));
			recordFormatItem.setSliceOssObjectPrefix(_ctx.stringValue("DescribeCasterConfigResponse.RecordConfig.RecordFormat["+ i +"].SliceOssObjectPrefix"));

			recordFormat.add(recordFormatItem);
		}
		recordConfig.setRecordFormat(recordFormat);
		describeCasterConfigResponse.setRecordConfig(recordConfig);

		TranscodeConfig transcodeConfig = new TranscodeConfig();
		transcodeConfig.setCasterTemplate(_ctx.stringValue("DescribeCasterConfigResponse.TranscodeConfig.CasterTemplate"));

		List<String> liveTemplateIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds.Length"); i++) {
			liveTemplateIds.add(_ctx.stringValue("DescribeCasterConfigResponse.TranscodeConfig.LiveTemplateIds["+ i +"]"));
		}
		transcodeConfig.setLiveTemplateIds(liveTemplateIds);

		CustomParams customParams = new CustomParams();

		Video video = new Video();
		video.setFps(_ctx.integerValue("DescribeCasterConfigResponse.TranscodeConfig.CustomParams.video.fps"));
		video.setBitrate(_ctx.integerValue("DescribeCasterConfigResponse.TranscodeConfig.CustomParams.video.bitrate"));
		video.setWidth(_ctx.integerValue("DescribeCasterConfigResponse.TranscodeConfig.CustomParams.video.width"));
		video.setHeight(_ctx.integerValue("DescribeCasterConfigResponse.TranscodeConfig.CustomParams.video.height"));
		customParams.setVideo(video);
		transcodeConfig.setCustomParams(customParams);
		describeCasterConfigResponse.setTranscodeConfig(transcodeConfig);

		List<SyncGroup> syncGroupsConfig = new ArrayList<SyncGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCasterConfigResponse.SyncGroupsConfig.Length"); i++) {
			SyncGroup syncGroup = new SyncGroup();
			syncGroup.setHostResourceId(_ctx.stringValue("DescribeCasterConfigResponse.SyncGroupsConfig["+ i +"].HostResourceId"));
			syncGroup.setMode(_ctx.integerValue("DescribeCasterConfigResponse.SyncGroupsConfig["+ i +"].Mode"));

			List<String> resourceIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCasterConfigResponse.SyncGroupsConfig["+ i +"].ResourceIds.Length"); j++) {
				resourceIds.add(_ctx.stringValue("DescribeCasterConfigResponse.SyncGroupsConfig["+ i +"].ResourceIds["+ j +"]"));
			}
			syncGroup.setResourceIds(resourceIds);

			syncGroupsConfig.add(syncGroup);
		}
		describeCasterConfigResponse.setSyncGroupsConfig(syncGroupsConfig);
	 
	 	return describeCasterConfigResponse;
	}
}