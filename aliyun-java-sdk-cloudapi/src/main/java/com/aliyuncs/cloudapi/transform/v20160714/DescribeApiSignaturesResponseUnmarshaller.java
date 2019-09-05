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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeApiSignaturesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeApiSignaturesResponse.ApiSignatureItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeApiSignaturesResponseUnmarshaller {

	public static DescribeApiSignaturesResponse unmarshall(DescribeApiSignaturesResponse describeApiSignaturesResponse, UnmarshallerContext _ctx) {
		
		describeApiSignaturesResponse.setRequestId(_ctx.stringValue("DescribeApiSignaturesResponse.RequestId"));
		describeApiSignaturesResponse.setTotalCount(_ctx.integerValue("DescribeApiSignaturesResponse.TotalCount"));
		describeApiSignaturesResponse.setPageSize(_ctx.integerValue("DescribeApiSignaturesResponse.PageSize"));
		describeApiSignaturesResponse.setPageNumber(_ctx.integerValue("DescribeApiSignaturesResponse.PageNumber"));

		List<ApiSignatureItem> apiSignatures = new ArrayList<ApiSignatureItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeApiSignaturesResponse.ApiSignatures.Length"); i++) {
			ApiSignatureItem apiSignatureItem = new ApiSignatureItem();
			apiSignatureItem.setApiId(_ctx.stringValue("DescribeApiSignaturesResponse.ApiSignatures["+ i +"].ApiId"));
			apiSignatureItem.setApiName(_ctx.stringValue("DescribeApiSignaturesResponse.ApiSignatures["+ i +"].ApiName"));
			apiSignatureItem.setSignatureId(_ctx.stringValue("DescribeApiSignaturesResponse.ApiSignatures["+ i +"].SignatureId"));
			apiSignatureItem.setSignatureName(_ctx.stringValue("DescribeApiSignaturesResponse.ApiSignatures["+ i +"].SignatureName"));
			apiSignatureItem.setBoundTime(_ctx.stringValue("DescribeApiSignaturesResponse.ApiSignatures["+ i +"].BoundTime"));

			apiSignatures.add(apiSignatureItem);
		}
		describeApiSignaturesResponse.setApiSignatures(apiSignatures);
	 
	 	return describeApiSignaturesResponse;
	}
}