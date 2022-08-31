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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnL2VipsByDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnL2VipsByDomainResponseUnmarshaller {

	public static DescribeDcdnL2VipsByDomainResponse unmarshall(DescribeDcdnL2VipsByDomainResponse describeDcdnL2VipsByDomainResponse, UnmarshallerContext _ctx) {
		
		describeDcdnL2VipsByDomainResponse.setRequestId(_ctx.stringValue("DescribeDcdnL2VipsByDomainResponse.RequestId"));
		describeDcdnL2VipsByDomainResponse.setDomainName(_ctx.stringValue("DescribeDcdnL2VipsByDomainResponse.DomainName"));

		List<String> vips = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnL2VipsByDomainResponse.Vips.Length"); i++) {
			vips.add(_ctx.stringValue("DescribeDcdnL2VipsByDomainResponse.Vips["+ i +"]"));
		}
		describeDcdnL2VipsByDomainResponse.setVips(vips);
	 
	 	return describeDcdnL2VipsByDomainResponse;
	}
}