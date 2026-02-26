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

package com.aliyuncs.anytrans.transform.v20250707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.anytrans.model.v20250707.TermQueryResponse;
import com.aliyuncs.anytrans.model.v20250707.TermQueryResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.TermQueryResponse.Data.TermsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TermQueryResponseUnmarshaller {

	public static TermQueryResponse unmarshall(TermQueryResponse termQueryResponse, UnmarshallerContext _ctx) {
		
		termQueryResponse.setCode(_ctx.stringValue("TermQueryResponse.code"));
		termQueryResponse.setMessage(_ctx.stringValue("TermQueryResponse.message"));
		termQueryResponse.setRequestId(_ctx.stringValue("TermQueryResponse.requestId"));
		termQueryResponse.setSuccess(_ctx.booleanValue("TermQueryResponse.success"));
		termQueryResponse.setHttpStatusCode(_ctx.stringValue("TermQueryResponse.httpStatusCode"));

		Data data = new Data();
		data.setFailCount(_ctx.longValue("TermQueryResponse.data.failCount"));

		List<TermsItem> terms = new ArrayList<TermsItem>();
		for (int i = 0; i < _ctx.lengthValue("TermQueryResponse.data.terms.Length"); i++) {
			TermsItem termsItem = new TermsItem();
			termsItem.setTermId(_ctx.stringValue("TermQueryResponse.data.terms["+ i +"].termId"));
			termsItem.setSrc(_ctx.stringValue("TermQueryResponse.data.terms["+ i +"].src"));
			termsItem.setTgt(_ctx.stringValue("TermQueryResponse.data.terms["+ i +"].tgt"));

			terms.add(termsItem);
		}
		data.setTerms(terms);
		termQueryResponse.setData(data);
	 
	 	return termQueryResponse;
	}
}