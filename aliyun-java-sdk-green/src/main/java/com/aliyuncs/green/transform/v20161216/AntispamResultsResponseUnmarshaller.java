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
package com.aliyuncs.green.transform.v20161216;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20161216.AntispamResultsResponse;
import com.aliyuncs.green.model.v20161216.AntispamResultsResponse.AntispamResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class AntispamResultsResponseUnmarshaller {

	public static AntispamResultsResponse unmarshall(AntispamResultsResponse antispamResultsResponse, UnmarshallerContext context) {
		
		antispamResultsResponse.setCode(context.stringValue("AntispamResultsResponse.Code"));
		antispamResultsResponse.setMsg(context.stringValue("AntispamResultsResponse.Msg"));

		List<AntispamResult> antispamResults = new ArrayList<AntispamResult>();
		for (int i = 0; i < context.lengthValue("AntispamResultsResponse.AntispamResults.Length"); i++) {
			AntispamResult antispamResult = new AntispamResult();
			antispamResult.setCode(context.stringValue("AntispamResultsResponse.AntispamResults["+ i +"].Code"));
			antispamResult.setMsg(context.stringValue("AntispamResultsResponse.AntispamResults["+ i +"].Msg"));
			antispamResult.setDataId(context.stringValue("AntispamResultsResponse.AntispamResults["+ i +"].DataId"));
			antispamResult.setStatus(context.stringValue("AntispamResultsResponse.AntispamResults["+ i +"].Status"));
			antispamResult.setResultCode(context.integerValue("AntispamResultsResponse.AntispamResults["+ i +"].ResultCode"));
			antispamResult.setLabel(context.integerValue("AntispamResultsResponse.AntispamResults["+ i +"].Label"));

			antispamResults.add(antispamResult);
		}
		antispamResultsResponse.setAntispamResults(antispamResults);
	 
	 	return antispamResultsResponse;
	}
}