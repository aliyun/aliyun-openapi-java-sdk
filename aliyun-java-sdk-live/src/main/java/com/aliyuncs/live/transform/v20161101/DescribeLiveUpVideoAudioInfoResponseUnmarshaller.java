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
			publishItem.setPublishTime(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishTime"));
			publishItem.setAppName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AppName"));
			publishItem.setCodecInfo(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].CodecInfo"));
			publishItem.setPublishIp(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishIp"));
			publishItem.setStreamName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].StreamName"));
			publishItem.setPublishStatus(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishStatus"));
			publishItem.setUniqueId(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].UniqueId"));
			publishItem.setPublishInterval(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].PublishInterval"));
			publishItem.setStopTime(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].StopTime"));
			publishItem.setDomainName(_ctx.stringValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].DomainName"));

			List<VideoFramesItem> videoFrames = new ArrayList<VideoFramesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames.Length"); j++) {
				VideoFramesItem videoFramesItem = new VideoFramesItem();
				videoFramesItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames["+ j +"].Value"));
				videoFramesItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoFrames["+ j +"].Time"));

				videoFrames.add(videoFramesItem);
			}
			publishItem.setVideoFrames(videoFrames);

			List<AudioFramesItem> audioFrames = new ArrayList<AudioFramesItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames.Length"); j++) {
				AudioFramesItem audioFramesItem = new AudioFramesItem();
				audioFramesItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames["+ j +"].Value"));
				audioFramesItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioFrames["+ j +"].Time"));

				audioFrames.add(audioFramesItem);
			}
			publishItem.setAudioFrames(audioFrames);

			List<VideoStampsItem> videoStamps = new ArrayList<VideoStampsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps.Length"); j++) {
				VideoStampsItem videoStampsItem = new VideoStampsItem();
				videoStampsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps["+ j +"].Value"));
				videoStampsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoStamps["+ j +"].Time"));

				videoStamps.add(videoStampsItem);
			}
			publishItem.setVideoStamps(videoStamps);

			List<AudioStampsItem> audioStamps = new ArrayList<AudioStampsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps.Length"); j++) {
				AudioStampsItem audioStampsItem = new AudioStampsItem();
				audioStampsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps["+ j +"].Value"));
				audioStampsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioStamps["+ j +"].Time"));

				audioStamps.add(audioStampsItem);
			}
			publishItem.setAudioStamps(audioStamps);

			List<V_AStamp> videoAndAudioStamp = new ArrayList<V_AStamp>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp.Length"); j++) {
				V_AStamp v_AStamp = new V_AStamp();
				v_AStamp.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp["+ j +"].Value"));
				v_AStamp.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoAndAudioStamp["+ j +"].Time"));

				videoAndAudioStamp.add(v_AStamp);
			}
			publishItem.setVideoAndAudioStamp(videoAndAudioStamp);

			List<AvcHeadersItem> avcHeaders = new ArrayList<AvcHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders.Length"); j++) {
				AvcHeadersItem avcHeadersItem = new AvcHeadersItem();
				avcHeadersItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders["+ j +"].Value"));
				avcHeadersItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AvcHeaders["+ j +"].Time"));

				avcHeaders.add(avcHeadersItem);
			}
			publishItem.setAvcHeaders(avcHeaders);

			List<AacHeadersItem> aacHeaders = new ArrayList<AacHeadersItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders.Length"); j++) {
				AacHeadersItem aacHeadersItem = new AacHeadersItem();
				aacHeadersItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders["+ j +"].Value"));
				aacHeadersItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AacHeaders["+ j +"].Time"));

				aacHeaders.add(aacHeadersItem);
			}
			publishItem.setAacHeaders(aacHeaders);

			List<VideoBitRateItem> videoBitRate = new ArrayList<VideoBitRateItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate.Length"); j++) {
				VideoBitRateItem videoBitRateItem = new VideoBitRateItem();
				videoBitRateItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate["+ j +"].Value"));
				videoBitRateItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoBitRate["+ j +"].Time"));

				videoBitRate.add(videoBitRateItem);
			}
			publishItem.setVideoBitRate(videoBitRate);

			List<AudioBitRateItem> audioBitRate = new ArrayList<AudioBitRateItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate.Length"); j++) {
				AudioBitRateItem audioBitRateItem = new AudioBitRateItem();
				audioBitRateItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate["+ j +"].Value"));
				audioBitRateItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioBitRate["+ j +"].Time"));

				audioBitRate.add(audioBitRateItem);
			}
			publishItem.setAudioBitRate(audioBitRate);

			List<VideoIntervalItem> videoInterval = new ArrayList<VideoIntervalItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval.Length"); j++) {
				VideoIntervalItem videoIntervalItem = new VideoIntervalItem();
				videoIntervalItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval["+ j +"].Value"));
				videoIntervalItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].VideoInterval["+ j +"].Time"));

				videoInterval.add(videoIntervalItem);
			}
			publishItem.setVideoInterval(videoInterval);

			List<AudioIntervalItem> audioInterval = new ArrayList<AudioIntervalItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval.Length"); j++) {
				AudioIntervalItem audioIntervalItem = new AudioIntervalItem();
				audioIntervalItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval["+ j +"].Value"));
				audioIntervalItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].AudioInterval["+ j +"].Time"));

				audioInterval.add(audioIntervalItem);
			}
			publishItem.setAudioInterval(audioInterval);

			List<ErrorFlagsItem> errorFlags = new ArrayList<ErrorFlagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags.Length"); j++) {
				ErrorFlagsItem errorFlagsItem = new ErrorFlagsItem();
				errorFlagsItem.setValue(_ctx.integerValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags["+ j +"].Value"));
				errorFlagsItem.setTime(_ctx.longValue("DescribeLiveUpVideoAudioInfoResponse.UpItems["+ i +"].ErrorFlags["+ j +"].Time"));

				errorFlags.add(errorFlagsItem);
			}
			publishItem.setErrorFlags(errorFlags);

			upItems.add(publishItem);
		}
		describeLiveUpVideoAudioInfoResponse.setUpItems(upItems);
	 
	 	return describeLiveUpVideoAudioInfoResponse;
	}
}