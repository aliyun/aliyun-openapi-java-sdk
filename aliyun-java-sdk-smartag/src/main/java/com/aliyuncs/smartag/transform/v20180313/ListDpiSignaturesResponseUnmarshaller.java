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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.ListDpiSignaturesResponse;
import com.aliyuncs.smartag.model.v20180313.ListDpiSignaturesResponse.DpiSignatureItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDpiSignaturesResponseUnmarshaller {

	public static ListDpiSignaturesResponse unmarshall(ListDpiSignaturesResponse listDpiSignaturesResponse, UnmarshallerContext _ctx) {
		
		listDpiSignaturesResponse.setRequestId(_ctx.stringValue("ListDpiSignaturesResponse.RequestId"));
		listDpiSignaturesResponse.setTotalCount(_ctx.integerValue("ListDpiSignaturesResponse.TotalCount"));
		listDpiSignaturesResponse.setNextToken(_ctx.stringValue("ListDpiSignaturesResponse.NextToken"));

		List<DpiSignatureItem> dpiSignature = new ArrayList<DpiSignatureItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDpiSignaturesResponse.DpiSignature.Length"); i++) {
			DpiSignatureItem dpiSignatureItem = new DpiSignatureItem();
			dpiSignatureItem.setMinEngineVersion(_ctx.stringValue("ListDpiSignaturesResponse.DpiSignature["+ i +"].MinEngineVersion"));
			dpiSignatureItem.setMinSignatureDbVersion(_ctx.stringValue("ListDpiSignaturesResponse.DpiSignature["+ i +"].MinSignatureDbVersion"));
			dpiSignatureItem.setDpiSignatureId(_ctx.stringValue("ListDpiSignaturesResponse.DpiSignature["+ i +"].DpiSignatureId"));
			dpiSignatureItem.setDpiSignatureName(_ctx.stringValue("ListDpiSignaturesResponse.DpiSignature["+ i +"].DpiSignatureName"));
			dpiSignatureItem.setDpiGroupId(_ctx.stringValue("ListDpiSignaturesResponse.DpiSignature["+ i +"].DpiGroupId"));

			dpiSignature.add(dpiSignatureItem);
		}
		listDpiSignaturesResponse.setDpiSignature(dpiSignature);
	 
	 	return listDpiSignaturesResponse;
	}
}