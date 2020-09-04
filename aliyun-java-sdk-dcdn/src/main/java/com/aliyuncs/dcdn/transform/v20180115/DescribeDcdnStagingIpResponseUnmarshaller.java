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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnStagingIpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnStagingIpResponseUnmarshaller {

	public static DescribeDcdnStagingIpResponse unmarshall(DescribeDcdnStagingIpResponse describeDcdnStagingIpResponse, UnmarshallerContext _ctx) {
		
		describeDcdnStagingIpResponse.setRequestId(_ctx.stringValue("DescribeDcdnStagingIpResponse.RequestId"));

		List<String> iPV4s = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnStagingIpResponse.IPV4s.Length"); i++) {
			iPV4s.add(_ctx.stringValue("DescribeDcdnStagingIpResponse.IPV4s["+ i +"]"));
		}
		describeDcdnStagingIpResponse.setIPV4s(iPV4s);
	 
	 	return describeDcdnStagingIpResponse;
	}
}