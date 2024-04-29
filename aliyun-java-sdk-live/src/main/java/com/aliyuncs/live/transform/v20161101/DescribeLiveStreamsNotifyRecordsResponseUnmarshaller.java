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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsNotifyRecordsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsNotifyRecordsResponse.LiveStreamNotifyRecordsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsNotifyRecordsResponseUnmarshaller {

	public static DescribeLiveStreamsNotifyRecordsResponse unmarshall(DescribeLiveStreamsNotifyRecordsResponse describeLiveStreamsNotifyRecordsResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsNotifyRecordsResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.RequestId"));
		describeLiveStreamsNotifyRecordsResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamsNotifyRecordsResponse.PageNum"));
		describeLiveStreamsNotifyRecordsResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamsNotifyRecordsResponse.PageSize"));
		describeLiveStreamsNotifyRecordsResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamsNotifyRecordsResponse.TotalNum"));
		describeLiveStreamsNotifyRecordsResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamsNotifyRecordsResponse.TotalPage"));

		List<LiveStreamNotifyRecordsInfo> notifyRecordsInfo = new ArrayList<LiveStreamNotifyRecordsInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo.Length"); i++) {
			LiveStreamNotifyRecordsInfo liveStreamNotifyRecordsInfo = new LiveStreamNotifyRecordsInfo();
			liveStreamNotifyRecordsInfo.setAppName(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].AppName"));
			liveStreamNotifyRecordsInfo.setDescription(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].Description"));
			liveStreamNotifyRecordsInfo.setDomainName(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].DomainName"));
			liveStreamNotifyRecordsInfo.setNotifyContent(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].NotifyContent"));
			liveStreamNotifyRecordsInfo.setNotifyResult(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].NotifyResult"));
			liveStreamNotifyRecordsInfo.setNotifyTime(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].NotifyTime"));
			liveStreamNotifyRecordsInfo.setNotifyType(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].NotifyType"));
			liveStreamNotifyRecordsInfo.setNotifyUrl(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].NotifyUrl"));
			liveStreamNotifyRecordsInfo.setStreamName(_ctx.stringValue("DescribeLiveStreamsNotifyRecordsResponse.NotifyRecordsInfo["+ i +"].StreamName"));

			notifyRecordsInfo.add(liveStreamNotifyRecordsInfo);
		}
		describeLiveStreamsNotifyRecordsResponse.setNotifyRecordsInfo(notifyRecordsInfo);
	 
	 	return describeLiveStreamsNotifyRecordsResponse;
	}
}