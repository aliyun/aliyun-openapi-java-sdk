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

import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitSnapshotJobResponseUnmarshaller {

	public static SubmitSnapshotJobResponse unmarshall(SubmitSnapshotJobResponse submitSnapshotJobResponse, UnmarshallerContext _ctx) {
		
		submitSnapshotJobResponse.setRequestId(_ctx.stringValue("SubmitSnapshotJobResponse.RequestId"));

		SnapshotJob snapshotJob = new SnapshotJob();
		snapshotJob.setCreationTime(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.CreationTime"));
		snapshotJob.setState(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.State"));
		snapshotJob.setMessage(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Message"));
		snapshotJob.setCount(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Count"));
		snapshotJob.setTileCount(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.TileCount"));
		snapshotJob.setUserData(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.UserData"));
		snapshotJob.setCode(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Code"));
		snapshotJob.setPipelineId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.PipelineId"));
		snapshotJob.setId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Id"));

		SnapshotConfig snapshotConfig = new SnapshotConfig();
		snapshotConfig.setTime(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Time"));
		snapshotConfig.setInterval(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Interval"));
		snapshotConfig.setFrameType(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.FrameType"));
		snapshotConfig.setWidth(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Width"));
		snapshotConfig.setHeight(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Height"));
		snapshotConfig.setNum(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Num"));

		TileOut tileOut = new TileOut();
		tileOut.setPadding(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Padding"));
		tileOut.setColor(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Color"));
		tileOut.setCellSelStep(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellSelStep"));
		tileOut.setCellHeight(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellHeight"));
		tileOut.setCellWidth(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellWidth"));
		tileOut.setMargin(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Margin"));
		tileOut.setColumns(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Columns"));
		tileOut.setIsKeepCellPic(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.IsKeepCellPic"));
		tileOut.setLines(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Lines"));
		snapshotConfig.setTileOut(tileOut);

		OutputFile outputFile = new OutputFile();
		outputFile.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.RoleArn"));
		outputFile.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Object"));
		outputFile.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Location"));
		outputFile.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Bucket"));
		snapshotConfig.setOutputFile(outputFile);

		TileOutputFile tileOutputFile = new TileOutputFile();
		tileOutputFile.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.RoleArn"));
		tileOutputFile.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Object"));
		tileOutputFile.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Location"));
		tileOutputFile.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Bucket"));
		snapshotConfig.setTileOutputFile(tileOutputFile);
		snapshotJob.setSnapshotConfig(snapshotConfig);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorCode"));
		snapshotJob.setMNSMessageResult(mNSMessageResult);

		Input input = new Input();
		input.setRoleArn(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.RoleArn"));
		input.setObject(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Object"));
		input.setLocation(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Location"));
		input.setBucket(_ctx.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Bucket"));
		snapshotJob.setInput(input);
		submitSnapshotJobResponse.setSnapshotJob(snapshotJob);
	 
	 	return submitSnapshotJobResponse;
	}
}