/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.transform.v20140618;

import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.Input;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig;
import com.aliyuncs.mts.model.v20140618.SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile;
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
		snapshotJob.setMessage(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Message"));
		snapshotJob.setCreationTime(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.CreationTime"));

		Input input = new Input();
		input.setBucket(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Bucket"));
		input.setLocation(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Location"));
		input.setObject(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.Input.Object"));
		snapshotJob.setInput(input);

		SnapshotConfig snapshotConfig = new SnapshotConfig();
		snapshotConfig.setTime(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Time"));
		snapshotConfig.setInterval(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Interval"));
		snapshotConfig.setNum(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.Num"));

		OutputFile outputFile = new OutputFile();
		outputFile.setBucket(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Bucket"));
		outputFile.setLocation(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Location"));
		outputFile.setObject(context.stringValue("SubmitSnapshotJobResponse.SnapshotJob.SnapshotConfig.OutputFile.Object"));
		snapshotConfig.setOutputFile(outputFile);
		snapshotJob.setSnapshotConfig(snapshotConfig);
		submitSnapshotJobResponse.setSnapshotJob(snapshotJob);
	 
	 	return submitSnapshotJobResponse;
	}
}