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

import com.aliyuncs.live.model.v20161101.DescribeLiveRecordNotifyRecordsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordNotifyRecordsResponse.Callback;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordNotifyRecordsResponseUnmarshaller {

	public static DescribeLiveRecordNotifyRecordsResponse unmarshall(DescribeLiveRecordNotifyRecordsResponse describeLiveRecordNotifyRecordsResponse, UnmarshallerContext _ctx) {
		
		describeLiveRecordNotifyRecordsResponse.setRequestId(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.RequestId"));
		describeLiveRecordNotifyRecordsResponse.setCode(_ctx.integerValue("DescribeLiveRecordNotifyRecordsResponse.Code"));
		describeLiveRecordNotifyRecordsResponse.setMsg(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.Msg"));
		describeLiveRecordNotifyRecordsResponse.setPageNum(_ctx.integerValue("DescribeLiveRecordNotifyRecordsResponse.PageNum"));
		describeLiveRecordNotifyRecordsResponse.setPageSize(_ctx.integerValue("DescribeLiveRecordNotifyRecordsResponse.PageSize"));
		describeLiveRecordNotifyRecordsResponse.setTotalNum(_ctx.integerValue("DescribeLiveRecordNotifyRecordsResponse.TotalNum"));
		describeLiveRecordNotifyRecordsResponse.setTotalPage(_ctx.integerValue("DescribeLiveRecordNotifyRecordsResponse.TotalPage"));

		List<Callback> callbackList = new ArrayList<Callback>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList.Length"); i++) {
			Callback callback = new Callback();
			callback.setAppName(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].AppName"));
			callback.setDescription(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].Description"));
			callback.setDomainName(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].DomainName"));
			callback.setNotifyContent(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].NotifyContent"));
			callback.setNotifyResult(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].NotifyResult"));
			callback.setNotifyTime(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].NotifyTime"));
			callback.setNotifyType(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].NotifyType"));
			callback.setNotifyUrl(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].NotifyUrl"));
			callback.setStreamName(_ctx.stringValue("DescribeLiveRecordNotifyRecordsResponse.CallbackList["+ i +"].StreamName"));

			callbackList.add(callback);
		}
		describeLiveRecordNotifyRecordsResponse.setCallbackList(callbackList);
	 
	 	return describeLiveRecordNotifyRecordsResponse;
	}
}