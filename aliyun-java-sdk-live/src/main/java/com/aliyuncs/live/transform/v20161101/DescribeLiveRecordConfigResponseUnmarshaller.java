/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse.LiveAppRecord;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordConfigResponse.LiveAppRecord.RecordFormat;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordConfigResponseUnmarshaller {

	public static DescribeLiveRecordConfigResponse unmarshall(DescribeLiveRecordConfigResponse describeLiveRecordConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveRecordConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveRecordConfigResponse.RequestId"));
		describeLiveRecordConfigResponse.setPageNum(_ctx.integerValue("DescribeLiveRecordConfigResponse.PageNum"));
		describeLiveRecordConfigResponse.setPageSize(_ctx.integerValue("DescribeLiveRecordConfigResponse.PageSize"));
		describeLiveRecordConfigResponse.setOrder(_ctx.stringValue("DescribeLiveRecordConfigResponse.Order"));
		describeLiveRecordConfigResponse.setTotalNum(_ctx.integerValue("DescribeLiveRecordConfigResponse.TotalNum"));
		describeLiveRecordConfigResponse.setTotalPage(_ctx.integerValue("DescribeLiveRecordConfigResponse.TotalPage"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setDomainName(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].DomainName"));
			liveAppRecord.setAppName(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].AppName"));
			liveAppRecord.setStreamName(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].StreamName"));
			liveAppRecord.setOssEndpoint(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssEndpoint"));
			liveAppRecord.setOssBucket(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssBucket"));
			liveAppRecord.setCreateTime(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].CreateTime"));
			liveAppRecord.setStartTime(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].StartTime"));
			liveAppRecord.setEndTime(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].EndTime"));
			liveAppRecord.setOnDemond(_ctx.integerValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OnDemond"));

			List<String> transcodeTemplates = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeTemplates.Length"); j++) {
				transcodeTemplates.add(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeTemplates["+ j +"]"));
			}
			liveAppRecord.setTranscodeTemplates(transcodeTemplates);

			List<RecordFormat> recordFormatList = new ArrayList<RecordFormat>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList.Length"); j++) {
				RecordFormat recordFormat = new RecordFormat();
				recordFormat.setFormat(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].Format"));
				recordFormat.setOssObjectPrefix(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].OssObjectPrefix"));
				recordFormat.setSliceOssObjectPrefix(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].SliceOssObjectPrefix"));
				recordFormat.setCycleDuration(_ctx.integerValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].CycleDuration"));
				recordFormat.setSliceDuration(_ctx.integerValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].RecordFormatList["+ j +"].SliceDuration"));

				recordFormatList.add(recordFormat);
			}
			liveAppRecord.setRecordFormatList(recordFormatList);

			List<RecordFormat> transcodeRecordFormatList = new ArrayList<RecordFormat>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList.Length"); j++) {
				RecordFormat recordFormat_ = new RecordFormat();
				recordFormat_.setFormat(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList["+ j +"].Format"));
				recordFormat_.setOssObjectPrefix(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList["+ j +"].OssObjectPrefix"));
				recordFormat_.setSliceOssObjectPrefix(_ctx.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList["+ j +"].SliceOssObjectPrefix"));
				recordFormat_.setCycleDuration(_ctx.integerValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList["+ j +"].CycleDuration"));
				recordFormat_.setSliceDuration(_ctx.integerValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].TranscodeRecordFormatList["+ j +"].SliceDuration"));

				transcodeRecordFormatList.add(recordFormat_);
			}
			liveAppRecord.setTranscodeRecordFormatList(transcodeRecordFormatList);

			liveAppRecordList.add(liveAppRecord);
		}
		describeLiveRecordConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeLiveRecordConfigResponse;
	}
}