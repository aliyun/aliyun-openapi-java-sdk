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
package com.aliyuncs.yundun.transform.v20150416;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.yundun.model.v20150416.SecureCheckResponse;
import com.aliyuncs.yundun.model.v20150416.SecureCheckResponse.Info;
import com.aliyuncs.transform.UnmarshallerContext;


public class SecureCheckResponseUnmarshaller {

	public static SecureCheckResponse unmarshall(SecureCheckResponse secureCheckResponse, UnmarshallerContext context) {
		
		secureCheckResponse.setRequestId(context.stringValue("SecureCheckResponse.RequestId"));
		secureCheckResponse.setRecentInstanceId(context.stringValue("SecureCheckResponse.RecentInstanceId"));

		List<Info> problemList = new ArrayList<Info>();
		for (int i = 0; i < context.lengthValue("SecureCheckResponse.ProblemList.Length"); i++) {
			Info  info = new Info();
			info.setIp(context.stringValue("SecureCheckResponse.ProblemList["+ i +"].Ip"));
			info.setStatus(context.stringValue("SecureCheckResponse.ProblemList["+ i +"].Status"));
			info.setVulNum(context.stringValue("SecureCheckResponse.ProblemList["+ i +"].VulNum"));
			info.setInstanceId(context.stringValue("SecureCheckResponse.ProblemList["+ i +"].InstanceId"));

			problemList.add(info);
		}
		secureCheckResponse.setProblemList(problemList);

		List<Info> noProblemList = new ArrayList<Info>();
		for (int i = 0; i < context.lengthValue("SecureCheckResponse.NoProblemList.Length"); i++) {
			Info  info = new Info();
			info.setIp(context.stringValue("SecureCheckResponse.NoProblemList["+ i +"].Ip"));
			info.setStatus(context.stringValue("SecureCheckResponse.NoProblemList["+ i +"].Status"));
			info.setVulNum(context.stringValue("SecureCheckResponse.NoProblemList["+ i +"].VulNum"));
			info.setInstanceId(context.stringValue("SecureCheckResponse.NoProblemList["+ i +"].InstanceId"));

			noProblemList.add(info);
		}
		secureCheckResponse.setNoProblemList(noProblemList);

		List<Info> noScanList = new ArrayList<Info>();
		for (int i = 0; i < context.lengthValue("SecureCheckResponse.NoScanList.Length"); i++) {
			Info  info = new Info();
			info.setIp(context.stringValue("SecureCheckResponse.NoScanList["+ i +"].Ip"));
			info.setStatus(context.stringValue("SecureCheckResponse.NoScanList["+ i +"].Status"));
			info.setVulNum(context.stringValue("SecureCheckResponse.NoScanList["+ i +"].VulNum"));
			info.setInstanceId(context.stringValue("SecureCheckResponse.NoScanList["+ i +"].InstanceId"));

			noScanList.add(info);
		}
		secureCheckResponse.setNoScanList(noScanList);

		List<Info> scanningList = new ArrayList<Info>();
		for (int i = 0; i < context.lengthValue("SecureCheckResponse.ScanningList.Length"); i++) {
			Info  info = new Info();
			info.setIp(context.stringValue("SecureCheckResponse.ScanningList["+ i +"].Ip"));
			info.setStatus(context.stringValue("SecureCheckResponse.ScanningList["+ i +"].Status"));
			info.setVulNum(context.stringValue("SecureCheckResponse.ScanningList["+ i +"].VulNum"));
			info.setInstanceId(context.stringValue("SecureCheckResponse.ScanningList["+ i +"].InstanceId"));

			scanningList.add(info);
		}
		secureCheckResponse.setScanningList(scanningList);

		List<Info> innerIpList = new ArrayList<Info>();
		for (int i = 0; i < context.lengthValue("SecureCheckResponse.InnerIpList.Length"); i++) {
			Info  info = new Info();
			info.setIp(context.stringValue("SecureCheckResponse.InnerIpList["+ i +"].Ip"));
			info.setStatus(context.stringValue("SecureCheckResponse.InnerIpList["+ i +"].Status"));
			info.setVulNum(context.stringValue("SecureCheckResponse.InnerIpList["+ i +"].VulNum"));
			info.setInstanceId(context.stringValue("SecureCheckResponse.InnerIpList["+ i +"].InstanceId"));

			innerIpList.add(info);
		}
		secureCheckResponse.setInnerIpList(innerIpList);
	 
	 	return secureCheckResponse;
	}
}