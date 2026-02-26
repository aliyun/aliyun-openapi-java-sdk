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

import com.aliyuncs.live.model.v20161101.DescribeDomainWithIntegrityResponse;
import com.aliyuncs.live.model.v20161101.DescribeDomainWithIntegrityResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainWithIntegrityResponseUnmarshaller {

	public static DescribeDomainWithIntegrityResponse unmarshall(DescribeDomainWithIntegrityResponse describeDomainWithIntegrityResponse, UnmarshallerContext _ctx) {
		
		describeDomainWithIntegrityResponse.setRequestId(_ctx.stringValue("DescribeDomainWithIntegrityResponse.RequestId"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainWithIntegrityResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setName(_ctx.stringValue("DescribeDomainWithIntegrityResponse.Content["+ i +"].Name"));

			List<String> points = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainWithIntegrityResponse.Content["+ i +"].Points.Length"); j++) {
				points.add(_ctx.stringValue("DescribeDomainWithIntegrityResponse.Content["+ i +"].Points["+ j +"]"));
			}
			contentItem.setPoints(points);

			List<String> columns = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDomainWithIntegrityResponse.Content["+ i +"].Columns.Length"); j++) {
				columns.add(_ctx.stringValue("DescribeDomainWithIntegrityResponse.Content["+ i +"].Columns["+ j +"]"));
			}
			contentItem.setColumns(columns);

			content.add(contentItem);
		}
		describeDomainWithIntegrityResponse.setContent(content);
	 
	 	return describeDomainWithIntegrityResponse;
	}
}