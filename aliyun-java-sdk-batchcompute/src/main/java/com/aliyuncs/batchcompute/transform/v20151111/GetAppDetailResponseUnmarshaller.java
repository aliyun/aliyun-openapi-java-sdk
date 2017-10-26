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
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.GetAppDetailResponse;
import com.aliyuncs.batchcompute.model.v20151111.GetAppResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.App;
import com.aliyuncs.batchcompute.pojo.v20151111.AppDescription;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;


public class GetAppDetailResponseUnmarshaller {

	public static GetAppDetailResponse unmarshall(GetAppDetailResponse getAppDetailResponse, UnmarshallerContext context) throws ServerException {

		HttpResponse httpResponse = context.getHttpResponse();
		getAppDetailResponse.setHttpResponse(httpResponse);

		try {
			String body = new String(httpResponse.getContent(), httpResponse.getEncoding());

			ObjectMapper mapper = new ObjectMapper();
			AppDescription appDetail = mapper.readValue(body, AppDescription.class);

			getAppDetailResponse.setAppDetail(appDetail);
		} catch (UnsupportedEncodingException e) {
			throw new ServerException("API.EncodeError", "encode response body error",getAppDetailResponse.getRequestId());
		} catch (IOException e) {
			throw new ServerException("API.EncodeError", "encode response body error",getAppDetailResponse.getRequestId());
		}
	 	return getAppDetailResponse;
	}
}