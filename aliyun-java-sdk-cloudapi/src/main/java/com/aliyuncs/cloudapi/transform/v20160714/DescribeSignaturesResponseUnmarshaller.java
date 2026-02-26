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

import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesResponse.SignatureInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSignaturesResponseUnmarshaller {

	public static DescribeSignaturesResponse unmarshall(DescribeSignaturesResponse describeSignaturesResponse, UnmarshallerContext _ctx) {
		
		describeSignaturesResponse.setRequestId(_ctx.stringValue("DescribeSignaturesResponse.RequestId"));
		describeSignaturesResponse.setPageNumber(_ctx.integerValue("DescribeSignaturesResponse.PageNumber"));
		describeSignaturesResponse.setPageSize(_ctx.integerValue("DescribeSignaturesResponse.PageSize"));
		describeSignaturesResponse.setTotalCount(_ctx.integerValue("DescribeSignaturesResponse.TotalCount"));

		List<SignatureInfo> signatureInfos = new ArrayList<SignatureInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSignaturesResponse.SignatureInfos.Length"); i++) {
			SignatureInfo signatureInfo = new SignatureInfo();
			signatureInfo.setModifiedTime(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].ModifiedTime"));
			signatureInfo.setSignatureId(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureId"));
			signatureInfo.setSignatureSecret(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureSecret"));
			signatureInfo.setSignatureName(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureName"));
			signatureInfo.setSignatureKey(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureKey"));
			signatureInfo.setCreatedTime(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].CreatedTime"));
			signatureInfo.setRegionId(_ctx.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].RegionId"));

			signatureInfos.add(signatureInfo);
		}
		describeSignaturesResponse.setSignatureInfos(signatureInfos);
	 
	 	return describeSignaturesResponse;
	}
}