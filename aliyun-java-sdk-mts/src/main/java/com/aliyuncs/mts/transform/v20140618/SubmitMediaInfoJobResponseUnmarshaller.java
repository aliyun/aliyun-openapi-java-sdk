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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStream;
import com.aliyuncs.mts.model.v20140618.SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStream.NetworkCost;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitMediaInfoJobResponseUnmarshaller {

	public static SubmitMediaInfoJobResponse unmarshall(SubmitMediaInfoJobResponse submitMediaInfoJobResponse, UnmarshallerContext _ctx) {
		
		submitMediaInfoJobResponse.setRequestId(_ctx.stringValue("SubmitMediaInfoJobResponse.RequestId"));

		MediaInfoJob mediaInfoJob = new MediaInfoJob();
		mediaInfoJob.setJobId(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.JobId"));
		mediaInfoJob.setUserData(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.UserData"));
		mediaInfoJob.setPipelineId(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.PipelineId"));
		mediaInfoJob.setAsync(_ctx.booleanValue("SubmitMediaInfoJobResponse.MediaInfoJob.Async"));
		mediaInfoJob.setState(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.State"));
		mediaInfoJob.setCode(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Code"));
		mediaInfoJob.setMessage(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Message"));
		mediaInfoJob.setCreationTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.CreationTime"));

		Input input = new Input();
		input.setBucket(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Bucket"));
		input.setLocation(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Location"));
		input.setObject(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Input.Object"));
		mediaInfoJob.setInput(input);

		Properties properties = new Properties();
		properties.setWidth(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Width"));
		properties.setHeight(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Height"));
		properties.setBitrate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Bitrate"));
		properties.setDuration(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Duration"));
		properties.setFps(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Fps"));
		properties.setFileSize(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.FileSize"));
		properties.setFileFormat(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.FileFormat"));

		Streams streams = new Streams();

		List<VideoStream> videoStreamList = new ArrayList<VideoStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList.Length"); i++) {
			VideoStream videoStream = new VideoStream();
			videoStream.setIndex(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Index"));
			videoStream.setCodecName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecName"));
			videoStream.setCodecLongName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecLongName"));
			videoStream.setProfile(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Profile"));
			videoStream.setCodecTimeBase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTimeBase"));
			videoStream.setCodecTagString(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTagString"));
			videoStream.setCodecTag(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].CodecTag"));
			videoStream.setWidth(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Width"));
			videoStream.setHeight(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Height"));
			videoStream.setHasBFrames(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].HasBFrames"));
			videoStream.setSar(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Sar"));
			videoStream.setDar(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Dar"));
			videoStream.setPixFmt(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].PixFmt"));
			videoStream.setLevel(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Level"));
			videoStream.setFps(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Fps"));
			videoStream.setAvgFPS(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].AvgFPS"));
			videoStream.setTimebase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Timebase"));
			videoStream.setStartTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].StartTime"));
			videoStream.setDuration(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Duration"));
			videoStream.setBitrate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Bitrate"));
			videoStream.setNumFrames(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NumFrames"));
			videoStream.setLang(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Lang"));
			videoStream.setRotate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].Rotate"));

			NetworkCost networkCost = new NetworkCost();
			networkCost.setPreloadTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.PreloadTime"));
			networkCost.setCostBandwidth(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.CostBandwidth"));
			networkCost.setAvgBitrate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.VideoStreamList["+ i +"].NetworkCost.AvgBitrate"));
			videoStream.setNetworkCost(networkCost);

			videoStreamList.add(videoStream);
		}
		streams.setVideoStreamList(videoStreamList);

		List<AudioStream> audioStreamList = new ArrayList<AudioStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList.Length"); i++) {
			AudioStream audioStream = new AudioStream();
			audioStream.setIndex(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Index"));
			audioStream.setCodecName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecName"));
			audioStream.setCodecTimeBase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTimeBase"));
			audioStream.setCodecLongName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecLongName"));
			audioStream.setCodecTagString(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTagString"));
			audioStream.setCodecTag(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].CodecTag"));
			audioStream.setSampleFmt(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].SampleFmt"));
			audioStream.setSamplerate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Samplerate"));
			audioStream.setChannels(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Channels"));
			audioStream.setChannelLayout(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].ChannelLayout"));
			audioStream.setTimebase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Timebase"));
			audioStream.setStartTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].StartTime"));
			audioStream.setDuration(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Duration"));
			audioStream.setBitrate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Bitrate"));
			audioStream.setNumFrames(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].NumFrames"));
			audioStream.setLang(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.AudioStreamList["+ i +"].Lang"));

			audioStreamList.add(audioStream);
		}
		streams.setAudioStreamList(audioStreamList);

		List<SubtitleStream> subtitleStreamList = new ArrayList<SubtitleStream>();
		for (int i = 0; i < _ctx.lengthValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList.Length"); i++) {
			SubtitleStream subtitleStream = new SubtitleStream();
			subtitleStream.setIndex(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Index"));
			subtitleStream.setCodecName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecName"));
			subtitleStream.setCodecTimeBase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTimeBase"));
			subtitleStream.setCodecLongName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecLongName"));
			subtitleStream.setCodecTagString(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTagString"));
			subtitleStream.setCodecTag(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].CodecTag"));
			subtitleStream.setTimebase(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Timebase"));
			subtitleStream.setStartTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].StartTime"));
			subtitleStream.setDuration(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Duration"));
			subtitleStream.setLang(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Streams.SubtitleStreamList["+ i +"].Lang"));

			subtitleStreamList.add(subtitleStream);
		}
		streams.setSubtitleStreamList(subtitleStreamList);
		properties.setStreams(streams);

		Format format = new Format();
		format.setNumStreams(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.NumStreams"));
		format.setNumPrograms(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.NumPrograms"));
		format.setFormatName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.FormatName"));
		format.setFormatLongName(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.FormatLongName"));
		format.setStartTime(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.StartTime"));
		format.setDuration(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Duration"));
		format.setSize(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Size"));
		format.setBitrate(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.Properties.Format.Bitrate"));
		properties.setFormat(format);
		mediaInfoJob.setProperties(properties);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitMediaInfoJobResponse.MediaInfoJob.MNSMessageResult.ErrorCode"));
		mediaInfoJob.setMNSMessageResult(mNSMessageResult);
		submitMediaInfoJobResponse.setMediaInfoJob(mediaInfoJob);
	 
	 	return submitMediaInfoJobResponse;
	}
}