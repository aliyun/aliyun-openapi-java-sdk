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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordIndexFileResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRecordIndexFileResponseUnmarshaller {

	public static DescribeLiveStreamRecordIndexFileResponse unmarshall(DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFileResponse, UnmarshallerContext context) {
		
		describeLiveStreamRecordIndexFileResponse.setRequestId(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RequestId"));

		RecordIndexInfo recordIndexInfo = new RecordIndexInfo();
		recordIndexInfo.setRecordId(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.RecordId"));
		recordIndexInfo.setRecordUrl(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.RecordUrl"));
		recordIndexInfo.setDomainName(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.DomainName"));
		recordIndexInfo.setAppName(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.AppName"));
		recordIndexInfo.setStreamName(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.StreamName"));
		recordIndexInfo.setOssBucket(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssBucket"));
		recordIndexInfo.setOssEndpoint(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssEndpoint"));
		recordIndexInfo.setOssObject(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssObject"));
		recordIndexInfo.setStartTime(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.StartTime"));
		recordIndexInfo.setEndTime(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.EndTime"));
		recordIndexInfo.setDuration(context.floatValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Duration"));
		recordIndexInfo.setHeight(context.integerValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Height"));
		recordIndexInfo.setWidth(context.integerValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Width"));
		recordIndexInfo.setCreateTime(context.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.CreateTime"));
		describeLiveStreamRecordIndexFileResponse.setRecordIndexInfo(recordIndexInfo);
	 
	 	return describeLiveStreamRecordIndexFileResponse;
	}
}