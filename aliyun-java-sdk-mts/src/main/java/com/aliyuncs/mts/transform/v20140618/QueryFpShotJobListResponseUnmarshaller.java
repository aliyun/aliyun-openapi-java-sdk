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

import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotConfig;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.TextFpShot;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.TextFpShot.TextFpShotSlice;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.TextFpShot.TextFpShotSlice.InputFragment;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpShotJobListResponseUnmarshaller {

	public static QueryFpShotJobListResponse unmarshall(QueryFpShotJobListResponse queryFpShotJobListResponse, UnmarshallerContext _ctx) {
		
		queryFpShotJobListResponse.setRequestId(_ctx.stringValue("QueryFpShotJobListResponse.RequestId"));
		queryFpShotJobListResponse.setNextPageToken(_ctx.stringValue("QueryFpShotJobListResponse.NextPageToken"));

		List<String> nonExistPrimaryKeys = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpShotJobListResponse.NonExistPrimaryKeys.Length"); i++) {
			nonExistPrimaryKeys.add(_ctx.stringValue("QueryFpShotJobListResponse.NonExistPrimaryKeys["+ i +"]"));
		}
		queryFpShotJobListResponse.setNonExistPrimaryKeys(nonExistPrimaryKeys);

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpShotJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(_ctx.stringValue("QueryFpShotJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpShotJobListResponse.setNonExistIds(nonExistIds);

		List<FpShotJob> fpShotJobList = new ArrayList<FpShotJob>();
		for (int i = 0; i < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList.Length"); i++) {
			FpShotJob fpShotJob = new FpShotJob();
			fpShotJob.setCreationTime(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].CreationTime"));
			fpShotJob.setFinishTime(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FinishTime"));
			fpShotJob.setState(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].State"));
			fpShotJob.setMessage(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Message"));
			fpShotJob.setTxHash(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].TxHash"));
			fpShotJob.setTransactionId(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].TransactionId"));
			fpShotJob.setFileId(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FileId"));
			fpShotJob.setUserData(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].UserData"));
			fpShotJob.setCode(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Code"));
			fpShotJob.setPipelineId(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].PipelineId"));
			fpShotJob.setId(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Id"));
			fpShotJob.setInput(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Input"));

			FpShotResult fpShotResult = new FpShotResult();

			List<FpShot> audioFpShots = new ArrayList<FpShot>();
			for (int j = 0; j < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots.Length"); j++) {
				FpShot fpShot = new FpShot();
				fpShot.setPrimaryKey(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].PrimaryKey"));
				fpShot.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].Similarity"));

				List<FpShotSlice> fpShotSlices = new ArrayList<FpShotSlice>();
				for (int k = 0; k < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices.Length"); k++) {
					FpShotSlice fpShotSlice = new FpShotSlice();
					fpShotSlice.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices["+ k +"].Similarity"));

					Duplication duplication = new Duplication();
					duplication.setStart(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Start"));
					duplication.setDuration(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Duration"));
					fpShotSlice.setDuplication(duplication);

					Input input = new Input();
					input.setStart(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices["+ k +"].Input.Start"));
					input.setDuration(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.AudioFpShots["+ j +"].FpShotSlices["+ k +"].Input.Duration"));
					fpShotSlice.setInput(input);

					fpShotSlices.add(fpShotSlice);
				}
				fpShot.setFpShotSlices(fpShotSlices);

				audioFpShots.add(fpShot);
			}
			fpShotResult.setAudioFpShots(audioFpShots);

			List<FpShot> fpShots = new ArrayList<FpShot>();
			for (int j = 0; j < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots.Length"); j++) {
				FpShot fpShot_ = new FpShot();
				fpShot_.setPrimaryKey(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].PrimaryKey"));
				fpShot_.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].Similarity"));

				List<FpShotSlice> fpShotSlices = new ArrayList<FpShotSlice>();
				for (int k = 0; k < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices.Length"); k++) {
					FpShotSlice fpShotSlice_ = new FpShotSlice();
					fpShotSlice_.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Similarity"));

					com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication fpShotSliceDuplication = new com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication();
					fpShotSliceDuplication.setStart(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Start"));
					fpShotSliceDuplication.setDuration(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Duration"));
					fpShotSlice_.setDuplication(fpShotSliceDuplication);

					com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input fpShotSliceInput = new com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input();
					fpShotSliceInput.setStart(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Input.Start"));
					fpShotSliceInput.setDuration(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Input.Duration"));
					fpShotSlice_.setInput(fpShotSliceInput);

					fpShotSlices.add(fpShotSlice_);
				}
				fpShot_.setFpShotSlices(fpShotSlices);

				fpShots.add(fpShot_);
			}
			fpShotResult.setFpShots(fpShots);

			List<TextFpShot> textFpShots = new ArrayList<TextFpShot>();
			for (int j = 0; j < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots.Length"); j++) {
				TextFpShot textFpShot = new TextFpShot();
				textFpShot.setPrimaryKey(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].PrimaryKey"));
				textFpShot.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].Similarity"));

				List<TextFpShotSlice> textFpShotSlices = new ArrayList<TextFpShotSlice>();
				for (int k = 0; k < _ctx.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices.Length"); k++) {
					TextFpShotSlice textFpShotSlice = new TextFpShotSlice();
					textFpShotSlice.setSimilarity(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices["+ k +"].Similarity"));
					textFpShotSlice.setInputText(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices["+ k +"].InputText"));
					textFpShotSlice.setDuplicationText(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices["+ k +"].DuplicationText"));

					InputFragment inputFragment = new InputFragment();
					inputFragment.setStart(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices["+ k +"].InputFragment.Start"));
					inputFragment.setDuration(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.TextFpShots["+ j +"].TextFpShotSlices["+ k +"].InputFragment.Duration"));
					textFpShotSlice.setInputFragment(inputFragment);

					textFpShotSlices.add(textFpShotSlice);
				}
				textFpShot.setTextFpShotSlices(textFpShotSlices);

				textFpShots.add(textFpShot);
			}
			fpShotResult.setTextFpShots(textFpShots);
			fpShotJob.setFpShotResult(fpShotResult);

			FpShotConfig fpShotConfig = new FpShotConfig();
			fpShotConfig.setPrimaryKey(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotConfig.PrimaryKey"));
			fpShotConfig.setSaveType(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotConfig.SaveType"));
			fpShotConfig.setNotary(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotConfig.Notary"));
			fpShotConfig.setFpDBId(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotConfig.FpDBId"));
			fpShotJob.setFpShotConfig(fpShotConfig);

			InputFile inputFile = new InputFile();
			inputFile.setObject(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Object"));
			inputFile.setLocation(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Location"));
			inputFile.setBucket(_ctx.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Bucket"));
			fpShotJob.setInputFile(inputFile);

			fpShotJobList.add(fpShotJob);
		}
		queryFpShotJobListResponse.setFpShotJobList(fpShotJobList);
	 
	 	return queryFpShotJobListResponse;
	}
}