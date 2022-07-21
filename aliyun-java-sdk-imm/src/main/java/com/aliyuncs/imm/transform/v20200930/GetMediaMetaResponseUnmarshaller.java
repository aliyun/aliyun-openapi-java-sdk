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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetMediaMetaResponse;
import com.aliyuncs.imm.model.v20200930.GetMediaMetaResponse.AddressesItem;
import com.aliyuncs.imm.model.v20200930.GetMediaMetaResponse.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.GetMediaMetaResponse.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.GetMediaMetaResponse.VideoStreamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMediaMetaResponseUnmarshaller {

	public static GetMediaMetaResponse unmarshall(GetMediaMetaResponse getMediaMetaResponse, UnmarshallerContext _ctx) {
		
		getMediaMetaResponse.setRequestId(_ctx.stringValue("GetMediaMetaResponse.RequestId"));
		getMediaMetaResponse.setLanguage(_ctx.stringValue("GetMediaMetaResponse.Language"));
		getMediaMetaResponse.setTitle(_ctx.stringValue("GetMediaMetaResponse.Title"));
		getMediaMetaResponse.setStreamCount(_ctx.longValue("GetMediaMetaResponse.StreamCount"));
		getMediaMetaResponse.setProgramCount(_ctx.longValue("GetMediaMetaResponse.ProgramCount"));
		getMediaMetaResponse.setFormatName(_ctx.stringValue("GetMediaMetaResponse.FormatName"));
		getMediaMetaResponse.setFormatLongName(_ctx.stringValue("GetMediaMetaResponse.FormatLongName"));
		getMediaMetaResponse.setSize(_ctx.longValue("GetMediaMetaResponse.Size"));
		getMediaMetaResponse.setStartTime(_ctx.doubleValue("GetMediaMetaResponse.StartTime"));
		getMediaMetaResponse.setBitrate(_ctx.longValue("GetMediaMetaResponse.Bitrate"));
		getMediaMetaResponse.setArtist(_ctx.stringValue("GetMediaMetaResponse.Artist"));
		getMediaMetaResponse.setAlbumArtist(_ctx.stringValue("GetMediaMetaResponse.AlbumArtist"));
		getMediaMetaResponse.setComposer(_ctx.stringValue("GetMediaMetaResponse.Composer"));
		getMediaMetaResponse.setPerformer(_ctx.stringValue("GetMediaMetaResponse.Performer"));
		getMediaMetaResponse.setAlbum(_ctx.stringValue("GetMediaMetaResponse.Album"));
		getMediaMetaResponse.setDuration(_ctx.doubleValue("GetMediaMetaResponse.Duration"));
		getMediaMetaResponse.setProduceTime(_ctx.stringValue("GetMediaMetaResponse.ProduceTime"));
		getMediaMetaResponse.setLatLong(_ctx.stringValue("GetMediaMetaResponse.LatLong"));
		getMediaMetaResponse.setVideoWidth(_ctx.longValue("GetMediaMetaResponse.VideoWidth"));
		getMediaMetaResponse.setVideoHeight(_ctx.longValue("GetMediaMetaResponse.VideoHeight"));

		List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.VideoStreams.Length"); i++) {
			VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
			videoStreamsItem.setIndex(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].Index"));
			videoStreamsItem.setLanguage(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].Language"));
			videoStreamsItem.setCodecName(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].CodecName"));
			videoStreamsItem.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].CodecLongName"));
			videoStreamsItem.setProfile(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].Profile"));
			videoStreamsItem.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].CodecTimeBase"));
			videoStreamsItem.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].CodecTagString"));
			videoStreamsItem.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].CodecTag"));
			videoStreamsItem.setWidth(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].Width"));
			videoStreamsItem.setHeight(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].Height"));
			videoStreamsItem.setHasBFrames(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].HasBFrames"));
			videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStreamsItem.setPixelFormat(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].PixelFormat"));
			videoStreamsItem.setLevel(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].Level"));
			videoStreamsItem.setFrameRate(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].FrameRate"));
			videoStreamsItem.setAverageFrameRate(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].AverageFrameRate"));
			videoStreamsItem.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].TimeBase"));
			videoStreamsItem.setStartTime(_ctx.doubleValue("GetMediaMetaResponse.VideoStreams["+ i +"].StartTime"));
			videoStreamsItem.setDuration(_ctx.doubleValue("GetMediaMetaResponse.VideoStreams["+ i +"].Duration"));
			videoStreamsItem.setBitrate(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].Bitrate"));
			videoStreamsItem.setFrameCount(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].FrameCount"));
			videoStreamsItem.setRotate(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].Rotate"));
			videoStreamsItem.setBitDepth(_ctx.longValue("GetMediaMetaResponse.VideoStreams["+ i +"].BitDepth"));
			videoStreamsItem.setColorSpace(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].ColorSpace"));
			videoStreamsItem.setColorRange(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].ColorRange"));
			videoStreamsItem.setColorTransfer(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].ColorTransfer"));
			videoStreamsItem.setColorPrimaries(_ctx.stringValue("GetMediaMetaResponse.VideoStreams["+ i +"].ColorPrimaries"));

			videoStreams.add(videoStreamsItem);
		}
		getMediaMetaResponse.setVideoStreams(videoStreams);

		List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.AudioStreams.Length"); i++) {
			AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
			audioStreamsItem.setIndex(_ctx.longValue("GetMediaMetaResponse.AudioStreams["+ i +"].Index"));
			audioStreamsItem.setLanguage(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].Language"));
			audioStreamsItem.setCodecName(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].CodecName"));
			audioStreamsItem.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].CodecLongName"));
			audioStreamsItem.setCodecTimeBase(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].CodecTimeBase"));
			audioStreamsItem.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].CodecTagString"));
			audioStreamsItem.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].CodecTag"));
			audioStreamsItem.setTimeBase(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].TimeBase"));
			audioStreamsItem.setStartTime(_ctx.doubleValue("GetMediaMetaResponse.AudioStreams["+ i +"].StartTime"));
			audioStreamsItem.setDuration(_ctx.doubleValue("GetMediaMetaResponse.AudioStreams["+ i +"].Duration"));
			audioStreamsItem.setBitrate(_ctx.longValue("GetMediaMetaResponse.AudioStreams["+ i +"].Bitrate"));
			audioStreamsItem.setFrameCount(_ctx.longValue("GetMediaMetaResponse.AudioStreams["+ i +"].FrameCount"));
			audioStreamsItem.setLyric(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].Lyric"));
			audioStreamsItem.setSampleFormat(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].SampleFormat"));
			audioStreamsItem.setSampleRate(_ctx.longValue("GetMediaMetaResponse.AudioStreams["+ i +"].SampleRate"));
			audioStreamsItem.setChannels(_ctx.longValue("GetMediaMetaResponse.AudioStreams["+ i +"].Channels"));
			audioStreamsItem.setChannelLayout(_ctx.stringValue("GetMediaMetaResponse.AudioStreams["+ i +"].ChannelLayout"));

			audioStreams.add(audioStreamsItem);
		}
		getMediaMetaResponse.setAudioStreams(audioStreams);

		List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.Subtitles.Length"); i++) {
			SubtitlesItem subtitlesItem = new SubtitlesItem();
			subtitlesItem.setIndex(_ctx.longValue("GetMediaMetaResponse.Subtitles["+ i +"].Index"));
			subtitlesItem.setLanguage(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].Language"));
			subtitlesItem.setCodecName(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].CodecName"));
			subtitlesItem.setCodecLongName(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].CodecLongName"));
			subtitlesItem.setCodecTagString(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].CodecTagString"));
			subtitlesItem.setCodecTag(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].CodecTag"));
			subtitlesItem.setStartTime(_ctx.doubleValue("GetMediaMetaResponse.Subtitles["+ i +"].StartTime"));
			subtitlesItem.setDuration(_ctx.doubleValue("GetMediaMetaResponse.Subtitles["+ i +"].Duration"));
			subtitlesItem.setBitrate(_ctx.longValue("GetMediaMetaResponse.Subtitles["+ i +"].Bitrate"));
			subtitlesItem.setContent(_ctx.stringValue("GetMediaMetaResponse.Subtitles["+ i +"].Content"));
			subtitlesItem.setWidth(_ctx.longValue("GetMediaMetaResponse.Subtitles["+ i +"].Width"));
			subtitlesItem.setHeight(_ctx.longValue("GetMediaMetaResponse.Subtitles["+ i +"].Height"));

			subtitles.add(subtitlesItem);
		}
		getMediaMetaResponse.setSubtitles(subtitles);

		List<AddressesItem> addresses = new ArrayList<AddressesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetMediaMetaResponse.Addresses.Length"); i++) {
			AddressesItem addressesItem = new AddressesItem();
			addressesItem.setLanguage(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].Language"));
			addressesItem.setAddressLine(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].AddressLine"));
			addressesItem.setCountry(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].Country"));
			addressesItem.setProvince(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].Province"));
			addressesItem.setCity(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].City"));
			addressesItem.setDistrict(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].District"));
			addressesItem.setTownship(_ctx.stringValue("GetMediaMetaResponse.Addresses["+ i +"].Township"));

			addresses.add(addressesItem);
		}
		getMediaMetaResponse.setAddresses(addresses);
	 
	 	return getMediaMetaResponse;
	}
}