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
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeResourceDiagnosisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceDiagnosisResponseUnmarshaller {

	public static DescribeResourceDiagnosisResponse unmarshall(DescribeResourceDiagnosisResponse describeResourceDiagnosisResponse, UnmarshallerContext context) {
		
		describeResourceDiagnosisResponse.setRequestId(context.stringValue("DescribeResourceDiagnosisResponse.RequestId"));
		describeResourceDiagnosisResponse.setStartTime(context.stringValue("DescribeResourceDiagnosisResponse.StartTime"));
		describeResourceDiagnosisResponse.setEndTime(context.stringValue("DescribeResourceDiagnosisResponse.EndTime"));

		List<String> cPU = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceDiagnosisResponse.CPU.Length"); i++) {
			cPU.add(context.stringValue("DescribeResourceDiagnosisResponse.CPU["+ i +"]"));
		}
		describeResourceDiagnosisResponse.setCPU(cPU);

		List<String> memory = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceDiagnosisResponse.Memory.Length"); i++) {
			memory.add(context.stringValue("DescribeResourceDiagnosisResponse.Memory["+ i +"]"));
		}
		describeResourceDiagnosisResponse.setMemory(memory);

		List<String> storage = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceDiagnosisResponse.Storage.Length"); i++) {
			storage.add(context.stringValue("DescribeResourceDiagnosisResponse.Storage["+ i +"]"));
		}
		describeResourceDiagnosisResponse.setStorage(storage);

		List<String> iOPS = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceDiagnosisResponse.IOPS.Length"); i++) {
			iOPS.add(context.stringValue("DescribeResourceDiagnosisResponse.IOPS["+ i +"]"));
		}
		describeResourceDiagnosisResponse.setIOPS(iOPS);

		List<String> connection = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeResourceDiagnosisResponse.Connection.Length"); i++) {
			connection.add(context.stringValue("DescribeResourceDiagnosisResponse.Connection["+ i +"]"));
		}
		describeResourceDiagnosisResponse.setConnection(connection);
	 
	 	return describeResourceDiagnosisResponse;
	}
}