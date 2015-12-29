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

import com.aliyuncs.rds.model.v20140815.DescribeBinlogFilesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeBinlogFilesResponse.BinLogFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBinlogFilesResponseUnmarshaller {

	public static DescribeBinlogFilesResponse unmarshall(DescribeBinlogFilesResponse describeBinlogFilesResponse, UnmarshallerContext context) {
		
		describeBinlogFilesResponse.setRequestId(context.stringValue("DescribeBinlogFilesResponse.RequestId"));
		describeBinlogFilesResponse.setTotalRecordCount(context.integerValue("DescribeBinlogFilesResponse.TotalRecordCount"));
		describeBinlogFilesResponse.setPageNumber(context.integerValue("DescribeBinlogFilesResponse.PageNumber"));
		describeBinlogFilesResponse.setPageRecordCount(context.integerValue("DescribeBinlogFilesResponse.PageRecordCount"));

		List<BinLogFile> items = new ArrayList<BinLogFile>();
		for (int i = 0; i < context.lengthValue("DescribeBinlogFilesResponse.Items.Length"); i++) {
			BinLogFile binLogFile = new BinLogFile();
			binLogFile.setFileSize(context.longValue("DescribeBinlogFilesResponse.Items["+ i +"].FileSize"));
			binLogFile.setLogBeginTime(context.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogBeginTime"));
			binLogFile.setLogEndTime(context.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LogEndTime"));
			binLogFile.setDownloadLink(context.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].DownloadLink"));
			binLogFile.setLinkExpiredTime(context.stringValue("DescribeBinlogFilesResponse.Items["+ i +"].LinkExpiredTime"));

			items.add(binLogFile);
		}
		describeBinlogFilesResponse.setItems(items);
	 
	 	return describeBinlogFilesResponse;
	}
}