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

	public static GetMezzanineInfoResponse unmarshall(GetMezzanineInfoResponse getMezzanineInfoResponse, UnmarshallerContext context) {
		
		getMezzanineInfoResponse.setRequestId(context.stringValue("GetMezzanineInfoResponse.RequestId"));

		Mezzanine mezzanine = new Mezzanine();
		mezzanine.setVideoId(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoId"));
		mezzanine.setBitrate(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Bitrate"));
		mezzanine.setCreationTime(context.stringValue("GetMezzanineInfoResponse.Mezzanine.CreationTime"));
		mezzanine.setDuration(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Duration"));
		mezzanine.setFps(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Fps"));
		mezzanine.setHeight(context.longValue("GetMezzanineInfoResponse.Mezzanine.Height"));
		mezzanine.setWidth(context.longValue("GetMezzanineInfoResponse.Mezzanine.Width"));
		mezzanine.setSize(context.longValue("GetMezzanineInfoResponse.Mezzanine.Size"));
		mezzanine.setStatus(context.stringValue("GetMezzanineInfoResponse.Mezzanine.Status"));
		mezzanine.setFileURL(context.stringValue("GetMezzanineInfoResponse.Mezzanine.FileURL"));
		mezzanine.setFileName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.FileName"));
		mezzanine.setCRC64(context.stringValue("GetMezzanineInfoResponse.Mezzanine.CRC64"));
		mezzanine.setPreprocessStatus(context.stringValue("GetMezzanineInfoResponse.Mezzanine.PreprocessStatus"));

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < context.lengthValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecLongName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTimeBase(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecTagString(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSampleRate(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].SampleRate"));
			audioStream.setChannels(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(context.stringValue("GetMezzanineInfoResponse.Mezzanine.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		mezzanine.setAudioStreamList(audioStreamList);

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < context.lengthValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Duration"));
			videoStream.setNumFrames(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(context.stringValue("GetMezzanineInfoResponse.Mezzanine.VideoStreamList["+ i +"].Lang"));

			videoStreamList.add(videoStream);
		}
		mezzanine.setVideoStreamList(videoStreamList);
		getMezzanineInfoResponse.setMezzanine(mezzanine);
	 
	 	return getMezzanineInfoResponse;
	}
}