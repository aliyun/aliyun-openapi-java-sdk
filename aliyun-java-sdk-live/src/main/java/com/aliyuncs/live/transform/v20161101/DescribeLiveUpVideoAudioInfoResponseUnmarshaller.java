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

import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AacHeadersItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AudioBitRateItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AudioFramesItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AudioIntervalItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AudioStampsItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.AvcHeadersItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.ErrorFlagsItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.V_AStamp;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.VideoBitRateItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.VideoFramesItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.VideoIntervalItem;
import com.aliyuncs.live.model.v20161101.DescribeLiveUpVideoAudioInfoResponse.PublishItem.VideoStampsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveUpVideoAudioInfoResponseUnmarshaller {

	public static DescribeLiveUpVideoAudioInfoResponse unmarshall(DescribeLiveUpVideoAudioInfoResponse describeLiveUpVideoAudioInfoResponse, UnmarshallerContext _ctx) {
		
		describeLiveUpVideoAudioInfoResponse.setRequestId(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.RequestId"));

		List<PublishItem> upItems = new ArrayList<PublishItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems.Length"); i++) {
			PublishItem publishItem = new PublishItem();
			publishItem.setAppName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AppName"));
			publishItem.setCodecInfo(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].CodecInfo"));
			publishItem.setDomainName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].DomainName"));
			publishItem.setPublishInterval(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishInterval"));
			publishItem.setPublishIp(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishIp"));
			publishItem.setPublishStatus(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishStatus"));
			publishItem.setPublishTime(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishTime"));
			publishItem.setStopTime(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].StopTime"));
			publishItem.setStreamName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].StreamName"));
			publishItem.setUniqueId(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].UniqueId"));

			List<AacHeadersItem> aacHeaders = new ArrayList<AacHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders.Length"); j++) {
				AacHeadersItem aacHeadersItem = new AacHeadersItem();
				aacHeadersItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders["+ j +"].Time"));
				aacHeadersItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders["+ j +"].Value"));

				aacHeaders.add(aacHeadersItem);
			}
			publishItem.setAacHeaders(aacHeaders);

			List<AudioBitRateItem> audioBitRate = new ArrayList<AudioBitRateItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate.Length"); j++) {
				AudioBitRateItem audioBitRateItem = new AudioBitRateItem();
				audioBitRateItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate["+ j +"].Time"));
				audioBitRateItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate["+ j +"].Value"));

				audioBitRate.add(audioBitRateItem);
			}
			publishItem.setAudioBitRate(audioBitRate);

			List<AudioFramesItem> audioFrames = new ArrayList<AudioFramesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames.Length"); j++) {
				AudioFramesItem audioFramesItem = new AudioFramesItem();
				audioFramesItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames["+ j +"].Time"));
				audioFramesItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames["+ j +"].Value"));

				audioFrames.add(audioFramesItem);
			}
			publishItem.setAudioFrames(audioFrames);

			List<AudioIntervalItem> audioInterval = new ArrayList<AudioIntervalItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval.Length"); j++) {
				AudioIntervalItem audioIntervalItem = new AudioIntervalItem();
				audioIntervalItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval["+ j +"].Time"));
				audioIntervalItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval["+ j +"].Value"));

				audioInterval.add(audioIntervalItem);
			}
			publishItem.setAudioInterval(audioInterval);

			List<AudioStampsItem> audioStamps = new ArrayList<AudioStampsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps.Length"); j++) {
				AudioStampsItem audioStampsItem = new AudioStampsItem();
				audioStampsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps["+ j +"].Time"));
				audioStampsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps["+ j +"].Value"));

				audioStamps.add(audioStampsItem);
			}
			publishItem.setAudioStamps(audioStamps);

			List<AvcHeadersItem> avcHeaders = new ArrayList<AvcHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders.Length"); j++) {
				AvcHeadersItem avcHeadersItem = new AvcHeadersItem();
				avcHeadersItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders["+ j +"].Time"));
				avcHeadersItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders["+ j +"].Value"));

				avcHeaders.add(avcHeadersItem);
			}
			publishItem.setAvcHeaders(avcHeaders);

			List<ErrorFlagsItem> errorFlags = new ArrayList<ErrorFlagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags.Length"); j++) {
				ErrorFlagsItem errorFlagsItem = new ErrorFlagsItem();
				errorFlagsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags["+ j +"].Time"));
				errorFlagsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags["+ j +"].Value"));

				errorFlags.add(errorFlagsItem);
			}
			publishItem.setErrorFlags(errorFlags);

			List<V_AStamp> videoAndAudioStamp = new ArrayList<V_AStamp>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp.Length"); j++) {
				V_AStamp v_AStamp = new V_AStamp();
				v_AStamp.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp["+ j +"].Time"));
				v_AStamp.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp["+ j +"].Value"));

				videoAndAudioStamp.add(v_AStamp);
			}
			publishItem.setVideoAndAudioStamp(videoAndAudioStamp);

			List<VideoBitRateItem> videoBitRate = new ArrayList<VideoBitRateItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate.Length"); j++) {
				VideoBitRateItem videoBitRateItem = new VideoBitRateItem();
				videoBitRateItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate["+ j +"].Time"));
				videoBitRateItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate["+ j +"].Value"));

				videoBitRate.add(videoBitRateItem);
			}
			publishItem.setVideoBitRate(videoBitRate);

			List<VideoFramesItem> videoFrames = new ArrayList<VideoFramesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames.Length"); j++) {
				VideoFramesItem videoFramesItem = new VideoFramesItem();
				videoFramesItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames["+ j +"].Time"));
				videoFramesItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames["+ j +"].Value"));

				videoFrames.add(videoFramesItem);
			}
			publishItem.setVideoFrames(videoFrames);

			List<VideoIntervalItem> videoInterval = new ArrayList<VideoIntervalItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval.Length"); j++) {
				VideoIntervalItem videoIntervalItem = new VideoIntervalItem();
				videoIntervalItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval["+ j +"].Time"));
				videoIntervalItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval["+ j +"].Value"));

				videoInterval.add(videoIntervalItem);
			}
			publishItem.setVideoInterval(videoInterval);

			List<VideoStampsItem> videoStamps = new ArrayList<VideoStampsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps.Length"); j++) {
				VideoStampsItem videoStampsItem = new VideoStampsItem();
				videoStampsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps["+ j +"].Time"));
				videoStampsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps["+ j +"].Value"));

				videoStamps.add(videoStampsItem);
			}
			publishItem.setVideoStamps(videoStamps);

			upItems.add(publishItem);
		}
		describeLiveUpVideoAudioInfoResponse.setUpItems(upItems);
	 
	 	return describeLiveUpVideoAudioInfoResponse;
	}
}