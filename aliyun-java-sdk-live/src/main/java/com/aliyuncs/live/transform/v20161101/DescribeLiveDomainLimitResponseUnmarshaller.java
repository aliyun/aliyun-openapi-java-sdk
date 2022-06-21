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

import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLimitResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveDomainLimitResponse.LiveDomainLimit;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveDomainLimitResponseUnmarshaller {

	public static DescribeLiveDomainLimitResponse unmarshall(DescribeLiveDomainLimitResponse describeLiveDomainLimitResponse, UnmarshallerContext _ctx) {
		
		describeLiveDomainLimitResponse.setRequestId(_ctx.stringValue("DescribeLiveDomainLimitResponse.RequestId"));

		List<LiveDomainLimit> liveDomainLimitList = new ArrayList<LiveDomainLimit>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveDomainLimitResponse.LiveDomainLimitList.Length"); i++) {
			LiveDomainLimit liveDomainLimit = new LiveDomainLimit();
			liveDomainLimit.setDomainName(_ctx.stringValue("DescribeLiveDomainLimitResponse.LiveDomainLimitList["+ i +"].DomainName"));
			liveDomainLimit.setLimitNum(_ctx.integerValue("DescribeLiveDomainLimitResponse.LiveDomainLimitList["+ i +"].LimitNum"));
			liveDomainLimit.setLimitTranscodeNum(_ctx.integerValue("DescribeLiveDomainLimitResponse.LiveDomainLimitList["+ i +"].LimitTranscodeNum"));

			liveDomainLimitList.add(liveDomainLimit);
		}
		describeLiveDomainLimitResponse.setLiveDomainLimitList(liveDomainLimitList);
	 
	 	return describeLiveDomainLimitResponse;
	}
}