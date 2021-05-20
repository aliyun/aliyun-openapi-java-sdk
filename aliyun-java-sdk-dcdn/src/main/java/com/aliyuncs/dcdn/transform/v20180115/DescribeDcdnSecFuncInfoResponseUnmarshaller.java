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

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSecFuncInfoResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnSecFuncInfoResponse.ContentItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnSecFuncInfoResponseUnmarshaller {

	public static DescribeDcdnSecFuncInfoResponse unmarshall(DescribeDcdnSecFuncInfoResponse describeDcdnSecFuncInfoResponse, UnmarshallerContext _ctx) {
		
		describeDcdnSecFuncInfoResponse.setRequestId(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.RequestId"));
		describeDcdnSecFuncInfoResponse.setDescription(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.Description"));
		describeDcdnSecFuncInfoResponse.setRetCode(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.RetCode"));
		describeDcdnSecFuncInfoResponse.setHttpStatus(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.HttpStatus"));

		List<ContentItem> content = new ArrayList<ContentItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnSecFuncInfoResponse.Content.Length"); i++) {
			ContentItem contentItem = new ContentItem();
			contentItem.setLabel(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.Content["+ i +"].Label"));
			contentItem.setValue(_ctx.stringValue("DescribeDcdnSecFuncInfoResponse.Content["+ i +"].Value"));

			content.add(contentItem);
		}
		describeDcdnSecFuncInfoResponse.setContent(content);
	 
	 	return describeDcdnSecFuncInfoResponse;
	}
}