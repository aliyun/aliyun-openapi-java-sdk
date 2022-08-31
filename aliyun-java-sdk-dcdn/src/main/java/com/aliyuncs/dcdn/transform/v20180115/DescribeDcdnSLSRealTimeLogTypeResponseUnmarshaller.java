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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSLSRealTimeLogTypeResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSLSRealTimeLogTypeResponse.Business;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSLSRealTimeLogTypeResponseUnmarshaller {

	public static DescribeDcdnSLSRealTimeLogTypeResponse unmarshall(DescribeDcdnSLSRealTimeLogTypeResponse describeDcdnSLSRealTimeLogTypeResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSLSRealTimeLogTypeResponse.setRequestId(_ctx.stringValue("DescribeDcdnSLSRealTimeLogTypeResponse.RequestId"));

		List<Business> content = new ArrayList<Business>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnSLSRealTimeLogTypeResponse.Content.Length"); i++) {
			Business business = new Business();
			business.setDesc(_ctx.stringValue("DescribeDcdnSLSRealTimeLogTypeResponse.Content["+ i +"].Desc"));
			business.setBusinessType(_ctx.stringValue("DescribeDcdnSLSRealTimeLogTypeResponse.Content["+ i +"].BusinessType"));

			content.add(business);
		}
		describeDcdnSLSRealTimeLogTypeResponse.setContent(content);
	 
	 	return describeDcdnSLSRealTimeLogTypeResponse;
	}
}