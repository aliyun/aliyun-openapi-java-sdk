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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordContentResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamRecordContentResponse.RecordContentInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRecordContentResponseUnmarshaller {

	public static DescribeLiveStreamRecordContentResponse unmarshall(DescribeLiveStreamRecordContentResponse describeLiveStreamRecordContentResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamRecordContentResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RequestId"));

		List<RecordContentInfo> recordContentInfoList = new ArrayList<RecordContentInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList.Length"); i++) {
			RecordContentInfo recordContentInfo = new RecordContentInfo();
			recordContentInfo.setEndTime(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].EndTime"));
			recordContentInfo.setStartTime(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].StartTime"));
			recordContentInfo.setDuration(_ctx.floatValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].Duration"));
			recordContentInfo.setOssBucket(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].OssBucket"));
			recordContentInfo.setOssObjectPrefix(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].OssObjectPrefix"));
			recordContentInfo.setOssEndpoint(_ctx.stringValue("DescribeLiveStreamRecordContentResponse.RecordContentInfoList["+ i +"].OssEndpoint"));

			recordContentInfoList.add(recordContentInfo);
		}
		describeLiveStreamRecordContentResponse.setRecordContentInfoList(recordContentInfoList);
	 
	 	return describeLiveStreamRecordContentResponse;
	}
}