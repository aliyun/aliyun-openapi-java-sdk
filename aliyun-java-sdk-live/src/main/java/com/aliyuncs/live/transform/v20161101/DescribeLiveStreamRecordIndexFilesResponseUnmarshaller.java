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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordIndexFilesResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRecordIndexFilesResponseUnmarshaller {

	public static DescribeLiveStreamRecordIndexFilesResponse unmarshall(DescribeLiveStreamRecordIndexFilesResponse describeLiveStreamRecordIndexFilesResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamRecordIndexFilesResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RequestId"));
		describeLiveStreamRecordIndexFilesResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.PageNum"));
		describeLiveStreamRecordIndexFilesResponse.setOrder(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.Order"));
		describeLiveStreamRecordIndexFilesResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.TotalPage"));
		describeLiveStreamRecordIndexFilesResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.PageSize"));
		describeLiveStreamRecordIndexFilesResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.TotalNum"));

		List<RecordIndexInfo> recordIndexInfoList = new ArrayList<RecordIndexInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList.Length"); i++) {
			RecordIndexInfo recordIndexInfo = new RecordIndexInfo();
			recordIndexInfo.setRecordUrl(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].RecordUrl"));
			recordIndexInfo.setStreamName(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].StreamName"));
			recordIndexInfo.setCreateTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].CreateTime"));
			recordIndexInfo.setRecordId(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].RecordId"));
			recordIndexInfo.setHeight(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Height"));
			recordIndexInfo.setOssBucket(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].OssBucket"));
			recordIndexInfo.setDomainName(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].DomainName"));
			recordIndexInfo.setOssObject(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].OssObject"));
			recordIndexInfo.setEndTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].EndTime"));
			recordIndexInfo.setAppName(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].AppName"));
			recordIndexInfo.setStartTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].StartTime"));
			recordIndexInfo.setWidth(_ctx.integerValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Width"));
			recordIndexInfo.setDuration(_ctx.floatValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].Duration"));
			recordIndexInfo.setOssEndpoint(_ctx.stringValue("DescribeLiveStreamRecordIndexFilesResponse.RecordIndexInfoList["+ i +"].OssEndpoint"));

			recordIndexInfoList.add(recordIndexInfo);
		}
		describeLiveStreamRecordIndexFilesResponse.setRecordIndexInfoList(recordIndexInfoList);
	 
	 	return describeLiveStreamRecordIndexFilesResponse;
	}
}