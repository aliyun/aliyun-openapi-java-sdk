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

import com.aliyuncs.live.model.v20161101.DescribeMixStreamListResponse;
import com.aliyuncs.live.model.v20161101.DescribeMixStreamListResponse.MixStreamInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMixStreamListResponseUnmarshaller {

	public static DescribeMixStreamListResponse unmarshall(DescribeMixStreamListResponse describeMixStreamListResponse, UnmarshallerContext _ctx) {
		
		describeMixStreamListResponse.setRequestId(_ctx.stringValue("DescribeMixStreamListResponse.RequestId"));
		describeMixStreamListResponse.setTotal(_ctx.integerValue("DescribeMixStreamListResponse.Total"));

		List<MixStreamInfo> mixStreamList = new ArrayList<MixStreamInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMixStreamListResponse.MixStreamList.Length"); i++) {
			MixStreamInfo mixStreamInfo = new MixStreamInfo();
			mixStreamInfo.setMixstreamId(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].MixstreamId"));
			mixStreamInfo.setDomainName(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].DomainName"));
			mixStreamInfo.setAppName(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].AppName"));
			mixStreamInfo.setStreamName(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].StreamName"));
			mixStreamInfo.setLayoutId(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].LayoutId"));
			mixStreamInfo.setInputStreamNumber(_ctx.integerValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].InputStreamNumber"));
			mixStreamInfo.setMixStreamTemplate(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].MixStreamTemplate"));
			mixStreamInfo.setGmtCreate(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].GmtCreate"));
			mixStreamInfo.setGmtModified(_ctx.stringValue("DescribeMixStreamListResponse.MixStreamList["+ i +"].GmtModified"));

			mixStreamList.add(mixStreamInfo);
		}
		describeMixStreamListResponse.setMixStreamList(mixStreamList);
	 
	 	return describeMixStreamListResponse;
	}
}