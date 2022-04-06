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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsBlockListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsBlockListResponseUnmarshaller {

	public static DescribeLiveStreamsBlockListResponse unmarshall(DescribeLiveStreamsBlockListResponse describeLiveStreamsBlockListResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsBlockListResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsBlockListResponse.RequestId"));
		describeLiveStreamsBlockListResponse.setPageNum(_ctx.integerValue("DescribeLiveStreamsBlockListResponse.PageNum"));
		describeLiveStreamsBlockListResponse.setTotalPage(_ctx.integerValue("DescribeLiveStreamsBlockListResponse.TotalPage"));
		describeLiveStreamsBlockListResponse.setPageSize(_ctx.integerValue("DescribeLiveStreamsBlockListResponse.PageSize"));
		describeLiveStreamsBlockListResponse.setTotalNum(_ctx.integerValue("DescribeLiveStreamsBlockListResponse.TotalNum"));
		describeLiveStreamsBlockListResponse.setDomainName(_ctx.stringValue("DescribeLiveStreamsBlockListResponse.DomainName"));

		List<String> streamUrls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamsBlockListResponse.StreamUrls.Length"); i++) {
			streamUrls.add(_ctx.stringValue("DescribeLiveStreamsBlockListResponse.StreamUrls["+ i +"]"));
		}
		describeLiveStreamsBlockListResponse.setStreamUrls(streamUrls);
	 
	 	return describeLiveStreamsBlockListResponse;
	}
}