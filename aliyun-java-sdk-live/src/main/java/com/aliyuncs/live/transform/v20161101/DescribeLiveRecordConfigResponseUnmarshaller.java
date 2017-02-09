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
package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse.LiveAppRecord;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse.LiveAppRecord.RecordFormat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordConfigResponseUnmarshaller {

	public static DescribeLiveRecordConfigResponse unmarshall(DescribeLiveRecordConfigResponse describeLiveRecordConfigResponse, UnmarshallerContext context) {
		
		describeLiveRecordConfigResponse.setRequestId(context.stringValue("DescribeLiveRecordConfigResponse.RequestId"));
		describeLiveRecordConfigResponse.setPageNum(context.integerValue("DescribeLiveRecordConfigResponse.PageNum"));
		describeLiveRecordConfigResponse.setPageSize(context.integerValue("DescribeLiveRecordConfigResponse.PageSize"));
		describeLiveRecordConfigResponse.setOrder(context.stringValue("DescribeLiveRecordConfigResponse.Order"));
		describeLiveRecordConfigResponse.setTotalNum(context.integerValue("DescribeLiveRecordConfigResponse.TotalNum"));
		describeLiveRecordConfigResponse.setTotalPage(context.integerValue("DescribeLiveRecordConfigResponse.TotalPage"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < context.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setDomainName(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].DomainName"));
			liveAppRecord.setAppName(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].AppName"));
			liveAppRecord.setOssEndpoint(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssEndpoint"));
			liveAppRecord.setOssBucket(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssBucket"));
			liveAppRecord.setCreateTime(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].CreateTime"));

			List<RecordFormat> recordFormatList = new ArrayList<RecordFormat>();
			for (int j = 0; j < context.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList.Length"); j++) {
				RecordFormat recordFormat = new RecordFormat();
				recordFormat.setFormat(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].Format"));
				recordFormat.setOssObjectPrefix(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].OssObjectPrefix"));
				recordFormat.setSliceOssObjectPrefix(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].SliceOssObjectPrefix"));

				recordFormatList.add(recordFormat);
			}
			liveAppRecord.setRecordFormatList(recordFormatList);

			liveAppRecordList.add(liveAppRecord);
		}
		describeLiveRecordConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeLiveRecordConfigResponse;
	}
}