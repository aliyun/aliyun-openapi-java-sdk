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

import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotConfig;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShot;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShot.TextFpShotSlice;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShot.TextFpShotSlice.InputFragment;
import com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitSyncFpShotJobResponseUnmarshaller {

	public static SubmitSyncFpShotJobResponse unmarshall(SubmitSyncFpShotJobResponse submitSyncFpShotJobResponse, UnmarshallerContext _ctx) {
		
		submitSyncFpShotJobResponse.setRequestId(_ctx.stringValue("SubmitSyncFpShotJobResponse.RequestId"));

		FpShotJob fpShotJob = new FpShotJob();
		fpShotJob.setCreationTime(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.CreationTime"));
		fpShotJob.setFinishTime(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FinishTime"));
		fpShotJob.setState(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.State"));
		fpShotJob.setUserData(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.UserData"));
		fpShotJob.setCode(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.Code"));
		fpShotJob.setMessage(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.Message"));
		fpShotJob.setTxHash(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.TxHash"));
		fpShotJob.setTransactionId(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.TransactionId"));
		fpShotJob.setPipelineId(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.PipelineId"));
		fpShotJob.setId(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.Id"));
		fpShotJob.setFileId(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FileId"));

		InputFile inputFile = new InputFile();
		inputFile.setObject(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.InputFile.Object"));
		inputFile.setLocation(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.InputFile.Location"));
		inputFile.setBucket(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.InputFile.Bucket"));
		fpShotJob.setInputFile(inputFile);

		FpShotConfig fpShotConfig = new FpShotConfig();
		fpShotConfig.setNotary(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotConfig.Notary"));
		fpShotConfig.setPrimaryKey(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotConfig.PrimaryKey"));
		fpShotConfig.setSaveType(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotConfig.SaveType"));
		fpShotConfig.setFpDBId(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotConfig.FpDBId"));
		fpShotJob.setFpShotConfig(fpShotConfig);

		FpShotResult fpShotResult = new FpShotResult();

		List<FpShot> fpShots = new ArrayList<FpShot>();
		for (int i = 0; i < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots.Length"); i++) {
			FpShot fpShot = new FpShot();
			fpShot.setPrimaryKey(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].PrimaryKey"));
			fpShot.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].Similarity"));

			List<FpShotSlice> fpShotSlices = new ArrayList<FpShotSlice>();
			for (int j = 0; j < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices.Length"); j++) {
				FpShotSlice fpShotSlice = new FpShotSlice();
				fpShotSlice.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices["+ j +"].Similarity"));

				Input input = new Input();
				input.setDuration(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices["+ j +"].Input.Duration"));
				input.setStart(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices["+ j +"].Input.Start"));
				fpShotSlice.setInput(input);

				Duplication duplication = new Duplication();
				duplication.setDuration(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices["+ j +"].Duplication.Duration"));
				duplication.setStart(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShots["+ i +"].FpShotSlices["+ j +"].Duplication.Start"));
				fpShotSlice.setDuplication(duplication);

				fpShotSlices.add(fpShotSlice);
			}
			fpShot.setFpShotSlices(fpShotSlices);

			fpShots.add(fpShot);
		}
		fpShotResult.setFpShots(fpShots);

		List<FpShot> audioFpShots = new ArrayList<FpShot>();
		for (int i = 0; i < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots.Length"); i++) {
			FpShot fpShot7 = new FpShot();
			fpShot7.setPrimaryKey(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].PrimaryKey"));
			fpShot7.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].Similarity"));

			List<FpShotSlice> fpShotSlices1 = new ArrayList<FpShotSlice>();
			for (int j = 0; j < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices.Length"); j++) {
				com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice fpShotSlice3 = new com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice();
				fpShotSlice3.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices["+ j +"].Similarity"));

				com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input input2 = new com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input();
				input2.setDuration(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices["+ j +"].Input.Duration"));
				input2.setStart(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices["+ j +"].Input.Start"));
				fpShotSlice3.setInput(input2);

				com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication duplication1 = new com.aliyuncs.mts.model.v20140618.SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication();
				duplication1.setDuration(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices["+ j +"].Duplication.Duration"));
				duplication1.setStart(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.AudioFpShots["+ i +"].FpShotSlices["+ j +"].Duplication.Start"));
				fpShotSlice3.setDuplication(duplication1);

				fpShotSlices1.add(fpShotSlice3);
			}
			fpShot7.setFpShotSlices(fpShotSlices1);

			audioFpShots.add(fpShot7);
		}
		fpShotResult.setAudioFpShots(audioFpShots);

		List<TextFpShot> textFpShots = new ArrayList<TextFpShot>();
		for (int i = 0; i < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots.Length"); i++) {
			TextFpShot textFpShot = new TextFpShot();
			textFpShot.setPrimaryKey(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].PrimaryKey"));
			textFpShot.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].Similarity"));

			List<TextFpShotSlice> textFpShotSlices = new ArrayList<TextFpShotSlice>();
			for (int j = 0; j < _ctx.lengthValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices.Length"); j++) {
				TextFpShotSlice textFpShotSlice = new TextFpShotSlice();
				textFpShotSlice.setInputText(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices["+ j +"].InputText"));
				textFpShotSlice.setSimilarity(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices["+ j +"].Similarity"));
				textFpShotSlice.setDuplicationText(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices["+ j +"].DuplicationText"));

				InputFragment inputFragment = new InputFragment();
				inputFragment.setDuration(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices["+ j +"].InputFragment.Duration"));
				inputFragment.setStart(_ctx.stringValue("SubmitSyncFpShotJobResponse.FpShotJob.FpShotResult.TextFpShots["+ i +"].TextFpShotSlices["+ j +"].InputFragment.Start"));
				textFpShotSlice.setInputFragment(inputFragment);

				textFpShotSlices.add(textFpShotSlice);
			}
			textFpShot.setTextFpShotSlices(textFpShotSlices);

			textFpShots.add(textFpShot);
		}
		fpShotResult.setTextFpShots(textFpShots);
		fpShotJob.setFpShotResult(fpShotResult);
		submitSyncFpShotJobResponse.setFpShotJob(fpShotJob);
	 
	 	return submitSyncFpShotJobResponse;
	}
}