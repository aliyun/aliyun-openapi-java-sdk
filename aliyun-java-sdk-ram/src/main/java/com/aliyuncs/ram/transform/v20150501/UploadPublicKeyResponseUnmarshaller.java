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
package com.aliyuncs.ram.transform.v20150501;

import com.aliyuncs.ram.model.v20150501.UploadPublicKeyResponse;
import com.aliyuncs.ram.model.v20150501.UploadPublicKeyResponse.PublicKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadPublicKeyResponseUnmarshaller {

	public static UploadPublicKeyResponse unmarshall(UploadPublicKeyResponse uploadPublicKeyResponse, UnmarshallerContext context) {
		
		uploadPublicKeyResponse.setRequestId(context.stringValue("UploadPublicKeyResponse.RequestId"));

		PublicKey publicKey = new PublicKey();
		publicKey.setPublicKeyId(context.stringValue("UploadPublicKeyResponse.PublicKey.PublicKeyId"));
		publicKey.setPublicKeySpec(context.stringValue("UploadPublicKeyResponse.PublicKey.PublicKeySpec"));
		publicKey.setStatus(context.stringValue("UploadPublicKeyResponse.PublicKey.Status"));
		publicKey.setCreateDate(context.stringValue("UploadPublicKeyResponse.PublicKey.CreateDate"));
		uploadPublicKeyResponse.setPublicKey(publicKey);
	 
	 	return uploadPublicKeyResponse;
	}
}