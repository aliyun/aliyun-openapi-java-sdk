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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaFormat;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaFormat.Address;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaStreams;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStream;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStream;
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStream;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaMetaResponseUnmarshaller {

	public static GetMediaMetaResponse unmarshall(GetMediaMetaResponse getMediaMetaResponse, UnmarshallerContext _ctx) {
		
		getMediaMetaResponse.setRequestId(_ctx.stringValue("GetMediaMetaResponse.RequestId"));
		getMediaMetaResponse.setMediaUri(_ctx.stringValue("GetMediaMetaResponse.MediaUri"));

		MediaMeta mediaMeta = new MediaMeta();

		MediaFormat mediaFormat = new MediaFormat();
		mediaFormat.setNumberStreams(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaFormat.NumberStreams"));
		mediaFormat.setNumberPrograms(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaFormat.NumberPrograms"));
		mediaFormat.setFormatName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.FormatName"));
		mediaFormat.setFormatLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.FormatLongName"));
		mediaFormat.setSize(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Size"));
		mediaFormat.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Duration"));
		mediaFormat.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.StartTime"));
		mediaFormat.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Bitrate"));
		mediaFormat.setCreationTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.CreationTime"));
		mediaFormat.setLocation(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Location"));

		Address address = new Address();
		address.setAddressLine(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.AddressLine"));
		address.setCountry(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Country"));
		address.setProvince(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Province"));
		address.setCity(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.City"));
		address.setDistrict(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.District"));
		address.setTownship(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Township"));
		mediaFormat.setAddress(address);
		mediaMeta.setMediaFormat(mediaFormat);

		MediaStreams mediaStreams = new MediaStreams();

		List<VideoStream> videoStreams = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Index"));
			videoStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Language"));
			videoStream.setCodecName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecName"));
			videoStream.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecLongName"));
			videoStream.setProfile(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Profile"));
			videoStream.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTagString"));
			videoStream.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTag"));
			videoStream.setWidth(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Width"));
			videoStream.setHeight(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Height"));
			videoStream.setHasBFrames(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].HasBFrames"));
			videoStream.setSampleAspectRatio(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStream.setDisplayAspectRatio(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStream.setPixelFormat(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].PixelFormat"));
			videoStream.setLevel(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Level"));
			videoStream.setFrameRrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].FrameRrate"));
			videoStream.setAverageFrameRate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].AverageFrameRate"));
			videoStream.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].TimeBase"));
			videoStream.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].StartTime"));
			videoStream.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Duration"));
			videoStream.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Bitrate"));
			videoStream.setFrames(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Frames"));

			videoStreams.add(videoStream);
		}
		mediaStreams.setVideoStreams(videoStreams);

		List<AudioStream> audioStreams = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Index"));
			audioStream.setCodecName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecName"));
			audioStream.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecLongName"));
			audioStream.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTimeBase"));
			audioStream.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTagString"));
			audioStream.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTag"));
			audioStream.setSampleFormat(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].SampleFormat"));
			audioStream.setSampleRate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].SampleRate"));
			audioStream.setChannels(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Channels"));
			audioStream.setChannelLayout(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].ChannelLayout"));
			audioStream.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].TimeBase"));
			audioStream.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].StartTime"));
			audioStream.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Duration"));
			audioStream.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Bitrate"));
			audioStream.setFrames(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Frames"));
			audioStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Language"));

			audioStreams.add(audioStream);
		}
		mediaStreams.setAudioStreams(audioStreams);

		List<SubtitleStream> subtitleStreams = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams["+ i +"].Index"));
			subtitleStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams["+ i +"].Language"));

			subtitleStreams.add(subtitleStream);
		}
		mediaStreams.setSubtitleStreams(subtitleStreams);
		mediaMeta.setMediaStreams(mediaStreams);
		getMediaMetaResponse.setMediaMeta(mediaMeta);
	 
	 	return getMediaMetaResponse;
	}
}