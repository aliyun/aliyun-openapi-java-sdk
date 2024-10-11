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

import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.PlayInfo;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.VideoBase;
import com.aliyuncs.vod.model.v20170321.GetPlayInfoResponse.VideoBase.Thumbnail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPlayInfoResponseUnmarshaller {

	public static GetPlayInfoResponse unmarshall(GetPlayInfoResponse getPlayInfoResponse, UnmarshallerContext _ctx) {
		
		getPlayInfoResponse.setRequestId(_ctx.stringValue("GetPlayInfoResponse.RequestId"));

		VideoBase videoBase = new VideoBase();
		videoBase.setCreationTime(_ctx.stringValue("GetPlayInfoResponse.VideoBase.CreationTime"));
		videoBase.setStatus(_ctx.stringValue("GetPlayInfoResponse.VideoBase.Status"));
		videoBase.setTranscodeMode(_ctx.stringValue("GetPlayInfoResponse.VideoBase.TranscodeMode"));
		videoBase.setOutputType(_ctx.stringValue("GetPlayInfoResponse.VideoBase.OutputType"));
		videoBase.setVideoId(_ctx.stringValue("GetPlayInfoResponse.VideoBase.VideoId"));
		videoBase.setCoverURL(_ctx.stringValue("GetPlayInfoResponse.VideoBase.CoverURL"));
		videoBase.setDuration(_ctx.stringValue("GetPlayInfoResponse.VideoBase.Duration"));
		videoBase.setTitle(_ctx.stringValue("GetPlayInfoResponse.VideoBase.Title"));
		videoBase.setMediaType(_ctx.stringValue("GetPlayInfoResponse.VideoBase.MediaType"));
		videoBase.setDanMuURL(_ctx.stringValue("GetPlayInfoResponse.VideoBase.DanMuURL"));
		videoBase.setStorageClass(_ctx.stringValue("GetPlayInfoResponse.VideoBase.StorageClass"));

		List<Thumbnail> thumbnailList = new ArrayList<Thumbnail>();
		for (int i = 0; i < _ctx.lengthValue("GetPlayInfoResponse.VideoBase.ThumbnailList.Length"); i++) {
			Thumbnail thumbnail = new Thumbnail();
			thumbnail.setURL(_ctx.stringValue("GetPlayInfoResponse.VideoBase.ThumbnailList["+ i +"].URL"));

			thumbnailList.add(thumbnail);
		}
		videoBase.setThumbnailList(thumbnailList);
		getPlayInfoResponse.setVideoBase(videoBase);

		List<PlayInfo> playInfoList = new ArrayList<PlayInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetPlayInfoResponse.PlayInfoList.Length"); i++) {
			PlayInfo playInfo = new PlayInfo();
			playInfo.setCreationTime(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].CreationTime"));
			playInfo.setStatus(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Status"));
			playInfo.setSpecification(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Specification"));
			playInfo.setComplexity(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Complexity"));
			playInfo.setNarrowBandType(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].NarrowBandType"));
			playInfo.setHeight(_ctx.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Height"));
			playInfo.setBitrate(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Bitrate"));
			playInfo.setModificationTime(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].ModificationTime"));
			playInfo.setWatermarkId(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].WatermarkId"));
			playInfo.setEncrypt(_ctx.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Encrypt"));
			playInfo.setDefinition(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Definition"));
			playInfo.setRand(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Rand"));
			playInfo.setEncryptType(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].EncryptType"));
			playInfo.setEncryptMode(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].EncryptMode"));
			playInfo.setPreprocessStatus(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].PreprocessStatus"));
			playInfo.setStreamType(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].StreamType"));
			playInfo.setJobId(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].JobId"));
			playInfo.setPlaintext(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Plaintext"));
			playInfo.setSize(_ctx.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Size"));
			playInfo.setWidth(_ctx.longValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Width"));
			playInfo.setFps(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Fps"));
			playInfo.setDuration(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Duration"));
			playInfo.setPlayURL(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].PlayURL"));
			playInfo.setFormat(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].Format"));
			playInfo.setHDRType(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].HDRType"));
			playInfo.setBitDepth(_ctx.integerValue("GetPlayInfoResponse.PlayInfoList["+ i +"].BitDepth"));
			playInfo.setJobType(_ctx.integerValue("GetPlayInfoResponse.PlayInfoList["+ i +"].JobType"));
			playInfo.setJobExt(_ctx.stringValue("GetPlayInfoResponse.PlayInfoList["+ i +"].JobExt"));

			playInfoList.add(playInfo);
		}
		getPlayInfoResponse.setPlayInfoList(playInfoList);
	 
	 	return getPlayInfoResponse;
	}
}