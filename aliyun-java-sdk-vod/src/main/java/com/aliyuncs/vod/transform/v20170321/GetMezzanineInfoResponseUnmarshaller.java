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

import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse.Mezzanine;
import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse.Mezzanine.AudioStream;
import com.aliyuncs.vod.model.v20170321.GetMezzanineInfoResponse.Mezzanine.VideoStream;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMezzanineInfoResponseUnmarshaller {

	public static GetMezzanineInfoResponse unmarshall(GetMezzanineInfoResponse getMezzanineInfoResponse, UnmarshallerContext _ctx) {
		
		getMezzanineInfoResponse.setRequestId(_ctx.stringValue("GetMezzanineInfoResponse.RequestId"));

		Mezzanine mezzanine = new Mezzanine();
		mezzanine.setCreationTime(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.CreationTime"));
		mezzanine.setStatus(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.Status"));
		mezzanine.setFileURL(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.FileURL"));
		mezzanine.setVideoId(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoId"));
		mezzanine.setHeight(_ctx.longValue("GetMezzanineInfoResponse.Mezzanine.Height"));
		mezzanine.setBitrate(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.Bitrate"));
		mezzanine.setFileName(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.FileName"));
		mezzanine.setOutputType(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.OutputType"));
		mezzanine.setPreprocessStatus(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.PreprocessStatus"));
		mezzanine.setWidth(_ctx.longValue("GetMezzanineInfoResponse.Mezzanine.Width"));
		mezzanine.setSize(_ctx.longValue("GetMezzanineInfoResponse.Mezzanine.Size"));
		mezzanine.setCRC64(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.CRC64"));
		mezzanine.setDuration(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.Duration"));
		mezzanine.setFps(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.Fps"));

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Index"));
			audioStream.setTimebase(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Timebase"));
			audioStream.setSampleFmt(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSampleRate(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].SampleRate"));
			audioStream.setChannelLayout(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setLang(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Lang"));
			audioStream.setCodecLongName(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setChannels(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Channels"));
			audioStream.setNumFrames(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setBitrate(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setCodecTagString(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setStartTime(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].StartTime"));
			audioStream.setCodecName(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecName"));
			audioStream.setDuration(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Duration"));
			audioStream.setCodecTag(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setCodecTimeBase(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTimeBase"));

			audioStreamList.add(audioStream);
		}
		mezzanine.setAudioStreamList(audioStreamList);

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setTimebase(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Timebase"));
			videoStream.setIndex(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Index"));
			videoStream.setAvgFPS(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setPixFmt(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLang(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Lang"));
			videoStream.setSar(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Sar"));
			videoStream.setHeight(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Height"));
			videoStream.setCodecLongName(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setNumFrames(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setBitrate(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setRotate(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Rotate"));
			videoStream.setCodecTagString(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setHasBFrames(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setProfile(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Profile"));
			videoStream.setStartTime(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDar(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Dar"));
			videoStream.setCodecName(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecName"));
			videoStream.setWidth(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Width"));
			videoStream.setDuration(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Duration"));
			videoStream.setFps(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Fps"));
			videoStream.setCodecTag(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setCodecTimeBase(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setLevel(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Level"));
			videoStream.setHDRType(_ctx.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].HDRType"));

			videoStreamList.add(videoStream);
		}
		mezzanine.setVideoStreamList(videoStreamList);
		getMezzanineInfoResponse.setMezzanine(mezzanine);
	 
	 	return getMezzanineInfoResponse;
	}
}