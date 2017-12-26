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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Duplication;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.FpShotResult.FpShot.FpShotSlice.Input;
import com.aliyuncs.mts.model.v20140618.QueryFpShotJobListResponse.FpShotJob.InputFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFpShotJobListResponseUnmarshaller {

	public static QueryFpShotJobListResponse unmarshall(QueryFpShotJobListResponse queryFpShotJobListResponse, UnmarshallerContext context) {
		
		queryFpShotJobListResponse.setRequestId(context.stringValue("QueryFpShotJobListResponse.RequestId"));

		List<String> nonExistIds = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryFpShotJobListResponse.NonExistIds.Length"); i++) {
			nonExistIds.add(context.stringValue("QueryFpShotJobListResponse.NonExistIds["+ i +"]"));
		}
		queryFpShotJobListResponse.setNonExistIds(nonExistIds);

		List<FpShotJob> fpShotJobList = new ArrayList<FpShotJob>();
		for (int i = 0; i < context.lengthValue("QueryFpShotJobListResponse.FpShotJobList.Length"); i++) {
			FpShotJob fpShotJob = new FpShotJob();
			fpShotJob.setId(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Id"));
			fpShotJob.setUserData(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].UserData"));
			fpShotJob.setPipelineId(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].PipelineId"));
			fpShotJob.setState(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].State"));
			fpShotJob.setCode(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Code"));
			fpShotJob.setMessage(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].Message"));
			fpShotJob.setCreationTime(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].CreationTime"));

			InputFile inputFile = new InputFile();
			inputFile.setBucket(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Bucket"));
			inputFile.setLocation(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Location"));
			inputFile.setObject(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].InputFile.Object"));
			fpShotJob.setInputFile(inputFile);

			FpShotResult fpShotResult = new FpShotResult();

			List<FpShot> fpShots = new ArrayList<FpShot>();
			for (int j = 0; j < context.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots.Length"); j++) {
				FpShot fpShot = new FpShot();
				fpShot.setPrimaryKey(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].PrimaryKey"));
				fpShot.setSimilarity(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].Similarity"));

				List<FpShotSlice> fpShotSlices = new ArrayList<FpShotSlice>();
				for (int k = 0; k < context.lengthValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices.Length"); k++) {
					FpShotSlice fpShotSlice = new FpShotSlice();

					Input input = new Input();
					input.setStart(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Input.Start"));
					input.setDuration(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Input.Duration"));
					fpShotSlice.setInput(input);

					Duplication duplication = new Duplication();
					duplication.setStart(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Start"));
					duplication.setDuration(context.stringValue("QueryFpShotJobListResponse.FpShotJobList["+ i +"].FpShotResult.FpShots["+ j +"].FpShotSlices["+ k +"].Duplication.Duration"));
					fpShotSlice.setDuplication(duplication);

					fpShotSlices.add(fpShotSlice);
				}
				fpShot.setFpShotSlices(fpShotSlices);

				fpShots.add(fpShot);
			}
			fpShotResult.setFpShots(fpShots);
			fpShotJob.setFpShotResult(fpShotResult);

			fpShotJobList.add(fpShotJob);
		}
		queryFpShotJobListResponse.setFpShotJobList(fpShotJobList);
	 
	 	return queryFpShotJobListResponse;
	}
}