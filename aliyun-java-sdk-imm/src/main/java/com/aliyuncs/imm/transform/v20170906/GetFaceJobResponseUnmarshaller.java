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
package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.GetFaceJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceJobResponseUnmarshaller {

	public static GetFaceJobResponse unmarshall(GetFaceJobResponse getFaceJobResponse, UnmarshallerContext context) {
		
		getFaceJobResponse.setRequestId(context.stringValue("GetFaceJobResponse.RequestId"));
		getFaceJobResponse.setJobId(context.stringValue("GetFaceJobResponse.JobId"));
		getFaceJobResponse.setSetId(context.stringValue("GetFaceJobResponse.SetId"));
		getFaceJobResponse.setSrcUri(context.stringValue("GetFaceJobResponse.SrcUri"));
		getFaceJobResponse.setStatus(context.stringValue("GetFaceJobResponse.Status"));
		getFaceJobResponse.setPercent(context.integerValue("GetFaceJobResponse.Percent"));
		getFaceJobResponse.setCreateTime(context.stringValue("GetFaceJobResponse.CreateTime"));
		getFaceJobResponse.setFinishTime(context.stringValue("GetFaceJobResponse.FinishTime"));
	 
	 	return getFaceJobResponse;
	}
}