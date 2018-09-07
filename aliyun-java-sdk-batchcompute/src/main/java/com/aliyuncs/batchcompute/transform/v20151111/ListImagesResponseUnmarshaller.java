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

import com.aliyuncs.batchcompute.model.v20151111.ListImagesResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.Image;
import com.aliyuncs.batchcompute.pojo.v20151111.MarkableResult;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.IOException;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext context) throws ServerException {
		HttpResponse httpResponse = context.getHttpResponse();
		listImagesResponse.setHttpResponse(httpResponse);

		try {
			String body = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());
			setContent(body, listImagesResponse);
		} catch (IOException e) {
			throw new ServerException("API.EncodeError", "encode response body error", listImagesResponse.getRequestId());
		}

		return listImagesResponse;
	}
	private static void setContent(String body, ListImagesResponse listImagesResponse) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		MarkableResult<Image> result = mapper.readValue(body,
				new TypeReference<MarkableResult<Image>>() {
				});

		listImagesResponse.setItems(result.getItems());
		listImagesResponse.setNextMarker(result.getNextMarker());
	}
}
