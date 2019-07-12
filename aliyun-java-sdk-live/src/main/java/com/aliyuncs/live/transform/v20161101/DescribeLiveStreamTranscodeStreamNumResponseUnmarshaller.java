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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamTranscodeStreamNumResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamTranscodeStreamNumResponseUnmarshaller {

	public static DescribeLiveStreamTranscodeStreamNumResponse unmarshall(DescribeLiveStreamTranscodeStreamNumResponse describeLiveStreamTranscodeStreamNumResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamTranscodeStreamNumResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamTranscodeStreamNumResponse.RequestId"));
		describeLiveStreamTranscodeStreamNumResponse.setTotal(_ctx.longValue("DescribeLiveStreamTranscodeStreamNumResponse.Total"));
		describeLiveStreamTranscodeStreamNumResponse.setTranscodedNumber(_ctx.longValue("DescribeLiveStreamTranscodeStreamNumResponse.TranscodedNumber"));
		describeLiveStreamTranscodeStreamNumResponse.setUntranscodeNumber(_ctx.longValue("DescribeLiveStreamTranscodeStreamNumResponse.UntranscodeNumber"));
		describeLiveStreamTranscodeStreamNumResponse.setLazyTranscodedNumber(_ctx.longValue("DescribeLiveStreamTranscodeStreamNumResponse.LazyTranscodedNumber"));
	 
	 	return describeLiveStreamTranscodeStreamNumResponse;
	}
}