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

import com.aliyuncs.rds.model.v20140815.DescribeSQLDiagnosisResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLDiagnosisResponseUnmarshaller {

	public static DescribeSQLDiagnosisResponse unmarshall(DescribeSQLDiagnosisResponse describeSQLDiagnosisResponse, UnmarshallerContext context) {
		
		describeSQLDiagnosisResponse.setRequestId(context.stringValue("DescribeSQLDiagnosisResponse.RequestId"));

		List<String> sQLList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeSQLDiagnosisResponse.SQLList.Length"); i++) {
			sQLList.add(context.stringValue("DescribeSQLDiagnosisResponse.SQLList["+ i +"]"));
		}
		describeSQLDiagnosisResponse.setSQLList(sQLList);
	 
	 	return describeSQLDiagnosisResponse;
	}
}