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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewTopUrlResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeDomainViewTopUrlResponse.Url;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainViewTopUrlResponseUnmarshaller {

	public static DescribeDomainViewTopUrlResponse unmarshall(DescribeDomainViewTopUrlResponse describeDomainViewTopUrlResponse, UnmarshallerContext _ctx) {
		
		describeDomainViewTopUrlResponse.setRequestId(_ctx.stringValue("DescribeDomainViewTopUrlResponse.RequestId"));

		List<Url> urlList = new ArrayList<Url>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainViewTopUrlResponse.UrlList.Length"); i++) {
			Url url = new Url();
			url.setCount(_ctx.longValue("DescribeDomainViewTopUrlResponse.UrlList["+ i +"].Count"));
			url.setDomain(_ctx.stringValue("DescribeDomainViewTopUrlResponse.UrlList["+ i +"].Domain"));
			url.setUrl(_ctx.stringValue("DescribeDomainViewTopUrlResponse.UrlList["+ i +"].Url"));

			urlList.add(url);
		}
		describeDomainViewTopUrlResponse.setUrlList(urlList);
	 
	 	return describeDomainViewTopUrlResponse;
	}
}