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
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRecordIndexFilesResponseUnmarshaller {

	public static DescribeLiveStreamRecordIndexFilesResponse unmarshall(DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFilesResponse, UnmarshallerContext context) {
		
		describeLiveStreamRecordIndexFilesResponse.setRequestId(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RequestId"));

		List<RecordIndexInfo> recordIndexInfoList = new ArrayList<RecordIndexInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList.Length"); i++) {
			RecordIndexInfo recordIndexInfo = new RecordIndexInfo();
			recordIndexInfo.setRecordId(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].RecordId"));
			recordIndexInfo.setRecordUrl(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].RecordUrl"));
			recordIndexInfo.setDomainName(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].DomainName"));
			recordIndexInfo.setAppName(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].AppName"));
			recordIndexInfo.setStreamName(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].StreamName"));
			recordIndexInfo.setOssObject(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].OssObject"));
			recordIndexInfo.setStartTime(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].StartTime"));
			recordIndexInfo.setEndTime(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].EndTime"));
			recordIndexInfo.setDuration(context.floatValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Duration"));
			recordIndexInfo.setHeight(context.integerValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Height"));
			recordIndexInfo.setWidth(context.integerValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Width"));
			recordIndexInfo.setCreateTime(context.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].CreateTime"));

			recordIndexInfoList.add(recordIndexInfo);
		}
		describeLiveStreamRecordIndexFilesResponse.setRecordIndexInfoList(recordIndexInfoList);
	 
	 	return describeLiveStreamRecordIndexFilesResponse;
	}
}