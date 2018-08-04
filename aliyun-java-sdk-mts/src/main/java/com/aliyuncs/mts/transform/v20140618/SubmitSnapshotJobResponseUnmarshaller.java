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

	public static SubmitSnapshotJobResponse unmarshall(SubmitSnapshotJobResponse submitSnapshotJobResponse, UnmarshallerContext context) {
		
		submitSnapshotJobResponse.setRequestId(context.stringValue("SubmitSnapshotJobResponse.RequestId"));

		SnapshotJob snapshotJob = new SnapshotJob();
		snapshotJob.setId(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Id"));
		snapshotJob.setUserData(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.UserData"));
		snapshotJob.setPipelineId(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.PipelineId"));
		snapshotJob.setState(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.State"));
		snapshotJob.setCode(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Code"));
		snapshotJob.setCount(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Count"));
		snapshotJob.setTileCount(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.TileCount"));
		snapshotJob.setMessage(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Message"));
		snapshotJob.setCreationTime(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.CreationTime"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Location"));
		input.setObject(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Object"));
		input.setRoleArn(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.RoleArn"));
		snapshotJob.setInput(input);

		SnapshotConfig snapshotConfig = new SnapshotConfig();
		snapshotConfig.setTime(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Time"));
		snapshotConfig.setInterval(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Interval"));
		snapshotConfig.setNum(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Num"));
		snapshotConfig.setWidth(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Width"));
		snapshotConfig.setHeight(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Height"));
		snapshotConfig.setFrameType(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.FrameType"));

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Bucket"));
		outputFile.setLocation(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Location"));
		outputFile.setObject(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Object"));
		outputFile.setRoleArn(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.RoleArn"));
		snapshotConfig.setOutputFile(outputFile);

		TileOutputFile tileOutputFile = new TileOutputFile();
		tileOutputFile.setBucket(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Bucket"));
		tileOutputFile.setLocation(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Location"));
		tileOutputFile.setObject(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.Object"));
		tileOutputFile.setRoleArn(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOutputFile.RoleArn"));
		snapshotConfig.setTileOutputFile(tileOutputFile);

		TileOut tileOut = new TileOut();
		tileOut.setLines(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Lines"));
		tileOut.setColumns(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Columns"));
		tileOut.setCellWidth(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellWidth"));
		tileOut.setCellHeight(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellHeight"));
		tileOut.setMargin(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Margin"));
		tileOut.setPadding(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Padding"));
		tileOut.setColor(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.Color"));
		tileOut.setIsKeepCellPic(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.IsKeepCellPic"));
		tileOut.setCellSelStep(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.TileOut.CellSelStep"));
		snapshotConfig.setTileOut(tileOut);
		snapshotJob.setSnapshotConfig(snapshotConfig);

		MNSMessageResult mNSMessageResult = new MNSMessageResult();
		mNSMessageResult.setMessageId(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.MessageId"));
		mNSMessageResult.setErrorMessage(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorMessage"));
		mNSMessageResult.setErrorCode(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.MNSMessageResult.ErrorCode"));
		snapshotJob.setMNSMessageResult(mNSMessageResult);
		submitSnapshotJobResponse.setSnapshotJob(snapshotJob);
	 
	 	return submitSnapshotJobResponse;
	}
}