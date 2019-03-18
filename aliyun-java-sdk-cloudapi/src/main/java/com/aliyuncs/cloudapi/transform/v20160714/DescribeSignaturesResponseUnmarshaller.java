/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudapi.transform.v20160714;

import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesResponse.SignatureInfo;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeSignaturesResponseUnmarshaller {

	public static DescribeSignaturesResponse unmarshall(DescribeSignaturesResponse describeSignaturesResponse, UnmarshallerContext context) {
		
		describeSignaturesResponse.setRequestId(context.stringValue("DescribeSignaturesResponse.RequestId"));
		describeSignaturesResponse.setTotalCount(context.integerValue("DescribeSignaturesResponse.TotalCount"));
		describeSignaturesResponse.setPageSize(context.integerValue("DescribeSignaturesResponse.PageSize"));
		describeSignaturesResponse.setPageNumber(context.integerValue("DescribeSignaturesResponse.PageNumber"));

		List<SignatureInfo> signatureInfos = new ArrayList<SignatureInfo>();
		for (int i = 0; i < context.lengthValue("DescribeSignaturesResponse.SignatureInfos.Length"); i++) {
			SignatureInfo signatureInfo = new SignatureInfo();
			signatureInfo.setRegionId(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].RegionId"));
			signatureInfo.setSignatureId(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureId"));
			signatureInfo.setSignatureName(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureName"));
			signatureInfo.setSignatureKey(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureKey"));
			signatureInfo.setSignatureSecret(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].SignatureSecret"));
			signatureInfo.setCreatedTime(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].CreatedTime"));
			signatureInfo.setModifiedTime(context.stringValue("DescribeSignaturesResponse.SignatureInfos["+ i +"].ModifiedTime"));

			signatureInfos.add(signatureInfo);
		}
		describeSignaturesResponse.setSignatureInfos(signatureInfos);
	 
	 	return describeSignaturesResponse;
	}
}