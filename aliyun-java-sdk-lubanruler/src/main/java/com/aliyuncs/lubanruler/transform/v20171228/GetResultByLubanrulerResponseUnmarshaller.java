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
package com.aliyuncs.lubanruler.transform.v20171228;

import com.aliyuncs.lubanruler.model.v20171228.GetResultByLubanrulerResponse;
import com.aliyuncs.lubanruler.model.v20171228.GetResultByLubanrulerResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResultByLubanrulerResponseUnmarshaller {

	public static GetResultByLubanrulerResponse unmarshall(GetResultByLubanrulerResponse getResultByLubanrulerResponse, UnmarshallerContext context) {
		
		getResultByLubanrulerResponse.setRequestId(context.stringValue("GetResultByLubanrulerResponse.RequestId"));
		getResultByLubanrulerResponse.setCode(context.stringValue("GetResultByLubanrulerResponse.Code"));
		getResultByLubanrulerResponse.setMessage(context.stringValue("GetResultByLubanrulerResponse.Message"));
		getResultByLubanrulerResponse.setRunStatus(context.stringValue("GetResultByLubanrulerResponse.RunStatus"));

		Data data = new Data();
		data.setAonePipelineId(context.integerValue("GetResultByLubanrulerResponse.Data.AonePipelineId"));
		data.setAppName(context.stringValue("GetResultByLubanrulerResponse.Data.AppName"));
		data.setScmUrl(context.stringValue("GetResultByLubanrulerResponse.Data.ScmUrl"));
		data.setScmBranch(context.stringValue("GetResultByLubanrulerResponse.Data.ScmBranch"));
		data.setTaskStatus(context.stringValue("GetResultByLubanrulerResponse.Data.TaskStatus"));
		data.setBlockerCnt(context.integerValue("GetResultByLubanrulerResponse.Data.BlockerCnt"));
		data.setCriticalCnt(context.integerValue("GetResultByLubanrulerResponse.Data.CriticalCnt"));
		data.setInfoCnt(context.integerValue("GetResultByLubanrulerResponse.Data.InfoCnt"));
		data.setMajorCnt(context.integerValue("GetResultByLubanrulerResponse.Data.MajorCnt"));
		data.setMinorCnt(context.integerValue("GetResultByLubanrulerResponse.Data.MinorCnt"));
		data.setComplexity(context.stringValue("GetResultByLubanrulerResponse.Data.Complexity"));
		data.setDuplicatedLinesDensity(context.stringValue("GetResultByLubanrulerResponse.Data.DuplicatedLinesDensity"));
		data.setReliabilityRating(context.stringValue("GetResultByLubanrulerResponse.Data.ReliabilityRating"));
		data.setSecurityRating(context.stringValue("GetResultByLubanrulerResponse.Data.SecurityRating"));
		data.setSqaleRating(context.stringValue("GetResultByLubanrulerResponse.Data.SqaleRating"));
		data.setLineOfCode(context.stringValue("GetResultByLubanrulerResponse.Data.LineOfCode"));
		data.setFunctions(context.stringValue("GetResultByLubanrulerResponse.Data.Functions"));
		data.setResultUrl(context.stringValue("GetResultByLubanrulerResponse.Data.ResultUrl"));
		data.setCommentLinesDensity(context.stringValue("GetResultByLubanrulerResponse.Data.CommentLinesDensity"));
		getResultByLubanrulerResponse.setData(data);
	 
	 	return getResultByLubanrulerResponse;
	}
}