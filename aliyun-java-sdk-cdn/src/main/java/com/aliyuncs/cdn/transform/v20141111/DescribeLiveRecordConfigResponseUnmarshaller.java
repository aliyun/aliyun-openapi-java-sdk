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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveRecordConfigResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveRecordConfigResponse.LiveAppRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordConfigResponseUnmarshaller {

	public static DescribeLiveRecordConfigResponse unmarshall(DescribeLiveRecordConfigResponse describeLiveRecordConfigResponse, UnmarshallerContext context) {
		
		describeLiveRecordConfigResponse.setRequestId(context.stringValue("DescribeLiveRecordConfigResponse.RequestId"));

		List<LiveAppRecord> liveAppRecordList = new ArrayList<LiveAppRecord>();
		for (int i = 0; i < context.lengthValue("DescribeLiveRecordConfigResponse.LiveAppRecordList.Length"); i++) {
			LiveAppRecord liveAppRecord = new LiveAppRecord();
			liveAppRecord.setDomainName(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].DomainName"));
			liveAppRecord.setAppName(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].AppName"));
			liveAppRecord.setOssEndpoint(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssEndpoint"));
			liveAppRecord.setOssBucket(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssBucket"));
			liveAppRecord.setOssObjectPrefix(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].OssObjectPrefix"));
			liveAppRecord.setCreateTime(context.stringValue("DescribeLiveRecordConfigResponse.LiveAppRecordList["+ i +"].CreateTime"));

			liveAppRecordList.add(liveAppRecord);
		}
		describeLiveRecordConfigResponse.setLiveAppRecordList(liveAppRecordList);
	 
	 	return describeLiveRecordConfigResponse;
	}
}