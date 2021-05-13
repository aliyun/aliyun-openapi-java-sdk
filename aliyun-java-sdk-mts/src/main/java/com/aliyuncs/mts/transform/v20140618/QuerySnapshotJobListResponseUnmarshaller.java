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

	public static QuerySnapshotJobListResponse unmarshall(QuerySnapshotJobListResponse querySnapshotJobListResponse, UnmarshallerContext _ctx) {
		
		querySnapshotJobListResponse.setRequestId(_ctx.stringValue("QuerySnapshotJobListResponse.RequestId"));
		querySnapshotJobListResponse.setNextPageToken(_ctx.stringValue("QuerySnapshotJobListResponse.NextPageToken"));

		List<String> nonExistSnapshotJobIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QuerySnapshotJobListResponse.NonExistSnapshotJobIds.Length"); i++) {
			nonExistSnapshotJobIds.add(_ctx.stringValue("QuerySnapshotJobListResponse.NonExistSnapshotJobIds["+ i +"]"));
		}
		querySnapshotJobListResponse.setNonExistSnapshotJobIds(nonExistSnapshotJobIds);

		List<SnapshotJob> snapshotJobList = new ArrayList<SnapshotJob>();
		for (int i = 0; i < _ctx.lengthValue("QuerySnapshotJobListResponse.SnapshotJobList.Length"); i++) {
			SnapshotJob snapshotJob = new SnapshotJob();
			snapshotJob.setCreationTime(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].CreationTime"));
			snapshotJob.setState(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].State"));
			snapshotJob.setMessage(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Message"));
			snapshotJob.setCount(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Count"));
			snapshotJob.setTileCount(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].TileCount"));
			snapshotJob.setUserData(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].UserData"));
			snapshotJob.setCode(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Code"));
			snapshotJob.setPipelineId(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].PipelineId"));
			snapshotJob.setId(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Id"));

			SnapshotConfig snapshotConfig = new SnapshotConfig();
			snapshotConfig.setTime(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Time"));
			snapshotConfig.setInterval(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Interval"));
			snapshotConfig.setFrameType(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.FrameType"));
			snapshotConfig.setWidth(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Width"));
			snapshotConfig.setHeight(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Height"));
			snapshotConfig.setNum(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.Num"));

			TileOut tileOut = new TileOut();
			tileOut.setPadding(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Padding"));
			tileOut.setColor(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Color"));
			tileOut.setCellSelStep(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellSelStep"));
			tileOut.setCellHeight(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellHeight"));
			tileOut.setCellWidth(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.CellWidth"));
			tileOut.setMargin(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Margin"));
			tileOut.setColumns(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Columns"));
			tileOut.setIsKeepCellPic(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.IsKeepCellPic"));
			tileOut.setLines(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOut.Lines"));
			snapshotConfig.setTileOut(tileOut);

			OutputFile outputFile = new OutputFile();
			outputFile.setRoleArn(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.RoleArn"));
			outputFile.setObject(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Object"));
			outputFile.setLocation(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Location"));
			outputFile.setBucket(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.OutputFile.Bucket"));
			snapshotConfig.setOutputFile(outputFile);

			TileOutputFile tileOutputFile = new TileOutputFile();
			tileOutputFile.setRoleArn(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.RoleArn"));
			tileOutputFile.setObject(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Object"));
			tileOutputFile.setLocation(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Location"));
			tileOutputFile.setBucket(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].SnapshotConfig.TileOutputFile.Bucket"));
			snapshotConfig.setTileOutputFile(tileOutputFile);
			snapshotJob.setSnapshotConfig(snapshotConfig);

			MNSMessageResult mNSMessageResult = new MNSMessageResult();
			mNSMessageResult.setMessageId(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.MessageId"));
			mNSMessageResult.setErrorMessage(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.ErrorMessage"));
			mNSMessageResult.setErrorCode(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].MNSMessageResult.ErrorCode"));
			snapshotJob.setMNSMessageResult(mNSMessageResult);

			Input input = new Input();
			input.setRoleArn(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.RoleArn"));
			input.setObject(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Object"));
			input.setLocation(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Location"));
			input.setBucket(_ctx.stringValue("QuerySnapshotJobListResponse.SnapshotJobList["+ i +"].Input.Bucket"));
			snapshotJob.setInput(input);

			snapshotJobList.add(snapshotJob);
		}
		querySnapshotJobListResponse.setSnapshotJobList(snapshotJobList);
	 
	 	return querySnapshotJobListResponse;
	}
}