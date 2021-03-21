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
import com.aliyuncs.imm.model.v20170906.GetMediaMetaResponse.MediaMeta.MediaFormat.Tag;
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
		mediaFormat.setSize(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Size"));
		mediaFormat.setNumberStreams(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaFormat.NumberStreams"));
		mediaFormat.setFormatLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.FormatLongName"));
		mediaFormat.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.StartTime"));
		mediaFormat.setCreationTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.CreationTime"));
		mediaFormat.setFormatName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.FormatName"));
		mediaFormat.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Duration"));
		mediaFormat.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Bitrate"));
		mediaFormat.setLocation(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Location"));
		mediaFormat.setNumberPrograms(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaFormat.NumberPrograms"));

		Address address = new Address();
		address.setTownship(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Township"));
		address.setAddressLine(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.AddressLine"));
		address.setCountry(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Country"));
		address.setCity(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.City"));
		address.setDistrict(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.District"));
		address.setProvince(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Address.Province"));
		mediaFormat.setAddress(address);

		Tag tag = new Tag();
		tag.setArtist(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Artist"));
		tag.setComposer(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Composer"));
		tag.setPerformer(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Performer"));
		tag.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Language"));
		tag.setCreationTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.CreationTime"));
		tag.setTitle(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Title"));
		tag.setAlbum(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.Album"));
		tag.setAlbumArtist(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaFormat.Tag.AlbumArtist"));
		mediaFormat.setTag(tag);
		mediaMeta.setMediaFormat(mediaFormat);

		MediaStreams mediaStreams = new MediaStreams();

		List<VideoStream> videoStreams = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTag"));
			videoStream.setFrames(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Frames"));
			videoStream.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTimeBase"));
			videoStream.setRotate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Rotate"));
			videoStream.setSampleAspectRatio(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStream.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].StartTime"));
			videoStream.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Duration"));
			videoStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Index"));
			videoStream.setCodecName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecName"));
			videoStream.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Bitrate"));
			videoStream.setProfile(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Profile"));
			videoStream.setDisplayAspectRatio(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStream.setHasBFrames(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].HasBFrames"));
			videoStream.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecTagString"));
			videoStream.setAverageFrameRate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].AverageFrameRate"));
			videoStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Language"));
			videoStream.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].CodecLongName"));
			videoStream.setPixelFormat(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].PixelFormat"));
			videoStream.setLevel(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Level"));
			videoStream.setHeight(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Height"));
			videoStream.setFrameRrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].FrameRrate"));
			videoStream.setWidth(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].Width"));
			videoStream.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.VideoStreams["+ i +"].TimeBase"));

			videoStreams.add(videoStream);
		}
		mediaStreams.setVideoStreams(videoStreams);

		List<SubtitleStream> subtitleStreams = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams["+ i +"].Language"));
			subtitleStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.SubtitleStreams["+ i +"].Index"));

			subtitleStreams.add(subtitleStream);
		}
		mediaStreams.setSubtitleStreams(subtitleStreams);

		List<AudioStream> audioStreams = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTag"));
			audioStream.setFrames(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Frames"));
			audioStream.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTimeBase"));
			audioStream.setChannelLayout(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].ChannelLayout"));
			audioStream.setStartTime(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].StartTime"));
			audioStream.setDuration(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Duration"));
			audioStream.setIndex(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Index"));
			audioStream.setCodecName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecName"));
			audioStream.setBitrate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Bitrate"));
			audioStream.setSampleFormat(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].SampleFormat"));
			audioStream.setChannels(_ctx.integerValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Channels"));
			audioStream.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecTagString"));
			audioStream.setSampleRate(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].SampleRate"));
			audioStream.setLanguage(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].Language"));
			audioStream.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].CodecLongName"));
			audioStream.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.MediaMeta.MediaStreams.AudioStreams["+ i +"].TimeBase"));

			audioStreams.add(audioStream);
		}
		mediaStreams.setAudioStreams(audioStreams);
		mediaMeta.setMediaStreams(mediaStreams);
		getMediaMetaResponse.setMediaMeta(mediaMeta);
	 
	 	return getMediaMetaResponse;
	}
}