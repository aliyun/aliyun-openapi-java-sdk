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

	public static QueryFpCompareJobListResponse unmarshall(QueryFpCompareJobListResponse queryFpCompareJobListResponse, UnmarshallerContext context) {
		
		queryFpCompareJobListResponse.setRequestId(context.stringValue("QueryFpCompareJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryFpCompareJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryFpCompareJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpCompareJobListResponse.setNonExistIds(nonExistIds);

		List<FpCompareJob> fpCompareJobList = new ArrayList<FpCompareJob>();
		for (int i = 0; i < context.lengthValue("QueryFpCompareJobListResponse.FpCompareJobList.Length"); i++) {
			FpCompareJob fpCompareJob = new FpCompareJob();
			fpCompareJob.setId(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Id"));
			fpCompareJob.setUserData(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].UserData"));
			fpCompareJob.setPipelineId(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].PipelineId"));
			fpCompareJob.setFpDBId(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpDBId"));
			fpCompareJob.setState(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].State"));
			fpCompareJob.setCode(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Code"));
			fpCompareJob.setMessage(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].Message"));
			fpCompareJob.setCreationTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].CreationTime"));
			fpCompareJob.setFinishTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FinishTime"));

			MasterFile masterFile = new MasterFile();
			masterFile.setBucket(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Bucket"));
			masterFile.setLocation(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Location"));
			masterFile.setObject(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MasterFile.Object"));
			fpCompareJob.setMasterFile(masterFile);

			QueryFile queryFile = new QueryFile();
			queryFile.setBucket(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Bucket"));
			queryFile.setLocation(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Location"));
			queryFile.setObject(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].QueryFile.Object"));
			fpCompareJob.setQueryFile(queryFile);

			MatchFrameStorage matchFrameStorage = new MatchFrameStorage();

			MasterMediaFrames masterMediaFrames = new MasterMediaFrames();
			masterMediaFrames.setBucket(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Bucket"));
			masterMediaFrames.setLocation(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Location"));
			masterMediaFrames.setObject(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MasterMediaFrames.Object"));
			matchFrameStorage.setMasterMediaFrames(masterMediaFrames);

			QueryMediaFrames queryMediaFrames = new QueryMediaFrames();
			queryMediaFrames.setBucket(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Bucket"));
			queryMediaFrames.setLocation(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Location"));
			queryMediaFrames.setObject(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.QueryMediaFrames.Object"));
			matchFrameStorage.setQueryMediaFrames(queryMediaFrames);

			MatchedFramesDescFile matchedFramesDescFile = new MatchedFramesDescFile();
			matchedFramesDescFile.setBucket(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Bucket"));
			matchedFramesDescFile.setLocation(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Location"));
			matchedFramesDescFile.setObject(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].MatchFrameStorage.MatchedFramesDescFile.Object"));
			matchFrameStorage.setMatchedFramesDescFile(matchedFramesDescFile);
			fpCompareJob.setMatchFrameStorage(matchFrameStorage);

			FpCompareResult fpCompareResult = new FpCompareResult();

			MasterMediaInfo masterMediaInfo = new MasterMediaInfo();
			masterMediaInfo.setDuration(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Duration"));
			masterMediaInfo.setFpNum(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.FpNum"));
			masterMediaInfo.setWidth(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Width"));
			masterMediaInfo.setHeight(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Height"));
			masterMediaInfo.setFps(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.Fps"));
			masterMediaInfo.setTotalVideoFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.TotalVideoFrame"));
			masterMediaInfo.setAudioBitRate(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioBitRate"));
			masterMediaInfo.setAudioChannels(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioChannels"));
			masterMediaInfo.setAudioSampleRate(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MasterMediaInfo.AudioSampleRate"));
			fpCompareResult.setMasterMediaInfo(masterMediaInfo);

			QueryMediaInfo queryMediaInfo = new QueryMediaInfo();
			queryMediaInfo.setDuration(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Duration"));
			queryMediaInfo.setFpNum(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.FpNum"));
			queryMediaInfo.setWidth(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Width"));
			queryMediaInfo.setHeight(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Height"));
			queryMediaInfo.setFps(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.Fps"));
			queryMediaInfo.setTotalVideoFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.TotalVideoFrame"));
			queryMediaInfo.setAudioBitRate(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioBitRate"));
			queryMediaInfo.setAudioChannels(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioChannels"));
			queryMediaInfo.setAudioSampleRate(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.QueryMediaInfo.AudioSampleRate"));
			fpCompareResult.setQueryMediaInfo(queryMediaInfo);

			List<MediaMatchSegment> mediaMatchSegments = new ArrayList<MediaMatchSegment>();
			for (int j = 0; j < context.lengthValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments.Length"); j++) {
				MediaMatchSegment mediaMatchSegment = new MediaMatchSegment();
				mediaMatchSegment.setQueryStartFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryStartFrame"));
				mediaMatchSegment.setQueryEndFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryEndFrame"));
				mediaMatchSegment.setMasterStartFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterStartFrame"));
				mediaMatchSegment.setMasterEndFrame(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterEndFrame"));
				mediaMatchSegment.setQueryStartTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryStartTime"));
				mediaMatchSegment.setQueryEndTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].QueryEndTime"));
				mediaMatchSegment.setMasterStartTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterStartTime"));
				mediaMatchSegment.setMasterEndTime(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].MasterEndTime"));
				mediaMatchSegment.setTotalMatchFrameNum(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].TotalMatchFrameNum"));
				mediaMatchSegment.setScore(context.stringValue("QueryFpCompareJobListResponse.FpCompareJobList["+ i +"].FpCompareResult.MediaMatchSegments["+ j +"].Score"));

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