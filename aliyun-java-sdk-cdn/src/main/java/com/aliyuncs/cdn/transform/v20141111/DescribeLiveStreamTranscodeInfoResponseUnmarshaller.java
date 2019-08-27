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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamTranscodeInfoResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamTranscodeInfoResponseUnmarshaller {

	public static DescribeLiveStreamTranscodeInfoResponse unmarshall(DescribeLiveStreamTranscodeInfoResponse describeLiveStreamTranscodeInfoResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamTranscodeInfoResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.RequestId"));

		List<DomainTranscodeInfo> domainTranscodeList = new ArrayList<DomainTranscodeInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList.Length"); i++) {
			DomainTranscodeInfo domainTranscodeInfo = new DomainTranscodeInfo();
			domainTranscodeInfo.setTranscodeApp(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeApp"));
			domainTranscodeInfo.setTranscodeId(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeId"));
			domainTranscodeInfo.setTranscodeName(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeName"));
			domainTranscodeInfo.setTranscodeRecord(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeRecord"));
			domainTranscodeInfo.setTranscodeSnapshot(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeSnapshot"));
			domainTranscodeInfo.setTranscodeTemplate(_ctx.stringValue("DescribeLiveStreamTranscodeInfoResponse.DomainTranscodeList["+ i +"].TranscodeTemplate"));

			domainTranscodeList.add(domainTranscodeInfo);
		}
		describeLiveStreamTranscodeInfoResponse.setDomainTranscodeList(domainTranscodeList);
	 
	 	return describeLiveStreamTranscodeInfoResponse;
	}
}