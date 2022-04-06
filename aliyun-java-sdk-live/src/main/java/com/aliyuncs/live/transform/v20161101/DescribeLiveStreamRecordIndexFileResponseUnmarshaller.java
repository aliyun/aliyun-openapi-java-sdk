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

	public static DescribeLiveStreamRecordIndexFileResponse unmarshall(DescribeLiveStreamRecordIndexFileResponse describeLiveStreamRecordIndexFileResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamRecordIndexFileResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RequestId"));

		RecordIndexInfo recordIndexInfo = new RecordIndexInfo();
		recordIndexInfo.setRecordUrl(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.RecordUrl"));
		recordIndexInfo.setStreamName(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.StreamName"));
		recordIndexInfo.setCreateTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.CreateTime"));
		recordIndexInfo.setRecordId(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.RecordId"));
		recordIndexInfo.setHeight(_ctx.integerValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Height"));
		recordIndexInfo.setOssBucket(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssBucket"));
		recordIndexInfo.setDomainName(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.DomainName"));
		recordIndexInfo.setOssObject(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssObject"));
		recordIndexInfo.setEndTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.EndTime"));
		recordIndexInfo.setAppName(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.AppName"));
		recordIndexInfo.setStartTime(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.StartTime"));
		recordIndexInfo.setWidth(_ctx.integerValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Width"));
		recordIndexInfo.setDuration(_ctx.floatValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.Duration"));
		recordIndexInfo.setOssEndpoint(_ctx.stringValue("DescribeLiveStreamRecordIndexFileResponse.RecordIndexInfo.OssEndpoint"));
		describeLiveStreamRecordIndexFileResponse.setRecordIndexInfo(recordIndexInfo);
	 
	 	return describeLiveStreamRecordIndexFileResponse;
	}
}