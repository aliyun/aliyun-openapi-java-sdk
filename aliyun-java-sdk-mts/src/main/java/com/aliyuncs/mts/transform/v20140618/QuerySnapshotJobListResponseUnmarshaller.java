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

import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.Input;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.MNSMessageResult;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.SnapshotConfig;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.SnapshotConfig.OutputFile;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.SnapshotConfig.TileOut;
import com.aliyuncs.mts.model.v20140618.QuerySnapshotJobListResponse.SnapshotJob.SnapshotConfig.TileOutputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySnapshotJobListResponseUnmarshaller {

	public static QuerySnapshotJobListResponse unmarshall(QuerySnapshotJobListResponse querySnapshotJobListResponse, UnmarshallerContext context) {
		
		querySnapshotJobListResponse.setRequestId(context.stringValue("QuerySnapshotJobListResponse.RequestId"));
		querySnapshotJobListResponse.setNextPageToken(context.stringValue("QuerySnapshotJobListResponse.NextPageToken"));

		List<String> nonExistSnapshotJobIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QuerySnapshotJobListResponse.NonExistSnapshotJobIds.Length"); i++) {
			nonExistSnapshotJobIds.add(context.stringValue("QuerySnapshotJobListResponse.NonExistSnapshotJobIds["+ i +"]"));
		}
		querySnapshotJobListResponse.setNonExistSnapshotJobIds(nonExistSnapshotJobIds);

		List<SnapshotJob> snapshotJobList = new ArrayList<SnapshotJob>();
		for (int i = 0; i < context.lengthValue("QuerySnapshotJobListResponse.SnapshotJobList.Length"); i++) {
			SnapshotJob snapshotJob = new SnapshotJob();
			snapshotJob.setId(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Id"));
			snapshotJob.setUserData(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].UserData"));
			snapshotJob.setPipelineId(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].PipelineId"));
			snapshotJob.setState(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].State"));
			snapshotJob.setCode(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Code"));
			snapshotJob.setCount(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Count"));
			snapshotJob.setTileCount(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].TileCount"));
			snapshotJob.setMessage(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Message"));
			snapshotJob.setCreationTime(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].CreationTime"));

			Input input = new Input();
			input.setBucket(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Bucket"));
			input.setLocation(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Location"));
			input.setObject(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Object"));
			input.setRoleArn(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.RoleArn"));
			snapshotJob.setInput(input);

			SnapshotConfig snapshotConfig = new SnapshotConfig();
			snapshotConfig.setTime(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Time"));
			snapshotConfig.setInterval(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Interval"));
			snapshotConfig.setNum(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Num"));
			snapshotConfig.setWidth(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Width"));
			snapshotConfig.setHeight(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Height"));
			snapshotConfig.setFrameType(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.FrameType"));

			OutputFile outputFile = new OutputFile();
			outputFile.setBucket(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Bucket"));
			outputFile.setLocation(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Location"));
			outputFile.setObject(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Object"));
			outputFile.setRoleArn(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.RoleArn"));
			snapshotConfig.setOutputFile(outputFile);

			TileOutputFile tileOutputFile = new TileOutputFile();
			tileOutputFile.setBucket(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Bucket"));
			tileOutputFile.setLocation(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Location"));
			tileOutputFile.setObject(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Object"));
			tileOutputFile.setRoleArn(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.RoleArn"));
			snapshotConfig.setTileOutputFile(tileOutputFile);

			TileOut tileOut = new TileOut();
			tileOut.setLines(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Lines"));
			tileOut.setColumns(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Columns"));
			tileOut.setCellWidth(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellWidth"));
			tileOut.setCellHeight(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellHeight"));
			tileOut.setMargin(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Margin"));
			tileOut.setPadding(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Padding"));
			tileOut.setColor(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Color"));
			tileOut.setIsKeepCellPic(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.IsKeepCellPic"));
			tileOut.setCellSelStep(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellSelStep"));
			snapshotConfig.setTileOut(tileOut);
			snapshotJob.setSnapshotConfig(snapshotConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(context.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.ErrorCode"));
			snapshotJob.setMNSMessageResult(mNSMessageResult);

			snapshotJobList.add(snapshotJob);
		}
		querySnapshotJobListResponse.setSnapshotJobList(snapshotJobList);
	 
	 	return querySnapshotJobListResponse;
	}
}