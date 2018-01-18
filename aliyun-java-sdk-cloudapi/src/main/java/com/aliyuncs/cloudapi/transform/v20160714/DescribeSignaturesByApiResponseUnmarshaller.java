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

import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesByApiResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeSignaturesByApiResponse.SignatureItem;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;


public class DescribeSignaturesByApiResponseUnmarshaller {

	public static DescribeSignaturesByApiResponse unmarshall(DescribeSignaturesByApiResponse describeSignaturesByApiResponse, UnmarshallerContext context) {
		
		describeSignaturesByApiResponse.setRequestId(context.stringValue("DescribeSignaturesByApiResponse.RequestId"));

		List<SignatureItem> signatures = new ArrayList<SignatureItem>();
		for (int i = 0; i < context.lengthValue("DescribeSignaturesByApiResponse.Signatures.Length"); i++) {
			SignatureItem signatureItem = new SignatureItem();
			signatureItem.setSignatureId(context.stringValue("DescribeSignaturesByApiResponse.Signatures["+ i +"].SignatureId"));
			signatureItem.setSignatureName(context.stringValue("DescribeSignaturesByApiResponse.Signatures["+ i +"].SignatureName"));
			signatureItem.setBoundTime(context.stringValue("DescribeSignaturesByApiResponse.Signatures["+ i +"].BoundTime"));

			signatures.add(signatureItem);
		}
		describeSignaturesByApiResponse.setSignatures(signatures);
	 
	 	return describeSignaturesByApiResponse;
	}
}