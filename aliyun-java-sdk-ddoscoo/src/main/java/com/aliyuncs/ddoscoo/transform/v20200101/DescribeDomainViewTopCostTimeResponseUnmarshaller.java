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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewTopCostTimeResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewTopCostTimeResponse.Url;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainViewTopCostTimeResponseUnmarshaller {

	public static DescribeDomainViewTopCostTimeResponse unmarshall(DescribeDomainViewTopCostTimeResponse describeDomainViewTopCostTimeResponse, UnmarshallerContext _ctx) {
		
		describeDomainViewTopCostTimeResponse.setRequestId(_ctx.stringValue("DescribeDomainViewTopCostTimeResponse.RequestId"));

		List<Url> urlList = new ArrayList<Url>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainViewTopCostTimeResponse.UrlList.Length"); i++) {
			Url url = new Url();
			url.setCostTime(_ctx.floatValue("DescribeDomainViewTopCostTimeResponse.UrlList["+ i +"].CostTime"));
			url.setDomain(_ctx.stringValue("DescribeDomainViewTopCostTimeResponse.UrlList["+ i +"].Domain"));
			url.setUrl(_ctx.stringValue("DescribeDomainViewTopCostTimeResponse.UrlList["+ i +"].Url"));

			urlList.add(url);
		}
		describeDomainViewTopCostTimeResponse.setUrlList(urlList);
	 
	 	return describeDomainViewTopCostTimeResponse;
	}
}