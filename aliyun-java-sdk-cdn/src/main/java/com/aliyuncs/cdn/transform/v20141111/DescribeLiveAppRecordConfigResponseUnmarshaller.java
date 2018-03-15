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

package com.aliyuncs.cdn.transform.v20141111;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveAppRecordConfigResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveAppRecordConfigResponse.LiveAppRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAppRecordConfigResponseUnmarshaller {

	public static DescribeLiveAppRecordConfigResponse unmarshall(DescribeLiveAppRecordConfigResponse describeLiveAppRecordConfigResponse, UnmarshallerContext context) {
		
		describeLiveAppRecordConfigResponse.setRequestId(context.stringValue("DescribeLiveAppRecordConfigResponse.RequestId"));

		LiveAppRecord liveAppRecord = new LiveAppRecord();
		liveAppRecord.setDomainName(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.DomainName"));
		liveAppRecord.setAppName(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.AppName"));
		liveAppRecord.setOssEndpoint(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.OssEndpoint"));
		liveAppRecord.setOssBucket(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.OssBucket"));
		liveAppRecord.setOssObjectPrefix(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.OssObjectPrefix"));
		liveAppRecord.setCreateTime(context.stringValue("DescribeLiveAppRecordConfigResponse.LiveAppRecord.CreateTime"));
		describeLiveAppRecordConfigResponse.setLiveAppRecord(liveAppRecord);
	 
	 	return describeLiveAppRecordConfigResponse;
	}
}