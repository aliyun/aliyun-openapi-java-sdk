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

import com.aliyuncs.imm.model.v20200930.DetectMediaMetaResponse;
import com.aliyuncs.imm.model.v20200930.DetectMediaMetaResponse.AddressesItem;
import com.aliyuncs.imm.model.v20200930.DetectMediaMetaResponse.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.DetectMediaMetaResponse.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.DetectMediaMetaResponse.VideoStreamsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectMediaMetaResponseUnmarshaller {

	public static DetectMediaMetaResponse unmarshall(DetectMediaMetaResponse detectMediaMetaResponse, UnmarshallerContext _ctx) {
		
		detectMediaMetaResponse.setRequestId(_ctx.stringValue("DetectMediaMetaResponse.RequestId"));
		detectMediaMetaResponse.setLanguage(_ctx.stringValue("DetectMediaMetaResponse.Language"));
		detectMediaMetaResponse.setTitle(_ctx.stringValue("DetectMediaMetaResponse.Title"));
		detectMediaMetaResponse.setStreamCount(_ctx.longValue("DetectMediaMetaResponse.StreamCount"));
		detectMediaMetaResponse.setProgramCount(_ctx.longValue("DetectMediaMetaResponse.ProgramCount"));
		detectMediaMetaResponse.setFormatName(_ctx.stringValue("DetectMediaMetaResponse.FormatName"));
		detectMediaMetaResponse.setFormatLongName(_ctx.stringValue("DetectMediaMetaResponse.FormatLongName"));
		detectMediaMetaResponse.setSize(_ctx.longValue("DetectMediaMetaResponse.Size"));
		detectMediaMetaResponse.setStartTime(_ctx.doubleValue("DetectMediaMetaResponse.StartTime"));
		detectMediaMetaResponse.setBitrate(_ctx.longValue("DetectMediaMetaResponse.Bitrate"));
		detectMediaMetaResponse.setArtist(_ctx.stringValue("DetectMediaMetaResponse.Artist"));
		detectMediaMetaResponse.setAlbumArtist(_ctx.stringValue("DetectMediaMetaResponse.AlbumArtist"));
		detectMediaMetaResponse.setComposer(_ctx.stringValue("DetectMediaMetaResponse.Composer"));
		detectMediaMetaResponse.setPerformer(_ctx.stringValue("DetectMediaMetaResponse.Performer"));
		detectMediaMetaResponse.setAlbum(_ctx.stringValue("DetectMediaMetaResponse.Album"));
		detectMediaMetaResponse.setDuration(_ctx.doubleValue("DetectMediaMetaResponse.Duration"));
		detectMediaMetaResponse.setProduceTime(_ctx.stringValue("DetectMediaMetaResponse.ProduceTime"));
		detectMediaMetaResponse.setLatLong(_ctx.stringValue("DetectMediaMetaResponse.LatLong"));
		detectMediaMetaResponse.setVideoWidth(_ctx.longValue("DetectMediaMetaResponse.VideoWidth"));
		detectMediaMetaResponse.setVideoHeight(_ctx.longValue("DetectMediaMetaResponse.VideoHeight"));

		List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectMediaMetaResponse.VideoStreams.Length"); i++) {
			VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
			videoStreamsItem.setIndex(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Index"));
			videoStreamsItem.setLanguage(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Language"));
			videoStreamsItem.setCodecName(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].CodecName"));
			videoStreamsItem.setCodecLongName(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].CodecLongName"));
			videoStreamsItem.setProfile(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Profile"));
			videoStreamsItem.setCodecTimeBase(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].CodecTimeBase"));
			videoStreamsItem.setCodecTagString(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].CodecTagString"));
			videoStreamsItem.setCodecTag(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].CodecTag"));
			videoStreamsItem.setWidth(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Width"));
			videoStreamsItem.setHeight(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Height"));
			videoStreamsItem.setHasBFrames(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].HasBFrames"));
			videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStreamsItem.setPixelFormat(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].PixelFormat"));
			videoStreamsItem.setLevel(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Level"));
			videoStreamsItem.setFrameRate(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].FrameRate"));
			videoStreamsItem.setAverageFrameRate(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].AverageFrameRate"));
			videoStreamsItem.setTimeBase(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].TimeBase"));
			videoStreamsItem.setStartTime(_ctx.doubleValue("DetectMediaMetaResponse.VideoStreams["+ i +"].StartTime"));
			videoStreamsItem.setDuration(_ctx.doubleValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Duration"));
			videoStreamsItem.setBitrate(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Bitrate"));
			videoStreamsItem.setFrameCount(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].FrameCount"));
			videoStreamsItem.setRotate(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].Rotate"));
			videoStreamsItem.setBitDepth(_ctx.longValue("DetectMediaMetaResponse.VideoStreams["+ i +"].BitDepth"));
			videoStreamsItem.setColorSpace(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].ColorSpace"));
			videoStreamsItem.setColorRange(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].ColorRange"));
			videoStreamsItem.setColorTransfer(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].ColorTransfer"));
			videoStreamsItem.setColorPrimaries(_ctx.stringValue("DetectMediaMetaResponse.VideoStreams["+ i +"].ColorPrimaries"));

			videoStreams.add(videoStreamsItem);
		}
		detectMediaMetaResponse.setVideoStreams(videoStreams);

		List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectMediaMetaResponse.AudioStreams.Length"); i++) {
			AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
			audioStreamsItem.setIndex(_ctx.longValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Index"));
			audioStreamsItem.setLanguage(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Language"));
			audioStreamsItem.setCodecName(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].CodecName"));
			audioStreamsItem.setCodecLongName(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].CodecLongName"));
			audioStreamsItem.setCodecTimeBase(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].CodecTimeBase"));
			audioStreamsItem.setCodecTagString(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].CodecTagString"));
			audioStreamsItem.setCodecTag(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].CodecTag"));
			audioStreamsItem.setTimeBase(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].TimeBase"));
			audioStreamsItem.setStartTime(_ctx.doubleValue("DetectMediaMetaResponse.AudioStreams["+ i +"].StartTime"));
			audioStreamsItem.setDuration(_ctx.doubleValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Duration"));
			audioStreamsItem.setBitrate(_ctx.longValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Bitrate"));
			audioStreamsItem.setFrameCount(_ctx.longValue("DetectMediaMetaResponse.AudioStreams["+ i +"].FrameCount"));
			audioStreamsItem.setLyric(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Lyric"));
			audioStreamsItem.setSampleFormat(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].SampleFormat"));
			audioStreamsItem.setSampleRate(_ctx.longValue("DetectMediaMetaResponse.AudioStreams["+ i +"].SampleRate"));
			audioStreamsItem.setChannels(_ctx.longValue("DetectMediaMetaResponse.AudioStreams["+ i +"].Channels"));
			audioStreamsItem.setChannelLayout(_ctx.stringValue("DetectMediaMetaResponse.AudioStreams["+ i +"].ChannelLayout"));

			audioStreams.add(audioStreamsItem);
		}
		detectMediaMetaResponse.setAudioStreams(audioStreams);

		List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectMediaMetaResponse.Subtitles.Length"); i++) {
			SubtitlesItem subtitlesItem = new SubtitlesItem();
			subtitlesItem.setIndex(_ctx.longValue("DetectMediaMetaResponse.Subtitles["+ i +"].Index"));
			subtitlesItem.setLanguage(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].Language"));
			subtitlesItem.setCodecName(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].CodecName"));
			subtitlesItem.setCodecLongName(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].CodecLongName"));
			subtitlesItem.setCodecTagString(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].CodecTagString"));
			subtitlesItem.setCodecTag(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].CodecTag"));
			subtitlesItem.setStartTime(_ctx.doubleValue("DetectMediaMetaResponse.Subtitles["+ i +"].StartTime"));
			subtitlesItem.setDuration(_ctx.doubleValue("DetectMediaMetaResponse.Subtitles["+ i +"].Duration"));
			subtitlesItem.setBitrate(_ctx.longValue("DetectMediaMetaResponse.Subtitles["+ i +"].Bitrate"));
			subtitlesItem.setContent(_ctx.stringValue("DetectMediaMetaResponse.Subtitles["+ i +"].Content"));
			subtitlesItem.setWidth(_ctx.longValue("DetectMediaMetaResponse.Subtitles["+ i +"].Width"));
			subtitlesItem.setHeight(_ctx.longValue("DetectMediaMetaResponse.Subtitles["+ i +"].Height"));

			subtitles.add(subtitlesItem);
		}
		detectMediaMetaResponse.setSubtitles(subtitles);

		List<AddressesItem> addresses = new ArrayList<AddressesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectMediaMetaResponse.Addresses.Length"); i++) {
			AddressesItem addressesItem = new AddressesItem();
			addressesItem.setLanguage(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].Language"));
			addressesItem.setAddressLine(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].AddressLine"));
			addressesItem.setCountry(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].Country"));
			addressesItem.setProvince(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].Province"));
			addressesItem.setCity(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].City"));
			addressesItem.setDistrict(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].District"));
			addressesItem.setTownship(_ctx.stringValue("DetectMediaMetaResponse.Addresses["+ i +"].Township"));

			addresses.add(addressesItem);
		}
		detectMediaMetaResponse.setAddresses(addresses);
	 
	 	return detectMediaMetaResponse;
	}
}