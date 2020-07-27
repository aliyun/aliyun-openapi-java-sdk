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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeDomainNamesOfVersionResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeDomainNamesOfVersionResponse.Content;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainNamesOfVersionResponseUnmarshaller {

	public static DescribeDomainNamesOfVersionResponse unmarshall(DescribeDomainNamesOfVersionResponse describeDomainNamesOfVersionResponse, UnmarshallerContext _ctx) {
		
		describeDomainNamesOfVersionResponse.setRequestId(_ctx.stringValue("DescribeDomainNamesOfVersionResponse.RequestId"));
		describeDomainNamesOfVersionResponse.setTotalCount(_ctx.integerValue("DescribeDomainNamesOfVersionResponse.TotalCount"));

		List<Content> contents = new ArrayList<Content>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainNamesOfVersionResponse.Contents.Length"); i++) {
			Content content = new Content();
			content.setDomainId(_ctx.stringValue("DescribeDomainNamesOfVersionResponse.Contents["+ i +"].DomainId"));
			content.setDomainName(_ctx.stringValue("DescribeDomainNamesOfVersionResponse.Contents["+ i +"].DomainName"));

			contents.add(content);
		}
		describeDomainNamesOfVersionResponse.setContents(contents);
	 
	 	return describeDomainNamesOfVersionResponse;
	}
}