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

import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.FpCompareResult;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.FpCompareResult.MasterMediaInfo;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.FpCompareResult.MediaMatchSegment;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.FpCompareResult.QueryMediaInfo;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.MasterFile;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.MatchFrameStorage;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.MatchFrameStorage.MasterMediaFrames;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.MatchFrameStorage.MatchedFramesDescFile;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.MatchFrameStorage.QueryMediaFrames;
import com.aliyuncs.mts.model.v20140618.QueryFpCompareJobListResponse.FpCompareJob.QueryFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpCompareJobListResponseUnmarshaller {

	public static QueryFpCompareJobListResponse unmarshall(QueryFpCompareJobListResponse queryFpCompareJobListResponse, UnmarshallerContext _ctx) {
		
		queryFpCompareJobListResponse.setRequestId(_ctx.stringValue("QueryFpCompareJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpCompareJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryFpCompareJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpCompareJobListResponse.setNonExistIds(nonExistIds);

		List<FpCompareJob> fpCompareJobList = new ArrayList<FpCompareJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpCompareJobListResponse.FpCompareJobList.Length"); i++) {
			FpCompareJob fpCompareJob = new FpCompareJob();
			fpCompareJob.setId(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Id"));
			fpCompareJob.setUserData(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].UserData"));
			fpCompareJob.setPipelineId(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].PipelineId"));
			fpCompareJob.setFpDBId(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpDBId"));
			fpCompareJob.setState(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].State"));
			fpCompareJob.setCode(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Code"));
			fpCompareJob.setMessage(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Message"));
			fpCompareJob.setCreationTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].CreationTime"));
			fpCompareJob.setFinishTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FinishTime"));

			MasterFile masterFile = new MasterFile();
			masterFile.setBucket(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Bucket"));
			masterFile.setLocation(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Location"));
			masterFile.setObject(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Object"));
			fpCompareJob.setMasterFile(masterFile);

			QueryFile queryFile = new QueryFile();
			queryFile.setBucket(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Bucket"));
			queryFile.setLocation(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Location"));
			queryFile.setObject(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Object"));
			fpCompareJob.setQueryFile(queryFile);

			MatchFrameStorage matchFrameStorage = new MatchFrameStorage();

			MasterMediaFrames masterMediaFrames = new MasterMediaFrames();
			masterMediaFrames.setBucket(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Bucket"));
			masterMediaFrames.setLocation(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Location"));
			masterMediaFrames.setObject(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Object"));
			matchFrameStorage.setMasterMediaFrames(masterMediaFrames);

			QueryMediaFrames queryMediaFrames = new QueryMediaFrames();
			queryMediaFrames.setBucket(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Bucket"));
			queryMediaFrames.setLocation(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Location"));
			queryMediaFrames.setObject(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Object"));
			matchFrameStorage.setQueryMediaFrames(queryMediaFrames);

			MatchedFramesDescFile matchedFramesDescFile = new MatchedFramesDescFile();
			matchedFramesDescFile.setBucket(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Bucket"));
			matchedFramesDescFile.setLocation(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Location"));
			matchedFramesDescFile.setObject(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Object"));
			matchFrameStorage.setMatchedFramesDescFile(matchedFramesDescFile);
			fpCompareJob.setMatchFrameStorage(matchFrameStorage);

			FpCompareResult fpCompareResult = new FpCompareResult();

			MasterMediaInfo masterMediaInfo = new MasterMediaInfo();
			masterMediaInfo.setDuration(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Duration"));
			masterMediaInfo.setFpNum(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.FpNum"));
			masterMediaInfo.setWidth(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Width"));
			masterMediaInfo.setHeight(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Height"));
			masterMediaInfo.setFps(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Fps"));
			masterMediaInfo.setTotalVideoFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.TotalVideoFrame"));
			masterMediaInfo.setAudioBitRate(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioBitRate"));
			masterMediaInfo.setAudioChannels(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioChannels"));
			masterMediaInfo.setAudioSampleRate(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioSampleRate"));
			fpCompareResult.setMasterMediaInfo(masterMediaInfo);

			QueryMediaInfo queryMediaInfo = new QueryMediaInfo();
			queryMediaInfo.setDuration(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Duration"));
			queryMediaInfo.setFpNum(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.FpNum"));
			queryMediaInfo.setWidth(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Width"));
			queryMediaInfo.setHeight(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Height"));
			queryMediaInfo.setFps(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Fps"));
			queryMediaInfo.setTotalVideoFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.TotalVideoFrame"));
			queryMediaInfo.setAudioBitRate(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioBitRate"));
			queryMediaInfo.setAudioChannels(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioChannels"));
			queryMediaInfo.setAudioSampleRate(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioSampleRate"));
			fpCompareResult.setQueryMediaInfo(queryMediaInfo);

			List<MediaMatchSegment> mediaMatchSegments = new ArrayList<MediaMatchSegment>();
			for (int j = 0; j < _ctx.lengthValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments.Length"); j++) {
				MediaMatchSegment mediaMatchSegment = new MediaMatchSegment();
				mediaMatchSegment.setQueryStartFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryStartFrame"));
				mediaMatchSegment.setQueryEndFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryEndFrame"));
				mediaMatchSegment.setMasterStartFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterStartFrame"));
				mediaMatchSegment.setMasterEndFrame(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterEndFrame"));
				mediaMatchSegment.setQueryStartTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryStartTime"));
				mediaMatchSegment.setQueryEndTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryEndTime"));
				mediaMatchSegment.setMasterStartTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterStartTime"));
				mediaMatchSegment.setMasterEndTime(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterEndTime"));
				mediaMatchSegment.setTotalMatchFrameNum(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].TotalMatchFrameNum"));
				mediaMatchSegment.setScore(_ctx.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].Score"));

				mediaMatchSegments.add(mediaMatchSegment);
			}
			fpCompareResult.setMediaMatchSegments(mediaMatchSegments);
			fpCompareJob.setFpCompareResult(fpCompareResult);

			fpCompareJobList.add(fpCompareJob);
		}
		queryFpCompareJobListResponse.setFpCompareJobList(fpCompareJobList);
	 
	 	return queryFpCompareJobListResponse;
	}
}